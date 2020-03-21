package typingsJapgolly.styletronReact.mod

import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.react.mod.PropsWithChildren
import typingsJapgolly.react.mod.ValidationMap
import typingsJapgolly.react.mod.WeakValidationMap
import typingsJapgolly.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react.react.FC<P & styletron-react.styletron-react.StyletronComponentInjectedProps<P>> & {  __STYLETRON__  :styletron-react.styletron-react.Styletron} */
@js.native
trait StyletronComponent[P /* <: js.Object */] extends js.Object {
  var __STYLETRON__ : Styletron = js.native
  var contextTypes: js.UndefOr[ValidationMap[_]] = js.native
  var defaultProps: js.UndefOr[Partial[P with StyletronComponentInjectedProps[P]]] = js.native
  var displayName: js.UndefOr[String] = js.native
  var propTypes: js.UndefOr[WeakValidationMap[P with StyletronComponentInjectedProps[P]]] = js.native
  def apply(props: PropsWithChildren[P with StyletronComponentInjectedProps[P]]): Element | Null = js.native
  def apply(props: PropsWithChildren[P with StyletronComponentInjectedProps[P]], context: js.Any): Element | Null = js.native
}

