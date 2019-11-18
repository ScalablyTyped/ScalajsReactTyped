package typingsJapgolly.reactDashNative.reactDashNativeMod

import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.react.reactMod.ReactNode
import typingsJapgolly.react.reactMod.ReactType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native", "createElement")
@js.native
object createElement extends js.Object {
  def apply[P](`type`: ReactType[_]): Element = js.native
  def apply[P](`type`: ReactType[_], props: P, children: ReactNode*): Element = js.native
}

