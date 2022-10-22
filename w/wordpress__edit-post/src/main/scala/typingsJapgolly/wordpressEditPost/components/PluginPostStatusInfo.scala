package typingsJapgolly.wordpressEditPost.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.wordpressEditPost.anon.OmitPropsname
import typingsJapgolly.wordpressEditPost.componentsSidebarPluginPostStatusInfoMod.PluginPostStatusInfo.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PluginPostStatusInfo {
  
  object Slot {
    
    @JSImport("@wordpress/edit-post", "PluginPostStatusInfo.Slot")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Slot.type): SharedBuilder_OmitPropsname2009588913 = new SharedBuilder_OmitPropsname2009588913(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: OmitPropsname): SharedBuilder_OmitPropsname2009588913 = new SharedBuilder_OmitPropsname2009588913(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("@wordpress/edit-post", "PluginPostStatusInfo")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: PluginPostStatusInfo.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
