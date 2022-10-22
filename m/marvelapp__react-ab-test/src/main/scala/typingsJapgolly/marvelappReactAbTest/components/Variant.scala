package typingsJapgolly.marvelappReactAbTest.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.marvelappReactAbTest.anon.Children
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Variant {
  
  inline def apply(name: String): Default[js.Object] = {
    val __props = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[Children]))
  }
  
  @JSImport("@marvelapp/react-ab-test", "Variant")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: Children): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
