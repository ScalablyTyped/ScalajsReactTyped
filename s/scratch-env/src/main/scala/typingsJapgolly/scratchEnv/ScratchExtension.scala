package typingsJapgolly.scratchEnv

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScratchExtension extends StObject {
  
  /** Returns data about the extension. */
  def getInfo(): ExtensionMetadata
}
object ScratchExtension {
  
  inline def apply(getInfo: CallbackTo[ExtensionMetadata]): ScratchExtension = {
    val __obj = js.Dynamic.literal(getInfo = getInfo.toJsFn)
    __obj.asInstanceOf[ScratchExtension]
  }
  
  extension [Self <: ScratchExtension](x: Self) {
    
    inline def setGetInfo(value: CallbackTo[ExtensionMetadata]): Self = StObject.set(x, "getInfo", value.toJsFn)
  }
}
