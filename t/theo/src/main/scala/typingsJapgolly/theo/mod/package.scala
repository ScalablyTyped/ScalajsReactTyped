package typingsJapgolly.theo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Aliases = typingsJapgolly.immutable.Immutable.OrderedMap[
    java.lang.String, 
    typingsJapgolly.immutable.Immutable.Map[java.lang.String, java.lang.String | scala.Double]
  ]
  type FormatResultFn = js.Function1[/* result */ typingsJapgolly.theo.mod.ImmutableStyleMap, java.lang.String]
  type Meta = typingsJapgolly.immutable.Immutable.Map[java.lang.String, java.lang.String]
  type Prop = typingsJapgolly.immutable.Immutable.Map[typingsJapgolly.theo.mod.StyleProperty, java.lang.String | scala.Double]
  type Props = typingsJapgolly.immutable.Immutable.List[typingsJapgolly.theo.mod.Prop]
}
