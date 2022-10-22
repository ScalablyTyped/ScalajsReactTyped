package typingsJapgolly.plotlyJs.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StaticPlots extends StObject {
  
  def resize(root: Root): Unit
}
object StaticPlots {
  
  inline def apply(resize: Root => Callback): StaticPlots = {
    val __obj = js.Dynamic.literal(resize = js.Any.fromFunction1((t0: Root) => resize(t0).runNow()))
    __obj.asInstanceOf[StaticPlots]
  }
  
  extension [Self <: StaticPlots](x: Self) {
    
    inline def setResize(value: Root => Callback): Self = StObject.set(x, "resize", js.Any.fromFunction1((t0: Root) => value(t0).runNow()))
  }
}
