package typingsJapgolly.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RowContext
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var rowContext: js.Object
}
object RowContext {
  
  inline def apply(rowContext: js.Object): RowContext = {
    val __obj = js.Dynamic.literal(rowContext = rowContext.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowContext]
  }
  
  extension [Self <: RowContext](x: Self) {
    
    inline def setRowContext(value: js.Object): Self = StObject.set(x, "rowContext", value.asInstanceOf[js.Any])
  }
}
