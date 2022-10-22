package typingsJapgolly.select2.mod

import typingsJapgolly.select2.select2Strings.close
import typingsJapgolly.select2.select2Strings.open
import typingsJapgolly.select2.select2Strings.select
import typingsJapgolly.select2.select2Strings.unselect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IngParams extends StObject {
  
  var name: select | open | close | unselect
  
  var prevented: Boolean
}
object IngParams {
  
  inline def apply(name: select | open | close | unselect, prevented: Boolean): IngParams = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], prevented = prevented.asInstanceOf[js.Any])
    __obj.asInstanceOf[IngParams]
  }
  
  extension [Self <: IngParams](x: Self) {
    
    inline def setName(value: select | open | close | unselect): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPrevented(value: Boolean): Self = StObject.set(x, "prevented", value.asInstanceOf[js.Any])
  }
}
