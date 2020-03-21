package typingsJapgolly.typestyle

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  type CSSClassNames[K /* <: java.lang.String */] = typingsJapgolly.std.Record[K, java.lang.String]
  type CSSClasses[K /* <: java.lang.String */] = typingsJapgolly.std.Record[K, typingsJapgolly.typestyle.typesMod.NestedCSSProperties]
  type FontFace = typingsJapgolly.csstype.mod.FontFace
  type TLength = scala.Double | java.lang.String
}
