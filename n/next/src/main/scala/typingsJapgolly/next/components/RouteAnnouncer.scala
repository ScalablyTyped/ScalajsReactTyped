package typingsJapgolly.next.components

import typingsJapgolly.StBuildingComponent.Default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RouteAnnouncer {
  
  @JSImport("next/dist/client/route-announcer", "RouteAnnouncer")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: RouteAnnouncer.type): Default[js.Object] = new Default[js.Object](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: js.Object): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
