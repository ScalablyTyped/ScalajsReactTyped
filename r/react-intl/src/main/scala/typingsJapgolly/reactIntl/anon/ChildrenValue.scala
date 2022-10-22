package typingsJapgolly.reactIntl.anon

import japgolly.scalajs.react.facade.React.Element
import typingsJapgolly.formatjsIntlListformat.mod.Part
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChildrenValue extends StObject {
  
  def children(`val`: js.Array[Part[String]]): Element | Null
  
  var value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<react-intl.react-intl/src/types.IntlShape['formatList']>[0] */ js.Any
}
object ChildrenValue {
  
  inline def apply(
    children: js.Array[Part[String]] => Element | Null,
    value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<react-intl.react-intl/src/types.IntlShape['formatList']>[0] */ js.Any
  ): ChildrenValue = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children), value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChildrenValue]
  }
  
  extension [Self <: ChildrenValue](x: Self) {
    
    inline def setChildren(value: js.Array[Part[String]] => Element | Null): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
    
    inline def setValue(
      value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<react-intl.react-intl/src/types.IntlShape['formatList']>[0] */ js.Any
    ): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
