package typingsJapgolly.happyguestmxWebUtilities.mod

import typingsJapgolly.happyguestmxWebUtilities.happyguestmxWebUtilitiesStrings.query
import typingsJapgolly.happyguestmxWebUtilities.happyguestmxWebUtilitiesStrings.scan
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DdbHelper_ extends StObject {
  
  def recursiveQuery(params: QueryInput, method: query | scan): js.Promise[QueryOutput] = js.native
  def recursiveQuery(params: QueryInput, method: query | scan, xray: Boolean): js.Promise[QueryOutput] = js.native
  def recursiveQuery(params: ScanInput, method: query | scan): js.Promise[QueryOutput] = js.native
  def recursiveQuery(params: ScanInput, method: query | scan, xray: Boolean): js.Promise[QueryOutput] = js.native
}
