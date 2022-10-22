package typingsJapgolly.dragControls.anon

import org.scalablytyped.runtime.Instantiable0
import typingsJapgolly.three.mod.AnimationClip
import typingsJapgolly.three.srcAnimationAnimationClipMod.MorphTarget
import typingsJapgolly.three.srcObjectsBoneMod.Bone
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofAnimationClip
  extends StObject
     with Instantiable0[AnimationClip] {
  
  def CreateClipsFromMorphTargetSequences(morphTargets: js.Array[MorphTarget], fps: Double, noLoop: Boolean): js.Array[typingsJapgolly.three.srcAnimationAnimationClipMod.AnimationClip] = js.native
  
  def CreateFromMorphTargetSequence(name: String, morphTargetSequence: js.Array[MorphTarget], fps: Double, noLoop: Boolean): typingsJapgolly.three.srcAnimationAnimationClipMod.AnimationClip = js.native
  
  def findByName(
    clipArray: js.Array[typingsJapgolly.three.srcAnimationAnimationClipMod.AnimationClip],
    name: String
  ): typingsJapgolly.three.srcAnimationAnimationClipMod.AnimationClip = js.native
  
  def parse(json: Any): typingsJapgolly.three.srcAnimationAnimationClipMod.AnimationClip = js.native
  
  def parseAnimation(animation: Any, bones: js.Array[Bone]): typingsJapgolly.three.srcAnimationAnimationClipMod.AnimationClip = js.native
  
  def toJSON(clip: typingsJapgolly.three.srcAnimationAnimationClipMod.AnimationClip): Any = js.native
}
