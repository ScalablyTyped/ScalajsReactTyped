package typingsJapgolly.openui5.sapMLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait StepInputValidationMode extends StObject
@JSImport("sap/m/library", "StepInputValidationMode")
@js.native
object StepInputValidationMode extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[StepInputValidationMode & String] = js.native
  
  /**
    * Validation happens on `FocusOut`.
    */
  @js.native
  sealed trait FocusOut
    extends StObject
       with StepInputValidationMode
  /* "FocusOut" */ val FocusOut: typingsJapgolly.openui5.sapMLibraryMod.StepInputValidationMode.FocusOut & String = js.native
  
  /**
    * Validation happens on `LiveChange`.
    */
  @js.native
  sealed trait LiveChange
    extends StObject
       with StepInputValidationMode
  /* "LiveChange" */ val LiveChange: typingsJapgolly.openui5.sapMLibraryMod.StepInputValidationMode.LiveChange & String = js.native
}
