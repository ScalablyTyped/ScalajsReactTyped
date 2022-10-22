package typingsJapgolly.webpack.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SourceLike extends StObject {
  
  def source(): String | Buffer
}
object SourceLike {
  
  inline def apply(source: CallbackTo[String | Buffer]): SourceLike = {
    val __obj = js.Dynamic.literal(source = source.toJsFn)
    __obj.asInstanceOf[SourceLike]
  }
  
  extension [Self <: SourceLike](x: Self) {
    
    inline def setSource(value: CallbackTo[String | Buffer]): Self = StObject.set(x, "source", value.toJsFn)
  }
}
