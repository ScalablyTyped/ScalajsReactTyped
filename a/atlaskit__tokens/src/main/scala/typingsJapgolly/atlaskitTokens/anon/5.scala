package typingsJapgolly.atlaskitTokens.anon

import typingsJapgolly.atlaskitTokens.distTypesTypesMod.PaintToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `5`[BaseToken] extends StObject {
  
  var `[default]`: PaintToken[BaseToken]
}
object `5` {
  
  inline def apply[BaseToken](`[default]`: PaintToken[BaseToken]): `5`[BaseToken] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("[default]")(`[default]`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`5`[BaseToken]]
  }
  
  extension [Self <: `5`[?], BaseToken](x: Self & `5`[BaseToken]) {
    
    inline def `set[default]`(value: PaintToken[BaseToken]): Self = StObject.set(x, "[default]", value.asInstanceOf[js.Any])
  }
}
