package typingsJapgolly.officeJsPreview.global.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Enumerations
/**
  * Specifies the state of the active view of the document, for example, whether the user can edit the document.
  */
@JSGlobal("Office.ActiveView")
@js.native
object ActiveView extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typingsJapgolly.officeJsPreview.Office.ActiveView & Double] = js.native
  
  /* 1 */ val Edit: typingsJapgolly.officeJsPreview.Office.ActiveView.Edit & Double = js.native
  
  /* 0 */ val Read: typingsJapgolly.officeJsPreview.Office.ActiveView.Read & Double = js.native
}
