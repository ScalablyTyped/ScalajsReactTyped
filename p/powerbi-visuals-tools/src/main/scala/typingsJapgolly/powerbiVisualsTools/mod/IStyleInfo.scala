package typingsJapgolly.powerbiVisualsTools.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IStyleInfo extends StObject {
  
  var className: js.UndefOr[String] = js.undefined
}
object IStyleInfo {
  
  inline def apply(): IStyleInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IStyleInfo]
  }
  
  extension [Self <: IStyleInfo](x: Self) {
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
  }
}
