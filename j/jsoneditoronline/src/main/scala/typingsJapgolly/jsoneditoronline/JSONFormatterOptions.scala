package typingsJapgolly.jsoneditoronline

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JSONFormatterOptions extends StObject {
  
  var change: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var indentation: js.UndefOr[Double] = js.undefined
}
object JSONFormatterOptions {
  
  inline def apply(): JSONFormatterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JSONFormatterOptions]
  }
  
  extension [Self <: JSONFormatterOptions](x: Self) {
    
    inline def setChange(value: Callback): Self = StObject.set(x, "change", value.toJsFn)
    
    inline def setChangeUndefined: Self = StObject.set(x, "change", js.undefined)
    
    inline def setIndentation(value: Double): Self = StObject.set(x, "indentation", value.asInstanceOf[js.Any])
    
    inline def setIndentationUndefined: Self = StObject.set(x, "indentation", js.undefined)
  }
}
