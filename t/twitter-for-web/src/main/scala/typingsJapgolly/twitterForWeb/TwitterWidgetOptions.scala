package typingsJapgolly.twitterForWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The interface for additional configuration for all widgets.
  */
trait TwitterWidgetOptions extends js.Object {
  /**
    * Enable Do Not Track for this widget.
    */
  var dnt: js.UndefOr[Boolean] = js.undefined
  /**
    * A list of hashtags to be appended to default Tweet text where appropriate.
    */
  var hashtags: js.UndefOr[String] = js.undefined
  /**
    * The language in which to render a widget, if supported.
    */
  var lang: js.UndefOr[String] = js.undefined
  /**
    * A list of Twitter screen names to be suggested for following after a Tweet is posted.
    */
  var related: js.UndefOr[String] = js.undefined
  /**
    * A Twitter user mentioned in the default Tweet text as /via @user where appropriate.
    */
  var via: js.UndefOr[String] = js.undefined
}

object TwitterWidgetOptions {
  @scala.inline
  def apply(
    dnt: js.UndefOr[Boolean] = js.undefined,
    hashtags: String = null,
    lang: String = null,
    related: String = null,
    via: String = null
  ): TwitterWidgetOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(dnt)) __obj.updateDynamic("dnt")(dnt.asInstanceOf[js.Any])
    if (hashtags != null) __obj.updateDynamic("hashtags")(hashtags.asInstanceOf[js.Any])
    if (lang != null) __obj.updateDynamic("lang")(lang.asInstanceOf[js.Any])
    if (related != null) __obj.updateDynamic("related")(related.asInstanceOf[js.Any])
    if (via != null) __obj.updateDynamic("via")(via.asInstanceOf[js.Any])
    __obj.asInstanceOf[TwitterWidgetOptions]
  }
}

