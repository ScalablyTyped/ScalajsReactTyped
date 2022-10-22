package typingsJapgolly.cssTree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaFeature
  extends StObject
     with CssNodeCommon
     with CssNode
     with CssNodePlain {
  
  var name: String
  
  @JSName("type")
  var type_MediaFeature: typingsJapgolly.cssTree.cssTreeStrings.MediaFeature
  
  var value: Identifier | NumberNode | Dimension | Ratio | Null
}
object MediaFeature {
  
  inline def apply(name: String): MediaFeature = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = null)
    __obj.updateDynamic("type")("MediaFeature")
    __obj.asInstanceOf[MediaFeature]
  }
  
  extension [Self <: MediaFeature](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: typingsJapgolly.cssTree.cssTreeStrings.MediaFeature): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Identifier | NumberNode | Dimension | Ratio): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
  }
}
