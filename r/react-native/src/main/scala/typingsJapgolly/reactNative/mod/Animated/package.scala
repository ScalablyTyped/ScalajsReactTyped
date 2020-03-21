package typingsJapgolly.reactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Animated {
  type AnimatedProps[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in keyof T ]: react-native.react-native.Animated.WithAnimatedValue<T[key]>}
    */ typingsJapgolly.reactNative.reactNativeStrings.AnimatedProps with T
  type AnimatedValue = typingsJapgolly.reactNative.mod.Animated.Value
  type AnimatedValueXY = typingsJapgolly.reactNative.mod.Animated.ValueXY
  type Base = typingsJapgolly.reactNative.mod.Animated.Animated
  type ComponentProps[T] = js.Any
  type EndCallback = js.Function1[/* result */ typingsJapgolly.reactNative.mod.Animated.EndResult, scala.Unit]
  type Mapping = (org.scalablytyped.runtime.StringDictionary[
    /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias react-native.react-native.Animated.Mapping */ js.Object
  ]) | typingsJapgolly.reactNative.mod.Animated.AnimatedValue
  type ValueListenerCallback = js.Function1[/* state */ typingsJapgolly.reactNative.AnonValue, scala.Unit]
  type ValueXYListenerCallback = js.Function1[/* value */ typingsJapgolly.reactNative.AnonX, scala.Unit]
}
