package typingsJapgolly.reactBootstrap.components

import typingsJapgolly.reactBootstrap.libMediaLeftMod.MediaLeftProps
import typingsJapgolly.reactBootstrap.libMediaLeftMod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MediaLeft {
  
  @JSImport("react-bootstrap/lib/MediaLeft", JSImport.Namespace)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: MediaLeft.type): SharedBuilder_MediaLeftProps1145560552[^] = new SharedBuilder_MediaLeftProps1145560552[^](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: MediaLeftProps): SharedBuilder_MediaLeftProps1145560552[^] = new SharedBuilder_MediaLeftProps1145560552[^](js.Array(this.component, p.asInstanceOf[js.Any]))
}
