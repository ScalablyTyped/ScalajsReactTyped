package typingsJapgolly.navermaps.naver.maps

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MapTypeControlStyle extends js.Object

/**
  * Enums
  */
@JSGlobal("naver.maps.MapTypeControlStyle")
@js.native
object MapTypeControlStyle extends js.Object {
  @js.native
  sealed trait BUTTON extends MapTypeControlStyle
  
  @js.native
  sealed trait DROPDOWN extends MapTypeControlStyle
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MapTypeControlStyle with Double] = js.native
  /* 0 */ @js.native
  object BUTTON extends TopLevel[BUTTON with Double]
  
  /* 1 */ @js.native
  object DROPDOWN extends TopLevel[DROPDOWN with Double]
  
}

