package typingsJapgolly.ssh2.mod

import typingsJapgolly.node.bufferMod.global.BufferEncoding
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReadFileOptions extends StObject {
  
  var encoding: js.UndefOr[BufferEncoding] = js.undefined
  
  var flag: js.UndefOr[String] = js.undefined
}
object ReadFileOptions {
  
  inline def apply(): ReadFileOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadFileOptions]
  }
  
  extension [Self <: ReadFileOptions](x: Self) {
    
    inline def setEncoding(value: BufferEncoding): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
    
    inline def setFlag(value: String): Self = StObject.set(x, "flag", value.asInstanceOf[js.Any])
    
    inline def setFlagUndefined: Self = StObject.set(x, "flag", js.undefined)
  }
}
