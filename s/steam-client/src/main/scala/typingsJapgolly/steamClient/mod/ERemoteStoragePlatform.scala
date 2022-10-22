package typingsJapgolly.steamClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ERemoteStoragePlatform extends StObject
@JSImport("steam-client", "ERemoteStoragePlatform")
@js.native
object ERemoteStoragePlatform extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ERemoteStoragePlatform & Double] = js.native
  
  @js.native
  sealed trait All
    extends StObject
       with ERemoteStoragePlatform
  /* -1 */ val All: typingsJapgolly.steamClient.mod.ERemoteStoragePlatform.All & Double = js.native
  
  @js.native
  sealed trait Linux
    extends StObject
       with ERemoteStoragePlatform
  /* 8 */ val Linux: typingsJapgolly.steamClient.mod.ERemoteStoragePlatform.Linux & Double = js.native
  
  @js.native
  sealed trait None
    extends StObject
       with ERemoteStoragePlatform
  /* 0 */ val None: typingsJapgolly.steamClient.mod.ERemoteStoragePlatform.None & Double = js.native
  
  @js.native
  sealed trait OSX
    extends StObject
       with ERemoteStoragePlatform
  /* 2 */ val OSX: typingsJapgolly.steamClient.mod.ERemoteStoragePlatform.OSX & Double = js.native
  
  @js.native
  sealed trait PS3
    extends StObject
       with ERemoteStoragePlatform
  /* 4 */ val PS3: typingsJapgolly.steamClient.mod.ERemoteStoragePlatform.PS3 & Double = js.native
  
  @js.native
  sealed trait Reserved1
    extends StObject
       with ERemoteStoragePlatform
  /* 8 */ val Reserved1: typingsJapgolly.steamClient.mod.ERemoteStoragePlatform.Reserved1 & Double = js.native
  
  // removed
  @js.native
  sealed trait Reserved2
    extends StObject
       with ERemoteStoragePlatform
  /* 16 */ val Reserved2: typingsJapgolly.steamClient.mod.ERemoteStoragePlatform.Reserved2 & Double = js.native
  
  @js.native
  sealed trait Windows
    extends StObject
       with ERemoteStoragePlatform
  /* 1 */ val Windows: typingsJapgolly.steamClient.mod.ERemoteStoragePlatform.Windows & Double = js.native
}
