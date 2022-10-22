package typingsJapgolly.uuidBrowser

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.uuidBrowser.interfacesMod.v1
import typingsJapgolly.uuidBrowser.interfacesMod.v4
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("uuid-browser", JSImport.Namespace)
  @js.native
  val ^ : UuidStatic & v4 = js.native
  
  trait UuidStatic extends StObject {
    
    var v1: typingsJapgolly.uuidBrowser.interfacesMod.v1
    
    var v4: typingsJapgolly.uuidBrowser.interfacesMod.v4
  }
  object UuidStatic {
    
    inline def apply(v1: v1, v4: v4): UuidStatic = {
      val __obj = js.Dynamic.literal(v1 = v1.asInstanceOf[js.Any], v4 = v4.asInstanceOf[js.Any])
      __obj.asInstanceOf[UuidStatic]
    }
    
    extension [Self <: UuidStatic](x: Self) {
      
      inline def setV1(value: v1): Self = StObject.set(x, "v1", value.asInstanceOf[js.Any])
      
      inline def setV4(value: v4): Self = StObject.set(x, "v4", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = UuidStatic & v4
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: UuidStatic & v4 = ^
}
