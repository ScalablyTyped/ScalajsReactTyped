package typingsJapgolly.antd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libDrawerMod {
  import japgolly.scalajs.react.ReactKeyboardEventFrom
  import japgolly.scalajs.react.ReactMouseEventFrom
  import org.scalajs.dom.raw.Element
  import org.scalajs.dom.raw.HTMLButtonElement
  import org.scalajs.dom.raw.HTMLDivElement
  import org.scalajs.dom.raw.HTMLElement

  type EventType = ReactKeyboardEventFrom[HTMLDivElement] | (ReactMouseEventFrom[(HTMLDivElement | HTMLButtonElement) with Element])
  type getContainerFunc = js.Function0[HTMLElement]
}
