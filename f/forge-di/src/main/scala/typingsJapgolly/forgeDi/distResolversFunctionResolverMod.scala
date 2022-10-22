package typingsJapgolly.forgeDi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distResolversFunctionResolverMod {
  
  @JSImport("forge-di/dist/resolvers/FunctionResolver", JSImport.Default)
  @js.native
  open class default protected () extends FunctionResolver {
    def this(
      forge: typingsJapgolly.forgeDi.distForgeMod.default,
      binding: typingsJapgolly.forgeDi.distFrameworkBindingMod.default,
      func: js.Function
    ) = this()
  }
  
  @js.native
  trait FunctionResolver
    extends typingsJapgolly.forgeDi.distResolversResolverMod.default {
    
    var func: js.Function = js.native
  }
}
