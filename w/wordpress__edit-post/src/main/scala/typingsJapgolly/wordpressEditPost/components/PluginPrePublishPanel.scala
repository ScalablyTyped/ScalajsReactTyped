package typingsJapgolly.wordpressEditPost.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.wordpressEditPost.anon.OmitPropsname
import typingsJapgolly.wordpressEditPost.componentsSidebarPluginPrePublishPanelMod.PluginPrePublishPanel.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PluginPrePublishPanel {
  
  object Slot {
    
    @JSImport("@wordpress/edit-post", "PluginPrePublishPanel.Slot")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Slot.type): SharedBuilder_OmitPropsname2009588913 = new SharedBuilder_OmitPropsname2009588913(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: OmitPropsname): SharedBuilder_OmitPropsname2009588913 = new SharedBuilder_OmitPropsname2009588913(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("@wordpress/edit-post", "PluginPrePublishPanel")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def initialOpen(value: Boolean): this.type = set("initialOpen", value.asInstanceOf[js.Any])
    
    inline def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: PluginPrePublishPanel.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
