package typingsJapgolly.ecmarkdown.distNodeTypesMod

import typingsJapgolly.ecmarkdown.ecmarkdownStrings.underscore
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnderscoreNode
  extends StObject
     with FormatNode
     with Node {
  
  var contents: js.Array[FragmentNode]
  
  var location: LocationRange
  
  var name: underscore
}
object UnderscoreNode {
  
  inline def apply(contents: js.Array[FragmentNode], location: LocationRange): UnderscoreNode = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = "underscore")
    __obj.asInstanceOf[UnderscoreNode]
  }
  
  extension [Self <: UnderscoreNode](x: Self) {
    
    inline def setContents(value: js.Array[FragmentNode]): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
    
    inline def setContentsVarargs(value: FragmentNode*): Self = StObject.set(x, "contents", js.Array(value*))
    
    inline def setLocation(value: LocationRange): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setName(value: underscore): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
