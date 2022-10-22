package typingsJapgolly.videoJs.mod.videojs

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.Element
import org.scalajs.dom.Node
import typingsJapgolly.videoJs.anon.Children
import typingsJapgolly.videoJs.mod.VideoJsPlayer
import typingsJapgolly.videoJs.mod.VideoJsPlayerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/* Rewritten from type alias, can be one of: 
  - scala.Boolean
  - typingsJapgolly.videoJs.videoJsStrings.muted
  - typingsJapgolly.videoJs.videoJsStrings.play
  - typingsJapgolly.videoJs.videoJsStrings.any
*/
type Autoplay = _Autoplay | Boolean

type Child = String | Children

type Content = String | Element | Node | (js.Function0[String | Element | Node])

type LanguageTranslations = StringDictionary[String]

type Player = VideoJsPlayer

type PlayerOptions = VideoJsPlayerOptions

type ReadyCallback = js.ThisFunction0[/* this */ Player, Unit]

type XhrCallback = js.Function3[
/* error */ js.UndefOr[js.Error], 
/* response */ js.UndefOr[XhrResponse], 
/* body */ js.UndefOr[Any], 
Unit]
