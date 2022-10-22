package typingsJapgolly.angularCompiler.mod

import typingsJapgolly.angularCompiler.angularCompilerInts.`5`
import typingsJapgolly.angularCompiler.angularCompilerInts.`6`
import typingsJapgolly.angularCompiler.angularCompilerInts.`7`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.angularCompiler.mod.TextToken
  - typingsJapgolly.angularCompiler.mod.InterpolationToken
  - typingsJapgolly.angularCompiler.mod.EncodedEntityToken
*/
trait InterpolatedTextToken extends StObject
object InterpolatedTextToken {
  
  inline def EncodedEntityToken(parts: js.Tuple2[/* decoded */ String, /* encoded */ String], sourceSpan: ParseSourceSpan): typingsJapgolly.angularCompiler.mod.EncodedEntityToken = {
    val __obj = js.Dynamic.literal(parts = parts.asInstanceOf[js.Any], sourceSpan = sourceSpan.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(9)
    __obj.asInstanceOf[typingsJapgolly.angularCompiler.mod.EncodedEntityToken]
  }
  
  inline def InterpolationToken(
    parts: (js.Tuple3[/* startMarker */ String, /* expression */ String, /* endMarker */ String]) | (js.Tuple2[/* startMarker */ String, /* expression */ String]),
    sourceSpan: ParseSourceSpan
  ): typingsJapgolly.angularCompiler.mod.InterpolationToken = {
    val __obj = js.Dynamic.literal(parts = parts.asInstanceOf[js.Any], sourceSpan = sourceSpan.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(8)
    __obj.asInstanceOf[typingsJapgolly.angularCompiler.mod.InterpolationToken]
  }
  
  inline def TextToken(parts: js.Array[String], sourceSpan: ParseSourceSpan, `type`: `5` | `6` | `7`): typingsJapgolly.angularCompiler.mod.TextToken = {
    val __obj = js.Dynamic.literal(parts = parts.asInstanceOf[js.Any], sourceSpan = sourceSpan.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.angularCompiler.mod.TextToken]
  }
}
