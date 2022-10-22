package typingsJapgolly.reactBootstrap.components

import typingsJapgolly.reactBootstrap.libMediaBodyMod.MediaBodyProps
import typingsJapgolly.reactBootstrap.libMediaBodyMod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MediaBody {
  
  @JSImport("react-bootstrap/lib/MediaBody", JSImport.Namespace)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: MediaBody.type): SharedBuilder_MediaBodyProps_1242228535[^] = new SharedBuilder_MediaBodyProps_1242228535[^](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: MediaBodyProps): SharedBuilder_MediaBodyProps_1242228535[^] = new SharedBuilder_MediaBodyProps_1242228535[^](js.Array(this.component, p.asInstanceOf[js.Any]))
}
