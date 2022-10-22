package typingsJapgolly.wordpressEditor.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.wordpressBlockEditor.anon.OmitPropsname
import typingsJapgolly.wordpressBlockEditor.componentsInspectorControlsMod.InspectorControls.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object InspectorControls {
  
  object Slot {
    
    @JSImport("@wordpress/editor", "InspectorControls.Slot")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Slot.type): SharedBuilder_OmitPropsname1231433775 = new SharedBuilder_OmitPropsname1231433775(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: OmitPropsname): SharedBuilder_OmitPropsname1231433775 = new SharedBuilder_OmitPropsname1231433775(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("@wordpress/editor", "InspectorControls")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: InspectorControls.type): Default[js.Object] = new Default[js.Object](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: Props): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
