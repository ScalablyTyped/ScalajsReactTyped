package typingsJapgolly.vimeoPlayer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type CallbackFunction = js.Function1[/* repeated */ js.Any, js.Any]
  type EventCallback = js.Function1[/* data */ js.Any, js.Any]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.vimeoPlayer.vimeoPlayerStrings.play
    - typingsJapgolly.vimeoPlayer.vimeoPlayerStrings.pause
    - typingsJapgolly.vimeoPlayer.vimeoPlayerStrings.ended
    - typingsJapgolly.vimeoPlayer.vimeoPlayerStrings.timeupdate
    - typingsJapgolly.vimeoPlayer.vimeoPlayerStrings.progress
    - typingsJapgolly.vimeoPlayer.vimeoPlayerStrings.seeked
    - typingsJapgolly.vimeoPlayer.vimeoPlayerStrings.seeking
    - typingsJapgolly.vimeoPlayer.vimeoPlayerStrings.texttrackchange
    - typingsJapgolly.vimeoPlayer.vimeoPlayerStrings.cuechange
    - typingsJapgolly.vimeoPlayer.vimeoPlayerStrings.cuepoint
    - typingsJapgolly.vimeoPlayer.vimeoPlayerStrings.volumechange
    - typingsJapgolly.vimeoPlayer.vimeoPlayerStrings.playbackratechange
    - typingsJapgolly.vimeoPlayer.vimeoPlayerStrings.bufferstart
    - typingsJapgolly.vimeoPlayer.vimeoPlayerStrings.bufferend
    - typingsJapgolly.vimeoPlayer.vimeoPlayerStrings.error
    - typingsJapgolly.vimeoPlayer.vimeoPlayerStrings.loaded
    - java.lang.String
  */
  type EventName = typingsJapgolly.vimeoPlayer.mod._EventName | java.lang.String
  type VimeoCuePointData = org.scalablytyped.runtime.StringDictionary[js.Any]
  type VimeoTimeRange = js.Tuple2[scala.Double, scala.Double]
}
