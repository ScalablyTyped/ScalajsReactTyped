package typingsJapgolly.angularCompiler.mod

import typingsJapgolly.angularCompiler.angularCompilerInts.`5`
import typingsJapgolly.angularCompiler.angularCompilerInts.`6`
import typingsJapgolly.angularCompiler.angularCompilerInts.`7`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextToken
  extends StObject
     with TokenBase
     with InterpolatedTextToken {
  
  @JSName("type")
  var type_TextToken: `5` | `6` | `7`
}
object TextToken {
  
  inline def apply(parts: js.Array[String], sourceSpan: ParseSourceSpan, `type`: `5` | `6` | `7`): TextToken = {
    val __obj = js.Dynamic.literal(parts = parts.asInstanceOf[js.Any], sourceSpan = sourceSpan.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextToken]
  }
  
  extension [Self <: TextToken](x: Self) {
    
    inline def setType(value: `5` | `6` | `7`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
