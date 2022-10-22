package typingsJapgolly.reactHtml5CameraPhoto.components

import typingsJapgolly.reactHtml5CameraPhoto.mod.CameraProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactHtml5CameraPhoto {
  
  @JSImport("react-html5-camera-photo", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: ReactHtml5CameraPhoto.type): SharedBuilder_CameraProps_466704511 = new SharedBuilder_CameraProps_466704511(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: CameraProps): SharedBuilder_CameraProps_466704511 = new SharedBuilder_CameraProps_466704511(js.Array(this.component, p.asInstanceOf[js.Any]))
}
