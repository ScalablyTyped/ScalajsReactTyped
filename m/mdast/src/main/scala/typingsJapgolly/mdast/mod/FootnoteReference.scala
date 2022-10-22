package typingsJapgolly.mdast.mod

import typingsJapgolly.mdast.mdastStrings.footnoteReference
import typingsJapgolly.unist.mod.Data
import typingsJapgolly.unist.mod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FootnoteReference
  extends StObject
     with Node[Data]
     with Association {
  
  @JSName("type")
  var type_FootnoteReference: footnoteReference
}
object FootnoteReference {
  
  inline def apply(identifier: String): FootnoteReference = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("footnoteReference")
    __obj.asInstanceOf[FootnoteReference]
  }
  
  extension [Self <: FootnoteReference](x: Self) {
    
    inline def setType(value: footnoteReference): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
