package typingsJapgolly.flight

import typingsJapgolly.flight.Flight.DebugStatic
import typingsJapgolly.flight.Flight.FlightStatic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  @JSGlobal("DEBUG")
  @js.native
  def DEBUG: DebugStatic = js.native
  inline def DEBUG_=(x: DebugStatic): Unit = js.Dynamic.global.updateDynamic("DEBUG")(x.asInstanceOf[js.Any])
  
  @JSGlobal("flight")
  @js.native
  def flight: FlightStatic = js.native
  inline def flight_=(x: FlightStatic): Unit = js.Dynamic.global.updateDynamic("flight")(x.asInstanceOf[js.Any])
}
