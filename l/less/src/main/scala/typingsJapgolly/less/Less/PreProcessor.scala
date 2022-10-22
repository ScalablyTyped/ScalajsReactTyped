package typingsJapgolly.less.Less

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PreProcessor extends StObject {
  
  def process(src: String, extra: PreProcessorExtraInfo): String
}
object PreProcessor {
  
  inline def apply(process: (String, PreProcessorExtraInfo) => String): PreProcessor = {
    val __obj = js.Dynamic.literal(process = js.Any.fromFunction2(process))
    __obj.asInstanceOf[PreProcessor]
  }
  
  extension [Self <: PreProcessor](x: Self) {
    
    inline def setProcess(value: (String, PreProcessorExtraInfo) => String): Self = StObject.set(x, "process", js.Any.fromFunction2(value))
  }
}
