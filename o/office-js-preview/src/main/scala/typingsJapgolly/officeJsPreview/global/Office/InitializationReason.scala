package typingsJapgolly.officeJsPreview.global.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Specifies whether the add-in was just inserted or was already contained in the document.
  */
@JSGlobal("Office.InitializationReason")
@js.native
object InitializationReason extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typingsJapgolly.officeJsPreview.Office.InitializationReason & Double] = js.native
  
  /* 1 */ val DocumentOpened: typingsJapgolly.officeJsPreview.Office.InitializationReason.DocumentOpened & Double = js.native
  
  /* 0 */ val Inserted: typingsJapgolly.officeJsPreview.Office.InitializationReason.Inserted & Double = js.native
}
