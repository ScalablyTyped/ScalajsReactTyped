package typingsJapgolly.wordpressEditor.components

import typingsJapgolly.std.Record
import typingsJapgolly.wordpressEditor.componentsProviderMod.EditorProvider.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object EditorProvider {
  
  inline def apply(post: Record[String, Any]): SharedBuilder_Props_692230639 = {
    val __props = js.Dynamic.literal(post = post.asInstanceOf[js.Any])
    new SharedBuilder_Props_692230639(js.Array(this.component, __props.asInstanceOf[Props]))
  }
  
  @JSImport("@wordpress/editor", "EditorProvider")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: Props): SharedBuilder_Props_692230639 = new SharedBuilder_Props_692230639(js.Array(this.component, p.asInstanceOf[js.Any]))
}
