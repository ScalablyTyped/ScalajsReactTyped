package typingsJapgolly.std

import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.std.stdStrings.message
import typingsJapgolly.std.stdStrings.messageerror
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BroadcastChannel extends EventTarget {
  /**
    * Returns the channel name (as passed to the constructor).
    */
  val name: java.lang.String = js.native
  var onmessage: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.MessageEvent, _]) | Null = js.native
  var onmessageerror: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.MessageEvent, _]) | Null = js.native
  @JSName("addEventListener")
  def addEventListener_message(
    `type`: message,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.MessageEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_message(
    `type`: message,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.MessageEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_message(
    `type`: message,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.MessageEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_messageerror(
    `type`: messageerror,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.MessageEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_messageerror(
    `type`: messageerror,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.MessageEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_messageerror(
    `type`: messageerror,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.MessageEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  /**
    * Closes the BroadcastChannel object, opening it up to garbage collection.
    */
  def close(): Unit = js.native
  /**
    * Sends the given message to other BroadcastChannel objects set up for this channel. Messages can be structured objects, e.g. nested objects and arrays.
    */
  def postMessage(message: js.Any): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_message(
    `type`: message,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.MessageEvent, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_message(
    `type`: message,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.MessageEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_message(
    `type`: message,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.MessageEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_messageerror(
    `type`: messageerror,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.MessageEvent, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_messageerror(
    `type`: messageerror,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.MessageEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_messageerror(
    `type`: messageerror,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.MessageEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
}

@JSGlobal("BroadcastChannel")
@js.native
object BroadcastChannel
  extends Instantiable1[/* name */ java.lang.String, BroadcastChannel]

