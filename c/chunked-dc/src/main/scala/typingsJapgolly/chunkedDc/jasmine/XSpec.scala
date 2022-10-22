package typingsJapgolly.chunkedDc.jasmine

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XSpec extends StObject {
  
  var id: Double
  
  def runs(): Unit
}
object XSpec {
  
  inline def apply(id: Double, runs: Callback): XSpec = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], runs = runs.toJsFn)
    __obj.asInstanceOf[XSpec]
  }
  
  extension [Self <: XSpec](x: Self) {
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setRuns(value: Callback): Self = StObject.set(x, "runs", value.toJsFn)
  }
}
