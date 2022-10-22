package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPath317Query250 extends StObject {
  
  /**
    * The self-hosted runner groups REST API is available with GitHub Enterprise Cloud. For more information, see "[GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products)."
    *
    * Lists self-hosted runners that are in a specific organization group.
    *
    * You must authenticate using an access token with the `admin:org` scope to use this endpoint.
    */
  var get: ParametersPath317Query250
  
  /**
    * The self-hosted runner groups REST API is available with GitHub Enterprise Cloud. For more information, see "[GitHub's products](https://docs.github.com/github/getting-started-with-github/githubs-products)."
    *
    * Replaces the list of self-hosted runners that are part of an organization runner group.
    *
    * You must authenticate using an access token with the `admin:org` scope to use this endpoint.
    */
  var put: ParametersPath317RequestBodyContentApplicationjsonRunnersArray
}
object GetParametersPath317Query250 {
  
  inline def apply(
    get: ParametersPath317Query250,
    put: ParametersPath317RequestBodyContentApplicationjsonRunnersArray
  ): GetParametersPath317Query250 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], put = put.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPath317Query250]
  }
  
  extension [Self <: GetParametersPath317Query250](x: Self) {
    
    inline def setGet(value: ParametersPath317Query250): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPut(value: ParametersPath317RequestBodyContentApplicationjsonRunnersArray): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
  }
}
