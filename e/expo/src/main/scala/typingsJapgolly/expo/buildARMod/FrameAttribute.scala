package typingsJapgolly.expo.buildARMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FrameAttribute extends js.Object

@JSImport("expo/build/AR", "FrameAttribute")
@js.native
object FrameAttribute extends js.Object {
  @js.native
  sealed trait Anchors extends FrameAttribute
  
  @js.native
  sealed trait CapturedDepthData extends FrameAttribute
  
  @js.native
  sealed trait LightEstimation extends FrameAttribute
  
  @js.native
  sealed trait RawFeaturePoints extends FrameAttribute
  
  /* "anchors" */ val Anchors: typingsJapgolly.expo.buildARMod.FrameAttribute.Anchors with String = js.native
  /* "capturedDepthData" */ val CapturedDepthData: typingsJapgolly.expo.buildARMod.FrameAttribute.CapturedDepthData with String = js.native
  /* "lightEstimation" */ val LightEstimation: typingsJapgolly.expo.buildARMod.FrameAttribute.LightEstimation with String = js.native
  /* "rawFeaturePoints" */ val RawFeaturePoints: typingsJapgolly.expo.buildARMod.FrameAttribute.RawFeaturePoints with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[FrameAttribute with String] = js.native
}

