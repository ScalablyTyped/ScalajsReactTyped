package typingsJapgolly.nodeDir

import typingsJapgolly.nodeDir.nodeDirBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Sync extends StObject {
    
    var sync: `true`
  }
  object Sync {
    
    inline def apply(): Sync = {
      val __obj = js.Dynamic.literal(sync = true)
      __obj.asInstanceOf[Sync]
    }
    
    extension [Self <: Sync](x: Self) {
      
      inline def setSync(value: `true`): Self = StObject.set(x, "sync", value.asInstanceOf[js.Any])
    }
  }
}
