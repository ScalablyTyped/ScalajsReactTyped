package typingsJapgolly.yandexMaps.mod.control

import typingsJapgolly.yandexMaps.mod.IChild
import typingsJapgolly.yandexMaps.mod.IControlParent
import typingsJapgolly.yandexMaps.mod.IEventManager
import typingsJapgolly.yandexMaps.mod.IOptionManager
import typingsJapgolly.yandexMaps.mod.IRoutePanel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsJapgolly.yandexMaps.mod.IEventEmitter because Already inherited
- typingsJapgolly.yandexMaps.mod.ICustomizable because var conflicts: events. Inlined options */ @JSImport("yandex-maps", "control.RouteButton")
@js.native
open class RouteButton ()
  extends StObject
     with IChild[IControlParent] {
  def this(parameters: IRouteButtonParameters) = this()
  
  /* CompleteClass */
  var events: IEventManager[js.Object] = js.native
  
  var options: IOptionManager = js.native
  
  var routePanel: IRoutePanel = js.native
  
  def setParent(parent: IControlParent): this.type = js.native
}
