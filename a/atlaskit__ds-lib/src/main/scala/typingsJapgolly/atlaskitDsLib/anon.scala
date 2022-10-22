package typingsJapgolly.atlaskitDsLib

import japgolly.scalajs.react.Callback
import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.react.mod.MutableRefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait BindFocus extends StObject {
    
    var bindFocus: OnBlur
    
    var isFocused: Boolean
  }
  object BindFocus {
    
    inline def apply(bindFocus: OnBlur, isFocused: Boolean): BindFocus = {
      val __obj = js.Dynamic.literal(bindFocus = bindFocus.asInstanceOf[js.Any], isFocused = isFocused.asInstanceOf[js.Any])
      __obj.asInstanceOf[BindFocus]
    }
    
    extension [Self <: BindFocus](x: Self) {
      
      inline def setBindFocus(value: OnBlur): Self = StObject.set(x, "bindFocus", value.asInstanceOf[js.Any])
      
      inline def setIsFocused(value: Boolean): Self = StObject.set(x, "isFocused", value.asInstanceOf[js.Any])
    }
  }
  
  trait OnBlur extends StObject {
    
    def onBlur(): Unit
    
    def onFocus(): Unit
  }
  object OnBlur {
    
    inline def apply(onBlur: Callback, onFocus: Callback): OnBlur = {
      val __obj = js.Dynamic.literal(onBlur = onBlur.toJsFn, onFocus = onFocus.toJsFn)
      __obj.asInstanceOf[OnBlur]
    }
    
    extension [Self <: OnBlur](x: Self) {
      
      inline def setOnBlur(value: Callback): Self = StObject.set(x, "onBlur", value.toJsFn)
      
      inline def setOnFocus(value: Callback): Self = StObject.set(x, "onFocus", value.toJsFn)
    }
  }
  
  trait Ref extends StObject {
    
    var ref: MutableRefObject[HTMLDivElement | Null]
    
    var width: Double
  }
  object Ref {
    
    inline def apply(ref: MutableRefObject[HTMLDivElement | Null], width: Double): Ref = {
      val __obj = js.Dynamic.literal(ref = ref.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Ref]
    }
    
    extension [Self <: Ref](x: Self) {
      
      inline def setRef(value: MutableRefObject[HTMLDivElement | Null]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
}
