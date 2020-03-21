package typingsJapgolly.std

import typingsJapgolly.std.stdStrings.afterprint
import typingsJapgolly.std.stdStrings.beforeprint
import typingsJapgolly.std.stdStrings.beforeunload
import typingsJapgolly.std.stdStrings.hashchange
import typingsJapgolly.std.stdStrings.languagechange
import typingsJapgolly.std.stdStrings.message
import typingsJapgolly.std.stdStrings.messageerror
import typingsJapgolly.std.stdStrings.offline
import typingsJapgolly.std.stdStrings.online
import typingsJapgolly.std.stdStrings.pagehide
import typingsJapgolly.std.stdStrings.pageshow
import typingsJapgolly.std.stdStrings.popstate
import typingsJapgolly.std.stdStrings.rejectionhandled
import typingsJapgolly.std.stdStrings.storage
import typingsJapgolly.std.stdStrings.unhandledrejection
import typingsJapgolly.std.stdStrings.unload
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WindowEventHandlers extends js.Object {
  var onafterprint: (js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]) | Null = js.native
  var onbeforeprint: (js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]) | Null = js.native
  var onbeforeunload: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.BeforeUnloadEvent, _]) | Null = js.native
  var onhashchange: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.HashChangeEvent, _]) | Null = js.native
  var onlanguagechange: (js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]) | Null = js.native
  var onmessage: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.MessageEvent, _]) | Null = js.native
  var onmessageerror: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.MessageEvent, _]) | Null = js.native
  var onoffline: (js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]) | Null = js.native
  var ononline: (js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]) | Null = js.native
  var onpagehide: (js.ThisFunction1[/* this */ this.type, /* ev */ PageTransitionEvent, _]) | Null = js.native
  var onpageshow: (js.ThisFunction1[/* this */ this.type, /* ev */ PageTransitionEvent, _]) | Null = js.native
  var onpopstate: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.PopStateEvent, _]) | Null = js.native
  var onrejectionhandled: (js.ThisFunction1[/* this */ this.type, /* ev */ PromiseRejectionEvent, _]) | Null = js.native
  var onstorage: (js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.StorageEvent, _]) | Null = js.native
  var onunhandledrejection: (js.ThisFunction1[/* this */ this.type, /* ev */ PromiseRejectionEvent, _]) | Null = js.native
  var onunload: (js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]) | Null = js.native
  def addEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject): Unit = js.native
  def addEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject, options: scala.Boolean): Unit = js.native
  def addEventListener(
    `type`: java.lang.String,
    listener: EventListenerOrEventListenerObject,
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_afterprint(`type`: afterprint, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_afterprint(
    `type`: afterprint,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_afterprint(
    `type`: afterprint,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_beforeprint(`type`: beforeprint, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_beforeprint(
    `type`: beforeprint,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_beforeprint(
    `type`: beforeprint,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_beforeunload(
    `type`: beforeunload,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.BeforeUnloadEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_beforeunload(
    `type`: beforeunload,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.BeforeUnloadEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_beforeunload(
    `type`: beforeunload,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.BeforeUnloadEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_hashchange(
    `type`: hashchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.HashChangeEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_hashchange(
    `type`: hashchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.HashChangeEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_hashchange(
    `type`: hashchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.HashChangeEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_languagechange(`type`: languagechange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_languagechange(
    `type`: languagechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_languagechange(
    `type`: languagechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: AddEventListenerOptions
  ): Unit = js.native
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
  @JSName("addEventListener")
  def addEventListener_offline(`type`: offline, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_offline(
    `type`: offline,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_offline(
    `type`: offline,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_online(`type`: online, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_online(
    `type`: online,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_online(
    `type`: online,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pagehide(
    `type`: pagehide,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PageTransitionEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pagehide(
    `type`: pagehide,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PageTransitionEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pagehide(
    `type`: pagehide,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PageTransitionEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pageshow(
    `type`: pageshow,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PageTransitionEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pageshow(
    `type`: pageshow,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PageTransitionEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pageshow(
    `type`: pageshow,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PageTransitionEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_popstate(
    `type`: popstate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.PopStateEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_popstate(
    `type`: popstate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.PopStateEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_popstate(
    `type`: popstate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.PopStateEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_rejectionhandled(
    `type`: rejectionhandled,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PromiseRejectionEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_rejectionhandled(
    `type`: rejectionhandled,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PromiseRejectionEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_rejectionhandled(
    `type`: rejectionhandled,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PromiseRejectionEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_storage(
    `type`: storage,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.StorageEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_storage(
    `type`: storage,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.StorageEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_storage(
    `type`: storage,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.StorageEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_unhandledrejection(
    `type`: unhandledrejection,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PromiseRejectionEvent, _]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_unhandledrejection(
    `type`: unhandledrejection,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PromiseRejectionEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_unhandledrejection(
    `type`: unhandledrejection,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PromiseRejectionEvent, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_unload(`type`: unload, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_unload(
    `type`: unload,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_unload(
    `type`: unload,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: AddEventListenerOptions
  ): Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject): Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject, options: scala.Boolean): Unit = js.native
  def removeEventListener(
    `type`: java.lang.String,
    listener: EventListenerOrEventListenerObject,
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_afterprint(`type`: afterprint, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_afterprint(
    `type`: afterprint,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_afterprint(
    `type`: afterprint,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_beforeprint(`type`: beforeprint, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_beforeprint(
    `type`: beforeprint,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_beforeprint(
    `type`: beforeprint,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_beforeunload(
    `type`: beforeunload,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.BeforeUnloadEvent, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_beforeunload(
    `type`: beforeunload,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.BeforeUnloadEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_beforeunload(
    `type`: beforeunload,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.BeforeUnloadEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_hashchange(
    `type`: hashchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.HashChangeEvent, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_hashchange(
    `type`: hashchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.HashChangeEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_hashchange(
    `type`: hashchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.HashChangeEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_languagechange(`type`: languagechange, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_languagechange(
    `type`: languagechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_languagechange(
    `type`: languagechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: EventListenerOptions
  ): Unit = js.native
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
  @JSName("removeEventListener")
  def removeEventListener_offline(`type`: offline, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_offline(
    `type`: offline,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_offline(
    `type`: offline,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_online(`type`: online, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_online(
    `type`: online,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_online(
    `type`: online,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pagehide(
    `type`: pagehide,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PageTransitionEvent, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pagehide(
    `type`: pagehide,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PageTransitionEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pagehide(
    `type`: pagehide,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PageTransitionEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pageshow(
    `type`: pageshow,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PageTransitionEvent, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pageshow(
    `type`: pageshow,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PageTransitionEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pageshow(
    `type`: pageshow,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PageTransitionEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_popstate(
    `type`: popstate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.PopStateEvent, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_popstate(
    `type`: popstate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.PopStateEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_popstate(
    `type`: popstate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.PopStateEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_rejectionhandled(
    `type`: rejectionhandled,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PromiseRejectionEvent, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_rejectionhandled(
    `type`: rejectionhandled,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PromiseRejectionEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_rejectionhandled(
    `type`: rejectionhandled,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PromiseRejectionEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_storage(
    `type`: storage,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.StorageEvent, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_storage(
    `type`: storage,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.StorageEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_storage(
    `type`: storage,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ org.scalajs.dom.raw.StorageEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_unhandledrejection(
    `type`: unhandledrejection,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PromiseRejectionEvent, _]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_unhandledrejection(
    `type`: unhandledrejection,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PromiseRejectionEvent, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_unhandledrejection(
    `type`: unhandledrejection,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PromiseRejectionEvent, _],
    options: EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_unload(`type`: unload, listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_unload(
    `type`: unload,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_unload(
    `type`: unload,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event_, _],
    options: EventListenerOptions
  ): Unit = js.native
}

