package typingsJapgolly.protonNative.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpinBoxProps
  extends StObject
     with GridChildrenProps
     with Label
     with Stretchy {
  
  /**
    * Whether the Spinbox is enabled.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * When the Spinbox value is changed. The current value is passed as a parameter.
    */
  var onChange: js.UndefOr[js.Function1[/* value */ Double, Unit]] = js.undefined
  
  /**
    * What the value of the Spinbox is set to.
    */
  var value: js.UndefOr[Double] = js.undefined
  
  /**
    * Whether the Spinbox can be seen.
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}
object SpinBoxProps {
  
  inline def apply(): SpinBoxProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpinBoxProps]
  }
  
  extension [Self <: SpinBoxProps](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setOnChange(value: /* value */ Double => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction1((t0: /* value */ Double) => value(t0).runNow()))
    
    inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
