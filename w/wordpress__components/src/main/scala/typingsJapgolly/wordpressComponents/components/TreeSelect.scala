package typingsJapgolly.wordpressComponents.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.wordpressComponents.treeSelectMod.TreeSelect.Props
import typingsJapgolly.wordpressComponents.treeSelectMod.TreeSelect.Tree
import typingsJapgolly.wordpressComponents.treeSelectMod.TreeSelect.TreeNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TreeSelect {
  
  @JSImport("@wordpress/components", "TreeSelect")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def noOptionLabel(value: String): this.type = set("noOptionLabel", value.asInstanceOf[js.Any])
    
    inline def selectedId(value: String): this.type = set("selectedId", value.asInstanceOf[js.Any])
    
    inline def tree(value: Tree): this.type = set("tree", value.asInstanceOf[js.Any])
    
    inline def treeVarargs(value: TreeNode*): this.type = set("tree", js.Array(value*))
  }
  
  implicit def make(companion: TreeSelect.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
