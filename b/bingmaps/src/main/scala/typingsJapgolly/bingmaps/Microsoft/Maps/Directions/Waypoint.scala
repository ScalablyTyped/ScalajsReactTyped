package typingsJapgolly.bingmaps.Microsoft.Maps.Directions

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.bingmaps.Microsoft.Maps.Location
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Waypoint extends StObject {
  
  /** Releases any resources associated with the waypoint. */
  def dispose(): Unit
  
  /**
    * Gets the address associated with the waypoint.
    * @returns The address associated with the waypoint.
    */
  def getAddress(): String
  
  /**
    * Gets the location of the waypoint.
    * @returns The location of the waypoint.
    */
  def getLocation(): Location
  
  /**
    * Gets a boolean value indicating whether the waypoint is a via point.
    * @returns A boolean value indicating whether the waypoint is a via point.
    */
  def isViapoint(): Boolean
  
  /**
    * Sets options for the waypoint. For these options to take effect, you must recalculate the route.
    * @param options Options used to define the Waypoint.
    */
  def setOptions(options: IWaypointOptions): Unit
}
object Waypoint {
  
  inline def apply(
    dispose: Callback,
    getAddress: CallbackTo[String],
    getLocation: CallbackTo[Location],
    isViapoint: CallbackTo[Boolean],
    setOptions: IWaypointOptions => Callback
  ): Waypoint = {
    val __obj = js.Dynamic.literal(dispose = dispose.toJsFn, getAddress = getAddress.toJsFn, getLocation = getLocation.toJsFn, isViapoint = isViapoint.toJsFn, setOptions = js.Any.fromFunction1((t0: IWaypointOptions) => setOptions(t0).runNow()))
    __obj.asInstanceOf[Waypoint]
  }
  
  extension [Self <: Waypoint](x: Self) {
    
    inline def setDispose(value: Callback): Self = StObject.set(x, "dispose", value.toJsFn)
    
    inline def setGetAddress(value: CallbackTo[String]): Self = StObject.set(x, "getAddress", value.toJsFn)
    
    inline def setGetLocation(value: CallbackTo[Location]): Self = StObject.set(x, "getLocation", value.toJsFn)
    
    inline def setIsViapoint(value: CallbackTo[Boolean]): Self = StObject.set(x, "isViapoint", value.toJsFn)
    
    inline def setSetOptions(value: IWaypointOptions => Callback): Self = StObject.set(x, "setOptions", js.Any.fromFunction1((t0: IWaypointOptions) => value(t0).runNow()))
  }
}
