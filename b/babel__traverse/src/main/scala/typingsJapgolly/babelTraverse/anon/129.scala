package typingsJapgolly.babelTraverse.anon

import typingsJapgolly.babelTraverse.babelTraverseStrings.VariableDeclarator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `129` extends StObject {
  
  var `type`: VariableDeclarator
}
object `129` {
  
  inline def apply(): `129` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("VariableDeclarator")
    __obj.asInstanceOf[`129`]
  }
  
  extension [Self <: `129`](x: Self) {
    
    inline def setType(value: VariableDeclarator): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
