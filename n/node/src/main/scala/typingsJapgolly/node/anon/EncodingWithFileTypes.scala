package typingsJapgolly.node.anon

import typingsJapgolly.node.bufferMod.global.BufferEncoding
import typingsJapgolly.node.nodeBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EncodingWithFileTypes extends StObject {
  
  var encoding: BufferEncoding | Null
  
  var withFileTypes: js.UndefOr[`false`] = js.undefined
}
object EncodingWithFileTypes {
  
  inline def apply(): EncodingWithFileTypes = {
    val __obj = js.Dynamic.literal(encoding = null)
    __obj.asInstanceOf[EncodingWithFileTypes]
  }
  
  extension [Self <: EncodingWithFileTypes](x: Self) {
    
    inline def setEncoding(value: BufferEncoding): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    inline def setEncodingNull: Self = StObject.set(x, "encoding", null)
    
    inline def setWithFileTypes(value: `false`): Self = StObject.set(x, "withFileTypes", value.asInstanceOf[js.Any])
    
    inline def setWithFileTypesUndefined: Self = StObject.set(x, "withFileTypes", js.undefined)
  }
}
