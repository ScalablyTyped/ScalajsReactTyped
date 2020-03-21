package typingsJapgolly.reactJss

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Managers = org.scalablytyped.runtime.NumberDictionary[org.scalajs.dom.raw.StyleSheet]
  type Omit[T, K] = typingsJapgolly.std.Pick[T, typingsJapgolly.std.Exclude[java.lang.String, K]]
  /**
    * @deprecated Please use `WithStylesProps` instead
    */
  type WithStyles[S /* <: typingsJapgolly.jss.mod.Styles[java.lang.String] | (js.Function1[/* theme */ js.Any, typingsJapgolly.jss.mod.Styles[java.lang.String]]) */] = typingsJapgolly.reactJss.mod.WithStylesProps[S]
}
