package typingsJapgolly.rotJs

import typingsJapgolly.rotJs.featuresMod.Corridor
import typingsJapgolly.rotJs.featuresMod.Room
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rot-js/lib/map/dungeon", JSImport.Namespace)
@js.native
object dungeonMod extends js.Object {
  @js.native
  trait Dungeon
    extends typingsJapgolly.rotJs.mapMapMod.default {
    var _corridors: js.Array[Corridor] = js.native
    var _rooms: js.Array[Room] = js.native
    /**
      * Get all generated corridors
      * @returns {ROT.Map.Feature.Corridor[]}
      */
    def getCorridors(): js.Array[Corridor] = js.native
    /**
      * Get all generated rooms
      * @returns {ROT.Map.Feature.Room[]}
      */
    def getRooms(): js.Array[Room] = js.native
  }
  
  @js.native
  abstract class default protected () extends Dungeon {
    def this(width: Double, height: Double) = this()
  }
  
}

