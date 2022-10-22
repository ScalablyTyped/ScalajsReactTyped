package typingsJapgolly.screeps.global

import typingsJapgolly.screeps.ColorConstant
import typingsJapgolly.screeps.FlagConstructor
import typingsJapgolly.screeps.RoomObjectEffect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("Flag")
@js.native
open class Flag protected ()
  extends StObject
     with typingsJapgolly.screeps.Flag {
  def this(
    name: String,
    color: ColorConstant,
    secondaryColor: ColorConstant,
    roomName: String,
    x: Double,
    y: Double
  ) = this()
  
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
object Flag {
  
  inline def apply: FlagConstructor = js.Dynamic.global.selectDynamic("Flag").asInstanceOf[FlagConstructor]
}
