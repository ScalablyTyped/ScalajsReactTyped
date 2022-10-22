package typingsJapgolly.reactAriaLive.components

import typingsJapgolly.StBuildingComponent.Default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object LiveAnnouncer {
  
  @JSImport("react-aria-live", "LiveAnnouncer")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: LiveAnnouncer.type): Default[typingsJapgolly.reactAriaLive.mod.LiveAnnouncer] = new Default[typingsJapgolly.reactAriaLive.mod.LiveAnnouncer](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: js.Object): Default[typingsJapgolly.reactAriaLive.mod.LiveAnnouncer] = new Default[typingsJapgolly.reactAriaLive.mod.LiveAnnouncer](js.Array(this.component, p.asInstanceOf[js.Any]))
}
