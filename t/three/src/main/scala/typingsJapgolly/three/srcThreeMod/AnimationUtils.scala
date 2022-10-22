package typingsJapgolly.three.srcThreeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AnimationUtils {
  
  @JSImport("three/src/Three", "AnimationUtils")
  @js.native
  val ^ : js.Any = js.native
  
  inline def arraySlice(array: Any, from: Double, to: Double): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("arraySlice")(array.asInstanceOf[js.Any], from.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def convertArray(array: Any, `type`: Any, forceClone: Boolean): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("convertArray")(array.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], forceClone.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def flattenJSON(jsonKeys: js.Array[String], times: js.Array[Any], values: js.Array[Any], valuePropertyName: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("flattenJSON")(jsonKeys.asInstanceOf[js.Any], times.asInstanceOf[js.Any], values.asInstanceOf[js.Any], valuePropertyName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def getKeyframeOrder(times: js.Array[Double]): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("getKeyframeOrder")(times.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  
  inline def isTypedArray(`object`: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTypedArray")(`object`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def makeClipAdditive(targetClip: typingsJapgolly.three.srcAnimationAnimationClipMod.AnimationClip): typingsJapgolly.three.srcAnimationAnimationClipMod.AnimationClip = ^.asInstanceOf[js.Dynamic].applyDynamic("makeClipAdditive")(targetClip.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.three.srcAnimationAnimationClipMod.AnimationClip]
  inline def makeClipAdditive(
    targetClip: typingsJapgolly.three.srcAnimationAnimationClipMod.AnimationClip,
    referenceFrame: Double
  ): typingsJapgolly.three.srcAnimationAnimationClipMod.AnimationClip = (^.asInstanceOf[js.Dynamic].applyDynamic("makeClipAdditive")(targetClip.asInstanceOf[js.Any], referenceFrame.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.three.srcAnimationAnimationClipMod.AnimationClip]
  inline def makeClipAdditive(
    targetClip: typingsJapgolly.three.srcAnimationAnimationClipMod.AnimationClip,
    referenceFrame: Double,
    referenceClip: Unit,
    fps: Double
  ): typingsJapgolly.three.srcAnimationAnimationClipMod.AnimationClip = (^.asInstanceOf[js.Dynamic].applyDynamic("makeClipAdditive")(targetClip.asInstanceOf[js.Any], referenceFrame.asInstanceOf[js.Any], referenceClip.asInstanceOf[js.Any], fps.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.three.srcAnimationAnimationClipMod.AnimationClip]
  inline def makeClipAdditive(
    targetClip: typingsJapgolly.three.srcAnimationAnimationClipMod.AnimationClip,
    referenceFrame: Double,
    referenceClip: typingsJapgolly.three.srcAnimationAnimationClipMod.AnimationClip
  ): typingsJapgolly.three.srcAnimationAnimationClipMod.AnimationClip = (^.asInstanceOf[js.Dynamic].applyDynamic("makeClipAdditive")(targetClip.asInstanceOf[js.Any], referenceFrame.asInstanceOf[js.Any], referenceClip.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.three.srcAnimationAnimationClipMod.AnimationClip]
  inline def makeClipAdditive(
    targetClip: typingsJapgolly.three.srcAnimationAnimationClipMod.AnimationClip,
    referenceFrame: Double,
    referenceClip: typingsJapgolly.three.srcAnimationAnimationClipMod.AnimationClip,
    fps: Double
  ): typingsJapgolly.three.srcAnimationAnimationClipMod.AnimationClip = (^.asInstanceOf[js.Dynamic].applyDynamic("makeClipAdditive")(targetClip.asInstanceOf[js.Any], referenceFrame.asInstanceOf[js.Any], referenceClip.asInstanceOf[js.Any], fps.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.three.srcAnimationAnimationClipMod.AnimationClip]
  inline def makeClipAdditive(
    targetClip: typingsJapgolly.three.srcAnimationAnimationClipMod.AnimationClip,
    referenceFrame: Unit,
    referenceClip: Unit,
    fps: Double
  ): typingsJapgolly.three.srcAnimationAnimationClipMod.AnimationClip = (^.asInstanceOf[js.Dynamic].applyDynamic("makeClipAdditive")(targetClip.asInstanceOf[js.Any], referenceFrame.asInstanceOf[js.Any], referenceClip.asInstanceOf[js.Any], fps.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.three.srcAnimationAnimationClipMod.AnimationClip]
  inline def makeClipAdditive(
    targetClip: typingsJapgolly.three.srcAnimationAnimationClipMod.AnimationClip,
    referenceFrame: Unit,
    referenceClip: typingsJapgolly.three.srcAnimationAnimationClipMod.AnimationClip
  ): typingsJapgolly.three.srcAnimationAnimationClipMod.AnimationClip = (^.asInstanceOf[js.Dynamic].applyDynamic("makeClipAdditive")(targetClip.asInstanceOf[js.Any], referenceFrame.asInstanceOf[js.Any], referenceClip.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.three.srcAnimationAnimationClipMod.AnimationClip]
  inline def makeClipAdditive(
    targetClip: typingsJapgolly.three.srcAnimationAnimationClipMod.AnimationClip,
    referenceFrame: Unit,
    referenceClip: typingsJapgolly.three.srcAnimationAnimationClipMod.AnimationClip,
    fps: Double
  ): typingsJapgolly.three.srcAnimationAnimationClipMod.AnimationClip = (^.asInstanceOf[js.Dynamic].applyDynamic("makeClipAdditive")(targetClip.asInstanceOf[js.Any], referenceFrame.asInstanceOf[js.Any], referenceClip.asInstanceOf[js.Any], fps.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.three.srcAnimationAnimationClipMod.AnimationClip]
  
  inline def sortedArray(values: js.Array[Any], stride: Double, order: js.Array[Double]): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("sortedArray")(values.asInstanceOf[js.Any], stride.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  
  inline def subclip(
    sourceClip: typingsJapgolly.three.srcAnimationAnimationClipMod.AnimationClip,
    name: String,
    startFrame: Double,
    endFrame: Double
  ): typingsJapgolly.three.srcAnimationAnimationClipMod.AnimationClip = (^.asInstanceOf[js.Dynamic].applyDynamic("subclip")(sourceClip.asInstanceOf[js.Any], name.asInstanceOf[js.Any], startFrame.asInstanceOf[js.Any], endFrame.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.three.srcAnimationAnimationClipMod.AnimationClip]
  inline def subclip(
    sourceClip: typingsJapgolly.three.srcAnimationAnimationClipMod.AnimationClip,
    name: String,
    startFrame: Double,
    endFrame: Double,
    fps: Double
  ): typingsJapgolly.three.srcAnimationAnimationClipMod.AnimationClip = (^.asInstanceOf[js.Dynamic].applyDynamic("subclip")(sourceClip.asInstanceOf[js.Any], name.asInstanceOf[js.Any], startFrame.asInstanceOf[js.Any], endFrame.asInstanceOf[js.Any], fps.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.three.srcAnimationAnimationClipMod.AnimationClip]
}
