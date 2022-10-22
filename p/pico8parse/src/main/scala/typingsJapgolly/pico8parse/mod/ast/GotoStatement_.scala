package typingsJapgolly.pico8parse.mod.ast

import typingsJapgolly.pico8parse.pico8parseStrings.GotoStatement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GotoStatement_
  extends StObject
     with Base[GotoStatement]
     with _Statement {
  
  var label: Identifier_
}
object GotoStatement_ {
  
  inline def apply(label: Identifier_): GotoStatement_ = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("GotoStatement")
    __obj.asInstanceOf[GotoStatement_]
  }
  
  extension [Self <: GotoStatement_](x: Self) {
    
    inline def setLabel(value: Identifier_): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
