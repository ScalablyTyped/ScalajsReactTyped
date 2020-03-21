package typingsJapgolly.dwt

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EnumDWTShowMode extends js.Object

@JSGlobal("EnumDWT_ShowMode")
@js.native
object EnumDWTShowMode extends js.Object {
  /** Activates the window and displays it in its current size and position. */
  @js.native
  sealed trait SW_ACTIVE extends EnumDWTShowMode
  
  /** Close the latest opened editor window */
  @js.native
  sealed trait SW_CLOSE extends EnumDWTShowMode
  
  /** Check whether a window exists */
  @js.native
  sealed trait SW_IFLIVE extends EnumDWTShowMode
  
  /** Maximizes the window */
  @js.native
  sealed trait SW_MAX extends EnumDWTShowMode
  
  /** Minimize the window */
  @js.native
  sealed trait SW_MIN extends EnumDWTShowMode
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnumDWTShowMode with Double] = js.native
  /* 0 */ @js.native
  object SW_ACTIVE extends TopLevel[SW_ACTIVE with Double]
  
  /* 3 */ @js.native
  object SW_CLOSE extends TopLevel[SW_CLOSE with Double]
  
  /* 4 */ @js.native
  object SW_IFLIVE extends TopLevel[SW_IFLIVE with Double]
  
  /* 1 */ @js.native
  object SW_MAX extends TopLevel[SW_MAX with Double]
  
  /* 2 */ @js.native
  object SW_MIN extends TopLevel[SW_MIN with Double]
  
}

