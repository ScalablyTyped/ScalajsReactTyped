package typingsJapgolly.googleAppsScript.GoogleAppsScript.CardService

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SelectionInputType extends StObject
/**
  * Type of selection input.
  */
@JSGlobal("GoogleAppsScript.Card_Service.SelectionInputType")
@js.native
object SelectionInputType extends StObject {
  
  @js.native
  sealed trait CHECK_BOX
    extends StObject
       with SelectionInputType
  
  @js.native
  sealed trait DROPDOWN
    extends StObject
       with SelectionInputType
  
  @js.native
  sealed trait RADIO_BUTTON
    extends StObject
       with SelectionInputType
}
