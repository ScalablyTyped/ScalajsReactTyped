package typingsJapgolly.mjmlReact.components

import typingsJapgolly.mjmlReact.anon.Children
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MjmlComment {
  
  inline def apply(children: String): SharedBuilder_Children_1291238532[typingsJapgolly.mjmlReact.extensionsMod.MjmlComment] = {
    val __props = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    new SharedBuilder_Children_1291238532[typingsJapgolly.mjmlReact.extensionsMod.MjmlComment](js.Array(this.component, __props.asInstanceOf[Children]))
  }
  
  @JSImport("mjml-react/extensions", "MjmlComment")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: Children): SharedBuilder_Children_1291238532[typingsJapgolly.mjmlReact.extensionsMod.MjmlComment] = new SharedBuilder_Children_1291238532[typingsJapgolly.mjmlReact.extensionsMod.MjmlComment](js.Array(this.component, p.asInstanceOf[js.Any]))
}
