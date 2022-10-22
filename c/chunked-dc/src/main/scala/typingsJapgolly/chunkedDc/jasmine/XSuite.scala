package typingsJapgolly.chunkedDc.jasmine

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XSuite extends StObject {
  
  def execute(): Unit
}
object XSuite {
  
  inline def apply(execute: Callback): XSuite = {
    val __obj = js.Dynamic.literal(execute = execute.toJsFn)
    __obj.asInstanceOf[XSuite]
  }
  
  extension [Self <: XSuite](x: Self) {
    
    inline def setExecute(value: Callback): Self = StObject.set(x, "execute", value.toJsFn)
  }
}
