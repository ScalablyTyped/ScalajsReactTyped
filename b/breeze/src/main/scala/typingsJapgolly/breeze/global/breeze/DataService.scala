package typingsJapgolly.breeze.global.breeze

import typingsJapgolly.breeze.breeze.DataServiceOptions
import typingsJapgolly.breeze.breeze.UriBuilder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("breeze.DataService")
@js.native
open class DataService protected ()
  extends StObject
     with typingsJapgolly.breeze.breeze.DataService {
  def this(config: DataServiceOptions) = this()
  
  /* CompleteClass */
  var adapterInstance: typingsJapgolly.breeze.breeze.DataServiceAdapter = js.native
  
  /* CompleteClass */
  var adapterName: String = js.native
  
  /* CompleteClass */
  var hasServerMetadata: Boolean = js.native
  
  /* CompleteClass */
  var jsonResultsAdapter: typingsJapgolly.breeze.breeze.JsonResultsAdapter = js.native
  
  /* CompleteClass */
  override def qualifyUrl(suffix: String): String = js.native
  
  /* CompleteClass */
  var serviceName: String = js.native
  
  /* CompleteClass */
  var uriBuilder: UriBuilder = js.native
  
  /* CompleteClass */
  var uriBuilderName: String = js.native
  
  /* CompleteClass */
  var useJsonp: Boolean = js.native
  
  /* CompleteClass */
  override def `using`(config: DataServiceOptions): typingsJapgolly.breeze.breeze.DataService = js.native
}
