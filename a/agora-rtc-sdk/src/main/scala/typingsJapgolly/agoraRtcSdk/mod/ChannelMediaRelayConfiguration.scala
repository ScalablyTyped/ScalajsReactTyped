package typingsJapgolly.agoraRtcSdk.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Configurations of the media stream relay.
  *
  * **Since**
  * <br>&emsp;&emsp;&emsp;*3.0.0*
  *
  * Use this interface to set the media stream relay when calling {@link startChannelMediaRelay} or {@link updateChannelMediaRelay}.
  */
trait ChannelMediaRelayConfiguration extends js.Object {
  /**
    * Removes the destination channel.
    *
    * @param channelName The name of the destination channel.
    * @example **Sample code**
    * ``` javascript
    * configuration.removeDestChannelInfo("cname")
    * ```
    */
  def removeDestChannelInfo(channelName: String): Unit
  /**
    * Sets the information of the destination channel.
    *
    * To relay a media stream across multiple channels, call this method as many times (to a maximum of four).
    *
    * @param channelName The name of the destination channel. Ensure that the value of this parameter is the same as the value of `channelName` in `destInfo`.
    * @param destInfo The information of the destination channel:
    *
    * - `channelName`: String, the channel name.
    * - `uid`: Number, the unique ID to identify the relay stream in the destination channel. A 32-bit unsigned integer with a value ranging from 0 to (2<sup>32</sup>-1). If you set it as `0`, the server assigns a random one. To avoid UID conflicts, this uid must be different from any other UIDs in the destination channel.
    * - `token`: String, the token generated with the above `channelName` and `uid`. Do not set this parameter if you have not enabled token.
    *
    * @example **Sample code**
    * ``` javascript
    * var configuration = new AgoraRTC.ChannelMediaRelayConfiguration();
    * configuration.setDestChannelInfo("cname", {
    *  channelName: "destChannel",
    *  uid: 123,
    *  token: "yourDestToken",
    * })
    * ```
    */
  def setDestChannelInfo(channelName: String, destInfo: js.Any): Unit
  /**
    * Sets the information of the source channel.
    *
    * @param srcInfo The information of the source channel:
    *
    * - `channelName`: String, the channel name.
    * - `uid`: Number, the unique ID to identify the relay stream in the source channel. A 32-bit unsigned integer with a value ranging from 0 to (2<sup>32</sup>-1). If you set it as `0`, the server assigns a random one. To avoid UID conflicts, this value must be different from the UID of the current host.
    * - `token`: String, the token generated with the above `channelName` and `uid`. Do not set this parameter if you have not enabled token.
    *
    * @example **Sample code**
    * ``` javascript
    * var configuration = new AgoraRTC.ChannelMediaRelayConfiguration();
    * configuration.setSrcChannelInfo({
    *  channelName: "srcChannel",
    *  uid: 123,
    *  token: "yourSrcToken",
    * })
    * ```
    */
  def setSrcChannelInfo(srcInfo: js.Any): Unit
}

object ChannelMediaRelayConfiguration {
  @scala.inline
  def apply(
    removeDestChannelInfo: String => Callback,
    setDestChannelInfo: (String, js.Any) => Callback,
    setSrcChannelInfo: js.Any => Callback
  ): ChannelMediaRelayConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("removeDestChannelInfo")(js.Any.fromFunction1((t0: java.lang.String) => removeDestChannelInfo(t0).runNow()))
    __obj.updateDynamic("setDestChannelInfo")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Any) => setDestChannelInfo(t0, t1).runNow()))
    __obj.updateDynamic("setSrcChannelInfo")(js.Any.fromFunction1((t0: js.Any) => setSrcChannelInfo(t0).runNow()))
    __obj.asInstanceOf[ChannelMediaRelayConfiguration]
  }
}

