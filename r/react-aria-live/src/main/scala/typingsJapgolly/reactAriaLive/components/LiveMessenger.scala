package typingsJapgolly.reactAriaLive.components

import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.reactAriaLive.anon.AnnounceAssertive
import typingsJapgolly.reactAriaLive.anon.Children
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object LiveMessenger {
  
  inline def apply(children: AnnounceAssertive => Node): Default[js.Object] = {
    val __props = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[Children]))
  }
  
  @JSImport("react-aria-live", "LiveMessenger")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: Children): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
