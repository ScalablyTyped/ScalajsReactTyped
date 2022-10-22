package typingsJapgolly.gestalt.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.gestalt.anon.ActiveIndex
import typingsJapgolly.gestalt.mod.SegmentedControlProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SegmentedControl {
  
  inline def apply(items: js.Array[Node], onChange: ActiveIndex => Callback, selectedItemIndex: Double): Builder = {
    val __props = js.Dynamic.literal(items = items.asInstanceOf[js.Any], onChange = js.Any.fromFunction1((t0: ActiveIndex) => onChange(t0).runNow()), selectedItemIndex = selectedItemIndex.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[SegmentedControlProps]))
  }
  
  @JSImport("gestalt", "SegmentedControl")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def responsive(value: Boolean): this.type = set("responsive", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: SegmentedControlProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
