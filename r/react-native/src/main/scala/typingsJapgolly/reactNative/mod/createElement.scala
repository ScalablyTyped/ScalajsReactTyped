package typingsJapgolly.reactNative.mod

import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.raw.React.Node
import typingsJapgolly.react.mod.ReactType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native", "createElement")
@js.native
object createElement extends js.Object {
  def apply[P](`type`: ReactType[_]): Element = js.native
  def apply[P](`type`: ReactType[_], props: P, children: Node*): Element = js.native
}

