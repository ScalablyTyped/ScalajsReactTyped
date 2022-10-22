package typingsJapgolly.reactBootstrap.components

import typingsJapgolly.reactBootstrap.libMediaHeadingMod.MediaHeadingProps
import typingsJapgolly.reactBootstrap.libMediaHeadingMod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MediaHeading {
  
  @JSImport("react-bootstrap/lib/MediaHeading", JSImport.Namespace)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: MediaHeading.type): SharedBuilder_MediaHeadingProps_1857553960[^] = new SharedBuilder_MediaHeadingProps_1857553960[^](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: MediaHeadingProps): SharedBuilder_MediaHeadingProps_1857553960[^] = new SharedBuilder_MediaHeadingProps_1857553960[^](js.Array(this.component, p.asInstanceOf[js.Any]))
}
