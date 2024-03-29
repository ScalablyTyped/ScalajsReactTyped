package typingsJapgolly.azureArmResource.libResourceModelsMod

import typingsJapgolly.std.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OperationListResult
  extends StObject
     with Array[Operation] {
  
  /**
    * URL to get the next set of operation list results if there are any.
    */
  var nextLink: js.UndefOr[String] = js.native
}
