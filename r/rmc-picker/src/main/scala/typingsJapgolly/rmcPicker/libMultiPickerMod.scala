package typingsJapgolly.rmcPicker

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.rmcPicker.anon.ComponentDidMount
import typingsJapgolly.rmcPicker.anon.OnValueChange
import typingsJapgolly.rmcPicker.libMultiPickerPropsMod.IMultiPickerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMultiPickerMod {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("rmc-picker/lib/MultiPicker", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with ComponentDidMount {
    def this(props: IMultiPickerProps) = this()
    def this(props: Unit, context: Any) = this()
    def this(props: IMultiPickerProps, context: Any) = this()
  }
  object default {
    
    @JSImport("rmc-picker/lib/MultiPicker", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rmc-picker/lib/MultiPicker", "default.defaultProps")
    @js.native
    def defaultProps: OnValueChange = js.native
    inline def defaultProps_=(x: OnValueChange): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  trait IMultiPickerProp extends StObject {
    
    def getValue(): Any
  }
  object IMultiPickerProp {
    
    inline def apply(getValue: CallbackTo[Any]): IMultiPickerProp = {
      val __obj = js.Dynamic.literal(getValue = getValue.toJsFn)
      __obj.asInstanceOf[IMultiPickerProp]
    }
    
    extension [Self <: IMultiPickerProp](x: Self) {
      
      inline def setGetValue(value: CallbackTo[Any]): Self = StObject.set(x, "getValue", value.toJsFn)
    }
  }
}
