## 🎥 Pairs with Zero Sum - Java Solution  

This repository includes a clean and efficient Java solution for the **"Pairs with Zero Sum"** problem. The problem is commonly asked in **MAANG** interviews (Meta, Amazon, Apple, Netflix, Google) and is excellent for honing your problem-solving skills.  

### 🚀 Problem Statement  
Given an integer array `arr`, find all **unique pairs** `[arr[i], arr[j]]` such that:  
- `i != j`  
- `arr[i] + arr[j] == 0`  

The output should be sorted, and duplicate pairs should not exist.  

---

### 💻 Example  
**Input:**  
```plaintext
arr = [-1, 0, 1, 2, -1, -4]
```

**Output:**  
```plaintext
[[-1, 1]]
```

---

### 🛠️ Approach  
The solution efficiently uses Java collections:  
1. **HashSet** to store numbers and avoid duplicate processing.  
2. **ArrayList** to store valid pairs in sorted order.  
3. String-based key tracking for unique pair detection.  

---

### 📚 Full Tutorial on YouTube  
For a complete walkthrough, line-by-line explanation, and dry run of the code, check out the video:  
🎥 https://youtu.be/svfNJx5sgTo
---

### 📝 Code  
Here’s the concise implementation:  

```java
import java.util.*;

class Solution {
    public static ArrayList<ArrayList<Integer>> getPairs(int[] arr) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        HashSet<Integer> seen = new HashSet<>();
        HashSet<String> addedPairs = new HashSet<>();

        for (int num : arr) {
            int complement = -num;
            if (seen.contains(complement)) {
                int min = Math.min(num, complement);
                int max = Math.max(num, complement);
                String pairKey = min + "," + max;

                if (!addedPairs.contains(pairKey)) {
                    result.add(new ArrayList<>(Arrays.asList(min, max)));
                    addedPairs.add(pairKey);
                }
            }
            seen.add(num);
        }

        result.sort((a, b) -> {
            if (a.get(0).equals(b.get(0))) {
                return a.get(1) - b.get(1);
            }
            return a.get(0) - b.get(0);
        });

        return result;
    }
}
```

---

### 💡 Why This Problem?  
This problem is a great practice exercise for mastering:  
- HashSet and ArrayList operations.  
- Sorting and duplicate elimination techniques.  
- Problem-solving in **MAANG-level coding interviews**.  

---

### 🤝 Connect  
If you find this solution helpful, don’t forget to:  
- ⭐ **Star this repository**  
- Watch the full https://youtu.be/svfNJx5sgTo for a detailed explanation.  
- Share your thoughts or questions in the comments section!  

Happy Coding! 🚀  

---
