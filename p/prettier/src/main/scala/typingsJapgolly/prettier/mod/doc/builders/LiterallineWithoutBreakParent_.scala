package typingsJapgolly.prettier.mod.doc.builders

import typingsJapgolly.prettier.prettierBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LiterallineWithoutBreakParent_
  extends StObject
     with Line_ {
  
  @JSName("hard")
  var hard_LiterallineWithoutBreakParent_ : `true`
  
  @JSName("literal")
  var literal_LiterallineWithoutBreakParent_ : `true`
}
object LiterallineWithoutBreakParent_ {
  
  inline def apply(): LiterallineWithoutBreakParent_ = {
    val __obj = js.Dynamic.literal(hard = true, literal = true)
    __obj.updateDynamic("type")("line")
    __obj.asInstanceOf[LiterallineWithoutBreakParent_]
  }
  
  extension [Self <: LiterallineWithoutBreakParent_](x: Self) {
    
    inline def setHard(value: `true`): Self = StObject.set(x, "hard", value.asInstanceOf[js.Any])
    
    inline def setLiteral(value: `true`): Self = StObject.set(x, "literal", value.asInstanceOf[js.Any])
  }
}
