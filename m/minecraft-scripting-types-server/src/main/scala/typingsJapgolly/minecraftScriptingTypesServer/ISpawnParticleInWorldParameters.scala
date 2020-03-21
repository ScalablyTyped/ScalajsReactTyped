package typingsJapgolly.minecraftScriptingTypesServer

import typingsJapgolly.minecraftScriptingTypesShared.ParticleEffect
import typingsJapgolly.minecraftScriptingTypesShared.VectorArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This event is used to create a static particle effect in the world. This particle effect is visible to all players. Any effect defined in a JSON file (both in your resource pack and in Minecraft) can be used here. Once the effect is spawned you won't be able to control it further.
  */
trait ISpawnParticleInWorldParameters extends js.Object {
  /**
    * The dimension in which you want to spawn the effect. Can be "overworld", "nether", or "the end"
    * @default overworld
    */
  var dimension: String
  /**
    * The identifier of the particle effect you want to attach to spawn. This is the same name you gave the effect in its JSON file
    */
  var effect: ParticleEffect
  /**
    * The position in the world where you want to spawn the effect
    * @default [0, 0, 0]
    */
  var position: VectorArray
}

object ISpawnParticleInWorldParameters {
  @scala.inline
  def apply(dimension: String, effect: ParticleEffect, position: VectorArray): ISpawnParticleInWorldParameters = {
    val __obj = js.Dynamic.literal(dimension = dimension.asInstanceOf[js.Any], effect = effect.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ISpawnParticleInWorldParameters]
  }
}

