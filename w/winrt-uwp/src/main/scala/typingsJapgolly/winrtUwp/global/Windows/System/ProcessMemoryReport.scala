package typingsJapgolly.winrtUwp.global.Windows.System

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents process memory usage at a single point in time. */
/* note: abstract class */ @JSGlobal("Windows.System.ProcessMemoryReport")
@js.native
open class ProcessMemoryReport ()
  extends StObject
     with typingsJapgolly.winrtUwp.Windows.System.ProcessMemoryReport {
  
  /** Gets the process' private working set usage. */
  /* CompleteClass */
  var privateWorkingSetUsage: Double = js.native
  
  /** Gets the process' total working set usage. */
  /* CompleteClass */
  var totalWorkingSetUsage: Double = js.native
}
