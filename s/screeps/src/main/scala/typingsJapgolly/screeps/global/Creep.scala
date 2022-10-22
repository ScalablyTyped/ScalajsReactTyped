package typingsJapgolly.screeps.global

import typingsJapgolly.screeps.CreepConstructor
import typingsJapgolly.screeps.Id
import typingsJapgolly.screeps.RoomObjectEffect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("Creep")
@js.native
open class Creep protected ()
  extends StObject
     with typingsJapgolly.screeps.Creep {
  def this(id: Id[typingsJapgolly.screeps.Creep]) = this()
  
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
object Creep {
  
  inline def apply: CreepConstructor = js.Dynamic.global.selectDynamic("Creep").asInstanceOf[CreepConstructor]
}
