package typingsJapgolly.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientCardView.BatchEditCardValidating event.
  */
@JSGlobal("ASPxClientCardViewBatchEditCardValidatingEventArgs")
@js.native
open class ASPxClientCardViewBatchEditCardValidatingEventArgs protected ()
  extends StObject
     with typingsJapgolly.devexpressWeb.ASPxClientCardViewBatchEditCardValidatingEventArgs {
  /**
    * Initializes a new instance of the ASPxClientCardViewBatchEditCardValidatingEventArgs class.
    * @param visibleIndex An integer value that specifies the processed card's visible index.
    * @param validationInfo An object containing validation information.
    */
  def this(visibleIndex: Double, validationInfo: Any) = this()
  
  /**
    * Provides validation information of a card currently being validated.
    */
  /* CompleteClass */
  var validationInfo: Any = js.native
  
  /**
    * Gets the processed card's visible index.
    */
  /* CompleteClass */
  var visibleIndex: Double = js.native
}
