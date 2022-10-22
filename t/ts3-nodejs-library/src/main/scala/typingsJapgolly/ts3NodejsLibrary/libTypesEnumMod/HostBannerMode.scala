package typingsJapgolly.ts3NodejsLibrary.libTypesEnumMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait HostBannerMode extends StObject
@JSImport("ts3-nodejs-library/lib/types/enum", "HostBannerMode")
@js.native
object HostBannerMode extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[HostBannerMode & Double] = js.native
  
  /** adjust but ignore aspect ratio (like TeamSpeak 2) */
  @js.native
  sealed trait IGNOREASPECT
    extends StObject
       with HostBannerMode
  /* 1 */ val IGNOREASPECT: typingsJapgolly.ts3NodejsLibrary.libTypesEnumMod.HostBannerMode.IGNOREASPECT & Double = js.native
  
  /** adjust and keep aspect ratio */
  @js.native
  sealed trait KEEPASPECT
    extends StObject
       with HostBannerMode
  /* 2 */ val KEEPASPECT: typingsJapgolly.ts3NodejsLibrary.libTypesEnumMod.HostBannerMode.KEEPASPECT & Double = js.native
  
  /** do not adjust */
  @js.native
  sealed trait NOADJUST
    extends StObject
       with HostBannerMode
  /* 0 */ val NOADJUST: typingsJapgolly.ts3NodejsLibrary.libTypesEnumMod.HostBannerMode.NOADJUST & Double = js.native
}
