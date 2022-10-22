package typingsJapgolly.screeps.anon

import typingsJapgolly.screeps.ResourceConstant
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined screeps.Store<screeps.RESOURCE_ENERGY | screeps.MineralConstant | screeps.MineralCompoundConstant, false> */
@js.native
trait StoreRESOURCEENERGYMinera extends StObject {
  
  var G: Double = js.native
  
  var GH: Double = js.native
  
  var GH2O: Double = js.native
  
  var GHO2: Double = js.native
  
  var GO: Double = js.native
  
  var H: Double = js.native
  
  var K: Double = js.native
  
  var KH: Double = js.native
  
  var KH2O: Double = js.native
  
  var KHO2: Double = js.native
  
  var KO: Double = js.native
  
  var L: Double = js.native
  
  var LH: Double = js.native
  
  var LH2O: Double = js.native
  
  var LHO2: Double = js.native
  
  var LO: Double = js.native
  
  var O: Double = js.native
  
  var OH: Double = js.native
  
  var U: Double = js.native
  
  var UH: Double = js.native
  
  var UH2O: Double = js.native
  
  var UHO2: Double = js.native
  
  var UL: Double = js.native
  
  var UO: Double = js.native
  
  var X: Double = js.native
  
  var XGH2O: Double = js.native
  
  var XGHO2: Double = js.native
  
  var XKH2O: Double = js.native
  
  var XKHO2: Double = js.native
  
  var XLH2O: Double = js.native
  
  var XLHO2: Double = js.native
  
  var XUH2O: Double = js.native
  
  var XUHO2: Double = js.native
  
  var XZH2O: Double = js.native
  
  var XZHO2: Double = js.native
  
  var Z: Double = js.native
  
  var ZH: Double = js.native
  
  var ZH2O: Double = js.native
  
  var ZHO2: Double = js.native
  
  var ZK: Double = js.native
  
  var ZO: Double = js.native
  
  var alloy: typingsJapgolly.screeps.screepsInts.`0` = js.native
  
  var battery: typingsJapgolly.screeps.screepsInts.`0` = js.native
  
  var biomass: typingsJapgolly.screeps.screepsInts.`0` = js.native
  
  var cell: typingsJapgolly.screeps.screepsInts.`0` = js.native
  
  var circuit: typingsJapgolly.screeps.screepsInts.`0` = js.native
  
  var composite: typingsJapgolly.screeps.screepsInts.`0` = js.native
  
  var concentrate: typingsJapgolly.screeps.screepsInts.`0` = js.native
  
  var condensate: typingsJapgolly.screeps.screepsInts.`0` = js.native
  
  var crystal: typingsJapgolly.screeps.screepsInts.`0` = js.native
  
  var device: typingsJapgolly.screeps.screepsInts.`0` = js.native
  
  var emanation: typingsJapgolly.screeps.screepsInts.`0` = js.native
  
  var energy: Double = js.native
  
  var essence: typingsJapgolly.screeps.screepsInts.`0` = js.native
  
  var extract: typingsJapgolly.screeps.screepsInts.`0` = js.native
  
  var fixtures: typingsJapgolly.screeps.screepsInts.`0` = js.native
  
  var frame: typingsJapgolly.screeps.screepsInts.`0` = js.native
  
  /**
    * Returns capacity of this store for the specified resource. For a general purpose store, it returns total capacity if `resource` is undefined.
    * @param resource The type of the resource.
    * @returns Returns capacity number, or `null` in case of an invalid `resource` for this store type.
    */
  def getCapacity[R /* <: js.UndefOr[ResourceConstant] */](): /* import warning: importer.ImportType#apply Failed type conversion: false extends true ? null : R extends undefined ? screeps.ResourceConstant extends screeps.RESOURCE_ENERGY | screeps.MineralConstant | screeps.MineralCompoundConstant ? number : null : R extends screeps.RESOURCE_ENERGY | screeps.MineralConstant | screeps.MineralCompoundConstant ? number : null */ js.Any = js.native
  def getCapacity[R /* <: js.UndefOr[ResourceConstant] */](resource: R): /* import warning: importer.ImportType#apply Failed type conversion: false extends true ? null : R extends undefined ? screeps.ResourceConstant extends screeps.RESOURCE_ENERGY | screeps.MineralConstant | screeps.MineralCompoundConstant ? number : null : R extends screeps.RESOURCE_ENERGY | screeps.MineralConstant | screeps.MineralCompoundConstant ? number : null */ js.Any = js.native
  
