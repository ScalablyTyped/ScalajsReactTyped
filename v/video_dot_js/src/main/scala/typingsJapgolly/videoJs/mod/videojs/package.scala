package typingsJapgolly.videoJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object videojs {
  type Child = java.lang.String | typingsJapgolly.videoJs.AnonChildren
  type Component = typingsJapgolly.videoJs.mod.videojs.Component_
  type Content = java.lang.String | org.scalajs.dom.raw.Element | org.scalajs.dom.raw.Node | (js.Function0[java.lang.String | org.scalajs.dom.raw.Element | org.scalajs.dom.raw.Node])
  type Dom = typingsJapgolly.videoJs.mod.videojs.Dom_
  type LanguageTranslations = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  type Player = typingsJapgolly.videoJs.mod.VideoJsPlayer
  type PlayerOptions = typingsJapgolly.videoJs.mod.VideoJsPlayerOptions
  type Plugin = typingsJapgolly.videoJs.mod.videojs.Plugin_
  type Tech = typingsJapgolly.videoJs.mod.videojs.Tech_
  type TextTrack = typingsJapgolly.videoJs.mod.videojs.TextTrack_
  type TextTrackCueList = typingsJapgolly.videoJs.mod.videojs.TextTrackCueList_
  type XhrCallback = js.Function3[
    /* error */ js.UndefOr[js.Error], 
    /* response */ js.UndefOr[typingsJapgolly.videoJs.mod.videojs.XhrResponse], 
    /* body */ js.UndefOr[js.Any], 
    scala.Unit
  ]
}
