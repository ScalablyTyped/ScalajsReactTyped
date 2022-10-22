package typingsJapgolly.officeJs.global.Office

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
  def apply(value: Double): js.UndefOr[typingsJapgolly.officeJs.Office.InitializationReason & Double] = js.native
  
  /* 1 */ val DocumentOpened: typingsJapgolly.officeJs.Office.InitializationReason.DocumentOpened & Double = js.native
  
  /* 0 */ val Inserted: typingsJapgolly.officeJs.Office.InitializationReason.Inserted & Double = js.native
}
