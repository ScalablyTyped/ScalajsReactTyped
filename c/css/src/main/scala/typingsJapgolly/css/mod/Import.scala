package typingsJapgolly.css.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Import
  extends StObject
     with Node
     with AtRule {
  
  /** The part following @import. */
  var `import`: js.UndefOr[String] = js.undefined
}
object Import {
  
  inline def apply(): Import = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Import]
  }
  
  extension [Self <: Import](x: Self) {
    
    inline def setImport(value: String): Self = StObject.set(x, "import", value.asInstanceOf[js.Any])
    
    inline def setImportUndefined: Self = StObject.set(x, "import", js.undefined)
  }
}
