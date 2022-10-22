package typingsJapgolly.rcTreeSelect.components

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.rcTreeSelect.esInterfaceMod.Key
import typingsJapgolly.rcTreeSelect.esTreeNodeMod.TreeNodeProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TreeNode {
  
  inline def apply(value: Key): Builder = {
    val __props = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[TreeNodeProps]))
  }
  
  @JSImport("rc-tree-select", "TreeNode")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def checkable(value: Boolean): this.type = set("checkable", value.asInstanceOf[js.Any])
    
    inline def disableCheckbox(value: Boolean): this.type = set("disableCheckbox", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def label(value: VdomNode): this.type = set("label", value.rawNode.asInstanceOf[js.Any])
    
    inline def labelNull: this.type = set("label", null)
    
    inline def labelVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("label", js.Array(value*))
    
    inline def labelVdomElement(value: VdomElement): this.type = set("label", value.rawElement.asInstanceOf[js.Any])
    
    inline def title(value: VdomNode): this.type = set("title", value.rawNode.asInstanceOf[js.Any])
    
    inline def titleNull: this.type = set("title", null)
    
    inline def titleVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("title", js.Array(value*))
    
    inline def titleVdomElement(value: VdomElement): this.type = set("title", value.rawElement.asInstanceOf[js.Any])
  }
  
  def withProps(p: TreeNodeProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
