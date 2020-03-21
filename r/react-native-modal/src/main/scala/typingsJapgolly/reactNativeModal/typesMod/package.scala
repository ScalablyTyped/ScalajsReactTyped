package typingsJapgolly.reactNativeModal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  type AnimationEvent = js.Function1[/* repeated */ js.Any, scala.Unit]
  type OnOrientationChange = js.Function1[
    japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.reactNative.mod.NodeHandle with org.scalajs.dom.raw.Element], 
    scala.Unit
  ]
  type OrNull[T] = scala.Null | T
  type SupportedAnimation = typingsJapgolly.reactNativeAnimatable.mod.Animation | (typingsJapgolly.reactNativeAnimatable.mod.CustomAnimation[
    typingsJapgolly.reactNative.mod.TextStyle with typingsJapgolly.reactNative.mod.ViewStyle with typingsJapgolly.reactNative.mod.ImageStyle
  ])
}
