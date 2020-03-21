package typingsJapgolly.twitchExt

import typingsJapgolly.twitchExt.twitchExtStrings.`false`
import typingsJapgolly.twitchExt.twitchExtStrings.`true`
import typingsJapgolly.twitchExt.twitchExtStrings.approved
import typingsJapgolly.twitchExt.twitchExtStrings.component
import typingsJapgolly.twitchExt.twitchExtStrings.config
import typingsJapgolly.twitchExt.twitchExtStrings.dashboard
import typingsJapgolly.twitchExt.twitchExtStrings.hosted_test
import typingsJapgolly.twitchExt.twitchExtStrings.in_review
import typingsJapgolly.twitchExt.twitchExtStrings.mobile
import typingsJapgolly.twitchExt.twitchExtStrings.panel
import typingsJapgolly.twitchExt.twitchExtStrings.pending_action
import typingsJapgolly.twitchExt.twitchExtStrings.ready_for_review
import typingsJapgolly.twitchExt.twitchExtStrings.released
import typingsJapgolly.twitchExt.twitchExtStrings.testing
import typingsJapgolly.twitchExt.twitchExtStrings.uploading
import typingsJapgolly.twitchExt.twitchExtStrings.video_overlay
import typingsJapgolly.twitchExt.twitchExtStrings.viewer
import typingsJapgolly.twitchExt.twitchExtStrings.web
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The extension window receives the following query parameters, which indicate
  * information about the extension environment that isn’t subject to change over
  * the frame’s life cycle.
  *
  * @see https://dev.twitch.tv/docs/extensions/reference/#client-query-parameters
  */
trait TwitchExtClientQueryParams extends js.Object {
  /**
  	 * The type of the anchor in which the extension is activated.
  	 */
  var anchor: component | panel | video_overlay
  /**
  	 * The user’s language setting.
  	 *
  	 * @example en
  	 */
  var language: String
  /**
  	 * The extension’s mode.
  	 */
  var mode: config | dashboard | viewer
  /**
  	 * The platform on which the Twitch client is running.
  	 */
  var platform: mobile | web
  /**
  	 * Indicates whether the extension is popped out.
  	 */
  var popout: `true` | `false`
  /**
  	 * The release state of the extension.
  	 */
  var state: testing | hosted_test | approved | released | ready_for_review | in_review | pending_action | uploading
}

object TwitchExtClientQueryParams {
  @scala.inline
  def apply(
    anchor: component | panel | video_overlay,
    language: String,
    mode: config | dashboard | viewer,
    platform: mobile | web,
    popout: `true` | `false`,
    state: testing | hosted_test | approved | released | ready_for_review | in_review | pending_action | uploading
  ): TwitchExtClientQueryParams = {
    val __obj = js.Dynamic.literal(anchor = anchor.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], popout = popout.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TwitchExtClientQueryParams]
  }
}

