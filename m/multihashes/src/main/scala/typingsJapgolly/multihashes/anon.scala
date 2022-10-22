package typingsJapgolly.multihashes

import typingsJapgolly.multihashes.mod.HashCode
import typingsJapgolly.multihashes.mod.HashName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Code extends StObject {
    
    var code: HashCode
    
    var digest: js.typedarray.Uint8Array
    
    var length: Double
    
    var name: HashName
  }
  object Code {
    
    extension [Self <: Code](x: Self) {
      
      inline def setCode(value: HashCode): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setDigest(value: js.typedarray.Uint8Array): Self = StObject.set(x, "digest", value.asInstanceOf[js.Any])
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setName(value: HashName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
