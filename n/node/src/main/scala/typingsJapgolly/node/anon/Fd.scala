package typingsJapgolly.node.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Fd extends StObject {
  
  var fd: typingsJapgolly.node.nodeInts.`1`
}
object Fd {
  
  inline def apply(): Fd = {
    val __obj = js.Dynamic.literal(fd = 1)
    __obj.asInstanceOf[Fd]
  }
  
  extension [Self <: Fd](x: Self) {
    
    inline def setFd(value: typingsJapgolly.node.nodeInts.`1`): Self = StObject.set(x, "fd", value.asInstanceOf[js.Any])
  }
}
