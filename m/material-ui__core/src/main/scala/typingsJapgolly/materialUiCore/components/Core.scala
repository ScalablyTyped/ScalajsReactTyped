package typingsJapgolly.materialUiCore.components

import typingsJapgolly.materialUiCore.zoomZoomMod.ZoomProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Core {
  
  @JSImport("@material-ui/core", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Core.type): SharedBuilder_ZoomProps_2021307965 = new SharedBuilder_ZoomProps_2021307965(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ZoomProps): SharedBuilder_ZoomProps_2021307965 = new SharedBuilder_ZoomProps_2021307965(js.Array(this.component, p.asInstanceOf[js.Any]))
}
