package typingsJapgolly.babelTraverse.anon

import typingsJapgolly.babelTraverse.babelTraverseStrings.RegExpLiteral
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `37` extends StObject {
  
  var `type`: RegExpLiteral
}
object `37` {
  
  inline def apply(): `37` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("RegExpLiteral")
    __obj.asInstanceOf[`37`]
  }
  
  extension [Self <: `37`](x: Self) {
    
    inline def setType(value: RegExpLiteral): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
