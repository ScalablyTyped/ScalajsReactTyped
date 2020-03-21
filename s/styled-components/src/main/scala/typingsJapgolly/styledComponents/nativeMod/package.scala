package typingsJapgolly.styledComponents

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object nativeMod {
  type AnyIfEmpty[T /* <: js.Object */] = T
  type ReactNativeThemedStyledFunction[C /* <: typingsJapgolly.react.mod.ComponentType[_] */, T /* <: js.Object */] = typingsJapgolly.styledComponents.styledComponentsMod.ThemedStyledFunction[C, T, js.Object, scala.Nothing]
  type ReactNativeThemedStyledInterface[T /* <: js.Object */] = typingsJapgolly.styledComponents.nativeMod.ReactNativeThemedBaseStyledInterface[typingsJapgolly.styledComponents.nativeMod.AnyIfEmpty[T]]
}
