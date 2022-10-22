package typingsJapgolly.winrtUwp.global.Windows.System

import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.ValueSet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the results of a Uri launch. */
/* note: abstract class */ @JSGlobal("Windows.System.LaunchUriResult")
@js.native
open class LaunchUriResult ()
  extends StObject
     with typingsJapgolly.winrtUwp.Windows.System.LaunchUriResult {
  
  /** Gets the result of the Uri launch. */
  /* CompleteClass */
  var result: ValueSet = js.native
  
  /** Gets the status of the Uri launch. */
  /* CompleteClass */
  var status: typingsJapgolly.winrtUwp.Windows.System.LaunchUriStatus = js.native
}
