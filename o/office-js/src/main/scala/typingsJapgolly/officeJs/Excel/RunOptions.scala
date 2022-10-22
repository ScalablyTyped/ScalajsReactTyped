package typingsJapgolly.officeJs.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RunOptions
  extends StObject
     with typingsJapgolly.officeJs.OfficeExtension.RunOptions[Session] {
  
  /**
    * Determines whether Excel will delay the batch request until the user exits cell edit mode.
    *
    * When false, if the user is in cell edit when the batch request is processed by the host, the batch will automatically fail.
    * When true, the batch request will be executed immediately if the user is not in cell edit mode, but if the user is in cell edit mode the batch request will be delayed until the user exits cell edit mode.
    */
  var delayForCellEdit: js.UndefOr[Boolean] = js.undefined
}
object RunOptions {
  
  inline def apply(): RunOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RunOptions]
  }
  
  extension [Self <: RunOptions](x: Self) {
    
    inline def setDelayForCellEdit(value: Boolean): Self = StObject.set(x, "delayForCellEdit", value.asInstanceOf[js.Any])
    
    inline def setDelayForCellEditUndefined: Self = StObject.set(x, "delayForCellEdit", js.undefined)
  }
}
