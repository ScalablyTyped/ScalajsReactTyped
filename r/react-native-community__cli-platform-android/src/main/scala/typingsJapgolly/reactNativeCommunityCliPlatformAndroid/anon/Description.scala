package typingsJapgolly.reactNativeCommunityCliPlatformAndroid.anon

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Description extends StObject {
  
  var description: String
  
  def func(): js.Promise[Unit]
  
  var name: String
}
object Description {
  
  inline def apply(description: String, func: CallbackTo[js.Promise[Unit]], name: String): Description = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], func = func.toJsFn, name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Description]
  }
  
  extension [Self <: Description](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setFunc(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "func", value.toJsFn)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
