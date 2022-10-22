package typingsJapgolly.ol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mapBrowserEventHandlerMod {
  
  @JSImport("ol/MapBrowserEventHandler", JSImport.Default)
  @js.native
  open class default protected () extends MapBrowserEventHandler {
    def this(map: typingsJapgolly.ol.pluggableMapMod.default) = this()
    def this(map: typingsJapgolly.ol.pluggableMapMod.default, moveTolerance: Double) = this()
  }
  
  @js.native
  trait MapBrowserEventHandler
    extends typingsJapgolly.ol.eventsTargetMod.default
}
