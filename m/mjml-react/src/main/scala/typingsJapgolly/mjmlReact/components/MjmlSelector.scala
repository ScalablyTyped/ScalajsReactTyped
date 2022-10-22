package typingsJapgolly.mjmlReact.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.mjmlReact.anon.Path
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MjmlSelector {
  
  inline def apply(path: String): Default[typingsJapgolly.mjmlReact.mod.MjmlSelector] = {
    val __props = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    new Default[typingsJapgolly.mjmlReact.mod.MjmlSelector](js.Array(this.component, __props.asInstanceOf[Path]))
  }
  
  @JSImport("mjml-react", "MjmlSelector")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: Path): Default[typingsJapgolly.mjmlReact.mod.MjmlSelector] = new Default[typingsJapgolly.mjmlReact.mod.MjmlSelector](js.Array(this.component, p.asInstanceOf[js.Any]))
}
