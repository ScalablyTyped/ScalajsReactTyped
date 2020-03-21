package typingsJapgolly.uiBox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object splitPropsMod {
  type Dictionary[T] = org.scalablytyped.runtime.StringDictionary[T]
  type Omit[T /* <: typingsJapgolly.uiBox.splitPropsMod.Dictionary[_] */, K /* <: java.lang.String */] = typingsJapgolly.std.Pick[T, typingsJapgolly.std.Exclude[java.lang.String, K]]
}
