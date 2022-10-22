package typingsJapgolly.baseui.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.baseui.anon.LabelInteractable
import typingsJapgolly.baseui.anon.Overrides
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TreeLabelInteractable {
  
  @JSImport("baseui/tree-view", "TreeLabelInteractable")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def overrides(value: LabelInteractable): this.type = set("overrides", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: TreeLabelInteractable.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: Overrides): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
