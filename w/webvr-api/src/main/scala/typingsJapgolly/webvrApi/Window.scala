package typingsJapgolly.webvrApi

import typingsJapgolly.std.Event_
import typingsJapgolly.webvrApi.webvrApiStrings.vrdisplayactivate
import typingsJapgolly.webvrApi.webvrApiStrings.vrdisplayblur
import typingsJapgolly.webvrApi.webvrApiStrings.vrdisplayconnect
import typingsJapgolly.webvrApi.webvrApiStrings.vrdisplaydeactivate
import typingsJapgolly.webvrApi.webvrApiStrings.vrdisplaydisconnect
import typingsJapgolly.webvrApi.webvrApiStrings.vrdisplayfocus
import typingsJapgolly.webvrApi.webvrApiStrings.vrdisplaypointerrestricted
import typingsJapgolly.webvrApi.webvrApiStrings.vrdisplaypointerunrestricted
import typingsJapgolly.webvrApi.webvrApiStrings.vrdisplaypresentchange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Window extends js.Object {
  var onvrdisplayactivate: (js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]) | Null = js.native
  var onvrdisplayblur: (js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]) | Null = js.native
  var onvrdisplayconnect: (js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]) | Null = js.native
  var onvrdisplaydeactivate: (js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]) | Null = js.native
  var onvrdisplaydisconnect: (js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]) | Null = js.native
  var onvrdisplayfocus: (js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]) | Null = js.native
  var onvrdisplaypointerrestricted: (js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]) | Null = js.native
  var onvrdisplaypointerunrestricted: (js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]) | Null = js.native
  var onvrdisplaypresentchange: (js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]) | Null = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplayactivate(`type`: vrdisplayactivate, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplayactivate(
    `type`: vrdisplayactivate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplayblur(`type`: vrdisplayblur, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplayblur(
    `type`: vrdisplayblur,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplayconnect(`type`: vrdisplayconnect, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplayconnect(
    `type`: vrdisplayconnect,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplaydeactivate(`type`: vrdisplaydeactivate, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplaydeactivate(
    `type`: vrdisplaydeactivate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplaydisconnect(`type`: vrdisplaydisconnect, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplaydisconnect(
    `type`: vrdisplaydisconnect,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplayfocus(`type`: vrdisplayfocus, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplayfocus(
    `type`: vrdisplayfocus,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplaypointerrestricted(
    `type`: vrdisplaypointerrestricted,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplaypointerrestricted(
    `type`: vrdisplaypointerrestricted,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplaypointerunrestricted(
    `type`: vrdisplaypointerunrestricted,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplaypointerunrestricted(
    `type`: vrdisplaypointerunrestricted,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplaypresentchange(
    `type`: vrdisplaypresentchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_vrdisplaypresentchange(
    `type`: vrdisplaypresentchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    useCapture: Boolean
  ): Unit = js.native
}

