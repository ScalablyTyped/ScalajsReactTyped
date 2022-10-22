package typingsJapgolly.playcanvas.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VersionedObject extends StObject {
  
  def increment(): Unit
  
  var version: Version_
}
object VersionedObject {
  
  inline def apply(increment: Callback, version: Version_): VersionedObject = {
    val __obj = js.Dynamic.literal(increment = increment.toJsFn, version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[VersionedObject]
  }
  
  extension [Self <: VersionedObject](x: Self) {
    
    inline def setIncrement(value: Callback): Self = StObject.set(x, "increment", value.toJsFn)
    
    inline def setVersion(value: Version_): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
