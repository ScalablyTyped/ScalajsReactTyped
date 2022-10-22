package typingsJapgolly.steamUser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EServerFlags extends StObject
@JSImport("steam-user", "EServerFlags")
@js.native
object EServerFlags extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EServerFlags & Double] = js.native
  
  @js.native
  sealed trait Active
    extends StObject
       with EServerFlags
  /* 1 */ val Active: typingsJapgolly.steamUser.mod.EServerFlags.Active & Double = js.native
  
  @js.native
  sealed trait Dedicated
    extends StObject
       with EServerFlags
  /* 4 */ val Dedicated: typingsJapgolly.steamUser.mod.EServerFlags.Dedicated & Double = js.native
  
  @js.native
  sealed trait Linux
    extends StObject
       with EServerFlags
  /* 8 */ val Linux: typingsJapgolly.steamUser.mod.EServerFlags.Linux & Double = js.native
  
  @js.native
  sealed trait None
    extends StObject
       with EServerFlags
  /* 0 */ val None: typingsJapgolly.steamUser.mod.EServerFlags.None & Double = js.native
  
  @js.native
  sealed trait Passworded
    extends StObject
       with EServerFlags
  /* 16 */ val Passworded: typingsJapgolly.steamUser.mod.EServerFlags.Passworded & Double = js.native
  
  @js.native
  sealed trait Private
    extends StObject
       with EServerFlags
  /* 32 */ val Private: typingsJapgolly.steamUser.mod.EServerFlags.Private & Double = js.native
  
  @js.native
  sealed trait Secure
    extends StObject
       with EServerFlags
  /* 2 */ val Secure: typingsJapgolly.steamUser.mod.EServerFlags.Secure & Double = js.native
}
