package typingsJapgolly.nodemailer.poolResourceMod

import typingsJapgolly.node.eventsMod.EventEmitter
import typingsJapgolly.nodemailer.nodemailerStrings.available
import typingsJapgolly.nodemailer.nodemailerStrings.close
import typingsJapgolly.nodemailer.nodemailerStrings.error
import typingsJapgolly.nodemailer.sharedMod.Logger
import typingsJapgolly.nodemailer.smtpPoolMod.Options
import typingsJapgolly.nodemailer.smtpPoolMod.SentMessageInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Creates an element for the pool
  */
@js.native
trait PoolResource extends EventEmitter {
  var available: Boolean = js.native
  var logger: Logger = js.native
  var messages: Double = js.native
  var options: Options = js.native
  var pool: typingsJapgolly.nodemailer.smtpPoolMod.^ = js.native
  @JSName("addListener")
  def addListener_available(event: available, listener: js.Function0[Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
  /** Closes the connection */
  def close(): Unit = js.native
  /** Initiates a connection to the SMTP server */
  def connect(callback: js.Function2[/* err */ js.Error | Null, /* established */ Boolean, Unit]): Unit = js.native
  @JSName("emit")
  def emit_available(event: available): Boolean = js.native
  @JSName("emit")
  def emit_close(event: close): Boolean = js.native
  @JSName("emit")
  def emit_error(event: error, err: js.Error): Boolean = js.native
  @JSName("on")
  def on_available(event: available, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_close(event: close, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
  @JSName("once")
  def once_available(event: available, listener: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  def once_close(event: close, listener: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  def once_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_available(event: available, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_available(event: available, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_available(event: available, listener: js.Function0[Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
  /** Sends an e-mail to be sent using the selected settings */
  def send(
    mail: typingsJapgolly.nodemailer.mailMessageMod.^,
    callback: js.Function2[/* err */ js.Error | Null, /* info */ SentMessageInfo, Unit]
  ): Unit = js.native
}

