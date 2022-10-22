package typingsJapgolly.wordpressEditor.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.wordpressBlockEditor.componentsBlockInspectorMod.BlockInspector.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object BlockInspector {
  
  @JSImport("@wordpress/editor", "BlockInspector")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def showNoBlockSelectedMessage(value: Boolean): this.type = set("showNoBlockSelectedMessage", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: BlockInspector.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
