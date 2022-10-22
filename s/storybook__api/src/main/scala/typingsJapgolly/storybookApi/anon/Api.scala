package typingsJapgolly.storybookApi.anon

import typingsJapgolly.storybookApi.mod.API
import typingsJapgolly.storybookApi.mod.State
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Api extends StObject {
  
  var api: API
  
  var state: State
}
object Api {
  
  inline def apply(api: API, state: State): Api = {
    val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[Api]
  }
  
  extension [Self <: Api](x: Self) {
    
    inline def setApi(value: API): Self = StObject.set(x, "api", value.asInstanceOf[js.Any])
    
    inline def setState(value: State): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
