package typingsJapgolly.node.childProcessMod

import typingsJapgolly.node.bufferMod.global.BufferEncoding
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExecFileOptionsWithOtherEncoding
  extends StObject
     with ExecFileOptions {
  
  var encoding: BufferEncoding
}
object ExecFileOptionsWithOtherEncoding {
  
  inline def apply(encoding: BufferEncoding): ExecFileOptionsWithOtherEncoding = {
    val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecFileOptionsWithOtherEncoding]
  }
  
  extension [Self <: ExecFileOptionsWithOtherEncoding](x: Self) {
    
    inline def setEncoding(value: BufferEncoding): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
  }
}
