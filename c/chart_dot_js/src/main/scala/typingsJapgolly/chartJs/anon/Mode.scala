package typingsJapgolly.chartJs.anon

import typingsJapgolly.chartJs.mod.UpdateMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Mode extends StObject {
  
  var mode: UpdateMode
}
object Mode {
  
  inline def apply(mode: UpdateMode): Mode = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mode]
  }
  
  extension [Self <: Mode](x: Self) {
    
    inline def setMode(value: UpdateMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
  }
}
