package typingsJapgolly.chartJs.anon

import typingsJapgolly.chartJs.chartJsBooleans.`true`
import typingsJapgolly.chartJs.mod.UpdateMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cancelable extends StObject {
  
  var cancelable: `true`
  
  var mode: UpdateMode
}
object Cancelable {
  
  inline def apply(mode: UpdateMode): Cancelable = {
    val __obj = js.Dynamic.literal(cancelable = true, mode = mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cancelable]
  }
  
  extension [Self <: Cancelable](x: Self) {
    
    inline def setCancelable(value: `true`): Self = StObject.set(x, "cancelable", value.asInstanceOf[js.Any])
    
    inline def setMode(value: UpdateMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
  }
}
