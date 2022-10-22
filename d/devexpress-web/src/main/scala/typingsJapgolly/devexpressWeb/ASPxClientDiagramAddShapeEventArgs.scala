package typingsJapgolly.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains information about the processed shape.
  */
trait ASPxClientDiagramAddShapeEventArgs
  extends StObject
     with ASPxClientEventArgs {
  
  /**
    * A position (x- and y-coordinates) where the shape is being added.
    */
  var position: Any
  
  /**
    * The processed shape.
    */
  var shape: DiagramShape
}
object ASPxClientDiagramAddShapeEventArgs {
  
  inline def apply(position: Any, shape: DiagramShape): ASPxClientDiagramAddShapeEventArgs = {
    val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any], shape = shape.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientDiagramAddShapeEventArgs]
  }
  
  extension [Self <: ASPxClientDiagramAddShapeEventArgs](x: Self) {
    
    inline def setPosition(value: Any): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setShape(value: DiagramShape): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
  }
}
