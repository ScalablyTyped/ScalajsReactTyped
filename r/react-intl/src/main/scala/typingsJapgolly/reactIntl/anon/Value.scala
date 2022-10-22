package typingsJapgolly.reactIntl.anon

import japgolly.scalajs.react.facade.React.Element
import typingsJapgolly.std.Intl.DateTimeFormatPart
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Value extends StObject {
  
  def children(`val`: js.Array[DateTimeFormatPart]): Element | Null
  
  var value: (/* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<react-intl.anon.FnCall>[0] */ js.Any) | String
}
object Value {
  
  inline def apply(
    children: js.Array[DateTimeFormatPart] => Element | Null,
    value: (/* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<react-intl.anon.FnCall>[0] */ js.Any) | String
  ): Value = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children), value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Value]
  }
  
  extension [Self <: Value](x: Self) {
    
    inline def setChildren(value: js.Array[DateTimeFormatPart] => Element | Null): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
    
    inline def setValue(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<react-intl.anon.FnCall>[0] */ js.Any) | String
    ): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
