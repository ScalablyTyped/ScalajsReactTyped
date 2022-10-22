package typingsJapgolly.googleCloudCommon.buildSrcUtilMod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Abortable extends StObject {
  
  def abort(): Unit
}
object Abortable {
  
  inline def apply(abort: Callback): Abortable = {
    val __obj = js.Dynamic.literal(abort = abort.toJsFn)
    __obj.asInstanceOf[Abortable]
  }
  
  extension [Self <: Abortable](x: Self) {
    
    inline def setAbort(value: Callback): Self = StObject.set(x, "abort", value.toJsFn)
  }
}
