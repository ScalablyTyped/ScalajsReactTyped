package typingsJapgolly.threeTdsLoader

import org.scalablytyped.runtime.Instantiable0
import typingsJapgolly.three.boneMod.Bone
import typingsJapgolly.three.geometryMod.MorphTarget
import typingsJapgolly.three.mod.AnimationClip
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofAnimationClip extends Instantiable0[AnimationClip] {
  def CreateClipsFromMorphTargetSequences(morphTargets: js.Array[MorphTarget], fps: Double, noLoop: Boolean): js.Array[typingsJapgolly.three.animationClipMod.AnimationClip] = js.native
  def CreateFromMorphTargetSequence(name: String, morphTargetSequence: js.Array[MorphTarget], fps: Double, noLoop: Boolean): typingsJapgolly.three.animationClipMod.AnimationClip = js.native
  def findByName(clipArray: js.Array[typingsJapgolly.three.animationClipMod.AnimationClip], name: String): typingsJapgolly.three.animationClipMod.AnimationClip = js.native
  def parse(json: js.Any): typingsJapgolly.three.animationClipMod.AnimationClip = js.native
  def parseAnimation(animation: js.Any, bones: js.Array[Bone], nodeName: String): typingsJapgolly.three.animationClipMod.AnimationClip = js.native
  def toJSON(): js.Any = js.native
}

