package typingsJapgolly.screeps

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A structure which produces trade commodities from base minerals and other commodities.
  */
@js.native
trait StructureFactory
  extends OwnedStructure[STRUCTURE_FACTORY]
     with AnyOwnedStructure
     with AnyStoreStructure {
  /**
    * The amount of game ticks the factory has to wait until the next produce is possible.
    */
  var cooldown: Double = js.native
  /**
    * The level of the factory.
    * Can be set by applying the PWR_OPERATE_FACTORY power to a newly built factory.
    * Once set, the level cannot be changed.
    */
  var level: Double = js.native
  /**
    * An object with the structure contents.
    */
  var store: StoreDefinition = js.native
  /**
    * Produces the specified commodity.
    * All ingredients should be available in the factory store.
    */
  def produce(resource: CommodityConstant | MineralConstant): ScreepsReturnCode = js.native
  def produce(resource: RESOURCE_GHODIUM): ScreepsReturnCode = js.native
}

@JSGlobal("StructureFactory")
@js.native
object StructureFactory extends TopLevel[StructureFactoryConstructor]

