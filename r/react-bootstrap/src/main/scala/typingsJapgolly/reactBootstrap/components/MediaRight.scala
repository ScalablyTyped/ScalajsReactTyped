package typingsJapgolly.reactBootstrap.components

import typingsJapgolly.reactBootstrap.libMediaRightMod.MediaRightProps
import typingsJapgolly.reactBootstrap.libMediaRightMod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MediaRight {
  
  @JSImport("react-bootstrap/lib/MediaRight", JSImport.Namespace)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: MediaRight.type): SharedBuilder_MediaRightProps1976507007[^] = new SharedBuilder_MediaRightProps1976507007[^](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: MediaRightProps): SharedBuilder_MediaRightProps1976507007[^] = new SharedBuilder_MediaRightProps1976507007[^](js.Array(this.component, p.asInstanceOf[js.Any]))
}
