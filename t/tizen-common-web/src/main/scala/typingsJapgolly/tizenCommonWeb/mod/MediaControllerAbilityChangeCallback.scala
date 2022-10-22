package typingsJapgolly.tizenCommonWeb.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaControllerAbilityChangeCallback extends StObject {
  
  /**
    * Event triggered when server's display mode ability is updated.
    *
    * @param server Server which triggered the event.
    * @param abilities Object with current state of display mode abilities on the media controller server.
    */
  def ondisplaymodeabilitychanged(server: MediaControllerServerInfo, abilities: MediaControllerDisplayModeAbilitiesInfo): Unit
  
  /**
    * Event triggered when server's display rotation is updated.
    *
    * @param server Server which triggered the event.
    * @param abilities Object with current state of display mode abilities on the media controller server.
    */
  def ondisplayrotationabilitychanged(server: MediaControllerServerInfo, abilities: MediaControllerDisplayRotationAbilitiesInfo): Unit
  
  /**
    * Event triggered when server's playback ability is updated.
    *
    * @param server Server which triggered the event.
    * @param abilities Object with current state of playback abilities on the media controller server.
    */
  def onplaybackabilitychanged(server: MediaControllerServerInfo, abilities: MediaControllerPlaybackAbilitiesInfo): Unit
  
  /**
    * Event triggered when server's simple ability is updated.
    *
    * @param server Server which triggered the event.
    * @param type Type of simple ability.
    * @param support Ability value which was set on the media controller server.
    */
  def onsimpleabilitychanged(
    server: MediaControllerServerInfo,
    `type`: MediaControllerSimpleAbility,
    support: MediaControllerAbilitySupport
  ): Unit
}
object MediaControllerAbilityChangeCallback {
  
  inline def apply(
    ondisplaymodeabilitychanged: (MediaControllerServerInfo, MediaControllerDisplayModeAbilitiesInfo) => Callback,
    ondisplayrotationabilitychanged: (MediaControllerServerInfo, MediaControllerDisplayRotationAbilitiesInfo) => Callback,
    onplaybackabilitychanged: (MediaControllerServerInfo, MediaControllerPlaybackAbilitiesInfo) => Callback,
    onsimpleabilitychanged: (MediaControllerServerInfo, MediaControllerSimpleAbility, MediaControllerAbilitySupport) => Callback
  ): MediaControllerAbilityChangeCallback = {
    val __obj = js.Dynamic.literal(ondisplaymodeabilitychanged = js.Any.fromFunction2((t0: MediaControllerServerInfo, t1: MediaControllerDisplayModeAbilitiesInfo) => (ondisplaymodeabilitychanged(t0, t1)).runNow()), ondisplayrotationabilitychanged = js.Any.fromFunction2((t0: MediaControllerServerInfo, t1: MediaControllerDisplayRotationAbilitiesInfo) => (ondisplayrotationabilitychanged(t0, t1)).runNow()), onplaybackabilitychanged = js.Any.fromFunction2((t0: MediaControllerServerInfo, t1: MediaControllerPlaybackAbilitiesInfo) => (onplaybackabilitychanged(t0, t1)).runNow()), onsimpleabilitychanged = js.Any.fromFunction3((t0: MediaControllerServerInfo, t1: MediaControllerSimpleAbility, t2: MediaControllerAbilitySupport) => (onsimpleabilitychanged(t0, t1, t2)).runNow()))
    __obj.asInstanceOf[MediaControllerAbilityChangeCallback]
  }
  
  extension [Self <: MediaControllerAbilityChangeCallback](x: Self) {
    
    inline def setOndisplaymodeabilitychanged(value: (MediaControllerServerInfo, MediaControllerDisplayModeAbilitiesInfo) => Callback): Self = StObject.set(x, "ondisplaymodeabilitychanged", js.Any.fromFunction2((t0: MediaControllerServerInfo, t1: MediaControllerDisplayModeAbilitiesInfo) => (value(t0, t1)).runNow()))
    
    inline def setOndisplayrotationabilitychanged(value: (MediaControllerServerInfo, MediaControllerDisplayRotationAbilitiesInfo) => Callback): Self = StObject.set(x, "ondisplayrotationabilitychanged", js.Any.fromFunction2((t0: MediaControllerServerInfo, t1: MediaControllerDisplayRotationAbilitiesInfo) => (value(t0, t1)).runNow()))
    
    inline def setOnplaybackabilitychanged(value: (MediaControllerServerInfo, MediaControllerPlaybackAbilitiesInfo) => Callback): Self = StObject.set(x, "onplaybackabilitychanged", js.Any.fromFunction2((t0: MediaControllerServerInfo, t1: MediaControllerPlaybackAbilitiesInfo) => (value(t0, t1)).runNow()))
    
    inline def setOnsimpleabilitychanged(
      value: (MediaControllerServerInfo, MediaControllerSimpleAbility, MediaControllerAbilitySupport) => Callback
    ): Self = StObject.set(x, "onsimpleabilitychanged", js.Any.fromFunction3((t0: MediaControllerServerInfo, t1: MediaControllerSimpleAbility, t2: MediaControllerAbilitySupport) => (value(t0, t1, t2)).runNow()))
  }
}
