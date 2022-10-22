package typingsJapgolly.mdast.mod

import typingsJapgolly.mdast.mdastStrings.imageReference
import typingsJapgolly.unist.mod.Data
import typingsJapgolly.unist.mod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageReference
  extends StObject
     with Node[Data]
     with Reference
     with Alternative {
  
  @JSName("type")
  var type_ImageReference: imageReference
}
object ImageReference {
  
  inline def apply(identifier: String, referenceType: ReferenceType): ImageReference = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any], referenceType = referenceType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("imageReference")
    __obj.asInstanceOf[ImageReference]
  }
  
  extension [Self <: ImageReference](x: Self) {
    
    inline def setType(value: imageReference): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
