package typingsJapgolly.wordpressBlocks.anon

import typingsJapgolly.wordpressBlocks.wordpressBlocksStrings.INLINE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Mode extends StObject {
  
  var mode: INLINE
}
object Mode {
  
  inline def apply(): Mode = {
    val __obj = js.Dynamic.literal(mode = "INLINE")
    __obj.asInstanceOf[Mode]
  }
  
  extension [Self <: Mode](x: Self) {
    
    inline def setMode(value: INLINE): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
  }
}
