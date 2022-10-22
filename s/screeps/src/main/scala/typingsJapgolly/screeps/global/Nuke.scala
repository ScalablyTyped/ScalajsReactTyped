package typingsJapgolly.screeps.global

import typingsJapgolly.screeps.Id
import typingsJapgolly.screeps.NukeConstructor
import typingsJapgolly.screeps.RoomObjectEffect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("Nuke")
@js.native
open class Nuke protected ()
  extends StObject
     with typingsJapgolly.screeps.Nuke {
  def this(id: Id[typingsJapgolly.screeps.Nuke]) = this()
  
  /**
    * Applied effects, an array of objects with the following properties:
    */
  /* CompleteClass */
  var effects: js.Array[RoomObjectEffect] = js.native
  
  /**
    * A unique object identifier. You can use Game.getObjectById method to retrieve an object instance by its id.
    */
  /* CompleteClass */
  var id: Id[this.type] = js.native
  
  /**
    * The name of the room where this nuke has been launched from.
    */
  /* CompleteClass */
  var launchRoomName: String = js.native
  
  /**
    * An object representing the position of this object in the room.
    */
  /* CompleteClass */
  var pos: typingsJapgolly.screeps.RoomPosition = js.native
  
  /**
    * The remaining landing time.
    */
  /* CompleteClass */
  var timeToLand: Double = js.native
}
object Nuke {
  
  inline def apply: NukeConstructor = js.Dynamic.global.selectDynamic("Nuke").asInstanceOf[NukeConstructor]
}
