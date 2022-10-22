package typingsJapgolly.reachRect.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reachRect.mod.PRect
import typingsJapgolly.reachRect.mod.RectProps
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Rect {
  
  inline def apply(children: typingsJapgolly.reachRect.anon.Rect => Element): Builder = {
    val __props = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    new Builder(js.Array(this.component, __props.asInstanceOf[RectProps]))
  }
  
  @JSImport("@reach/rect", "Rect")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def observe(value: Boolean): this.type = set("observe", value.asInstanceOf[js.Any])
    
    inline def onChange(value: /* rect */ PRect => Callback): this.type = set("onChange", js.Any.fromFunction1((t0: /* rect */ PRect) => value(t0).runNow()))
  }
  
  def withProps(p: RectProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
