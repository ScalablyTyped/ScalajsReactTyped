package typingsJapgolly.reactNativeAnimatable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.linear
    - typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.ease
    - typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.`ease-in`
    - typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.`ease-out`
    - typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.`ease-in-out`
    - typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.`ease-in-cubic`
    - typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.`ease-out-cubic`
    - typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.`ease-in-out-cubic`
    - typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.`ease-in-circ`
    - typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.`ease-out-circ`
    - typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.`ease-in-out-circ`
    - typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.`ease-in-expo`
    - typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.`ease-out-expo`
    - typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.`ease-in-out-expo`
    - typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.`ease-in-quad`
    - typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.`ease-out-quad`
    - typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.`ease-in-out-quad`
    - typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.`ease-in-quart`
    - typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.`ease-out-quart`
    - typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.`ease-in-out-quart`
    - typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.`ease-in-quint`
    - typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.`ease-out-quint`
    - typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.`ease-in-out-quint`
    - typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.`ease-in-sine`
    - typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.`ease-out-sine`
    - typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.`ease-in-out-sine`
    - typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.`ease-in-back`
    - typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.`ease-out-back`
    - typingsJapgolly.reactNativeAnimatable.reactNativeAnimatableStrings.`ease-in-out-back`
    - typingsJapgolly.reactNativeAnimatable.mod.EasingFunction
  */
  type Easing = typingsJapgolly.reactNativeAnimatable.mod._Easing | typingsJapgolly.reactNativeAnimatable.mod.EasingFunction
  type EasingFunction = js.Function1[/* t */ scala.Double, scala.Double]
  type GetPropertyType[B, K /* <: java.lang.String */] = /* import warning: importer.ImportType#apply Failed type conversion: B[K] */ js.Any
  type Image = typingsJapgolly.reactNativeAnimatable.mod.AnimatableComponent[
    typingsJapgolly.reactNative.mod.ImageProperties, 
    typingsJapgolly.reactNative.mod.ImageStyle
  ]
  type Text = typingsJapgolly.reactNativeAnimatable.mod.AnimatableComponent[
    typingsJapgolly.reactNative.mod.TextProperties, 
    typingsJapgolly.reactNative.mod.TextStyle
  ]
  type View = typingsJapgolly.reactNativeAnimatable.mod.AnimatableComponent[
    typingsJapgolly.reactNative.mod.ViewProperties, 
    typingsJapgolly.reactNative.mod.ViewStyle
  ]
}
