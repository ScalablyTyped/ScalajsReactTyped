package typingsJapgolly.typescript.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PackageJsonInfoCache extends StObject {
  
  def clear(): Unit
}
object PackageJsonInfoCache {
  
  inline def apply(clear: Callback): PackageJsonInfoCache = {
    val __obj = js.Dynamic.literal(clear = clear.toJsFn)
    __obj.asInstanceOf[PackageJsonInfoCache]
  }
  
  extension [Self <: PackageJsonInfoCache](x: Self) {
    
    inline def setClear(value: Callback): Self = StObject.set(x, "clear", value.toJsFn)
  }
}
