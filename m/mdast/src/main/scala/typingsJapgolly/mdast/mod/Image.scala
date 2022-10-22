package typingsJapgolly.mdast.mod

import typingsJapgolly.mdast.mdastStrings.image
import typingsJapgolly.unist.mod.Data
import typingsJapgolly.unist.mod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Image
  extends StObject
     with Node[Data]
     with Resource
     with Alternative {
  
  @JSName("type")
  var type_Image: image
}
object Image {
  
  inline def apply(url: String): Image = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("image")
    __obj.asInstanceOf[Image]
  }
  
  extension [Self <: Image](x: Self) {
    
    inline def setType(value: image): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
