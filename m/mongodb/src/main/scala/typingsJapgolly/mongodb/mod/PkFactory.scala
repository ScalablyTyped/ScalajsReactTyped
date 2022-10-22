package typingsJapgolly.mongodb.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PkFactory extends StObject {
  
  def createPk(): Any
}
object PkFactory {
  
  inline def apply(createPk: CallbackTo[Any]): PkFactory = {
    val __obj = js.Dynamic.literal(createPk = createPk.toJsFn)
    __obj.asInstanceOf[PkFactory]
  }
  
  extension [Self <: PkFactory](x: Self) {
    
    inline def setCreatePk(value: CallbackTo[Any]): Self = StObject.set(x, "createPk", value.toJsFn)
  }
}
