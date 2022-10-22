package typingsJapgolly.steamUser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EContentDownloadSourceType extends StObject
@JSImport("steam-user", "EContentDownloadSourceType")
@js.native
object EContentDownloadSourceType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EContentDownloadSourceType & Double] = js.native
  
  @js.native
  sealed trait CDN
    extends StObject
       with EContentDownloadSourceType
  /* 2 */ val CDN: typingsJapgolly.steamUser.mod.EContentDownloadSourceType.CDN & Double = js.native
  
  @js.native
  sealed trait CS
    extends StObject
       with EContentDownloadSourceType
  /* 1 */ val CS: typingsJapgolly.steamUser.mod.EContentDownloadSourceType.CS & Double = js.native
  
  @js.native
  sealed trait Invalid
    extends StObject
       with EContentDownloadSourceType
  /* 0 */ val Invalid: typingsJapgolly.steamUser.mod.EContentDownloadSourceType.Invalid & Double = js.native
  
  @js.native
  sealed trait LANCache
    extends StObject
       with EContentDownloadSourceType
  /* 9 */ val LANCache: typingsJapgolly.steamUser.mod.EContentDownloadSourceType.LANCache & Double = js.native
  
  @js.native
  sealed trait LANPeer
    extends StObject
       with EContentDownloadSourceType
  /* 5 */ val LANPeer: typingsJapgolly.steamUser.mod.EContentDownloadSourceType.LANPeer & Double = js.native
  
  @js.native
  sealed trait LCS
    extends StObject
       with EContentDownloadSourceType
  /* 3 */ val LCS: typingsJapgolly.steamUser.mod.EContentDownloadSourceType.LCS & Double = js.native
  
  @js.native
  sealed trait OpenCache
    extends StObject
       with EContentDownloadSourceType
  /* 8 */ val OpenCache: typingsJapgolly.steamUser.mod.EContentDownloadSourceType.OpenCache & Double = js.native
  
  @js.native
  sealed trait ProxyCache
    extends StObject
       with EContentDownloadSourceType
  /* 4 */ val ProxyCache: typingsJapgolly.steamUser.mod.EContentDownloadSourceType.ProxyCache & Double = js.native
  
  @js.native
  sealed trait SLS
    extends StObject
       with EContentDownloadSourceType
  /* 6 */ val SLS: typingsJapgolly.steamUser.mod.EContentDownloadSourceType.SLS & Double = js.native
  
  @js.native
  sealed trait SteamCache
    extends StObject
       with EContentDownloadSourceType
  /* 7 */ val SteamCache: typingsJapgolly.steamUser.mod.EContentDownloadSourceType.SteamCache & Double = js.native
}
