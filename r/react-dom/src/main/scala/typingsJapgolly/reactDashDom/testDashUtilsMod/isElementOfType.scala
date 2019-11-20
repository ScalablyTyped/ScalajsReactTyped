package typingsJapgolly.reactDashDom.testDashUtilsMod

import japgolly.scalajs.react.raw.React.Component
import japgolly.scalajs.react.raw.React.ComponentClassP
import japgolly.scalajs.react.raw.React.Element
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.react.reactMod.ClassType
import typingsJapgolly.react.reactMod.SFC
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-dom/test-utils", "isElementOfType")
@js.native
object isElementOfType extends js.Object {
  def apply[T /* <: HTMLElement */](element: Element, `type`: String): /* is react.react.ReactHTMLElement<T> */ Boolean = js.native
  def apply[P](element: Element, `type`: SFC[P]): /* is react.react.SFCElement<P> */ Boolean = js.native
  def apply[P, T /* <: Component[P with js.Object, js.Object] */, C /* <: ComponentClassP[P with js.Object] */](element: Element, `type`: ClassType[P, T, C]): /* is react.react.CElement<P, T> */ Boolean = js.native
}

