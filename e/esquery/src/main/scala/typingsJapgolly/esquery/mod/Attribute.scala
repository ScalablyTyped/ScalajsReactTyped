package typingsJapgolly.esquery.mod

import typingsJapgolly.esquery.esqueryStrings.Equalssign
import typingsJapgolly.esquery.esqueryStrings.ExclamationmarkEqualssign
import typingsJapgolly.esquery.esqueryStrings.Greaterthansign
import typingsJapgolly.esquery.esqueryStrings.GreaterthansignEqualssign
import typingsJapgolly.esquery.esqueryStrings.Lessthansign
import typingsJapgolly.esquery.esqueryStrings.LessthansignEqualssign
import typingsJapgolly.esquery.esqueryStrings.attribute
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Attribute
  extends StObject
     with SubjectSelectorAtom
     with Selector
     with SubjectSelector {
  
  var name: String
  
  var operator: js.UndefOr[
    Equalssign | ExclamationmarkEqualssign | Greaterthansign | Lessthansign | GreaterthansignEqualssign | LessthansignEqualssign
  ] = js.undefined
  
  @JSName("type")
  var type_Attribute: attribute
  
  var value: js.UndefOr[Literal | RegExpLiteral | Type] = js.undefined
}
object Attribute {
  
  inline def apply(name: String): Attribute = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("attribute")
    __obj.asInstanceOf[Attribute]
  }
  
  extension [Self <: Attribute](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOperator(
      value: Equalssign | ExclamationmarkEqualssign | Greaterthansign | Lessthansign | GreaterthansignEqualssign | LessthansignEqualssign
    ): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    inline def setOperatorUndefined: Self = StObject.set(x, "operator", js.undefined)
    
    inline def setType(value: attribute): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Literal | RegExpLiteral | Type): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
