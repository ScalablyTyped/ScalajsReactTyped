package typingsJapgolly.babelTraverse.anon

import typingsJapgolly.babelTraverse.babelTraverseStrings.DeclareTypeAlias
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `166` extends StObject {
  
  var `type`: DeclareTypeAlias
}
object `166` {
  
  inline def apply(): `166` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("DeclareTypeAlias")
    __obj.asInstanceOf[`166`]
  }
  
  extension [Self <: `166`](x: Self) {
    
    inline def setType(value: DeclareTypeAlias): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
