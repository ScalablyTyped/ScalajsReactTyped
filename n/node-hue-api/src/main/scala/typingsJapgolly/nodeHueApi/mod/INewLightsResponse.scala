package typingsJapgolly.nodeHueApi.mod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.nodeHueApi.anon.Name
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait INewLightsResponse
  extends StObject
     with /* key */ StringDictionary[String | Name] {
  
  var lastscan: String
}
object INewLightsResponse {
  
  inline def apply(lastscan: String): INewLightsResponse = {
    val __obj = js.Dynamic.literal(lastscan = lastscan.asInstanceOf[js.Any])
    __obj.asInstanceOf[INewLightsResponse]
  }
  
  extension [Self <: INewLightsResponse](x: Self) {
    
    inline def setLastscan(value: String): Self = StObject.set(x, "lastscan", value.asInstanceOf[js.Any])
  }
}
