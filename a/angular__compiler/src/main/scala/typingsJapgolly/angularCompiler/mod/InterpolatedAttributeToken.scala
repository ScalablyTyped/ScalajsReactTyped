package typingsJapgolly.angularCompiler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.angularCompiler.mod.AttributeValueTextToken
  - typingsJapgolly.angularCompiler.mod.AttributeValueInterpolationToken
  - typingsJapgolly.angularCompiler.mod.EncodedEntityToken
*/
trait InterpolatedAttributeToken extends StObject
object InterpolatedAttributeToken {
  
  inline def AttributeValueInterpolationToken(
    parts: (js.Tuple3[/* startMarker */ String, /* expression */ String, /* endMarker */ String]) | (js.Tuple2[/* startMarker */ String, /* expression */ String]),
    sourceSpan: ParseSourceSpan
  ): typingsJapgolly.angularCompiler.mod.AttributeValueInterpolationToken = {
    val __obj = js.Dynamic.literal(parts = parts.asInstanceOf[js.Any], sourceSpan = sourceSpan.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(17)
    __obj.asInstanceOf[typingsJapgolly.angularCompiler.mod.AttributeValueInterpolationToken]
  }
  
  inline def AttributeValueTextToken(parts: js.Array[String], sourceSpan: ParseSourceSpan): typingsJapgolly.angularCompiler.mod.AttributeValueTextToken = {
    val __obj = js.Dynamic.literal(parts = parts.asInstanceOf[js.Any], sourceSpan = sourceSpan.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(16)
    __obj.asInstanceOf[typingsJapgolly.angularCompiler.mod.AttributeValueTextToken]
  }
  
  inline def EncodedEntityToken(parts: js.Tuple2[/* decoded */ String, /* encoded */ String], sourceSpan: ParseSourceSpan): typingsJapgolly.angularCompiler.mod.EncodedEntityToken = {
    val __obj = js.Dynamic.literal(parts = parts.asInstanceOf[js.Any], sourceSpan = sourceSpan.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(9)
    __obj.asInstanceOf[typingsJapgolly.angularCompiler.mod.EncodedEntityToken]
  }
}
