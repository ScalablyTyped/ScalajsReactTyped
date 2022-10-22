package typingsJapgolly.pico8parse.mod.ast

import typingsJapgolly.pico8parse.pico8parseStrings.LabelStatement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//#region node types definitions
trait LabelStatement_
  extends StObject
     with Base[LabelStatement]
     with _Statement {
  
  var label: Identifier_
}
object LabelStatement_ {
  
  inline def apply(label: Identifier_): LabelStatement_ = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("LabelStatement")
    __obj.asInstanceOf[LabelStatement_]
  }
  
  extension [Self <: LabelStatement_](x: Self) {
    
    inline def setLabel(value: Identifier_): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
