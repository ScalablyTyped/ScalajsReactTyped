package typingsJapgolly.cathoQuantum.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLButtonElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.cathoQuantum.anon.`20`
import typingsJapgolly.cathoQuantum.segmentedControlMod.SegmentedControlProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SegmentedControl {
  
  inline def apply(items: js.Array[typingsJapgolly.cathoQuantum.anon.Icon]): Builder = {
    val __props = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[SegmentedControlProps]))
  }
  
  @JSImport("@catho/quantum/SegmentedControl", "SegmentedControl")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def darkMode(value: Boolean): this.type = set("darkMode", value.asInstanceOf[js.Any])
    
    inline def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
    
    inline def onChange(value: ReactMouseEventFrom[HTMLButtonElement & Element] => Callback): this.type = set("onChange", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLButtonElement & Element]) => value(t0).runNow()))
    
    inline def theme(value: `20`): this.type = set("theme", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: SegmentedControlProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
