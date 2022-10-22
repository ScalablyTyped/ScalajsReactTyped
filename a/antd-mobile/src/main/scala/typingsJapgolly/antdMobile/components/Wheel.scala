package typingsJapgolly.antdMobile.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.antdMobile.esComponentsPickerViewPickerViewMod.PickerColumnItem
import typingsJapgolly.antdMobile.esComponentsPickerViewPickerViewMod.PickerValue
import typingsJapgolly.antdMobile.esComponentsPickerViewWheelMod.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Wheel {
  
  inline def apply(
    column: js.Array[PickerColumnItem],
    index: Double,
    mouseWheel: Boolean,
    onSelect: (PickerValue, Double) => Callback,
    renderLabel: PickerColumnItem => Node
  ): Builder = {
    val __props = js.Dynamic.literal(column = column.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], mouseWheel = mouseWheel.asInstanceOf[js.Any], onSelect = js.Any.fromFunction2((t0: PickerValue, t1: Double) => (onSelect(t0, t1)).runNow()), renderLabel = js.Any.fromFunction1(renderLabel))
    new Builder(js.Array(this.component, __props.asInstanceOf[Props]))
  }
  
  @JSImport("antd-mobile/es/components/picker-view/wheel", "Wheel")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def value(value: PickerValue): this.type = set("value", value.asInstanceOf[js.Any])
    
    inline def valueNull: this.type = set("value", null)
  }
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
