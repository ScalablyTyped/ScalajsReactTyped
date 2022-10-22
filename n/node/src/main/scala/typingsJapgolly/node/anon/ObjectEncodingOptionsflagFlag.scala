package typingsJapgolly.node.anon

import typingsJapgolly.node.bufferMod.global.BufferEncoding
import typingsJapgolly.node.fsMod.OpenMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined node.node:fs.ObjectEncodingOptions & {  flag :node.node:fs.OpenMode | undefined} */
trait ObjectEncodingOptionsflagFlag extends StObject {
  
  var encoding: js.UndefOr[BufferEncoding | Null] = js.undefined
  
  var flag: js.UndefOr[OpenMode] = js.undefined
}
object ObjectEncodingOptionsflagFlag {
  
  inline def apply(): ObjectEncodingOptionsflagFlag = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ObjectEncodingOptionsflagFlag]
  }
  
  extension [Self <: ObjectEncodingOptionsflagFlag](x: Self) {
    
    inline def setEncoding(value: BufferEncoding): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    inline def setEncodingNull: Self = StObject.set(x, "encoding", null)
    
    inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
    
    inline def setFlag(value: OpenMode): Self = StObject.set(x, "flag", value.asInstanceOf[js.Any])
    
    inline def setFlagUndefined: Self = StObject.set(x, "flag", js.undefined)
  }
}
