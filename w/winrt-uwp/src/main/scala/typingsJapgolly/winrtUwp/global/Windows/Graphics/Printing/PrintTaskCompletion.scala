package typingsJapgolly.winrtUwp.global.Windows.Graphics.Printing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Specifies the completion status of a print task. */
@JSGlobal("Windows.Graphics.Printing.PrintTaskCompletion")
@js.native
object PrintTaskCompletion extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typingsJapgolly.winrtUwp.Windows.Graphics.Printing.PrintTaskCompletion & Double] = js.native
  
  /* 0 */ val abandoned: typingsJapgolly.winrtUwp.Windows.Graphics.Printing.PrintTaskCompletion.abandoned & Double = js.native
  
  /* 1 */ val canceled: typingsJapgolly.winrtUwp.Windows.Graphics.Printing.PrintTaskCompletion.canceled & Double = js.native
  
  /* 2 */ val failed: typingsJapgolly.winrtUwp.Windows.Graphics.Printing.PrintTaskCompletion.failed & Double = js.native
  
  /* 3 */ val submitted: typingsJapgolly.winrtUwp.Windows.Graphics.Printing.PrintTaskCompletion.submitted & Double = js.native
}
