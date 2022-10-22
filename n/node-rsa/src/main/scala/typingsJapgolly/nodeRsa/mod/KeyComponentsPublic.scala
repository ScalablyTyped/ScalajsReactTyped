package typingsJapgolly.nodeRsa.mod

import typingsJapgolly.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyComponentsPublic
  extends StObject
     with _Key {
  
  var e: Buffer | Double
  
  var n: Buffer
}
object KeyComponentsPublic {
  
  inline def apply(e: Buffer | Double, n: Buffer): KeyComponentsPublic = {
    val __obj = js.Dynamic.literal(e = e.asInstanceOf[js.Any], n = n.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyComponentsPublic]
  }
  
  extension [Self <: KeyComponentsPublic](x: Self) {
    
    inline def setE(value: Buffer | Double): Self = StObject.set(x, "e", value.asInstanceOf[js.Any])
    
    inline def setN(value: Buffer): Self = StObject.set(x, "n", value.asInstanceOf[js.Any])
  }
}
