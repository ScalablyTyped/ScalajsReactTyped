package typingsJapgolly.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains information about the processed shape.
  */
trait ASPxClientDiagramDeleteShapeEventArgs
  extends StObject
     with ASPxClientEventArgs {
  
  /**
    * The processed shape.
    */
  var shape: DiagramShape
}
object ASPxClientDiagramDeleteShapeEventArgs {
  
  inline def apply(shape: DiagramShape): ASPxClientDiagramDeleteShapeEventArgs = {
    val __obj = js.Dynamic.literal(shape = shape.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientDiagramDeleteShapeEventArgs]
  }
  
  extension [Self <: ASPxClientDiagramDeleteShapeEventArgs](x: Self) {
    
    inline def setShape(value: DiagramShape): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
  }
}
