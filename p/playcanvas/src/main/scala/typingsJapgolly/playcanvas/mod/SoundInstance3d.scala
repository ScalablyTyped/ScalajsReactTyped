package typingsJapgolly.playcanvas.mod

import typingsJapgolly.playcanvas.AnonDistanceModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @class
  * @name pc.SoundInstance3d
  * @augments pc.SoundInstance
  * @classdesc A pc.SoundInstance3d plays a {@link pc.Sound} in 3D.
  * @param {pc.SoundManager} manager - The sound manager.
  * @param {pc.Sound} sound - The sound to play.
  * @param {object} options - Options for the instance.
  * @param {number} [options.volume=1] - The playback volume, between 0 and 1.
  * @param {number} [options.pitch=1] - The relative pitch, default of 1, plays at normal pitch.
  * @param {boolean} [options.loop=false] - Whether the sound should loop when it reaches the end or not.
  * @param {number} [options.startTime=0] - The time from which the playback will start. Default is 0 to start at the beginning.
  * @param {number} [options.duration=null] - The total time after the startTime when playback will stop or restart if loop is true.
  * @param {pc.Vec3} [options.position=null] - The position of the sound in 3D space.
  * @param {pc.Vec3} [options.velocity=null] - The velocity of the sound.
  * @param {string} [options.distanceModel=pc.DISTANCE_LINEAR] - Determines which algorithm to use to reduce the volume of the audio as it moves away from the listener. Can be:
  *
  * * {@link pc.DISTANCE_LINEAR}
  * * {@link pc.DISTANCE_INVERSE}
  * * {@link pc.DISTANCE_EXPONENTIAL}
  *
  * Default is {@link pc.DISTANCE_LINEAR}.
  * @param {number} [options.refDistance=1] - The reference distance for reducing volume as the sound source moves further from the listener.
  * @param {number} [options.maxDistance=10000] - The maximum distance from the listener at which audio falloff stops. Note the volume of the audio is not 0 after this distance, but just doesn't fall off anymore.
  * @param {number} [options.rollOffFactor=1] - The factor used in the falloff equation.
  * @property {pc.Vec3} position The position of the sound in 3D space.
  * @property {pc.Vec3} velocity The velocity of the sound.
  * @property {string} distanceModel Determines which algorithm to use to reduce the volume of the audio as it moves away from the listener. Can be:
  *
  * * {@link pc.DISTANCE_LINEAR}
  * * {@link pc.DISTANCE_INVERSE}
  * * {@link pc.DISTANCE_EXPONENTIAL}
  *
  * Default is {@link pc.DISTANCE_LINEAR}.
  * @property {number} refDistance The reference distance for reducing volume as the sound source moves further from the listener.
  * @property {number} maxDistance The maximum distance from the listener at which audio falloff stops. Note the volume of the audio is not 0 after this distance, but just doesn't fall off anymore.
  * @property {number} rollOffFactor The factor used in the falloff equation.
  */
@JSImport("playcanvas", "SoundInstance3d")
@js.native
class SoundInstance3d protected ()
  extends typingsJapgolly.playcanvas.pc.SoundInstance3d {
  def this(
    manager: typingsJapgolly.playcanvas.pc.SoundManager,
    sound: typingsJapgolly.playcanvas.pc.Sound,
    options: AnonDistanceModel
  ) = this()
}

