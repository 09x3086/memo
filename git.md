# git
```
[core]
	pager=nkf -w | LESSCHARSET=utf-8 less
	quotepath = false
```
```
git stash save "message"
```

```
git archive --format=zip --prefix=root/ "stash@{1}" $(git diff --diff-filter=d --name-only "stash@{1}"..NK-128_dev_SLMS_add_target_layer) -o ("./work/"+(Get-Date -Format "yyyyMMddhhmmss") + "_archive.zip")

```
