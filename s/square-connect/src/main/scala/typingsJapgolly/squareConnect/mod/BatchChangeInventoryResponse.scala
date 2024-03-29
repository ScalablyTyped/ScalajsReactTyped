package typingsJapgolly.squareConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("square-connect", "BatchChangeInventoryResponse")
@js.native
open class BatchChangeInventoryResponse () extends StObject {
  
  /**
    * The current counts for all objects referenced in the request.
    */
  var counts: js.UndefOr[js.Array[InventoryCount]] = js.native
  
  /**
    * Any errors that occurred during the request.
    */
  var errors: js.UndefOr[js.Array[js.Error]] = js.native
}
