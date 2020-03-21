package typingsJapgolly.twitterForWeb

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The interface for Twitter for Websites.
  */
trait Twitter extends TwitterLike {
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
  @scala.inline
  def apply(
    events: TwitterEvents,
    ready: js.Function1[/* twttr */ Twitter, Unit] => Callback,
    widgets: TwitterWidgets
  ): Twitter = {
    val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any], widgets = widgets.asInstanceOf[js.Any])
    __obj.updateDynamic("ready")(js.Any.fromFunction1((t0: js.Function1[/* twttr */ typingsJapgolly.twitterForWeb.Twitter, scala.Unit]) => ready(t0).runNow()))
    __obj.asInstanceOf[Twitter]
  }
}

