package typingsJapgolly.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import typingsJapgolly.devexpressAspnetcoreBootstrap.devexpressAspnetcoreBootstrapStrings.keyDown
import typingsJapgolly.devexpressAspnetcoreBootstrap.devexpressAspnetcoreBootstrapStrings.keyPress
import typingsJapgolly.devexpressAspnetcoreBootstrap.devexpressAspnetcoreBootstrapStrings.keyUp
import typingsJapgolly.devexpressAspnetcoreBootstrap.devexpressAspnetcoreBootstrapStrings.textChanged
import typingsJapgolly.devexpressAspnetcoreBootstrap.devexpressAspnetcoreBootstrapStrings.userInput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("DevExpress.AspNetCore.BootstrapMemo")
@js.native
class BootstrapMemo () extends BootstrapClientEdit {
  def getCaretPosition(): Double = js.native
  def getText(): String = js.native
  @JSName("off")
  def off_keyDown(eventName: keyDown): this.type = js.native
  @JSName("off")
  def off_keyDown(
    eventName: keyDown,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[EditKeyEventArgs], Unit]
  ): this.type = js.native
  @JSName("off")
  def off_keyPress(eventName: keyPress): this.type = js.native
  @JSName("off")
  def off_keyPress(
    eventName: keyPress,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[EditKeyEventArgs], Unit]
  ): this.type = js.native
  @JSName("off")
  def off_keyUp(eventName: keyUp): this.type = js.native
  @JSName("off")
  def off_keyUp(
    eventName: keyUp,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[EditKeyEventArgs], Unit]
  ): this.type = js.native
  @JSName("off")
  def off_textChanged(eventName: textChanged): this.type = js.native
  @JSName("off")
  def off_textChanged(
    eventName: textChanged,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[ProcessingModeEventArgs], Unit]
  ): this.type = js.native
  @JSName("off")
  def off_userInput(eventName: userInput): this.type = js.native
  @JSName("off")
  def off_userInput(
    eventName: userInput,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[EventArgs], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_keyDown(
    eventName: keyDown,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[EditKeyEventArgs], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_keyPress(
    eventName: keyPress,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[EditKeyEventArgs], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_keyUp(
    eventName: keyUp,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[EditKeyEventArgs], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_textChanged(
    eventName: textChanged,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[ProcessingModeEventArgs], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_userInput(
    eventName: userInput,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[EventArgs], Unit]
  ): this.type = js.native
  @JSName("once")
  def once_keyDown(
    eventName: keyDown,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[EditKeyEventArgs], Unit]
  ): this.type = js.native
  @JSName("once")
  def once_keyPress(
    eventName: keyPress,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[EditKeyEventArgs], Unit]
  ): this.type = js.native
  @JSName("once")
  def once_keyUp(
    eventName: keyUp,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[EditKeyEventArgs], Unit]
  ): this.type = js.native
  @JSName("once")
  def once_textChanged(
    eventName: textChanged,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[ProcessingModeEventArgs], Unit]
  ): this.type = js.native
  @JSName("once")
  def once_userInput(
    eventName: userInput,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[EventArgs], Unit]
  ): this.type = js.native
  def selectAll(): Unit = js.native
  def setCaretPosition(position: Double): Unit = js.native
  def setSelection(startPos: Double, endPos: Double, scrollToSelection: Boolean): Unit = js.native
  def setText(text: String): Unit = js.native
}

