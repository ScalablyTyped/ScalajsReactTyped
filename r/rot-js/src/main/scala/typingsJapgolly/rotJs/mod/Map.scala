package typingsJapgolly.rotJs.mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.rotJs.PartialOptionsBorn
import typingsJapgolly.rotJs.PartialOptionsCellHeight
import typingsJapgolly.rotJs.PartialOptionsCorridorLength
import typingsJapgolly.rotJs.PartialOptionsRoomDugPercentage
import typingsJapgolly.rotJs.arenaMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rot-js", "Map")
@js.native
object Map extends js.Object {
  @js.native
  class Arena () extends default
  
  @js.native
  class Cellular protected ()
    extends typingsJapgolly.rotJs.cellularMod.default {
    def this(width: Double, height: Double) = this()
    def this(width: Double, height: Double, options: PartialOptionsBorn) = this()
  }
  
  @js.native
  class Digger protected ()
    extends typingsJapgolly.rotJs.diggerMod.default {
    def this(width: Double, height: Double) = this()
    def this(width: Double, height: Double, options: PartialOptionsCorridorLength) = this()
  }
  
  @js.native
  class DividedMaze ()
    extends typingsJapgolly.rotJs.dividedmazeMod.default
  
  @js.native
  class EllerMaze ()
    extends typingsJapgolly.rotJs.ellermazeMod.default
  
  @js.native
  class IceyMaze protected ()
    extends typingsJapgolly.rotJs.iceymazeMod.default {
    def this(width: Double, height: Double) = this()
    def this(width: Double, height: Double, regularity: Double) = this()
  }
  
  @js.native
  class Rogue protected ()
    extends typingsJapgolly.rotJs.rogueMod.default {
    def this(width: Double, height: Double, options: PartialOptionsCellHeight) = this()
  }
  
  @js.native
  class Uniform protected ()
    extends typingsJapgolly.rotJs.uniformMod.default {
    def this(width: Double, height: Double, options: PartialOptionsRoomDugPercentage) = this()
  }
  
  @js.native
  object Arena extends TopLevel[Instantiable0[default]]
  
  @js.native
  object Cellular
    extends TopLevel[
          Instantiable3[
            /* width */ Double, 
            /* height */ Double, 
            js.UndefOr[/* options */ PartialOptionsBorn], 
            typingsJapgolly.rotJs.cellularMod.default
          ]
        ]
  
  @js.native
  object Digger
    extends TopLevel[
          Instantiable3[
            /* width */ Double, 
            /* height */ Double, 
            js.UndefOr[/* options */ PartialOptionsCorridorLength], 
            typingsJapgolly.rotJs.diggerMod.default
          ]
        ]
  
  @js.native
  object DividedMaze
    extends TopLevel[Instantiable0[typingsJapgolly.rotJs.dividedmazeMod.default]]
  
  @js.native
  object EllerMaze
    extends TopLevel[Instantiable0[typingsJapgolly.rotJs.ellermazeMod.default]]
  
  @js.native
  object IceyMaze
    extends TopLevel[
          Instantiable3[
            /* width */ Double, 
            /* height */ Double, 
            js.UndefOr[/* regularity */ Double], 
            typingsJapgolly.rotJs.iceymazeMod.default
          ]
        ]
  
  @js.native
  object Rogue
    extends TopLevel[
          Instantiable3[
            /* width */ Double, 
            /* height */ Double, 
            /* options */ PartialOptionsCellHeight, 
            typingsJapgolly.rotJs.rogueMod.default
          ]
        ]
  
  @js.native
  object Uniform
    extends TopLevel[
          Instantiable3[
            /* width */ Double, 
            /* height */ Double, 
            /* options */ PartialOptionsRoomDugPercentage, 
            typingsJapgolly.rotJs.uniformMod.default
          ]
        ]
  
}

