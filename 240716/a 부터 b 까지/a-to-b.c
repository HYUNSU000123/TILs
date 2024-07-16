#include <stdio.h>

int main() {
    int a, b;
    scanf("%d %d", &a, &b);

    for (int i = a; i <= b;) {
        printf("%d ", i);
        if (i % 2 == 1) {
            i *= 2;
        }
        else if (i % 2 == 0) {
            i += 3;
        }
    }
    return 0;
}