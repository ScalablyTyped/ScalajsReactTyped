package typingsJapgolly.materialAnimation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  trait CssVendorProperty extends StObject {
    
    var prefixed: PrefixedCssPropertyName
    
    var standard: StandardCssPropertyName
  }
  object CssVendorProperty {
    
    inline def apply(prefixed: PrefixedCssPropertyName, standard: StandardCssPropertyName): CssVendorProperty = {
      val __obj = js.Dynamic.literal(prefixed = prefixed.asInstanceOf[js.Any], standard = standard.asInstanceOf[js.Any])
      __obj.asInstanceOf[CssVendorProperty]
    }
    
    extension [Self <: CssVendorProperty](x: Self) {
      
      inline def setPrefixed(value: PrefixedCssPropertyName): Self = StObject.set(x, "prefixed", value.asInstanceOf[js.Any])
      
      inline def setStandard(value: StandardCssPropertyName): Self = StObject.set(x, "standard", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined {[ K in @material/animation.@material/animation/types.StandardCssPropertyName ]: @material/animation.@material/animation/types.CssVendorProperty} */
  trait CssVendorPropertyMap extends StObject {
    
    var animation: CssVendorProperty
    
    var transform: CssVendorProperty
    
    var transition: CssVendorProperty
  }
  object CssVendorPropertyMap {
    
    inline def apply(animation: CssVendorProperty, transform: CssVendorProperty, transition: CssVendorProperty): CssVendorPropertyMap = {
      val __obj = js.Dynamic.literal(animation = animation.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any], transition = transition.asInstanceOf[js.Any])
      __obj.asInstanceOf[CssVendorPropertyMap]
    }
    
    extension [Self <: CssVendorPropertyMap](x: Self) {
      
      inline def setAnimation(value: CssVendorProperty): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
      
      inline def setTransform(value: CssVendorProperty): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
      
      inline def setTransition(value: CssVendorProperty): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
    }
  }
  
  trait JsVendorProperty extends StObject {
    
    var cssProperty: StandardCssPropertyName
    
    var prefixed: PrefixedJsEventType
    
    var standard: StandardJsEventType
  }
  object JsVendorProperty {
    
    inline def apply(cssProperty: StandardCssPropertyName, prefixed: PrefixedJsEventType, standard: StandardJsEventType): JsVendorProperty = {
      val __obj = js.Dynamic.literal(cssProperty = cssProperty.asInstanceOf[js.Any], prefixed = prefixed.asInstanceOf[js.Any], standard = standard.asInstanceOf[js.Any])
      __obj.asInstanceOf[JsVendorProperty]
    }
    
    extension [Self <: JsVendorProperty](x: Self) {
      
      inline def setCssProperty(value: StandardCssPropertyName): Self = StObject.set(x, "cssProperty", value.asInstanceOf[js.Any])
      
      inline def setPrefixed(value: PrefixedJsEventType): Self = StObject.set(x, "prefixed", value.asInstanceOf[js.Any])
      
      inline def setStandard(value: StandardJsEventType): Self = StObject.set(x, "standard", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined {[ K in @material/animation.@material/animation/types.StandardJsEventType ]: @material/animation.@material/animation/types.JsVendorProperty} */
  trait JsVendorPropertyMap extends StObject {
    
    var animationend: JsVendorProperty
    
    var animationiteration: JsVendorProperty
    
    var animationstart: JsVendorProperty
    
    var transitionend: JsVendorProperty
  }
  object JsVendorPropertyMap {
    
    inline def apply(
      animationend: JsVendorProperty,
      animationiteration: JsVendorProperty,
      animationstart: JsVendorProperty,
      transitionend: JsVendorProperty
    ): JsVendorPropertyMap = {
      val __obj = js.Dynamic.literal(animationend = animationend.asInstanceOf[js.Any], animationiteration = animationiteration.asInstanceOf[js.Any], animationstart = animationstart.asInstanceOf[js.Any], transitionend = transitionend.asInstanceOf[js.Any])
      __obj.asInstanceOf[JsVendorPropertyMap]
    }
    
    extension [Self <: JsVendorPropertyMap](x: Self) {
      
      inline def setAnimationend(value: JsVendorProperty): Self = StObject.set(x, "animationend", value.asInstanceOf[js.Any])
      
      inline def setAnimationiteration(value: JsVendorProperty): Self = StObject.set(x, "animationiteration", value.asInstanceOf[js.Any])
      
      inline def setAnimationstart(value: JsVendorProperty): Self = StObject.set(x, "animationstart", value.asInstanceOf[js.Any])
      
      inline def setTransitionend(value: JsVendorProperty): Self = StObject.set(x, "transitionend", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.materialAnimation.materialAnimationStrings.`-webkit-animation`
    - typingsJapgolly.materialAnimation.materialAnimationStrings.`-webkit-transform`
    - typingsJapgolly.materialAnimation.materialAnimationStrings.`-webkit-transition`
  */
  trait PrefixedCssPropertyName extends StObject
  object PrefixedCssPropertyName {
    
    inline def `-webkit-animation`: typingsJapgolly.materialAnimation.materialAnimationStrings.`-webkit-animation` = "-webkit-animation".asInstanceOf[typingsJapgolly.materialAnimation.materialAnimationStrings.`-webkit-animation`]
    
    inline def `-webkit-transform`: typingsJapgolly.materialAnimation.materialAnimationStrings.`-webkit-transform` = "-webkit-transform".asInstanceOf[typingsJapgolly.materialAnimation.materialAnimationStrings.`-webkit-transform`]
    
    inline def `-webkit-transition`: typingsJapgolly.materialAnimation.materialAnimationStrings.`-webkit-transition` = "-webkit-transition".asInstanceOf[typingsJapgolly.materialAnimation.materialAnimationStrings.`-webkit-transition`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.materialAnimation.materialAnimationStrings.webkitAnimationEnd
    - typingsJapgolly.materialAnimation.materialAnimationStrings.webkitAnimationIteration
    - typingsJapgolly.materialAnimation.materialAnimationStrings.webkitAnimationStart
    - typingsJapgolly.materialAnimation.materialAnimationStrings.webkitTransitionEnd
  */
  trait PrefixedJsEventType extends StObject
  object PrefixedJsEventType {
    
    inline def webkitAnimationEnd: typingsJapgolly.materialAnimation.materialAnimationStrings.webkitAnimationEnd = "webkitAnimationEnd".asInstanceOf[typingsJapgolly.materialAnimation.materialAnimationStrings.webkitAnimationEnd]
    
    inline def webkitAnimationIteration: typingsJapgolly.materialAnimation.materialAnimationStrings.webkitAnimationIteration = "webkitAnimationIteration".asInstanceOf[typingsJapgolly.materialAnimation.materialAnimationStrings.webkitAnimationIteration]
    
    inline def webkitAnimationStart: typingsJapgolly.materialAnimation.materialAnimationStrings.webkitAnimationStart = "webkitAnimationStart".asInstanceOf[typingsJapgolly.materialAnimation.materialAnimationStrings.webkitAnimationStart]
    
    inline def webkitTransitionEnd: typingsJapgolly.materialAnimation.materialAnimationStrings.webkitTransitionEnd = "webkitTransitionEnd".asInstanceOf[typingsJapgolly.materialAnimation.materialAnimationStrings.webkitTransitionEnd]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.materialAnimation.materialAnimationStrings.animation
    - typingsJapgolly.materialAnimation.materialAnimationStrings.transform
    - typingsJapgolly.materialAnimation.materialAnimationStrings.transition
  */
  trait StandardCssPropertyName extends StObject
  object StandardCssPropertyName {
    
    inline def animation: typingsJapgolly.materialAnimation.materialAnimationStrings.animation = "animation".asInstanceOf[typingsJapgolly.materialAnimation.materialAnimationStrings.animation]
    
    inline def transform: typingsJapgolly.materialAnimation.materialAnimationStrings.transform = "transform".asInstanceOf[typingsJapgolly.materialAnimation.materialAnimationStrings.transform]
    
    inline def transition: typingsJapgolly.materialAnimation.materialAnimationStrings.transition = "transition".asInstanceOf[typingsJapgolly.materialAnimation.materialAnimationStrings.transition]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.materialAnimation.materialAnimationStrings.animationend
    - typingsJapgolly.materialAnimation.materialAnimationStrings.animationiteration
    - typingsJapgolly.materialAnimation.materialAnimationStrings.animationstart
    - typingsJapgolly.materialAnimation.materialAnimationStrings.transitionend
  */
  trait StandardJsEventType extends StObject
  object StandardJsEventType {
    
    inline def animationend: typingsJapgolly.materialAnimation.materialAnimationStrings.animationend = "animationend".asInstanceOf[typingsJapgolly.materialAnimation.materialAnimationStrings.animationend]
    
    inline def animationiteration: typingsJapgolly.materialAnimation.materialAnimationStrings.animationiteration = "animationiteration".asInstanceOf[typingsJapgolly.materialAnimation.materialAnimationStrings.animationiteration]
    
    inline def animationstart: typingsJapgolly.materialAnimation.materialAnimationStrings.animationstart = "animationstart".asInstanceOf[typingsJapgolly.materialAnimation.materialAnimationStrings.animationstart]
    
    inline def transitionend: typingsJapgolly.materialAnimation.materialAnimationStrings.transitionend = "transitionend".asInstanceOf[typingsJapgolly.materialAnimation.materialAnimationStrings.transitionend]
  }
}