  /**
    * Returns free capacity for the store. For a limited store, it returns the capacity available for the specified resource if `resource` is defined and valid for this store.
    * @param resource The type of the resource.
    * @returns Returns available capacity number, or `null` in case of an invalid `resource` for this store type.
    */
  def getFreeCapacity[R /* <: js.UndefOr[ResourceConstant] */](): /* import warning: importer.ImportType#apply Failed type conversion: R extends undefined ? screeps.ResourceConstant extends screeps.RESOURCE_ENERGY | screeps.MineralConstant | screeps.MineralCompoundConstant ? number : null : R extends screeps.RESOURCE_ENERGY | screeps.MineralConstant | screeps.MineralCompoundConstant ? number : null */ js.Any = js.native
  def getFreeCapacity[R /* <: js.UndefOr[ResourceConstant] */](resource: R): /* import warning: importer.ImportType#apply Failed type conversion: R extends undefined ? screeps.ResourceConstant extends screeps.RESOURCE_ENERGY | screeps.MineralConstant | screeps.MineralCompoundConstant ? number : null : R extends screeps.RESOURCE_ENERGY | screeps.MineralConstant | screeps.MineralCompoundConstant ? number : null */ js.Any = js.native
  
  /**
    * Returns the capacity used by the specified resource, or total used capacity for general purpose stores if `resource` is undefined.
    * @param resource The type of the resource.
    * @returns Returns used capacity number, or `null` in case of a not valid `resource` for this store type.
    */
  def getUsedCapacity[R /* <: js.UndefOr[ResourceConstant] */](): /* import warning: importer.ImportType#apply Failed type conversion: R extends undefined ? screeps.ResourceConstant extends screeps.RESOURCE_ENERGY | screeps.MineralConstant | screeps.MineralCompoundConstant ? number : null : R extends screeps.RESOURCE_ENERGY | screeps.MineralConstant | screeps.MineralCompoundConstant ? number : null */ js.Any = js.native
  def getUsedCapacity[R /* <: js.UndefOr[ResourceConstant] */](resource: R): /* import warning: importer.ImportType#apply Failed type conversion: R extends undefined ? screeps.ResourceConstant extends screeps.RESOURCE_ENERGY | screeps.MineralConstant | screeps.MineralCompoundConstant ? number : null : R extends screeps.RESOURCE_ENERGY | screeps.MineralConstant | screeps.MineralCompoundConstant ? number : null */ js.Any = js.native
  
  var ghodium_melt: typingsJapgolly.screeps.screepsInts.`0` = js.native
  
  var hydraulics: typingsJapgolly.screeps.screepsInts.`0` = js.native
  
  var keanium_bar: typingsJapgolly.screeps.screepsInts.`0` = js.native
  
  var lemergium_bar: typingsJapgolly.screeps.screepsInts.`0` = js.native
  
  var liquid: typingsJapgolly.screeps.screepsInts.`0` = js.native
  
  var machine: typingsJapgolly.screeps.screepsInts.`0` = js.native
  
  var metal: typingsJapgolly.screeps.screepsInts.`0` = js.native
  
  var microchip: typingsJapgolly.screeps.screepsInts.`0` = js.native
  
  var mist: typingsJapgolly.screeps.screepsInts.`0` = js.native
  
  var muscle: typingsJapgolly.screeps.screepsInts.`0` = js.native
  
  var ops: typingsJapgolly.screeps.screepsInts.`0` = js.native
  
  var organism: typingsJapgolly.screeps.screepsInts.`0` = js.native
  
  var organoid: typingsJapgolly.screeps.screepsInts.`0` = js.native
  
  var oxidant: typingsJapgolly.screeps.screepsInts.`0` = js.native
  
  var phlegm: typingsJapgolly.screeps.screepsInts.`0` = js.native
  
  var power: typingsJapgolly.screeps.screepsInts.`0` = js.native
  
  var purifier: typingsJapgolly.screeps.screepsInts.`0` = js.native
  
  var reductant: typingsJapgolly.screeps.screepsInts.`0` = js.native
  
  var silicon: typingsJapgolly.screeps.screepsInts.`0` = js.native
  
  var spirit: typingsJapgolly.screeps.screepsInts.`0` = js.native
  
  var switch: typingsJapgolly.screeps.screepsInts.`0` = js.native
  
  var tissue: typingsJapgolly.screeps.screepsInts.`0` = js.native
  
  var transistor: typingsJapgolly.screeps.screepsInts.`0` = js.native
  
  var tube: typingsJapgolly.screeps.screepsInts.`0` = js.native
  
  var utrium_bar: typingsJapgolly.screeps.screepsInts.`0` = js.native
  
  var wire: typingsJapgolly.screeps.screepsInts.`0` = js.native
  
  var zynthium_bar: typingsJapgolly.screeps.screepsInts.`0` = js.native
}
