package typingsJapgolly.xmlpoke

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object XmlPoke {
  
  @js.native
  trait API extends StObject {
    
    def add(map: PathToValueMap): API = js.native
    def add(xpath: String, value: Value): API = js.native
    
    def addNamespace(prefix: String, uri: String): API = js.native
    
    def clear(xpath: String): API = js.native
    
    def ensure(xpath: String): API = js.native
    
    def errorOnNoMatches(): API = js.native
    
    def remove(xpath: String): API = js.native
    
    def set(map: PathToValueMap): API = js.native
    def set(xpath: String, value: Value): API = js.native
    
    def setOrAdd(map: PathToValueMap): API = js.native
    def setOrAdd(xpath: String, value: Value): API = js.native
    
    def withBasePath(xpath: String): API = js.native
  }
  
  trait CDataValue
    extends StObject
       with _Value {
    
    var value: String
  }
  object CDataValue {
    
    inline def apply(value: String): CDataValue = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[CDataValue]
    }
    
    extension [Self <: CDataValue](x: Self) {
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait PathToValueMap
    extends StObject
       with /* xpath */ StringDictionary[Value]
       with _Value
  object PathToValueMap {
    
    inline def apply(): PathToValueMap = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PathToValueMap]
    }
  }
  
  // ghost module
  @js.native
  trait Transform
    extends StObject
       with _Value {
    
    def apply(node: Node, value: String): Value = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - scala.Boolean
    - scala.Double
    - typingsJapgolly.xmlpoke.XmlPoke.XmlValue
    - typingsJapgolly.xmlpoke.XmlPoke.CDataValue
    - typingsJapgolly.xmlpoke.XmlPoke.PathToValueMap
    - typingsJapgolly.xmlpoke.XmlPoke.Transform
  */
  type Value = _Value | String | Boolean | Double
  
  trait XmlValue
    extends StObject
       with _Value {
    
    var value: String
  }
  object XmlValue {
    
    inline def apply(value: String): XmlValue = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[XmlValue]
    }
    
    extension [Self <: XmlValue](x: Self) {
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait _Value extends StObject
}
