package typingsJapgolly.fridaGum

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SqliteOpenOptions extends StObject {
  
  var flags: js.UndefOr[js.Array[SqliteOpenFlag]] = js.undefined
}
object SqliteOpenOptions {
  
  inline def apply(): SqliteOpenOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SqliteOpenOptions]
  }
  
  extension [Self <: SqliteOpenOptions](x: Self) {
    
    inline def setFlags(value: js.Array[SqliteOpenFlag]): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    
    inline def setFlagsUndefined: Self = StObject.set(x, "flags", js.undefined)
    
    inline def setFlagsVarargs(value: SqliteOpenFlag*): Self = StObject.set(x, "flags", js.Array(value*))
  }
}
