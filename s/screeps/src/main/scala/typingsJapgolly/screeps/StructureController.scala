package typingsJapgolly.screeps

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Claim this structure to take control over the room. The controller structure
  * cannot be damaged or destroyed. It can be addressed by `Room.controller`
  * property.
  */
trait StructureController
  extends StObject
     with OwnedStructure[STRUCTURE_CONTROLLER]
     with AnyOwnedStructure {
  
  /**
    * Activate safe mode if available.
    * @returns Result Code: OK, ERR_NOT_OWNER, ERR_BUSY, ERR_NOT_ENOUGH_RESOURCES, ERR_TIRED
    */
  def activateSafeMode(): ScreepsReturnCode
  
  /**
    * Whether using power is enabled in this room.
    *
    * Use `PowerCreep.enableRoom()` to turn powers on.
    */
  var isPowerEnabled: Boolean
  
  /**
    * Current controller level, from 0 to 8.
    */
  var level: Double
  
  /**
    * The current progress of upgrading the controller to the next level.
    */
  var progress: Double
  
  /**
    * The progress needed to reach the next level.
    */
  var progressTotal: Double
  
  /**
    * An object with the controller reservation info if present: username, ticksToEnd
    */
  var reservation: js.UndefOr[ReservationDefinition] = js.undefined
  
  /**
    * How many ticks of safe mode are remaining, or undefined.
    */
  var safeMode: js.UndefOr[Double] = js.undefined
  
  /**
    * Safe mode activations available to use.
    */
  var safeModeAvailable: Double
  
  /**
    * During this period in ticks new safe mode activations will be blocked, undefined if cooldown is inactive.
    */
  var safeModeCooldown: js.UndefOr[Double] = js.undefined
  
  /**
    * An object with the controller sign info if present
    */
  var sign: js.UndefOr[SignDefinition] = js.undefined
  
  /**
    * The amount of game ticks when this controller will lose one level. This timer can be reset by using Creep.upgradeController.
    */
  var ticksToDowngrade: Double
  
  /**
    * Make your claimed controller neutral again.
    */
  def unclaim(): ScreepsReturnCode
  
  /**
    * The amount of game ticks while this controller cannot be upgraded due to attack.
    */
  var upgradeBlocked: Double
}
object StructureController {
  
  inline def apply(
    activateSafeMode: CallbackTo[ScreepsReturnCode],
    destroy: CallbackTo[ScreepsReturnCode],
    effects: js.Array[RoomObjectEffect],
    hits: Double,
    hitsMax: Double,
    id: Id[StructureController],
    isActive: CallbackTo[Boolean],
    isPowerEnabled: Boolean,
    level: Double,
    my: Boolean,
    notifyWhenAttacked: Boolean => ScreepsReturnCode,
    owner: /* import warning: importer.ImportType#apply Failed type conversion: T extends screeps.STRUCTURE_CONTROLLER ? screeps.Owner | undefined : screeps.Owner */ js.Any,
    pos: RoomPosition,
    progress: Double,
    progressTotal: Double,
    room: Room,
    safeModeAvailable: Double,
    structureType: STRUCTURE_CONTROLLER,
    ticksToDowngrade: Double,
    unclaim: CallbackTo[ScreepsReturnCode],
    upgradeBlocked: Double
  ): StructureController = {
    val __obj = js.Dynamic.literal(activateSafeMode = activateSafeMode.toJsFn, destroy = destroy.toJsFn, effects = effects.asInstanceOf[js.Any], hits = hits.asInstanceOf[js.Any], hitsMax = hitsMax.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isActive = isActive.toJsFn, isPowerEnabled = isPowerEnabled.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], my = my.asInstanceOf[js.Any], notifyWhenAttacked = js.Any.fromFunction1(notifyWhenAttacked), owner = owner.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], progressTotal = progressTotal.asInstanceOf[js.Any], room = room.asInstanceOf[js.Any], safeModeAvailable = safeModeAvailable.asInstanceOf[js.Any], structureType = structureType.asInstanceOf[js.Any], ticksToDowngrade = ticksToDowngrade.asInstanceOf[js.Any], unclaim = unclaim.toJsFn, upgradeBlocked = upgradeBlocked.asInstanceOf[js.Any])
    __obj.asInstanceOf[StructureController]
  }
  
  extension [Self <: StructureController](x: Self) {
    
    inline def setActivateSafeMode(value: CallbackTo[ScreepsReturnCode]): Self = StObject.set(x, "activateSafeMode", value.toJsFn)
    
    inline def setIsPowerEnabled(value: Boolean): Self = StObject.set(x, "isPowerEnabled", value.asInstanceOf[js.Any])
    
    inline def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    inline def setProgress(value: Double): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
    
    inline def setProgressTotal(value: Double): Self = StObject.set(x, "progressTotal", value.asInstanceOf[js.Any])
    
    inline def setReservation(value: ReservationDefinition): Self = StObject.set(x, "reservation", value.asInstanceOf[js.Any])
    
    inline def setReservationUndefined: Self = StObject.set(x, "reservation", js.undefined)
    
    inline def setSafeMode(value: Double): Self = StObject.set(x, "safeMode", value.asInstanceOf[js.Any])
    
    inline def setSafeModeAvailable(value: Double): Self = StObject.set(x, "safeModeAvailable", value.asInstanceOf[js.Any])
    
    inline def setSafeModeCooldown(value: Double): Self = StObject.set(x, "safeModeCooldown", value.asInstanceOf[js.Any])
    
    inline def setSafeModeCooldownUndefined: Self = StObject.set(x, "safeModeCooldown", js.undefined)
    
    inline def setSafeModeUndefined: Self = StObject.set(x, "safeMode", js.undefined)
    
    inline def setSign(value: SignDefinition): Self = StObject.set(x, "sign", value.asInstanceOf[js.Any])
    
    inline def setSignUndefined: Self = StObject.set(x, "sign", js.undefined)
    
    inline def setTicksToDowngrade(value: Double): Self = StObject.set(x, "ticksToDowngrade", value.asInstanceOf[js.Any])
    
    inline def setUnclaim(value: CallbackTo[ScreepsReturnCode]): Self = StObject.set(x, "unclaim", value.toJsFn)
    
    inline def setUpgradeBlocked(value: Double): Self = StObject.set(x, "upgradeBlocked", value.asInstanceOf[js.Any])
  }
}
