package typingsJapgolly.sharepoint.SP

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObjectPath extends StObject {
  
  def setPendingReplace(): Unit
}
object ObjectPath {
  
  inline def apply(setPendingReplace: Callback): ObjectPath = {
    val __obj = js.Dynamic.literal(setPendingReplace = setPendingReplace.toJsFn)
    __obj.asInstanceOf[ObjectPath]
  }
  
  extension [Self <: ObjectPath](x: Self) {
    
    inline def setSetPendingReplace(value: Callback): Self = StObject.set(x, "setPendingReplace", value.toJsFn)
  }
}
