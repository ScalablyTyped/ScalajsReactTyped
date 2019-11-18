package typingsJapgolly.three.threeMod

import typingsJapgolly.three.srcCoreGeometryMod.MorphTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three", "AnimationClip")
@js.native
class AnimationClip ()
  extends typingsJapgolly.three.srcAnimationAnimationClipMod.AnimationClip {
  def this(name: String) = this()
  def this(name: String, duration: Double) = this()
  def this(
    name: String,
    duration: Double,
    tracks: js.Array[typingsJapgolly.three.srcAnimationKeyframeTrackMod.KeyframeTrack]
  ) = this()
}

/* static members */
@JSImport("three", "AnimationClip")
@js.native
object AnimationClip extends js.Object {
  def CreateClipsFromMorphTargetSequences(morphTargets: js.Array[MorphTarget], fps: Double, noLoop: Boolean): js.Array[typingsJapgolly.three.srcAnimationAnimationClipMod.AnimationClip] = js.native
  def CreateFromMorphTargetSequence(name: String, morphTargetSequence: js.Array[MorphTarget], fps: Double, noLoop: Boolean): typingsJapgolly.three.srcAnimationAnimationClipMod.AnimationClip = js.native
  def findByName(
    clipArray: js.Array[typingsJapgolly.three.srcAnimationAnimationClipMod.AnimationClip],
    name: String
  ): typingsJapgolly.three.srcAnimationAnimationClipMod.AnimationClip = js.native
  def parse(json: js.Any): typingsJapgolly.three.srcAnimationAnimationClipMod.AnimationClip = js.native
  def parseAnimation(animation: js.Any, bones: js.Array[typingsJapgolly.three.srcObjectsBoneMod.Bone], nodeName: String): typingsJapgolly.three.srcAnimationAnimationClipMod.AnimationClip = js.native
  def toJSON(): js.Any = js.native
}

