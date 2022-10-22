package typingsJapgolly.webscreensWindowPlacement

import org.scalajs.dom.Event
import typingsJapgolly.std.AddEventListenerOptions
import typingsJapgolly.std.EventTarget
import typingsJapgolly.webscreensWindowPlacement.webscreensWindowPlacementStrings.currentscreenchange
import typingsJapgolly.webscreensWindowPlacement.webscreensWindowPlacementStrings.screenschange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScreenDetailsEventHandlers
  extends StObject
     with EventTarget {
  
  @JSName("addEventListener")
  def addEventListener_currentscreenchange(
    `type`: currentscreenchange,
    listener: js.ThisFunction1[/* this */ ScreenDetails, /* ev */ Event, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_currentscreenchange(
    `type`: currentscreenchange,
    listener: js.ThisFunction1[/* this */ ScreenDetails, /* ev */ Event, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_currentscreenchange(
    `type`: currentscreenchange,
    listener: js.ThisFunction1[/* this */ ScreenDetails, /* ev */ Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_screenschange(`type`: screenschange, listener: js.ThisFunction1[/* this */ ScreenDetails, /* ev */ Event, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_screenschange(
    `type`: screenschange,
    listener: js.ThisFunction1[/* this */ ScreenDetails, /* ev */ Event, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_screenschange(
    `type`: screenschange,
    listener: js.ThisFunction1[/* this */ ScreenDetails, /* ev */ Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  
  var oncurrentscreenchange: (js.ThisFunction1[/* this */ ScreenDetails, /* ev */ Event, Any]) | Null = js.native
  
  var onscreenschange: (js.ThisFunction1[/* this */ ScreenDetails, /* ev */ Event, Any]) | Null = js.native
}
