package typingsJapgolly.sharepoint.Srch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait UserActionType extends StObject
@JSGlobal("Srch.UserActionType")
@js.native
object UserActionType extends StObject {
  
  @js.native
  sealed trait filterLanguage
    extends StObject
       with UserActionType
  
  @js.native
  sealed trait pageNext
    extends StObject
       with UserActionType
  
  @js.native
  sealed trait pagePrev
    extends StObject
       with UserActionType
  
  @js.native
  sealed trait refine
    extends StObject
       with UserActionType
  
  @js.native
  sealed trait search
    extends StObject
       with UserActionType
  
  @js.native
  sealed trait sort
    extends StObject
       with UserActionType
}
