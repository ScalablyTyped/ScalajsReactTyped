package typingsJapgolly.rmcInputNumber

import japgolly.scalajs.react.Callback
import typingsJapgolly.reactNative.mod.ImageStyle
import typingsJapgolly.reactNative.mod.TextStyle
import typingsJapgolly.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait FocusOnUpDown extends StObject {
    
    var focusOnUpDown: Boolean
    
    var max: Double
    
    var min: Double
    
    def onBlur(): Unit
    
    def onChange(): Unit
    
    def onFocus(): Unit
    
    def parser(input: String): String
    
    var prefixCls: String
    
    var step: Double
    
    var useTouch: Boolean
  }
  object FocusOnUpDown {
    
    inline def apply(
      focusOnUpDown: Boolean,
      max: Double,
      min: Double,
      onBlur: Callback,
      onChange: Callback,
      onFocus: Callback,
      parser: String => String,
      prefixCls: String,
      step: Double,
      useTouch: Boolean
    ): FocusOnUpDown = {
      val __obj = js.Dynamic.literal(focusOnUpDown = focusOnUpDown.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], onBlur = onBlur.toJsFn, onChange = onChange.toJsFn, onFocus = onFocus.toJsFn, parser = js.Any.fromFunction1(parser), prefixCls = prefixCls.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any], useTouch = useTouch.asInstanceOf[js.Any])
      __obj.asInstanceOf[FocusOnUpDown]
    }
    
    extension [Self <: FocusOnUpDown](x: Self) {
      
      inline def setFocusOnUpDown(value: Boolean): Self = StObject.set(x, "focusOnUpDown", value.asInstanceOf[js.Any])
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setOnBlur(value: Callback): Self = StObject.set(x, "onBlur", value.toJsFn)
      
      inline def setOnChange(value: Callback): Self = StObject.set(x, "onChange", value.toJsFn)
      
      inline def setOnFocus(value: Callback): Self = StObject.set(x, "onFocus", value.toJsFn)
      
      inline def setParser(value: String => String): Self = StObject.set(x, "parser", js.Any.fromFunction1(value))
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      inline def setUseTouch(value: Boolean): Self = StObject.set(x, "useTouch", value.asInstanceOf[js.Any])
    }
  }
  
  trait Max extends StObject {
    
    var max: Double
    
    var min: Double
    
    def onBlur(): Unit
    
    def onChange(): Unit
    
    def onFocus(): Unit
    
    def parser(input: String): String
    
    var step: Double
  }
  object Max {
    
    inline def apply(
      max: Double,
      min: Double,
      onBlur: Callback,
      onChange: Callback,
      onFocus: Callback,
      parser: String => String,
      step: Double
    ): Max = {
      val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], onBlur = onBlur.toJsFn, onChange = onChange.toJsFn, onFocus = onFocus.toJsFn, parser = js.Any.fromFunction1(parser), step = step.asInstanceOf[js.Any])
      __obj.asInstanceOf[Max]
    }
    
    extension [Self <: Max](x: Self) {
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setOnBlur(value: Callback): Self = StObject.set(x, "onBlur", value.toJsFn)
      
      inline def setOnChange(value: Callback): Self = StObject.set(x, "onChange", value.toJsFn)
      
      inline def setOnFocus(value: Callback): Self = StObject.set(x, "onFocus", value.toJsFn)
      
      inline def setParser(value: String => String): Self = StObject.set(x, "parser", js.Any.fromFunction1(value))
      
      inline def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    }
  }
  
  trait RegisteredStyleBrand extends StObject {
    
    var __registeredStyleBrand: ViewStyle | TextStyle | ImageStyle
  }
  object RegisteredStyleBrand {
    
    inline def apply(__registeredStyleBrand: ViewStyle | TextStyle | ImageStyle): RegisteredStyleBrand = {
      val __obj = js.Dynamic.literal(__registeredStyleBrand = __registeredStyleBrand.asInstanceOf[js.Any])
      __obj.asInstanceOf[RegisteredStyleBrand]
    }
    
    extension [Self <: RegisteredStyleBrand](x: Self) {
      
      inline def set__registeredStyleBrand(value: ViewStyle | TextStyle | ImageStyle): Self = StObject.set(x, "__registeredStyleBrand", value.asInstanceOf[js.Any])
    }
  }
}
