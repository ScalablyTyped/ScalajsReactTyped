package typingsJapgolly.steamUser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EPackageStatus extends StObject
@JSImport("steam-user", "EPackageStatus")
@js.native
object EPackageStatus extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EPackageStatus & Double] = js.native
  
  @js.native
  sealed trait Available
    extends StObject
       with EPackageStatus
  /* 0 */ val Available: typingsJapgolly.steamUser.mod.EPackageStatus.Available & Double = js.native
  
  @js.native
  sealed trait Invalid
    extends StObject
       with EPackageStatus
  /* 3 */ val Invalid: typingsJapgolly.steamUser.mod.EPackageStatus.Invalid & Double = js.native
  
  @js.native
  sealed trait Preorder
    extends StObject
       with EPackageStatus
  /* 1 */ val Preorder: typingsJapgolly.steamUser.mod.EPackageStatus.Preorder & Double = js.native
  
  @js.native
  sealed trait Unavailable
    extends StObject
       with EPackageStatus
  /* 2 */ val Unavailable: typingsJapgolly.steamUser.mod.EPackageStatus.Unavailable & Double = js.native
}
