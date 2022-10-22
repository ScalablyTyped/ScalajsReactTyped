package typingsJapgolly.antdMobile

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.antdMobile.esComponentsPickerViewPickerViewMod.PickerColumnItem
import typingsJapgolly.antdMobile.esComponentsPickerViewPickerViewMod.PickerValue
import typingsJapgolly.react.mod.NamedExoticComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esComponentsPickerViewWheelMod {
  
  @JSImport("antd-mobile/es/components/picker-view/wheel", "Wheel")
  @js.native
  val Wheel: NamedExoticComponent[Props] = js.native
  
  trait Props extends StObject {
    
    var column: js.Array[PickerColumnItem]
    
    var index: Double
    
    var mouseWheel: Boolean
    
    def onSelect(value: PickerValue, index: Double): Unit
    
    def renderLabel(item: PickerColumnItem): Node
    
    var value: PickerValue
  }
  object Props {
    
    inline def apply(
      column: js.Array[PickerColumnItem],
      index: Double,
      mouseWheel: Boolean,
      onSelect: (PickerValue, Double) => Callback,
      renderLabel: PickerColumnItem => Node
    ): Props = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], mouseWheel = mouseWheel.asInstanceOf[js.Any], onSelect = js.Any.fromFunction2((t0: PickerValue, t1: Double) => (onSelect(t0, t1)).runNow()), renderLabel = js.Any.fromFunction1(renderLabel), value = null)
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setColumn(value: js.Array[PickerColumnItem]): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setColumnVarargs(value: PickerColumnItem*): Self = StObject.set(x, "column", js.Array(value*))
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setMouseWheel(value: Boolean): Self = StObject.set(x, "mouseWheel", value.asInstanceOf[js.Any])
      
      inline def setOnSelect(value: (PickerValue, Double) => Callback): Self = StObject.set(x, "onSelect", js.Any.fromFunction2((t0: PickerValue, t1: Double) => (value(t0, t1)).runNow()))
      
      inline def setRenderLabel(value: PickerColumnItem => Node): Self = StObject.set(x, "renderLabel", js.Any.fromFunction1(value))
      
      inline def setValue(value: PickerValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueNull: Self = StObject.set(x, "value", null)
    }
  }
}
