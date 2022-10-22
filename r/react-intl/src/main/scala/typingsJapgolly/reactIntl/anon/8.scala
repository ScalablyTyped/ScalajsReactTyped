package typingsJapgolly.reactIntl.anon

import japgolly.scalajs.react.facade.React.Element
import typingsJapgolly.reactIntl.reactIntlStrings.formatDate
import typingsJapgolly.reactIntl.reactIntlStrings.formatTime
import typingsJapgolly.std.Intl.DateTimeFormatPart
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `8`[Name /* <: formatDate | formatTime */] extends StObject {
  
  def children(`val`: js.Array[DateTimeFormatPart]): Element | Null
  
  var value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<react-intl.react-intl/lib/src/types.IntlShape[Name]>[0] */ js.Any
}
object `8` {
  
  inline def apply[Name /* <: formatDate | formatTime */](
    children: js.Array[DateTimeFormatPart] => Element | Null,
    value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<react-intl.react-intl/lib/src/types.IntlShape[Name]>[0] */ js.Any
  ): `8`[Name] = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children), value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[`8`[Name]]
  }
  
  extension [Self <: `8`[?], Name /* <: formatDate | formatTime */](x: Self & `8`[Name]) {
    
    inline def setChildren(value: js.Array[DateTimeFormatPart] => Element | Null): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
    
    inline def setValue(
      value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<react-intl.react-intl/lib/src/types.IntlShape[Name]>[0] */ js.Any
    ): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
