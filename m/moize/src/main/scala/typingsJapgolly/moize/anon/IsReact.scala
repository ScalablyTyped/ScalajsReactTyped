package typingsJapgolly.moize.anon

import typingsJapgolly.moize.moizeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsReact extends StObject {
  
  var isReact: `true`
}
object IsReact {
  
  inline def apply(): IsReact = {
    val __obj = js.Dynamic.literal(isReact = true)
    __obj.asInstanceOf[IsReact]
  }
  
  extension [Self <: IsReact](x: Self) {
    
    inline def setIsReact(value: `true`): Self = StObject.set(x, "isReact", value.asInstanceOf[js.Any])
  }
}
