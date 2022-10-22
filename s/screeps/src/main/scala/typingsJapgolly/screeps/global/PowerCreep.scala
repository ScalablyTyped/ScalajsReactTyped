package typingsJapgolly.screeps.global

import typingsJapgolly.screeps.Id
import typingsJapgolly.screeps.PowerCreepConstructor
import typingsJapgolly.screeps.RoomObjectEffect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("PowerCreep")
@js.native
open class PowerCreep protected ()
  extends StObject
     with typingsJapgolly.screeps.PowerCreep {
  def this(id: Id[typingsJapgolly.screeps.PowerCreep]) = this()
  
  /**
    * Applied effects, an array of objects with the following properties:
    */
  /* CompleteClass */
  var effects: js.Array[RoomObjectEffect] = js.native
  
  /**
    * An object representing the position of this object in the room.
    */
  /* CompleteClass */
  var pos: typingsJapgolly.screeps.RoomPosition = js.native
}
object PowerCreep {
  
  inline def apply: PowerCreepConstructor = js.Dynamic.global.selectDynamic("PowerCreep").asInstanceOf[PowerCreepConstructor]
}
