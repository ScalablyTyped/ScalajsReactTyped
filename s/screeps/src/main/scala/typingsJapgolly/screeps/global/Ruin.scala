package typingsJapgolly.screeps.global

import typingsJapgolly.screeps.AnyStructure
import typingsJapgolly.screeps.Id
import typingsJapgolly.screeps.RoomObjectEffect
import typingsJapgolly.screeps.RuinConstructor
import typingsJapgolly.screeps.StoreDefinitionUnlimited
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("Ruin")
@js.native
open class Ruin protected ()
  extends StObject
     with typingsJapgolly.screeps.Ruin {
  def this(id: Id[typingsJapgolly.screeps.Ruin]) = this()
  
  /**
    * Time of destruction.
    */
  /* CompleteClass */
  var destroyTime: Double = js.native
  
  /**
    * Applied effects, an array of objects with the following properties:
    */
  /* CompleteClass */
  var effects: js.Array[RoomObjectEffect] = js.native
  
  /**
    * A unique object identificator.
    * You can use {@link Game.getObjectById} method to retrieve an object instance by its id.
    */
  /* CompleteClass */
  var id: Id[this.type] = js.native
  
  /**
    * An object representing the position of this object in the room.
    */
  /* CompleteClass */
  var pos: typingsJapgolly.screeps.RoomPosition = js.native
  
  /**
    * An object with the ruin contents.
    */
  /* CompleteClass */
  var store: StoreDefinitionUnlimited = js.native
  
  /**
    * An object containing the destroyed structure.
    */
  /* CompleteClass */
  var structure: AnyStructure = js.native
  
  /**
    * The amount of game ticks before this ruin decays.
    */
  /* CompleteClass */
  var ticksToDecay: Double = js.native
}
object Ruin {
  
  inline def apply: RuinConstructor = js.Dynamic.global.selectDynamic("Ruin").asInstanceOf[RuinConstructor]
}
