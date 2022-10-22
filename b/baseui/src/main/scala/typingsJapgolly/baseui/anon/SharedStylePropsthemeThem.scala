package typingsJapgolly.baseui.anon

import typingsJapgolly.baseui.baseuiStrings.both
import typingsJapgolly.baseui.baseuiStrings.left
import typingsJapgolly.baseui.baseuiStrings.none
import typingsJapgolly.baseui.baseuiStrings.right
import typingsJapgolly.csstype.mod.Property.Resize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined baseui.baseui/textarea/types.SharedStyleProps & {  $theme :baseui.baseui/styles/types.Theme} */
trait SharedStylePropsthemeThem extends StObject {
  
  @JSName("$adjoined")
  var $adjoined: /* keyof baseui.anon.Both */ none | left | right | both
  
  @JSName("$disabled")
  var $disabled: js.UndefOr[Boolean] = js.undefined
  
  @JSName("$error")
  var $error: js.UndefOr[Boolean] = js.undefined
  
  @JSName("$isFocused")
  var $isFocused: js.UndefOr[Boolean] = js.undefined
  
  @JSName("$isReadOnly")
  var $isReadOnly: js.UndefOr[Boolean] = js.undefined
  
  @JSName("$positive")
  var $positive: js.UndefOr[Boolean] = js.undefined
  
  @JSName("$required")
  var $required: js.UndefOr[Boolean] = js.undefined
  
  @JSName("$resize")
  var $resize: js.UndefOr[Resize] = js.undefined
  
  @JSName("$size")
  var $size: typingsJapgolly.baseui.textareaTypesMod.Size
  
  @JSName("$theme")
  var $theme: typingsJapgolly.baseui.stylesTypesMod.Theme
}
object SharedStylePropsthemeThem {
  
  inline def apply(
    $adjoined: /* keyof baseui.anon.Both */ none | left | right | both,
    $size: typingsJapgolly.baseui.textareaTypesMod.Size,
    $theme: typingsJapgolly.baseui.stylesTypesMod.Theme
  ): SharedStylePropsthemeThem = {
    val __obj = js.Dynamic.literal($adjoined = $adjoined.asInstanceOf[js.Any], $size = $size.asInstanceOf[js.Any], $theme = $theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[SharedStylePropsthemeThem]
  }
  
  extension [Self <: SharedStylePropsthemeThem](x: Self) {
    
    inline def set$adjoined(value: /* keyof baseui.anon.Both */ none | left | right | both): Self = StObject.set(x, "$adjoined", value.asInstanceOf[js.Any])
    
    inline def set$disabled(value: Boolean): Self = StObject.set(x, "$disabled", value.asInstanceOf[js.Any])
    
    inline def set$disabledUndefined: Self = StObject.set(x, "$disabled", js.undefined)
    
    inline def set$error(value: Boolean): Self = StObject.set(x, "$error", value.asInstanceOf[js.Any])
    
    inline def set$errorUndefined: Self = StObject.set(x, "$error", js.undefined)
    
    inline def set$isFocused(value: Boolean): Self = StObject.set(x, "$isFocused", value.asInstanceOf[js.Any])
    
    inline def set$isFocusedUndefined: Self = StObject.set(x, "$isFocused", js.undefined)
    
    inline def set$isReadOnly(value: Boolean): Self = StObject.set(x, "$isReadOnly", value.asInstanceOf[js.Any])
    
    inline def set$isReadOnlyUndefined: Self = StObject.set(x, "$isReadOnly", js.undefined)
    
    inline def set$positive(value: Boolean): Self = StObject.set(x, "$positive", value.asInstanceOf[js.Any])
    
    inline def set$positiveUndefined: Self = StObject.set(x, "$positive", js.undefined)
    
    inline def set$required(value: Boolean): Self = StObject.set(x, "$required", value.asInstanceOf[js.Any])
    
    inline def set$requiredUndefined: Self = StObject.set(x, "$required", js.undefined)
    
    inline def set$resize(value: Resize): Self = StObject.set(x, "$resize", value.asInstanceOf[js.Any])
    
    inline def set$resizeUndefined: Self = StObject.set(x, "$resize", js.undefined)
    
    inline def set$size(value: typingsJapgolly.baseui.textareaTypesMod.Size): Self = StObject.set(x, "$size", value.asInstanceOf[js.Any])
    
    inline def set$theme(value: typingsJapgolly.baseui.stylesTypesMod.Theme): Self = StObject.set(x, "$theme", value.asInstanceOf[js.Any])
  }
}
