package typingsJapgolly.forgeDi

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.forgeDi.distFrameworkArgumentsMod.Arguments
import typingsJapgolly.forgeDi.distFrameworkConfigMod.Config
import typingsJapgolly.forgeDi.distFrameworkModeMod.Mode
import typingsJapgolly.forgeDi.distInspectorsInspectorMod.Inspector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distForgeMod {
  
  @JSImport("forge-di/dist/Forge", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with Forge {
    def this(config: Config) = this()
  }
  
  @js.native
  trait Forge extends StObject {
    
    def bind(name: String): typingsJapgolly.forgeDi.distFrameworkBindingMod.default = js.native
    
    var bindings: StringDictionary[js.Array[typingsJapgolly.forgeDi.distFrameworkBindingMod.default]] = js.native
    
    def get[T](name: String): T = js.native
    def get[T](name: String, hint: Any): T = js.native
    def get[T](name: String, hint: Any, args: Arguments): T = js.native
    def get[T](name: String, hint: Unit, args: Arguments): T = js.native
    
    def getAll[T](name: String): js.Array[T] = js.native
    def getAll[T](name: String, args: Arguments): js.Array[T] = js.native
    
    /* private */ var getMatchingBindings: Any = js.native
    
    def getOne[T](name: String): T = js.native
    def getOne[T](name: String, hint: Any): T = js.native
    def getOne[T](name: String, hint: Any, args: Arguments): T = js.native
    def getOne[T](name: String, hint: Unit, args: Arguments): T = js.native
    
    def inspect(): String = js.native
    
    var inspector: Inspector = js.native
    
    def rebind(name: String): typingsJapgolly.forgeDi.distFrameworkBindingMod.default = js.native
    
    def resolve(
      name: String,
      context: typingsJapgolly.forgeDi.distFrameworkContextMod.default,
      hint: Any,
      args: Arguments
    ): Any = js.native
    def resolve(
      name: String,
      context: typingsJapgolly.forgeDi.distFrameworkContextMod.default,
      hint: Any,
      args: Arguments,
      mode: Mode
    ): Any = js.native
    
    def unbind(name: String): Double = js.native
  }
}
