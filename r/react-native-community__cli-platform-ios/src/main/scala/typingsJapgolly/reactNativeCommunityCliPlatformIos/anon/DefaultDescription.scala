package typingsJapgolly.reactNativeCommunityCliPlatformIos.anon

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultDescription extends StObject {
  
  def default(): js.UndefOr[String]
  
  var description: String
  
  var name: String
  
  var parse: Unit
}
object DefaultDescription {
  
  inline def apply(default: CallbackTo[js.UndefOr[String]], description: String, name: String, parse: Unit): DefaultDescription = {
    val __obj = js.Dynamic.literal(default = default.toJsFn, description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parse = parse.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultDescription]
  }
  
  extension [Self <: DefaultDescription](x: Self) {
    
    inline def setDefault(value: CallbackTo[js.UndefOr[String]]): Self = StObject.set(x, "default", value.toJsFn)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setParse(value: Unit): Self = StObject.set(x, "parse", value.asInstanceOf[js.Any])
  }
}
