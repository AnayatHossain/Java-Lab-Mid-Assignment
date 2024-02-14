#include <stdio.h>
#include <string.h>

#define MAX_SIZE 100

int main() {
    char str[MAX_SIZE];
    int freq[256] = {0}; // Assuming ASCII characters

    printf("Enter a string: ");
    fgets(str, MAX_SIZE, stdin);

    for (int i = 0; i < strlen(str); i++) {
        freq[(int)str[i]]++;
    }

    printf("Character Frequency:\n");
    for (int i = 0; i < 256; i++) {
        if (freq[i] != 0) {
            printf("%c - %d\n", i, freq[i]);
        }
    }

    return 0;
}