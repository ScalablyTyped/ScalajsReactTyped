package typingsJapgolly.reactBeforeunload.components

import org.scalajs.dom.Event
import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.reactBeforeunload.anon.Children
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Beforeunload {
  
  inline def apply(onBeforeunload: /* arg */ Event => js.UndefOr[String | Unit]): Default[js.Object] = {
    val __props = js.Dynamic.literal(onBeforeunload = js.Any.fromFunction1(onBeforeunload))
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[Children]))
  }
  
  @JSImport("react-beforeunload", "Beforeunload")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: Children): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
