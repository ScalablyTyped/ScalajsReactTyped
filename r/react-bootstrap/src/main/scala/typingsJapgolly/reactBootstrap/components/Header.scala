package typingsJapgolly.reactBootstrap.components

import typingsJapgolly.reactBootstrap.libModalHeaderMod.ModalHeaderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Header {
  
  @JSImport("react-bootstrap/lib/Modal", "Header")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Header.type): SharedBuilder_ModalHeaderProps_8845214[typingsJapgolly.reactBootstrap.libModalMod.Header] = new SharedBuilder_ModalHeaderProps_8845214[typingsJapgolly.reactBootstrap.libModalMod.Header](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ModalHeaderProps): SharedBuilder_ModalHeaderProps_8845214[typingsJapgolly.reactBootstrap.libModalMod.Header] = new SharedBuilder_ModalHeaderProps_8845214[typingsJapgolly.reactBootstrap.libModalMod.Header](js.Array(this.component, p.asInstanceOf[js.Any]))
}
