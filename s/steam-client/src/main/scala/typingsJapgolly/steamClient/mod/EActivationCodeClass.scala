package typingsJapgolly.steamClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EActivationCodeClass extends StObject
@JSImport("steam-client", "EActivationCodeClass")
@js.native
object EActivationCodeClass extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EActivationCodeClass & Double] = js.native
  
  @js.native
  sealed trait DBLookup
    extends StObject
       with EActivationCodeClass
  /* 3 */ val DBLookup: typingsJapgolly.steamClient.mod.EActivationCodeClass.DBLookup & Double = js.native
  
  @js.native
  sealed trait Doom3CDKey
    extends StObject
       with EActivationCodeClass
  /* 2 */ val Doom3CDKey: typingsJapgolly.steamClient.mod.EActivationCodeClass.Doom3CDKey & Double = js.native
  
  @js.native
  sealed trait Invalid
    extends StObject
       with EActivationCodeClass
  /* 4294967295.0 */ val Invalid: typingsJapgolly.steamClient.mod.EActivationCodeClass.Invalid & Double = js.native
  
  @js.native
  sealed trait Max
    extends StObject
       with EActivationCodeClass
  /* 5 */ val Max: typingsJapgolly.steamClient.mod.EActivationCodeClass.Max & Double = js.native
  
  @js.native
  sealed trait Steam2010Key
    extends StObject
       with EActivationCodeClass
  /* 4 */ val Steam2010Key: typingsJapgolly.steamClient.mod.EActivationCodeClass.Steam2010Key & Double = js.native
  
  @js.native
  sealed trait Test
    extends StObject
       with EActivationCodeClass
  /* 2147483647 */ val Test: typingsJapgolly.steamClient.mod.EActivationCodeClass.Test & Double = js.native
  
  @js.native
  sealed trait ValveCDKey
    extends StObject
       with EActivationCodeClass
  /* 1 */ val ValveCDKey: typingsJapgolly.steamClient.mod.EActivationCodeClass.ValveCDKey & Double = js.native
  
  @js.native
  sealed trait WonCDKey
    extends StObject
       with EActivationCodeClass
  /* 0 */ val WonCDKey: typingsJapgolly.steamClient.mod.EActivationCodeClass.WonCDKey & Double = js.native
}
