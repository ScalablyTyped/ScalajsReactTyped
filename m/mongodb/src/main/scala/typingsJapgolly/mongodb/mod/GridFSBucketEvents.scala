package typingsJapgolly.mongodb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GridFSBucketEvents extends StObject {
  
  def index(): Unit
}
object GridFSBucketEvents {
  
  inline def apply(index: japgolly.scalajs.react.Callback): GridFSBucketEvents = {
    val __obj = js.Dynamic.literal(index = index.toJsFn)
    __obj.asInstanceOf[GridFSBucketEvents]
  }
  
  extension [Self <: GridFSBucketEvents](x: Self) {
    
    inline def setIndex(value: japgolly.scalajs.react.Callback): Self = StObject.set(x, "index", value.toJsFn)
  }
}
