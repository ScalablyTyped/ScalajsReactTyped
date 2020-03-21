package typingsJapgolly.screeps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined screeps.GenericStoreBase & {[ P in screeps.ResourceConstant ]: number} */
@js.native
trait GenericStore extends js.Object {
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
  var alloy: Double = js.native
  var battery: Double = js.native
  var biomass: Double = js.native
  var cell: Double = js.native
  var circuit: Double = js.native
  var composite: Double = js.native
  var concentrate: Double = js.native
  var condensate: Double = js.native
  var crystal: Double = js.native
  var device: Double = js.native
  var emanation: Double = js.native
  var energy: Double = js.native
  var essence: Double = js.native
  var extract: Double = js.native
  var fixtures: Double = js.native
  var frame: Double = js.native
  var ghodium_melt: Double = js.native
  var hydraulics: Double = js.native
  var keanium_bar: Double = js.native
  var lemergium_bar: Double = js.native
  var liquid: Double = js.native
  var machine: Double = js.native
  var metal: Double = js.native
  var microchip: Double = js.native
  var mist: Double = js.native
  var muscle: Double = js.native
  var ops: Double = js.native
  var organism: Double = js.native
  var organoid: Double = js.native
  var oxidant: Double = js.native
  var phlegm: Double = js.native
  var power: Double = js.native
  var purifier: Double = js.native
  var reductant: Double = js.native
  var silicon: Double = js.native
  var spirit: Double = js.native
  var switch: Double = js.native
  var tissue: Double = js.native
  var transistor: Double = js.native
  var tube: Double = js.native
  var utrium_bar: Double = js.native
  var wire: Double = js.native
  var zynthium_bar: Double = js.native
  /** Returns capacity of this store for the specified resource, or total capacity if resource is undefined. */
  def getCapacity(): Double | Null = js.native
  def getCapacity(resource: ResourceConstant): Double | Null = js.native
  /** A shorthand for getCapacity(resource) - getUsedCapacity(resource). */
  def getFreeCapacity(): Double = js.native
  def getFreeCapacity(resource: ResourceConstant): Double = js.native
  /** Returns the capacity used by the specified resource, or total used capacity for general purpose stores if resource is undefined. */
  def getUsedCapacity(): Double | Null = js.native
  def getUsedCapacity(resource: ResourceConstant): Double | Null = js.native
}

