package typingsJapgolly.phaser.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofVertexAttachment extends StObject {
  
  /* static member */
  var nextID: Any
}
object TypeofVertexAttachment {
  
  inline def apply(nextID: Any): TypeofVertexAttachment = {
    val __obj = js.Dynamic.literal(nextID = nextID.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofVertexAttachment]
  }
  
  extension [Self <: TypeofVertexAttachment](x: Self) {
    
    inline def setNextID(value: Any): Self = StObject.set(x, "nextID", value.asInstanceOf[js.Any])
  }
}
