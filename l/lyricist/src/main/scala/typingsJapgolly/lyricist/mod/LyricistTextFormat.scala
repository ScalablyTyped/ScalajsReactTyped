package typingsJapgolly.lyricist.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait LyricistTextFormat extends StObject
@JSImport("lyricist", "LyricistTextFormat")
@js.native
object LyricistTextFormat extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[LyricistTextFormat & String] = js.native
  
  @js.native
  sealed trait DOM
    extends StObject
       with LyricistTextFormat
  /* "dom" */ val DOM: typingsJapgolly.lyricist.mod.LyricistTextFormat.DOM & String = js.native
  
  @js.native
  sealed trait HTML
    extends StObject
       with LyricistTextFormat
  /* "html" */ val HTML: typingsJapgolly.lyricist.mod.LyricistTextFormat.HTML & String = js.native
  
  @js.native
  sealed trait PLAIN
    extends StObject
       with LyricistTextFormat
  /* "plain" */ val PLAIN: typingsJapgolly.lyricist.mod.LyricistTextFormat.PLAIN & String = js.native
}
