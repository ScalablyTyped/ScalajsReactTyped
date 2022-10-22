package typingsJapgolly.clearbladejsServer.CbServer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait QuerySortDirections extends StObject
@JSGlobal("CbServer.QuerySortDirections")
@js.native
object QuerySortDirections extends StObject {
  
  @js.native
  sealed trait QUERY_SORT_ASCENDING
    extends StObject
       with QuerySortDirections
  
  @js.native
  sealed trait QUERY_SORT_DESCENDING
    extends StObject
       with QuerySortDirections
}
