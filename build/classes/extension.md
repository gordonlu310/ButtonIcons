---
layout: documentation
title: Extension
---

[&laquo; Back to index](index.html)
# Extension

Table of Contents:

* [ButtonIcons](#ButtonIcons)

## ButtonIcons  {#ButtonIcons}

Component for ButtonIcons



### Properties  {#ButtonIcons-Properties}

{:.properties}
None


### Events  {#ButtonIcons-Events}

{:.events}
None


### Methods  {#ButtonIcons-Methods}

{:.methods}

{:id="ButtonIcons.SetButtonIcons" class="method"} <i/> SetButtonIcons(*component*{:.component},*leftIcon*{:.number},*topIcon*{:.number},*rightIcon*{:.number},*bottomIcon*{:.number})
: Sets the icon of the specified button. Use 0 if you do not want an icon to appear.

{:id="ButtonIcons.SetCustomButtonIcons" class="method"} <i/> SetCustomButtonIcons(*component*{:.component},*leftIconPath*{:.text},*topIconPath*{:.text},*rightIconPath*{:.text},*bottomIconPath*{:.text})
: Sets the icon of the specified button. Use an empty text block if you do not want an icon to appear. Please use absolute paths in this instance.

{:id="ButtonIcons.SetMaterialButtonIcons" class="method"} <i/> SetMaterialButtonIcons(*component*{:.component},*leftIcon*{:.text},*topIcon*{:.text},*rightIcon*{:.text},*bottomIcon*{:.text},*color*{:.number},*size*{:.number})
: Sets the material icon of the specified button. Use an empty text block if you do not want an icon to appear. The size of the icons should be in pixels.
