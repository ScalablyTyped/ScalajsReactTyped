package typingsJapgolly.three.srcThreeMod

import typingsJapgolly.three.srcAnimationAnimationClipMod.MorphTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/src/Three", "AnimationClip")
@js.native
open class AnimationClip ()
  extends typingsJapgolly.three.srcAnimationAnimationClipMod.AnimationClip {
  def this(name: String) = this()
  def this(name: String, duration: Double) = this()
  def this(name: Unit, duration: Double) = this()
  def this(
    name: String,
    duration: Double,
    tracks: js.Array[typingsJapgolly.three.srcAnimationKeyframeTrackMod.KeyframeTrack]
  ) = this()
  def this(
    name: String,
    duration: Unit,
    tracks: js.Array[typingsJapgolly.three.srcAnimationKeyframeTrackMod.KeyframeTrack]
  ) = this()
  def this(
    name: Unit,
    duration: Double,
    tracks: js.Array[typingsJapgolly.three.srcAnimationKeyframeTrackMod.KeyframeTrack]
  ) = this()
  def this(
    name: Unit,
    duration: Unit,
    tracks: js.Array[typingsJapgolly.three.srcAnimationKeyframeTrackMod.KeyframeTrack]
  ) = this()
  def this(
    name: String,
    duration: Double,
    tracks: js.Array[typingsJapgolly.three.srcAnimationKeyframeTrackMod.KeyframeTrack],
    blendMode: typingsJapgolly.three.srcConstantsMod.AnimationBlendMode
  ) = this()
  def this(
    name: String,
    duration: Double,
    tracks: Unit,
    blendMode: typingsJapgolly.three.srcConstantsMod.AnimationBlendMode
  ) = this()
  def this(
    name: String,
    duration: Unit,
    tracks: js.Array[typingsJapgolly.three.srcAnimationKeyframeTrackMod.KeyframeTrack],
    blendMode: typingsJapgolly.three.srcConstantsMod.AnimationBlendMode
  ) = this()
  def this(
    name: String,
    duration: Unit,
    tracks: Unit,
    blendMode: typingsJapgolly.three.srcConstantsMod.AnimationBlendMode
  ) = this()
  def this(
    name: Unit,
    duration: Double,
    tracks: js.Array[typingsJapgolly.three.srcAnimationKeyframeTrackMod.KeyframeTrack],
    blendMode: typingsJapgolly.three.srcConstantsMod.AnimationBlendMode
  ) = this()
  def this(
    name: Unit,
    duration: Double,
    tracks: Unit,
    blendMode: typingsJapgolly.three.srcConstantsMod.AnimationBlendMode
  ) = this()
  def this(
    name: Unit,
    duration: Unit,
    tracks: js.Array[typingsJapgolly.three.srcAnimationKeyframeTrackMod.KeyframeTrack],
    blendMode: typingsJapgolly.three.srcConstantsMod.AnimationBlendMode
  ) = this()
  def this(
    name: Unit,
    duration: Unit,
    tracks: Unit,
    blendMode: typingsJapgolly.three.srcConstantsMod.AnimationBlendMode
  ) = this()
}
/* static members */
object AnimationClip {
  
  @JSImport("three/src/Three", "AnimationClip")
  @js.native
  val ^ : js.Any = js.native
  
  inline def CreateClipsFromMorphTargetSequences(morphTargets: js.Array[MorphTarget], fps: Double, noLoop: Boolean): js.Array[typingsJapgolly.three.srcAnimationAnimationClipMod.AnimationClip] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateClipsFromMorphTargetSequences")(morphTargets.asInstanceOf[js.Any], fps.asInstanceOf[js.Any], noLoop.asInstanceOf[js.Any])).asInstanceOf[js.Array[typingsJapgolly.three.srcAnimationAnimationClipMod.AnimationClip]]
  
  inline def CreateFromMorphTargetSequence(name: String, morphTargetSequence: js.Array[MorphTarget], fps: Double, noLoop: Boolean): typingsJapgolly.three.srcAnimationAnimationClipMod.AnimationClip = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateFromMorphTargetSequence")(name.asInstanceOf[js.Any], morphTargetSequence.asInstanceOf[js.Any], fps.asInstanceOf[js.Any], noLoop.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.three.srcAnimationAnimationClipMod.AnimationClip]
  
  inline def findByName(
    clipArray: js.Array[typingsJapgolly.three.srcAnimationAnimationClipMod.AnimationClip],
    name: String
  ): typingsJapgolly.three.srcAnimationAnimationClipMod.AnimationClip = (^.asInstanceOf[js.Dynamic].applyDynamic("findByName")(clipArray.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.three.srcAnimationAnimationClipMod.AnimationClip]
  
  inline def parse(json: Any): typingsJapgolly.three.srcAnimationAnimationClipMod.AnimationClip = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(json.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.three.srcAnimationAnimationClipMod.AnimationClip]
  
  inline def parseAnimation(animation: Any, bones: js.Array[typingsJapgolly.three.srcObjectsBoneMod.Bone]): typingsJapgolly.three.srcAnimationAnimationClipMod.AnimationClip = (^.asInstanceOf[js.Dynamic].applyDynamic("parseAnimation")(animation.asInstanceOf[js.Any], bones.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.three.srcAnimationAnimationClipMod.AnimationClip]
  
  inline def toJSON(clip: typingsJapgolly.three.srcAnimationAnimationClipMod.AnimationClip): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("toJSON")(clip.asInstanceOf[js.Any]).asInstanceOf[Any]
}
