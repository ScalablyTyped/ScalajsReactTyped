package typingsJapgolly.officeJs.global.Office

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
  def apply(value: String): js.UndefOr[typingsJapgolly.officeJs.Office.StartupBehavior & String] = js.native
  
  /* "Load" */ val load: typingsJapgolly.officeJs.Office.StartupBehavior.load & String = js.native
  
  /* "None" */ val none: typingsJapgolly.officeJs.Office.StartupBehavior.none & String = js.native
}
