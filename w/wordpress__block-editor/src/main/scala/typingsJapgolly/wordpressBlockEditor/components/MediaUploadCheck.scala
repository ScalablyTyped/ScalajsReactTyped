package typingsJapgolly.wordpressBlockEditor.components

import typingsJapgolly.wordpressBlockEditor.componentsMediaUploadCheckMod.MediaUploadCheck.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MediaUploadCheck {
  
  @JSImport("@wordpress/block-editor", "MediaUploadCheck")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: MediaUploadCheck.type): SharedBuilder_Props1925757978 = new SharedBuilder_Props1925757978(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: Props): SharedBuilder_Props1925757978 = new SharedBuilder_Props1925757978(js.Array(this.component, p.asInstanceOf[js.Any]))
}
