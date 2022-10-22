package typingsJapgolly.officeJs.global.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Specifies whether to select (highlight) the location to navigate to (when using the {@link Office.Document | Document}.goToByIdAsync method).
  */
@JSGlobal("Office.SelectionMode")
@js.native
object SelectionMode extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typingsJapgolly.officeJs.Office.SelectionMode & Double] = js.native
  
  /* 0 */ val Default: typingsJapgolly.officeJs.Office.SelectionMode.Default & Double = js.native
  
  /* 2 */ val None: typingsJapgolly.officeJs.Office.SelectionMode.None & Double = js.native
  
  /* 1 */ val Selected: typingsJapgolly.officeJs.Office.SelectionMode.Selected & Double = js.native
}
