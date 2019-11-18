package typingsJapgolly.antd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libDrawerMod {
  import typingsJapgolly.react.NativeMouseEvent
  import typingsJapgolly.react.reactMod.KeyboardEvent
  import typingsJapgolly.react.reactMod.MouseEvent
  import typingsJapgolly.std.HTMLButtonElement
  import typingsJapgolly.std.HTMLDivElement
  import typingsJapgolly.std.HTMLElement

  type EventType = KeyboardEvent[HTMLDivElement] | (MouseEvent[HTMLDivElement | HTMLButtonElement, NativeMouseEvent])
  type getContainerFunc = js.Function0[HTMLElement]
}
