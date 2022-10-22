package typingsJapgolly.webscreensWindowPlacement

import org.scalajs.dom.Event
import typingsJapgolly.std.AddEventListenerOptions
import typingsJapgolly.std.EventTarget
import typingsJapgolly.webscreensWindowPlacement.webscreensWindowPlacementStrings.change
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScreenEventHandlers
  extends StObject
     with EventTarget {
  
  @JSName("addEventListener")
  def addEventListener_change(`type`: change, listener: js.ThisFunction1[/* this */ Screen, /* ev */ Event, Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_change(
    `type`: change,
    listener: js.ThisFunction1[/* this */ Screen, /* ev */ Event, Any],
    options: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_change(
    `type`: change,
    listener: js.ThisFunction1[/* this */ Screen, /* ev */ Event, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  
  var onchange: (js.ThisFunction1[/* this */ Screen, /* ev */ Event, Any]) | Null = js.native
}
