package typingsJapgolly.steamUser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EMachineIDType extends StObject
@JSImport("steam-user", "EMachineIDType")
@js.native
object EMachineIDType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EMachineIDType & Double] = js.native
  
  @js.native
  sealed trait AccountNameGenerated
    extends StObject
       with EMachineIDType
  /* 3 */ val AccountNameGenerated: typingsJapgolly.steamUser.mod.EMachineIDType.AccountNameGenerated & Double = js.native
  
  @js.native
  sealed trait AlwaysRandom
    extends StObject
       with EMachineIDType
  /* 2 */ val AlwaysRandom: typingsJapgolly.steamUser.mod.EMachineIDType.AlwaysRandom & Double = js.native
  
  @js.native
  sealed trait None
    extends StObject
       with EMachineIDType
  /* 1 */ val None: typingsJapgolly.steamUser.mod.EMachineIDType.None & Double = js.native
  
  @js.native
  sealed trait PersistentRandom
    extends StObject
       with EMachineIDType
  /* 4 */ val PersistentRandom: typingsJapgolly.steamUser.mod.EMachineIDType.PersistentRandom & Double = js.native
}
