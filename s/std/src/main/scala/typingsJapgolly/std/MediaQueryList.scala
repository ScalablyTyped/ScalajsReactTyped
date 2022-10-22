package typingsJapgolly.std

import typingsJapgolly.std.stdStrings.change
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Stores information on a media query applied to a document, and handles sending notifications to listeners when the media query state change (i.e. when the media query test starts or stops evaluating to true). */
@js.native
trait MediaQueryList
  extends StObject
     with EventTarget {
  
  /* standard dom */
  @JSName("addEventListener")
  def addEventListener_change(
    `type`: change,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaQueryListEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_change(
    `type`: change,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaQueryListEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_change(
    `type`: change,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaQueryListEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  
  /** @deprecated */
  /* standard dom */
  def addListener(): Unit = js.native
  def addListener(callback: js.ThisFunction1[/* this */ this.type, /* ev */ MediaQueryListEvent, Any]): Unit = js.native
  
  /* standard dom */
  val matches: scala.Boolean = js.native
  
  /* standard dom */
  val media: java.lang.String = js.native
  
  /* standard dom */
  var onchange: (js.ThisFunction1[/* this */ this.type, /* ev */ MediaQueryListEvent, Any]) | Null = js.native
  
  /* standard dom */
  @JSName("removeEventListener")
  def removeEventListener_change(
    `type`: change,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaQueryListEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_change(
    `type`: change,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaQueryListEvent, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_change(
    `type`: change,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaQueryListEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  
  /** @deprecated */
  /* standard dom */
  def removeListener(): Unit = js.native
  def removeListener(callback: js.ThisFunction1[/* this */ this.type, /* ev */ MediaQueryListEvent, Any]): Unit = js.native
}
