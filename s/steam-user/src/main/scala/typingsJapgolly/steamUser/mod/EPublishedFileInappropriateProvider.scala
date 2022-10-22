package typingsJapgolly.steamUser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EPublishedFileInappropriateProvider extends StObject
@JSImport("steam-user", "EPublishedFileInappropriateProvider")
@js.native
object EPublishedFileInappropriateProvider extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EPublishedFileInappropriateProvider & Double] = js.native
  
  @js.native
  sealed trait Amazon
    extends StObject
       with EPublishedFileInappropriateProvider
  /* 2 */ val Amazon: typingsJapgolly.steamUser.mod.EPublishedFileInappropriateProvider.Amazon & Double = js.native
  
  @js.native
  sealed trait Google
    extends StObject
       with EPublishedFileInappropriateProvider
  /* 1 */ val Google: typingsJapgolly.steamUser.mod.EPublishedFileInappropriateProvider.Google & Double = js.native
  
  @js.native
  sealed trait Invalid
    extends StObject
       with EPublishedFileInappropriateProvider
  /* 0 */ val Invalid: typingsJapgolly.steamUser.mod.EPublishedFileInappropriateProvider.Invalid & Double = js.native
}
