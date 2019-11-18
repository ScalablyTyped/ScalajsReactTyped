package typingsJapgolly.reactDashNative.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Animated {
  import org.scalablytyped.runtime.StringDictionary
  import typingsJapgolly.reactDashNative.Anon_Value
  import typingsJapgolly.reactDashNative.Anon_X

  type AnimatedValue = Value
  type AnimatedValueXY = ValueXY
  type Base = typingsJapgolly.reactDashNative.reactDashNativeMod.Animated.Animated
  type EndCallback = js.Function1[/* result */ EndResult, Unit]
  type Mapping = (StringDictionary[
    /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias react-native.react-native.Animated.Mapping */ js.Object
  ]) | AnimatedValue
  type ValueListenerCallback = js.Function1[/* state */ Anon_Value, Unit]
  type ValueXYListenerCallback = js.Function1[/* value */ Anon_X, Unit]
}
