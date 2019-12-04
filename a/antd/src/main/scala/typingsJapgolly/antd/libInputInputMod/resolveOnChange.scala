package typingsJapgolly.antd.libInputInputMod

import japgolly.scalajs.react.ReactEventFrom
import org.scalajs.dom.raw.Element
import typingsJapgolly.react.reactMod.ChangeEvent
import typingsJapgolly.std.HTMLElement
import typingsJapgolly.std.HTMLInputElement
import typingsJapgolly.std.HTMLTextAreaElement
import typingsJapgolly.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd/lib/input/Input", "resolveOnChange")
@js.native
object resolveOnChange extends js.Object {
  def apply(target: HTMLInputElement, e: ChangeEvent[HTMLTextAreaElement | HTMLInputElement]): Unit = js.native
  def apply(
    target: HTMLInputElement,
    e: ChangeEvent[HTMLTextAreaElement | HTMLInputElement],
    onChange: js.Function1[
      /* event */ ReactEventFrom[
        (org.scalajs.dom.raw.HTMLInputElement | org.scalajs.dom.raw.HTMLTextAreaElement) with Element
      ], 
      Unit
    ]
  ): Unit = js.native
  def apply(target: HTMLInputElement, e: typingsJapgolly.react.reactMod.MouseEvent[HTMLElement, MouseEvent]): Unit = js.native
  def apply(
    target: HTMLInputElement,
    e: typingsJapgolly.react.reactMod.MouseEvent[HTMLElement, MouseEvent],
    onChange: js.Function1[
      /* event */ ReactEventFrom[
        (org.scalajs.dom.raw.HTMLInputElement | org.scalajs.dom.raw.HTMLTextAreaElement) with Element
      ], 
      Unit
    ]
  ): Unit = js.native
  def apply(target: HTMLTextAreaElement, e: ChangeEvent[HTMLTextAreaElement | HTMLInputElement]): Unit = js.native
  def apply(
    target: HTMLTextAreaElement,
    e: ChangeEvent[HTMLTextAreaElement | HTMLInputElement],
    onChange: js.Function1[
      /* event */ ReactEventFrom[
        (org.scalajs.dom.raw.HTMLInputElement | org.scalajs.dom.raw.HTMLTextAreaElement) with Element
      ], 
      Unit
    ]
  ): Unit = js.native
  def apply(target: HTMLTextAreaElement, e: typingsJapgolly.react.reactMod.MouseEvent[HTMLElement, MouseEvent]): Unit = js.native
  def apply(
    target: HTMLTextAreaElement,
    e: typingsJapgolly.react.reactMod.MouseEvent[HTMLElement, MouseEvent],
    onChange: js.Function1[
      /* event */ ReactEventFrom[
        (org.scalajs.dom.raw.HTMLInputElement | org.scalajs.dom.raw.HTMLTextAreaElement) with Element
      ], 
      Unit
    ]
  ): Unit = js.native
}

