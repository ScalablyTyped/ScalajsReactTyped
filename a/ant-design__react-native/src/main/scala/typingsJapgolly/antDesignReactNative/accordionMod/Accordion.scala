package typingsJapgolly.antDesignReactNative.accordionMod

import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.antDesignReactNative.AnonArrow
import typingsJapgolly.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Accordion[T /* <: AccordionHeader */]
  extends Component[AccordionNativeProps[T], js.Any, js.Any] {
  def renderContent(styles: AnonArrow): js.Function1[/* section */ T, Element] = js.native
  def renderHeader(styles: AnonArrow): js.Function3[/* section */ T, /* _ */ Double, /* isActive */ Boolean, Element] = js.native
}

