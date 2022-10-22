package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponses200Content584 extends StObject {
  
  /**
    * Returns the `total` number of commits authored by the contributor. In addition, the response includes a Weekly Hash (`weeks` array) with the following information:
    *
    * *   `w` - Start of the week, given as a [Unix timestamp](http://en.wikipedia.org/wiki/Unix_time).
    * *   `a` - Number of additions
    * *   `d` - Number of deletions
    * *   `c` - Number of commits
    */
  var get: Responses200Content584
}
object GetResponses200Content584 {
  
  inline def apply(get: Responses200Content584): GetResponses200Content584 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponses200Content584]
  }
  
  extension [Self <: GetResponses200Content584](x: Self) {
    
    inline def setGet(value: Responses200Content584): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
