package typingsJapgolly.flowdoc

import typingsJapgolly.flowdoc.Flow.FileAsset
import typingsJapgolly.flowdoc.Flow.Point
import typingsJapgolly.flowdoc.Flow.Size
import typingsJapgolly.flowdoc.Flow.URLAsset
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Graphic
  extends StObject
     with Node {
  
  var position: Point
  
  var size: Size
  
  var source: FileAsset | URLAsset
}
object Graphic {
  
  inline def apply(
    id: String,
    name: String,
    position: Point,
    size: Size,
    source: FileAsset | URLAsset,
    `type`: NodeType
  ): Graphic = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Graphic]
  }
  
  extension [Self <: Graphic](x: Self) {
    
    inline def setPosition(value: Point): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Size): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSource(value: FileAsset | URLAsset): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}
