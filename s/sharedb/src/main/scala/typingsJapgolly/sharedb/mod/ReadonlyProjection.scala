package typingsJapgolly.sharedb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReadonlyProjection extends StObject {
  
  val target: String
}
object ReadonlyProjection {
  
  inline def apply(target: String): ReadonlyProjection = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyProjection]
  }
  
  extension [Self <: ReadonlyProjection](x: Self) {
    
    inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
