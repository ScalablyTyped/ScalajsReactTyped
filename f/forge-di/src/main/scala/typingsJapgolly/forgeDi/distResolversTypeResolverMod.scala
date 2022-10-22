package typingsJapgolly.forgeDi

import typingsJapgolly.forgeDi.distFrameworkConstructorMod.Constructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distResolversTypeResolverMod {
  
  @JSImport("forge-di/dist/resolvers/TypeResolver", JSImport.Default)
  @js.native
  open class default protected () extends TypeResolver {
    def this(
      forge: typingsJapgolly.forgeDi.distForgeMod.default,
      binding: typingsJapgolly.forgeDi.distFrameworkBindingMod.default,
      `type`: Constructor
    ) = this()
  }
  
  @js.native
  trait TypeResolver
    extends typingsJapgolly.forgeDi.distResolversResolverMod.default {
    
    var `type`: Constructor = js.native
  }
}
