package typingsJapgolly.twitterForWeb

import typingsJapgolly.twitterForWeb.twitterForWebStrings.click
import typingsJapgolly.twitterForWeb.twitterForWebStrings.favorite
import typingsJapgolly.twitterForWeb.twitterForWebStrings.follow
import typingsJapgolly.twitterForWeb.twitterForWebStrings.loaded
import typingsJapgolly.twitterForWeb.twitterForWebStrings.rendered
import typingsJapgolly.twitterForWeb.twitterForWebStrings.retweet
import typingsJapgolly.twitterForWeb.twitterForWebStrings.tweet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The interface for Twitter events.
  */
@js.native
trait TwitterEvents extends js.Object {
  /**
    * Bind an event.
    *
    * @param name The name of an event.
    * @param callback A callback function which will be invoked.
    */
  def bind(name: String, callback: js.Function1[/* ev */ js.Any, Unit]): Unit = js.native
  /**
    * Bind an event occurs when the user invokes a Web Intent from within an embedded widget.
    *
    * @param name The name of an event.
    * @param callback A callback function which will be invoked.
    */
  @JSName("bind")
  def bind_click(name: click, callback: js.Function1[/* ev */ TwitterIntentEvent, Unit]): Unit = js.native
  /**
    * Bind an event which will populate the favorited tweet_id in the event object’s data argument.
    *
    * @param name The name of an event.
    * @param callback A callback function which will be invoked.
    */
  @JSName("bind")
  def bind_favorite(name: favorite, callback: js.Function1[/* ev */ TwitterIntentEvent, Unit]): Unit = js.native
  /**
    * Bind an event which will populate the followed user_id in the event object’s data argument.
    *
    * @param name The name of an event.
    * @param callback A callback function which will be invoked.
    */
  @JSName("bind")
  def bind_follow(name: follow, callback: js.Function1[/* ev */ TwitterIntentEvent, Unit]): Unit = js.native
  /**
    * Occurs after twttr.widgets.load has initialized widgets in a page, from an embed code. Includes an array of references to the newly created widget nodes.
    *
    * @param name The name of an event.
    * @param callback A callback function which will be invoked.
    */
  @JSName("bind")
  def bind_loaded(name: loaded, callback: js.Function1[/* ev */ js.Any, Unit]): Unit = js.native
  /**
    * Bind an event occurs after an individual widget in a page is rendered. Includes a of reference to the newly created widget node. Occurs at the same time as loaded, but for each individual widget. Also triggered when creating a widget with a factory function.
    *
    * @param name The name of an event.
    * @param callback A callback function which will be invoked.
    */
  @JSName("bind")
  def bind_rendered(name: rendered, callback: js.Function1[/* ev */ js.Any, Unit]): Unit = js.native
  /**
    * Bind an event which will populate the original Tweet that was retweeted’s source_tweet_id in the event object’s data argument.
    *
    * @param name The name of an event.
    * @param callback A callback function which will be invoked.
    */
  @JSName("bind")
  def bind_retweet(name: retweet, callback: js.Function1[/* ev */ TwitterIntentEvent, Unit]): Unit = js.native
  /**
    * Bind an event which will be triggered when the user publishes a Tweet (either new, or a reply) through the Tweet Web Intent.
    *
    * @param name The name of an event.
    * @param callback A callback function which will be invoked.
    */
  @JSName("bind")
  def bind_tweet(name: tweet, callback: js.Function1[/* ev */ TwitterIntentEvent, Unit]): Unit = js.native
}

