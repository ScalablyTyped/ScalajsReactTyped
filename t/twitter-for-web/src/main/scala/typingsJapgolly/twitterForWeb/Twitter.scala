package typingsJapgolly.twitterForWeb

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The interface for Twitter for Websites.
  */
trait Twitter
  extends StObject
     with TwitterLike {
  
  /**
    * Twitter events.
    */
  var events: TwitterEvents
  
  /**
    * Twitter widgets.
    */
  var widgets: TwitterWidgets
}
object Twitter {
  
  inline def apply(
    events: TwitterEvents,
    ready: js.Function1[/* twttr */ Twitter, Unit] => Callback,
    widgets: TwitterWidgets
  ): Twitter = {
    val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any], ready = js.Any.fromFunction1((t0: js.Function1[/* twttr */ Twitter, Unit]) => ready(t0).runNow()), widgets = widgets.asInstanceOf[js.Any])
    __obj.asInstanceOf[Twitter]
  }
  
  extension [Self <: Twitter](x: Self) {
    
    inline def setEvents(value: TwitterEvents): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    inline def setWidgets(value: TwitterWidgets): Self = StObject.set(x, "widgets", value.asInstanceOf[js.Any])
  }
}
