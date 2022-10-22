package typingsJapgolly.tsNode.anon

import typingsJapgolly.tsNode.distEsmMod.NodeLoaderHooksFormat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Url extends StObject {
  
  var format: NodeLoaderHooksFormat
  
  var url: String
}
object Url {
  
  inline def apply(format: NodeLoaderHooksFormat, url: String): Url = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Url]
  }
  
  extension [Self <: Url](x: Self) {
    
    inline def setFormat(value: NodeLoaderHooksFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
