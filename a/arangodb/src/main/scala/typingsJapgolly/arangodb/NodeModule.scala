package typingsJapgolly.arangodb

import typingsJapgolly.arangodb.Foxx.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodeModule extends StObject {
  
  var context: Context
}
object NodeModule {
  
  inline def apply(context: Context): NodeModule = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeModule]
  }
  
  extension [Self <: NodeModule](x: Self) {
    
    inline def setContext(value: Context): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
  }
}
