package typingsJapgolly.azureCoreClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SerializerOptions extends StObject {
  
  /**
    * Options to configure xml parser/builder behavior.
    */
  var xml: XmlOptions
}
object SerializerOptions {
  
  inline def apply(xml: XmlOptions): SerializerOptions = {
    val __obj = js.Dynamic.literal(xml = xml.asInstanceOf[js.Any])
    __obj.asInstanceOf[SerializerOptions]
  }
  
  extension [Self <: SerializerOptions](x: Self) {
    
    inline def setXml(value: XmlOptions): Self = StObject.set(x, "xml", value.asInstanceOf[js.Any])
  }
}
