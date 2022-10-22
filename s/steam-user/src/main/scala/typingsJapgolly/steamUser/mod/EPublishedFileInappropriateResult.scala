package typingsJapgolly.steamUser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EPublishedFileInappropriateResult extends StObject
@JSImport("steam-user", "EPublishedFileInappropriateResult")
@js.native
object EPublishedFileInappropriateResult extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EPublishedFileInappropriateResult & Double] = js.native
  
  @js.native
  sealed trait Likely
    extends StObject
       with EPublishedFileInappropriateResult
  /* 75 */ val Likely: typingsJapgolly.steamUser.mod.EPublishedFileInappropriateResult.Likely & Double = js.native
  
  @js.native
  sealed trait NotScanned
    extends StObject
       with EPublishedFileInappropriateResult
  /* 0 */ val NotScanned: typingsJapgolly.steamUser.mod.EPublishedFileInappropriateResult.NotScanned & Double = js.native
  
  @js.native
  sealed trait Possible
    extends StObject
       with EPublishedFileInappropriateResult
  /* 50 */ val Possible: typingsJapgolly.steamUser.mod.EPublishedFileInappropriateResult.Possible & Double = js.native
  
  @js.native
  sealed trait Unlikely
    extends StObject
       with EPublishedFileInappropriateResult
  /* 30 */ val Unlikely: typingsJapgolly.steamUser.mod.EPublishedFileInappropriateResult.Unlikely & Double = js.native
  
  @js.native
  sealed trait VeryLikely
    extends StObject
       with EPublishedFileInappropriateResult
  /* 100 */ val VeryLikely: typingsJapgolly.steamUser.mod.EPublishedFileInappropriateResult.VeryLikely & Double = js.native
  
  @js.native
  sealed trait VeryUnlikely
    extends StObject
       with EPublishedFileInappropriateResult
  /* 1 */ val VeryUnlikely: typingsJapgolly.steamUser.mod.EPublishedFileInappropriateResult.VeryUnlikely & Double = js.native
}
