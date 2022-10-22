package typingsJapgolly.mjmlReact.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.mjmlReact.anon.ChildrenName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MjmlHtmlAttribute {
  
  inline def apply(name: String): Default[typingsJapgolly.mjmlReact.mod.MjmlHtmlAttribute] = {
    val __props = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    new Default[typingsJapgolly.mjmlReact.mod.MjmlHtmlAttribute](js.Array(this.component, __props.asInstanceOf[ChildrenName]))
  }
  
  @JSImport("mjml-react", "MjmlHtmlAttribute")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: ChildrenName): Default[typingsJapgolly.mjmlReact.mod.MjmlHtmlAttribute] = new Default[typingsJapgolly.mjmlReact.mod.MjmlHtmlAttribute](js.Array(this.component, p.asInstanceOf[js.Any]))
}
