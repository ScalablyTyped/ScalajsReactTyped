package typingsJapgolly.mjmlReact.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.mjmlReact.anon.Name
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MjmlClass {
  
  inline def apply(name: String): Default[typingsJapgolly.mjmlReact.mod.MjmlClass] = {
    val __props = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    new Default[typingsJapgolly.mjmlReact.mod.MjmlClass](js.Array(this.component, __props.asInstanceOf[Name]))
  }
  
  @JSImport("mjml-react", "MjmlClass")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: Name): Default[typingsJapgolly.mjmlReact.mod.MjmlClass] = new Default[typingsJapgolly.mjmlReact.mod.MjmlClass](js.Array(this.component, p.asInstanceOf[js.Any]))
}
