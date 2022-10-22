package typingsJapgolly.openrct2.mod.global

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a staff member.
  */
trait Staff
  extends StObject
     with Peep {
  
  /**
    * Colour of the staff member. Not applicable for entertainers.
    */
  var colour: Double
  
  /**
    * The entertainer's costume, only applicable for entertainers.
    */
  var costume: Double
  
  /**
    * The enabled jobs the staff can do, e.g. sweep litter, water plants, inspect rides etc.
    */
  var orders: Double
  
  /**
    * The type of staff member, e.g. handyman, mechanic.
    */
  var staffType: StaffType
}
object Staff {
  
  inline def apply(
    colour: Double,
    costume: Double,
    destination: CoordsXY,
    energy: Double,
    energyTarget: Double,
    getFlag: PeepFlags => Boolean,
    id: Double,
    name: String,
    orders: Double,
    peepType: PeepType,
    remove: Callback,
    setFlag: (PeepFlags, Boolean) => Callback,
    staffType: StaffType,
    `type`: EntityType,
    x: Double,
    y: Double,
    z: Double
  ): Staff = {
    val __obj = js.Dynamic.literal(colour = colour.asInstanceOf[js.Any], costume = costume.asInstanceOf[js.Any], destination = destination.asInstanceOf[js.Any], energy = energy.asInstanceOf[js.Any], energyTarget = energyTarget.asInstanceOf[js.Any], getFlag = js.Any.fromFunction1(getFlag), id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], orders = orders.asInstanceOf[js.Any], peepType = peepType.asInstanceOf[js.Any], remove = remove.toJsFn, setFlag = js.Any.fromFunction2((t0: PeepFlags, t1: Boolean) => (setFlag(t0, t1)).runNow()), staffType = staffType.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Staff]
  }
  
  extension [Self <: Staff](x: Self) {
    
    inline def setColour(value: Double): Self = StObject.set(x, "colour", value.asInstanceOf[js.Any])
    
    inline def setCostume(value: Double): Self = StObject.set(x, "costume", value.asInstanceOf[js.Any])
    
    inline def setOrders(value: Double): Self = StObject.set(x, "orders", value.asInstanceOf[js.Any])
    
    inline def setStaffType(value: StaffType): Self = StObject.set(x, "staffType", value.asInstanceOf[js.Any])
  }
}
