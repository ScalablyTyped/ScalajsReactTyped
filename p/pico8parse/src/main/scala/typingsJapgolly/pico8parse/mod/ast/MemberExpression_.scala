package typingsJapgolly.pico8parse.mod.ast

import typingsJapgolly.pico8parse.pico8parseStrings.Colon
import typingsJapgolly.pico8parse.pico8parseStrings.Dot
import typingsJapgolly.pico8parse.pico8parseStrings.MemberExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MemberExpression_
  extends StObject
     with Base[MemberExpression]
     with Expression {
  
  var base: Expression
  
  var identifier: Identifier_
  
  var indexer: Dot | Colon
}
object MemberExpression_ {
  
  inline def apply(base: Expression, identifier: Identifier_, indexer: Dot | Colon): MemberExpression_ = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any], indexer = indexer.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("MemberExpression")
    __obj.asInstanceOf[MemberExpression_]
  }
  
  extension [Self <: MemberExpression_](x: Self) {
    
    inline def setBase(value: Expression): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
    
    inline def setIdentifier(value: Identifier_): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIndexer(value: Dot | Colon): Self = StObject.set(x, "indexer", value.asInstanceOf[js.Any])
  }
}
