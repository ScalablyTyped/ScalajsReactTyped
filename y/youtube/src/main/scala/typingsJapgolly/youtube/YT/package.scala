package typingsJapgolly.youtube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object YT {
  type ListType = typingsJapgolly.youtube.YT.ListTypePlayer | typingsJapgolly.youtube.YT.ListTypeSearch | typingsJapgolly.youtube.YT.ListTypeUserUploads
  type ListTypePlayer = typingsJapgolly.youtube.youtubeStrings.player
  type ListTypeSearch = typingsJapgolly.youtube.youtubeStrings.search
  type ListTypeUserUploads = typingsJapgolly.youtube.youtubeStrings.user_uploads
  type PlayerEventHandler[TEvent /* <: typingsJapgolly.youtube.YT.PlayerEvent */] = js.Function1[/* event */ TEvent, scala.Unit]
  type SuggestedVideoQuality = typingsJapgolly.youtube.YT.VideoQualityDefault | typingsJapgolly.youtube.YT.VideoQualitySmall | typingsJapgolly.youtube.YT.VideoQualityMedium | typingsJapgolly.youtube.YT.VideoQualityLarge | typingsJapgolly.youtube.YT.VideoQualityHD720 | typingsJapgolly.youtube.YT.VideoQualityHD1080 | typingsJapgolly.youtube.YT.VideoQualityHighRes
  type VideoQualityDefault = typingsJapgolly.youtube.youtubeStrings.default
  type VideoQualityHD1080 = typingsJapgolly.youtube.youtubeStrings.hd1080
  type VideoQualityHD720 = typingsJapgolly.youtube.youtubeStrings.hd720
  type VideoQualityHighRes = typingsJapgolly.youtube.youtubeStrings.highres
  type VideoQualityLarge = typingsJapgolly.youtube.youtubeStrings.large
  type VideoQualityMedium = typingsJapgolly.youtube.youtubeStrings.medium
  type VideoQualitySmall = typingsJapgolly.youtube.youtubeStrings.small
}
