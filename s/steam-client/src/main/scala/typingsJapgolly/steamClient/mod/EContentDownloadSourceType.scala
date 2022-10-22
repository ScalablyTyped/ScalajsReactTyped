package typingsJapgolly.steamClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EContentDownloadSourceType extends StObject
@JSImport("steam-client", "EContentDownloadSourceType")
@js.native
object EContentDownloadSourceType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EContentDownloadSourceType & Double] = js.native
  
  @js.native
  sealed trait CDN
    extends StObject
       with EContentDownloadSourceType
  /* 2 */ val CDN: typingsJapgolly.steamClient.mod.EContentDownloadSourceType.CDN & Double = js.native
  
  @js.native
  sealed trait CS
    extends StObject
       with EContentDownloadSourceType
  /* 1 */ val CS: typingsJapgolly.steamClient.mod.EContentDownloadSourceType.CS & Double = js.native
  
  @js.native
  sealed trait Invalid
    extends StObject
       with EContentDownloadSourceType
  /* 0 */ val Invalid: typingsJapgolly.steamClient.mod.EContentDownloadSourceType.Invalid & Double = js.native
  
  @js.native
  sealed trait LANPeer
    extends StObject
       with EContentDownloadSourceType
  /* 5 */ val LANPeer: typingsJapgolly.steamClient.mod.EContentDownloadSourceType.LANPeer & Double = js.native
  
  @js.native
  sealed trait LCS
    extends StObject
       with EContentDownloadSourceType
  /* 3 */ val LCS: typingsJapgolly.steamClient.mod.EContentDownloadSourceType.LCS & Double = js.native
  
  @js.native
  sealed trait Max
    extends StObject
       with EContentDownloadSourceType
  /* 5 */ val Max: typingsJapgolly.steamClient.mod.EContentDownloadSourceType.Max & Double = js.native
  
  @js.native
  sealed trait ProxyCache
    extends StObject
       with EContentDownloadSourceType
  /* 4 */ val ProxyCache: typingsJapgolly.steamClient.mod.EContentDownloadSourceType.ProxyCache & Double = js.native
}
