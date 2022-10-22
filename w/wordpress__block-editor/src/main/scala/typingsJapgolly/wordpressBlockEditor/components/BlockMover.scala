package typingsJapgolly.wordpressBlockEditor.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.wordpressBlockEditor.componentsBlockMoverMod.BlockMover.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object BlockMover {
  
  inline def apply(clientIds: js.Array[String]): Builder = {
    val __props = js.Dynamic.literal(clientIds = clientIds.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[Props]))
  }
  
  @JSImport("@wordpress/block-editor", "BlockMover")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def blockElementId(value: String): this.type = set("blockElementId", value.asInstanceOf[js.Any])
    
    inline def instanceId(value: String): this.type = set("instanceId", value.asInstanceOf[js.Any])
    
    inline def isDraggable(value: Boolean): this.type = set("isDraggable", value.asInstanceOf[js.Any])
    
    inline def isHidden(value: Boolean): this.type = set("isHidden", value.asInstanceOf[js.Any])
    
    inline def onDragEnd(value: Callback): this.type = set("onDragEnd", value.toJsFn)
    
    inline def onDragStart(value: Callback): this.type = set("onDragStart", value.toJsFn)
  }
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
