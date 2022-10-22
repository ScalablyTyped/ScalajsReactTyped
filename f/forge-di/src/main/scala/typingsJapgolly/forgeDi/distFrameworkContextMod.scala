package typingsJapgolly.forgeDi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distFrameworkContextMod {
  
  @JSImport("forge-di/dist/framework/Context", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with Context
  
  @js.native
  trait Context extends StObject {
    
    var bindings: js.Array[typingsJapgolly.forgeDi.distFrameworkBindingMod.default] = js.native
    
    def has(binding: typingsJapgolly.forgeDi.distFrameworkBindingMod.default): Boolean = js.native
    
    def pop(): typingsJapgolly.forgeDi.distFrameworkBindingMod.default = js.native
    
    def push(binding: typingsJapgolly.forgeDi.distFrameworkBindingMod.default): Double = js.native
    
    def toString(indent: Double): String = js.native
  }
}
