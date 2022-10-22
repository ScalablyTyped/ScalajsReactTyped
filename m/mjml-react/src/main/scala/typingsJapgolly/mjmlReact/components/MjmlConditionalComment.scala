package typingsJapgolly.mjmlReact.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.mjmlReact.anon.Condition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MjmlConditionalComment {
  
  inline def apply(children: String, condition: String): Default[typingsJapgolly.mjmlReact.extensionsMod.MjmlConditionalComment] = {
    val __props = js.Dynamic.literal(children = children.asInstanceOf[js.Any], condition = condition.asInstanceOf[js.Any])
    new Default[typingsJapgolly.mjmlReact.extensionsMod.MjmlConditionalComment](js.Array(this.component, __props.asInstanceOf[Condition]))
  }
  
  @JSImport("mjml-react/extensions", "MjmlConditionalComment")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: Condition): Default[typingsJapgolly.mjmlReact.extensionsMod.MjmlConditionalComment] = new Default[typingsJapgolly.mjmlReact.extensionsMod.MjmlConditionalComment](js.Array(this.component, p.asInstanceOf[js.Any]))
}
