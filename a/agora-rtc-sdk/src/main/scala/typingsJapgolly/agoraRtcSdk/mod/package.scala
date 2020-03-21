package typingsJapgolly.agoraRtcSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  /**
    * A list of `LocalAudioStats` objects, one per uid.
    *
    * If {@link getLocalAudioStats} is called successfully, this interface provides the UID and [[LocalAudioStats]] of the local user.
    */
  type LocalAudioStatsMap = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.agoraRtcSdk.mod.LocalAudioStats]
  /**
    * A list of `LocalVideoStats` objects, one per uid.
    *
    * If {@link getLocalVideoStats} is called successfully, this interface provides the UID and [[LocalVideoStats]] of each remote user.
    */
  type LocalVideoStatsMap = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.agoraRtcSdk.mod.LocalVideoStats]
  /**
    * A list of `RemoteAudioStats` objects, one per uid.
    *
    * If {@link getRemoteAudioStats} is called successfully, this interface provides the UID and [[RemoteAudioStats]] of each remote user.
    */
  type RemoteAudioStatsMap = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.agoraRtcSdk.mod.RemoteAudioStats]
  /**
    * A list of `RemoteVideoStats` objects, one per uid.
    *
    * If {@link getRemoteVideoStats} is called successfully, this interface provides the UID and [[RemoteVideoStats]] of each remote user.
    */
  type RemoteVideoStatsMap = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.agoraRtcSdk.mod.RemoteVideoStats]
}
