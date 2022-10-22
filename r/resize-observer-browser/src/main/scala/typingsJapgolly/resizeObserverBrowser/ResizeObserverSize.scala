package typingsJapgolly.resizeObserverBrowser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResizeObserverSize extends StObject {
  
  val blockSize: Double
  
  val inlineSize: Double
}
object ResizeObserverSize {
  
  inline def apply(blockSize: Double, inlineSize: Double): ResizeObserverSize = {
    val __obj = js.Dynamic.literal(blockSize = blockSize.asInstanceOf[js.Any], inlineSize = inlineSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResizeObserverSize]
  }
  
  extension [Self <: ResizeObserverSize](x: Self) {
    
    inline def setBlockSize(value: Double): Self = StObject.set(x, "blockSize", value.asInstanceOf[js.Any])
    
    inline def setInlineSize(value: Double): Self = StObject.set(x, "inlineSize", value.asInstanceOf[js.Any])
  }
}
