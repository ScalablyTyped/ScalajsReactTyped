package typingsJapgolly.antd

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.Component
import typingsJapgolly.antd.libDatePickerGeneratePickerMod.PickerProps
import typingsJapgolly.antd.libDatePickerGeneratePickerMod.RangePickerProps
import typingsJapgolly.react.mod.ComponentClass
import typingsJapgolly.react.mod.ForwardedRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDatePickerGeneratePickerInterfaceMod {
  
  trait CommonPickerMethods extends StObject {
    
    def blur(): Unit
    
    def focus(): Unit
  }
  object CommonPickerMethods {
    
    inline def apply(blur: Callback, focus: Callback): CommonPickerMethods = {
      val __obj = js.Dynamic.literal(blur = blur.toJsFn, focus = focus.toJsFn)
      __obj.asInstanceOf[CommonPickerMethods]
    }
    
    extension [Self <: CommonPickerMethods](x: Self) {
      
      inline def setBlur(value: Callback): Self = StObject.set(x, "blur", value.toJsFn)
      
      inline def setFocus(value: Callback): Self = StObject.set(x, "focus", value.toJsFn)
    }
  }
  
  type DatePickRef[DateType] = PickerRef[PickerProps[DateType]]
  
  @js.native
  trait PickerComponentClass[P, S]
    extends StObject
       with ComponentClass[P, S]
  
  type PickerRef[P] = ForwardedRef[(Component[P & js.Object, js.Object]) & CommonPickerMethods]
  
  type RangePickerRef[DateType] = PickerRef[RangePickerProps[DateType]]
}
