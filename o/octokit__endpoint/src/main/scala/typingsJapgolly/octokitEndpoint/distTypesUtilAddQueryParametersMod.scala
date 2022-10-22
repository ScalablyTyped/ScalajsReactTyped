package typingsJapgolly.octokitEndpoint

import typingsJapgolly.octokitEndpoint.anon.Dictx
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesUtilAddQueryParametersMod {
  
  @JSImport("@octokit/endpoint/dist-types/util/add-query-parameters", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addQueryParameters(url: String, parameters: Dictx): String = (^.asInstanceOf[js.Dynamic].applyDynamic("addQueryParameters")(url.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any])).asInstanceOf[String]
}
