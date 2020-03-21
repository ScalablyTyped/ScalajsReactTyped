package typingsJapgolly.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import typingsJapgolly.devexpressAspnetcoreBootstrap.devexpressAspnetcoreBootstrapStrings.init
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("DevExpress.AspNetCore.Control")
@js.native
class Control protected () extends js.Object {
  protected def this(instance: js.Any) = this()
  val instance: js.Any = js.native
  val name: String = js.native
  def adjustControl(): Unit = js.native
  def getHeight(): Double = js.native
  def getMainElement(): js.Any = js.native
  def getParentControl(): js.Any = js.native
  def getVisible(): Boolean = js.native
  def getWidth(): Double = js.native
  def inCallback(): Boolean = js.native
  def off(): this.type = js.native
   // tslint:disable-line:no-unnecessary-generics
  @JSName("off")
  def off_init(eventName: init): this.type = js.native
   // tslint:disable-line:unified-signatures no-unnecessary-generics
  @JSName("off")
  def off_init(
    eventName: init,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[EventArgs], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_init(
    eventName: init,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[EventArgs], Unit]
  ): this.type = js.native
  @JSName("once")
  def once_init(
    eventName: init,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[EventArgs], Unit]
  ): this.type = js.native
  def sendMessageToAssistiveTechnology(message: String): Unit = js.native
  def setHeight(height: Double): Unit = js.native
  def setVisible(visible: Boolean): Unit = js.native
  def setWidth(width: Double): Unit = js.native
}

