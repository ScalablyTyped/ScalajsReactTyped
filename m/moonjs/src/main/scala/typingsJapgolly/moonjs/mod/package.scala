package typingsJapgolly.moonjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ComponentOptions[Props /* <: java.lang.String */, Data, Methods] = (typingsJapgolly.moonjs.mod.ComponentOptionsProperties[Props, js.Function0[Data], Methods]) with (typingsJapgolly.std.ThisType[
    typingsJapgolly.moonjs.mod.Instance[Data with Methods with (typingsJapgolly.std.Record[Props, _])]
  ])
  type ConstructorOptions[Props /* <: java.lang.String */, Data, Methods] = (typingsJapgolly.moonjs.mod.ComponentOptionsProperties[Props, js.Function0[Data] | Data, Methods]) with (typingsJapgolly.std.ThisType[
    typingsJapgolly.moonjs.mod.Instance[Data with Methods with (typingsJapgolly.std.Record[Props, _])]
  ])
}
