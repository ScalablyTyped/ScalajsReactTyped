package typingsJapgolly.wordpressBlocks.anon

import typingsJapgolly.std.Record
import typingsJapgolly.wordpressBlocks.mod.Transform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait From extends StObject {
  
  /**
    * Transforms from another block type to this block type.
    */
  val from: js.UndefOr[js.Array[Transform[js.Object]]] = js.undefined
  
  /**
    * Transforms from this block type to another block type.
    */
  val to: js.UndefOr[js.Array[Transform[Record[String, Any]]]] = js.undefined
}
object From {
  
  inline def apply(): From = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[From]
  }
  
  extension [Self <: From](x: Self) {
    
    inline def setFrom(value: js.Array[Transform[js.Object]]): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    inline def setFromVarargs(value: Transform[js.Object]*): Self = StObject.set(x, "from", js.Array(value*))
    
    inline def setTo(value: js.Array[Transform[Record[String, Any]]]): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
    
    inline def setToVarargs(value: (Transform[Record[String, Any]])*): Self = StObject.set(x, "to", js.Array(value*))
  }
}
