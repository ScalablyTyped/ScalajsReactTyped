package typingsJapgolly.youtube.YT

import typingsJapgolly.youtube.youtubeStrings.default
import typingsJapgolly.youtube.youtubeStrings.hd1080
import typingsJapgolly.youtube.youtubeStrings.hd720
import typingsJapgolly.youtube.youtubeStrings.highres
import typingsJapgolly.youtube.youtubeStrings.large
import typingsJapgolly.youtube.youtubeStrings.medium
import typingsJapgolly.youtube.youtubeStrings.playlist
import typingsJapgolly.youtube.youtubeStrings.search
import typingsJapgolly.youtube.youtubeStrings.small
import typingsJapgolly.youtube.youtubeStrings.user_uploads
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type ListType = ListTypeSearch | ListTypeUserUploads | ListTypePlaylist

type ListTypePlaylist = playlist

type ListTypeSearch = search

type ListTypeUserUploads = user_uploads

type PlayerEventHandler[TEvent /* <: PlayerEvent */] = js.Function1[/* event */ TEvent, Unit]

type SuggestedVideoQuality = VideoQualityDefault | VideoQualitySmall | VideoQualityMedium | VideoQualityLarge | VideoQualityHD720 | VideoQualityHD1080 | VideoQualityHighRes

type VideoQualityDefault = default

type VideoQualityHD1080 = hd1080

type VideoQualityHD720 = hd720

type VideoQualityHighRes = highres

type VideoQualityLarge = large

type VideoQualityMedium = medium

type VideoQualitySmall = small
