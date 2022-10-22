package typingsJapgolly.steamUser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EPublishedFileRevision extends StObject
@JSImport("steam-user", "EPublishedFileRevision")
@js.native
object EPublishedFileRevision extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EPublishedFileRevision & Double] = js.native
  
  @js.native
  sealed trait ApprovedSnapshot
    extends StObject
       with EPublishedFileRevision
  /* 2 */ val ApprovedSnapshot: typingsJapgolly.steamUser.mod.EPublishedFileRevision.ApprovedSnapshot & Double = js.native
  
  @js.native
  sealed trait ApprovedSnapshot_China
    extends StObject
       with EPublishedFileRevision
  /* 3 */ val ApprovedSnapshot_China: typingsJapgolly.steamUser.mod.EPublishedFileRevision.ApprovedSnapshot_China & Double = js.native
  
  @js.native
  sealed trait Default
    extends StObject
       with EPublishedFileRevision
  /* 0 */ val Default: typingsJapgolly.steamUser.mod.EPublishedFileRevision.Default & Double = js.native
  
  @js.native
  sealed trait Latest
    extends StObject
       with EPublishedFileRevision
  /* 1 */ val Latest: typingsJapgolly.steamUser.mod.EPublishedFileRevision.Latest & Double = js.native
  
  @js.native
  sealed trait RejectedSnapshot
    extends StObject
       with EPublishedFileRevision
  /* 4 */ val RejectedSnapshot: typingsJapgolly.steamUser.mod.EPublishedFileRevision.RejectedSnapshot & Double = js.native
  
  @js.native
  sealed trait RejectedSnapshot_China
    extends StObject
       with EPublishedFileRevision
  /* 5 */ val RejectedSnapshot_China: typingsJapgolly.steamUser.mod.EPublishedFileRevision.RejectedSnapshot_China & Double = js.native
}
