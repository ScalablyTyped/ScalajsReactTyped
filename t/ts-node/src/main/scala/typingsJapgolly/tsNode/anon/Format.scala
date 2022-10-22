package typingsJapgolly.tsNode.anon

import typingsJapgolly.tsNode.distEsmMod.NodeLoaderHooksFormat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Format extends StObject {
  
  var format: NodeLoaderHooksFormat
}
object Format {
  
  inline def apply(format: NodeLoaderHooksFormat): Format = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any])
    __obj.asInstanceOf[Format]
  }
  
  extension [Self <: Format](x: Self) {
    
    inline def setFormat(value: NodeLoaderHooksFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
  }
}
