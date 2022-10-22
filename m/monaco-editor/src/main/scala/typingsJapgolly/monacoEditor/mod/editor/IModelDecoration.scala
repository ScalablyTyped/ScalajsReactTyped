package typingsJapgolly.monacoEditor.mod.editor

import typingsJapgolly.monacoEditor.mod.Range
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IModelDecoration extends StObject {
  
  /**
    * Identifier for a decoration.
    */
  val id: String
  
  /**
    * Options associated with this decoration.
    */
  val options: IModelDecorationOptions
  
  /**
    * Identifier for a decoration's owner.
    */
  val ownerId: Double
  
  /**
    * Range that this decoration covers.
    */
  val range: Range
}
object IModelDecoration {
  
  inline def apply(id: String, options: IModelDecorationOptions, ownerId: Double, range: Range): IModelDecoration = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], ownerId = ownerId.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any])
    __obj.asInstanceOf[IModelDecoration]
  }
  
  extension [Self <: IModelDecoration](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: IModelDecorationOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOwnerId(value: Double): Self = StObject.set(x, "ownerId", value.asInstanceOf[js.Any])
    
    inline def setRange(value: Range): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
  }
}
