package typingsJapgolly.baseui.anon

import typingsJapgolly.baseui.baseuiStrings.compact
import typingsJapgolly.baseui.baseuiStrings.default_
import typingsJapgolly.baseui.baseuiStrings.large_
import typingsJapgolly.baseui.baseuiStrings.mini
import typingsJapgolly.baseui.baseuiStrings.search
import typingsJapgolly.baseui.baseuiStrings.select
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Clearable extends StObject {
  
  @JSName("$clearable")
  var $clearable: Boolean
  
  @JSName("$creatable")
  var $creatable: Boolean
  
  @JSName("$disabled")
  var $disabled: Boolean
  
  @JSName("$error")
  var $error: Boolean
  
  @JSName("$isEmpty")
  var $isEmpty: Boolean
  
  @JSName("$isFocused")
  var $isFocused: Boolean
  
  @JSName("$isLoading")
  var $isLoading: Boolean
  
  @JSName("$isOpen")
  var $isOpen: Boolean
  
  @JSName("$isPseudoFocused")
  var $isPseudoFocused: Boolean
  
  @JSName("$multi")
  var $multi: Boolean
  
  @JSName("$positive")
  var $positive: Boolean
  
  @JSName("$required")
  var $required: Boolean
  
  @JSName("$searchable")
  var $searchable: Boolean
  
  @JSName("$size")
  var $size: default_ | compact | large_ | mini
  
  @JSName("$type")
  var $type: search | select
}
object Clearable {
  
  inline def apply(
    $clearable: Boolean,
    $creatable: Boolean,
    $disabled: Boolean,
    $error: Boolean,
    $isEmpty: Boolean,
    $isFocused: Boolean,
    $isLoading: Boolean,
    $isOpen: Boolean,
    $isPseudoFocused: Boolean,
    $multi: Boolean,
    $positive: Boolean,
    $required: Boolean,
    $searchable: Boolean,
    $size: default_ | compact | large_ | mini,
    $type: search | select
  ): Clearable = {
    val __obj = js.Dynamic.literal($clearable = $clearable.asInstanceOf[js.Any], $creatable = $creatable.asInstanceOf[js.Any], $disabled = $disabled.asInstanceOf[js.Any], $error = $error.asInstanceOf[js.Any], $isEmpty = $isEmpty.asInstanceOf[js.Any], $isFocused = $isFocused.asInstanceOf[js.Any], $isLoading = $isLoading.asInstanceOf[js.Any], $isOpen = $isOpen.asInstanceOf[js.Any], $isPseudoFocused = $isPseudoFocused.asInstanceOf[js.Any], $multi = $multi.asInstanceOf[js.Any], $positive = $positive.asInstanceOf[js.Any], $required = $required.asInstanceOf[js.Any], $searchable = $searchable.asInstanceOf[js.Any], $size = $size.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any])
    __obj.asInstanceOf[Clearable]
  }
  
  extension [Self <: Clearable](x: Self) {
    
    inline def set$clearable(value: Boolean): Self = StObject.set(x, "$clearable", value.asInstanceOf[js.Any])
    
    inline def set$creatable(value: Boolean): Self = StObject.set(x, "$creatable", value.asInstanceOf[js.Any])
    
    inline def set$disabled(value: Boolean): Self = StObject.set(x, "$disabled", value.asInstanceOf[js.Any])
    
    inline def set$error(value: Boolean): Self = StObject.set(x, "$error", value.asInstanceOf[js.Any])
    
    inline def set$isEmpty(value: Boolean): Self = StObject.set(x, "$isEmpty", value.asInstanceOf[js.Any])
    
    inline def set$isFocused(value: Boolean): Self = StObject.set(x, "$isFocused", value.asInstanceOf[js.Any])
    
    inline def set$isLoading(value: Boolean): Self = StObject.set(x, "$isLoading", value.asInstanceOf[js.Any])
    
    inline def set$isOpen(value: Boolean): Self = StObject.set(x, "$isOpen", value.asInstanceOf[js.Any])
    
    inline def set$isPseudoFocused(value: Boolean): Self = StObject.set(x, "$isPseudoFocused", value.asInstanceOf[js.Any])
    
    inline def set$multi(value: Boolean): Self = StObject.set(x, "$multi", value.asInstanceOf[js.Any])
    
    inline def set$positive(value: Boolean): Self = StObject.set(x, "$positive", value.asInstanceOf[js.Any])
    
    inline def set$required(value: Boolean): Self = StObject.set(x, "$required", value.asInstanceOf[js.Any])
    
    inline def set$searchable(value: Boolean): Self = StObject.set(x, "$searchable", value.asInstanceOf[js.Any])
    
    inline def set$size(value: default_ | compact | large_ | mini): Self = StObject.set(x, "$size", value.asInstanceOf[js.Any])
    
    inline def set$type(value: search | select): Self = StObject.set(x, "$type", value.asInstanceOf[js.Any])
  }
}
