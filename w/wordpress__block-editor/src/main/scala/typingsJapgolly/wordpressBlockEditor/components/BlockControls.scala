package typingsJapgolly.wordpressBlockEditor.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.wordpressBlockEditor.anon.OmitPropsname
import typingsJapgolly.wordpressBlockEditor.componentsBlockControlsMod.BlockControls.Props
import typingsJapgolly.wordpressComponents.toolbarMod.Toolbar.Control
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object BlockControls {
  
  object Slot {
    
    @JSImport("@wordpress/block-editor", "BlockControls.Slot")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Slot.type): SharedBuilder_OmitPropsname1231433775 = new SharedBuilder_OmitPropsname1231433775(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: OmitPropsname): SharedBuilder_OmitPropsname1231433775 = new SharedBuilder_OmitPropsname1231433775(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("@wordpress/block-editor", "BlockControls")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def controls(value: js.Array[js.Array[Control] | Control]): this.type = set("controls", value.asInstanceOf[js.Any])
    
    inline def controlsVarargs(value: (js.Array[Control] | Control)*): this.type = set("controls", js.Array(value*))
  }
  
  implicit def make(companion: BlockControls.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
