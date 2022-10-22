package typingsJapgolly.cqrsDomain.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// endregion
// region defineContext
trait DefineContextOptions extends StObject {
  
  /**
    * optional, default is the directory name
    */
  var name: js.UndefOr[String] = js.undefined
}
object DefineContextOptions {
  
  inline def apply(): DefineContextOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefineContextOptions]
  }
  
  extension [Self <: DefineContextOptions](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
