package typingsJapgolly.officeJsPreview.global.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Enumerations
/**
  * Provides options to determine the startup behavior of the add-in upon next start-up.
  */
@JSGlobal("Office.StartupBehavior")
@js.native
object StartupBehavior extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typingsJapgolly.officeJsPreview.Office.StartupBehavior & String] = js.native
  
  /* "Load" */ val load: typingsJapgolly.officeJsPreview.Office.StartupBehavior.load & String = js.native
  
  /* "None" */ val none: typingsJapgolly.officeJsPreview.Office.StartupBehavior.none & String = js.native
}
