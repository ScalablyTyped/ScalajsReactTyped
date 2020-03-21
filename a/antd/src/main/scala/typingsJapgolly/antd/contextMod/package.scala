package typingsJapgolly.antd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object contextMod {
  type IReactComponent[P] = typingsJapgolly.react.mod.StatelessComponent[P] | (japgolly.scalajs.react.raw.React.ComponentClassP[P with js.Object]) | typingsJapgolly.react.mod.ClassicComponentClass[P]
}
