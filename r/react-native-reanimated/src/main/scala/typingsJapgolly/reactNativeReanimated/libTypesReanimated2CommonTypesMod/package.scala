package typingsJapgolly.reactNativeReanimated.libTypesReanimated2CommonTypesMod

import typingsJapgolly.reactNative.mod.MatrixTransform
import typingsJapgolly.reactNative.mod.PerpectiveTransform
import typingsJapgolly.reactNative.mod.RotateTransform
import typingsJapgolly.reactNative.mod.RotateXTransform
import typingsJapgolly.reactNative.mod.RotateYTransform
import typingsJapgolly.reactNative.mod.RotateZTransform
import typingsJapgolly.reactNative.mod.ScaleTransform
import typingsJapgolly.reactNative.mod.ScaleXTransform
import typingsJapgolly.reactNative.mod.ScaleYTransform
import typingsJapgolly.reactNative.mod.SkewXTransform
import typingsJapgolly.reactNative.mod.SkewYTransform
import typingsJapgolly.reactNative.mod.TranslateXTransform
import typingsJapgolly.reactNative.mod.TranslateYTransform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AnimatableValue = Double | String | js.Array[Double]

type AnimationCallback = js.Function2[/* finished */ js.UndefOr[Boolean], /* current */ js.UndefOr[AnimatableValue], Unit]

type NestedObjectValues[T] = T | js.Array[Any] | NestedObject[T]

type SensorValue3D = SharedValue[Value3D]

type SensorValueRotation = SharedValue[ValueRotation]

type ShadowNodeWrapper = js.Object

type Timestamp = Double

type TransformProperty = PerpectiveTransform | RotateTransform | RotateXTransform | RotateYTransform | RotateZTransform | ScaleTransform | ScaleXTransform | ScaleYTransform | TranslateXTransform | TranslateYTransform | SkewXTransform | SkewYTransform | MatrixTransform
