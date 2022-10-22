package typingsJapgolly.steamUser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EPlatformType extends StObject
@JSImport("steam-user", "EPlatformType")
@js.native
object EPlatformType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EPlatformType & Double] = js.native
  
  @js.native
  sealed trait Linux
    extends StObject
       with EPlatformType
  /* 3 */ val Linux: typingsJapgolly.steamUser.mod.EPlatformType.Linux & Double = js.native
  
  @js.native
  sealed trait Linux32
    extends StObject
       with EPlatformType
  /* 6 */ val Linux32: typingsJapgolly.steamUser.mod.EPlatformType.Linux32 & Double = js.native
  
  @js.native
  sealed trait Linux64
    extends StObject
       with EPlatformType
  /* 3 */ val Linux64: typingsJapgolly.steamUser.mod.EPlatformType.Linux64 & Double = js.native
  
  @js.native
  sealed trait OSX
    extends StObject
       with EPlatformType
  /* 4 */ val OSX: typingsJapgolly.steamUser.mod.EPlatformType.OSX & Double = js.native
  
  @js.native
  sealed trait PS3
    extends StObject
       with EPlatformType
  /* 5 */ val PS3: typingsJapgolly.steamUser.mod.EPlatformType.PS3 & Double = js.native
  
  @js.native
  sealed trait Unknown
    extends StObject
       with EPlatformType
  /* 0 */ val Unknown: typingsJapgolly.steamUser.mod.EPlatformType.Unknown & Double = js.native
  
  @js.native
  sealed trait Win32
    extends StObject
       with EPlatformType
  /* 1 */ val Win32: typingsJapgolly.steamUser.mod.EPlatformType.Win32 & Double = js.native
  
  @js.native
  sealed trait Win64
    extends StObject
       with EPlatformType
  /* 2 */ val Win64: typingsJapgolly.steamUser.mod.EPlatformType.Win64 & Double = js.native
}
