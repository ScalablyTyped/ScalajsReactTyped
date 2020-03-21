package typingsJapgolly.ts3NodejsLibrary.enumMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait HostBannerMode extends js.Object

@JSImport("ts3-nodejs-library/lib/types/enum", "HostBannerMode")
@js.native
object HostBannerMode extends js.Object {
  /** adjust but ignore aspect ratio (like TeamSpeak 2) */
  @js.native
  sealed trait IGNOREASPECT extends HostBannerMode
  
  /** adjust and keep aspect ratio */
  @js.native
  sealed trait KEEPASPECT extends HostBannerMode
  
  /** do not adjust */
  @js.native
  sealed trait NOADJUST extends HostBannerMode
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[HostBannerMode with Double] = js.native
  /* 1 */ @js.native
  object IGNOREASPECT extends TopLevel[IGNOREASPECT with Double]
  
  /* 2 */ @js.native
  object KEEPASPECT extends TopLevel[KEEPASPECT with Double]
  
  /* 0 */ @js.native
  object NOADJUST extends TopLevel[NOADJUST with Double]
  
}

