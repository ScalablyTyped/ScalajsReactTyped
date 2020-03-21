package typingsJapgolly.twitterStreamChannels.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.twitterStreamChannels.mod.StreamChannels.StreamChannelsOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @class TwitterStreamChannels
  * @param {object} credentials
  * @param {String} credentials.consumer_key
  * @param {String} credentials.consumer_secret
  * @param {String} credentials.access_token
  * @param {String} credentials.access_token_secret
  * @return {TwitterStreamChannels}
  */
trait TwitterStreamChannels extends js.Object {
  /**
    * Returns a Twitter API client on which you can do pretty much what you want.
    * More here https://github.com/ttezel/twit
    * @method getApiClient
    * @returns {Twit}
    * @see https://github.com/topheman/twitter-stream-channels/blob/master/lib/TwitterStreamChannels.js#L113
    */
  def getApiClient(): typingsJapgolly.twit.mod.^
  /**
    * Opens a Twitter Stream and returns you an other one on which you'll be able to attach events for each channels
    * @method streamChannels
    * @param {object} options You can use the same filter options as described in the Twitter stream API for `statuses/filter` https://dev.twitter.com/docs/api/1.1/post/statuses/filter
    * @param {object|Array} options.track Pass an object describing your channels. If you don't want to use channels, you can pass directly an array of keywords.
    * @param {String} [options.follow] A comma separated list of user IDs, indicating the users to return statuses for in the stream
    * @param {String} [options.locations] Specifies a set of bounding boxes to track. More about how to format this parameter here : https://dev.twitter.com/docs/streaming-apis/parameters#locations
    * @param {Boolean} [options.enableChannelsEvents=true] If true, will fire the events like 'channels/channelName'
    * @param {Boolean} [options.enableRootChannelsEvent=true] If true, will fire the event 'channels'
    * @param {Boolean} [options.enableKeywordsEvents=false] If true, will fire the events 'keywords/keywordName' (disabled by default)
    * @return {StreamChannels}
    * @see https://github.com/topheman/twitter-stream-channels/blob/master/lib/TwitterStreamChannels.js#L131
    */
  def streamChannels(options: StreamChannelsOptions): StreamChannels
}

object TwitterStreamChannels {
  @scala.inline
  def apply(
    getApiClient: CallbackTo[typingsJapgolly.twit.mod.^],
    streamChannels: StreamChannelsOptions => CallbackTo[StreamChannels]
  ): TwitterStreamChannels = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getApiClient")(getApiClient.toJsFn)
    __obj.updateDynamic("streamChannels")(js.Any.fromFunction1((t0: typingsJapgolly.twitterStreamChannels.mod.StreamChannels.StreamChannelsOptions) => streamChannels(t0).runNow()))
    __obj.asInstanceOf[TwitterStreamChannels]
  }
}

