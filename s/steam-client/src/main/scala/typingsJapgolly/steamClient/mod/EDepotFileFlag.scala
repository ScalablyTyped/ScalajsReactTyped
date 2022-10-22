package typingsJapgolly.steamClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EDepotFileFlag extends StObject
@JSImport("steam-client", "EDepotFileFlag")
@js.native
object EDepotFileFlag extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EDepotFileFlag & Double] = js.native
  
  @js.native
  sealed trait CustomExecutable
    extends StObject
       with EDepotFileFlag
  /* 128 */ val CustomExecutable: typingsJapgolly.steamClient.mod.EDepotFileFlag.CustomExecutable & Double = js.native
  
  @js.native
  sealed trait Directory
    extends StObject
       with EDepotFileFlag
  /* 64 */ val Directory: typingsJapgolly.steamClient.mod.EDepotFileFlag.Directory & Double = js.native
  
  @js.native
  sealed trait Encrypted
    extends StObject
       with EDepotFileFlag
  /* 4 */ val Encrypted: typingsJapgolly.steamClient.mod.EDepotFileFlag.Encrypted & Double = js.native
  
  @js.native
  sealed trait Executable
    extends StObject
       with EDepotFileFlag
  /* 32 */ val Executable: typingsJapgolly.steamClient.mod.EDepotFileFlag.Executable & Double = js.native
  
  @js.native
  sealed trait Hidden
    extends StObject
       with EDepotFileFlag
  /* 16 */ val Hidden: typingsJapgolly.steamClient.mod.EDepotFileFlag.Hidden & Double = js.native
  
  @js.native
  sealed trait InstallScript
    extends StObject
       with EDepotFileFlag
  /* 256 */ val InstallScript: typingsJapgolly.steamClient.mod.EDepotFileFlag.InstallScript & Double = js.native
  
  @js.native
  sealed trait ReadOnly
    extends StObject
       with EDepotFileFlag
  /* 8 */ val ReadOnly: typingsJapgolly.steamClient.mod.EDepotFileFlag.ReadOnly & Double = js.native
  
  @js.native
  sealed trait Symlink
    extends StObject
       with EDepotFileFlag
  /* 512 */ val Symlink: typingsJapgolly.steamClient.mod.EDepotFileFlag.Symlink & Double = js.native
  
  @js.native
  sealed trait UserConfig
    extends StObject
       with EDepotFileFlag
  /* 1 */ val UserConfig: typingsJapgolly.steamClient.mod.EDepotFileFlag.UserConfig & Double = js.native
  
  @js.native
  sealed trait VersionedUserConfig
    extends StObject
       with EDepotFileFlag
  /* 2 */ val VersionedUserConfig: typingsJapgolly.steamClient.mod.EDepotFileFlag.VersionedUserConfig & Double = js.native
}
