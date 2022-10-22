package typingsJapgolly.rmcPicker

import japgolly.scalajs.react.Callback
import typingsJapgolly.rmcPicker.anon.ComponentDidUpdate
import typingsJapgolly.rmcPicker.libPickerMixinMod.IItemProps
import typingsJapgolly.rmcPicker.libPickerTypesMod.IPickerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPickerMod {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("rmc-picker/lib/Picker", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with ComponentDidUpdate {
    def this(props: IPickerProps) = this()
    def this(props: Unit, context: Any) = this()
    def this(props: IPickerProps, context: Any) = this()
  }
  object default {
    
    @JSImport("rmc-picker/lib/Picker", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def Item(_props: IItemProps): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("Item")(_props.asInstanceOf[js.Any]).asInstanceOf[Any]
  }
  
  trait IPickerProp extends StObject {
    
    def computeChildIndex(arg: Any*): Double
    
    def doScrollingComplete(arg: Any*): Unit
    
    def select(arg: Any*): Unit
  }
  object IPickerProp {
    
    inline def apply(
      computeChildIndex: /* repeated */ Any => Double,
      doScrollingComplete: /* repeated */ Any => Callback,
      select: /* repeated */ Any => Callback
    ): IPickerProp = {
      val __obj = js.Dynamic.literal(computeChildIndex = js.Any.fromFunction1(computeChildIndex), doScrollingComplete = js.Any.fromFunction1((t0: /* repeated */ Any) => doScrollingComplete(t0).runNow()), select = js.Any.fromFunction1((t0: /* repeated */ Any) => select(t0).runNow()))
      __obj.asInstanceOf[IPickerProp]
    }
    
    extension [Self <: IPickerProp](x: Self) {
      
      inline def setComputeChildIndex(value: /* repeated */ Any => Double): Self = StObject.set(x, "computeChildIndex", js.Any.fromFunction1(value))
      
      inline def setDoScrollingComplete(value: /* repeated */ Any => Callback): Self = StObject.set(x, "doScrollingComplete", js.Any.fromFunction1((t0: /* repeated */ Any) => value(t0).runNow()))
      
      inline def setSelect(value: /* repeated */ Any => Callback): Self = StObject.set(x, "select", js.Any.fromFunction1((t0: /* repeated */ Any) => value(t0).runNow()))
    }
  }
}
