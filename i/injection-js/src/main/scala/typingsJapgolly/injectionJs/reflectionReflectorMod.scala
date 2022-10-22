package typingsJapgolly.injectionJs

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.injectionJs.facadeTypeMod.Type
import typingsJapgolly.injectionJs.reflectionPlatformReflectionCapabilitiesMod.PlatformReflectionCapabilities
import typingsJapgolly.injectionJs.reflectionReflectorReaderMod.ReflectorReader
import typingsJapgolly.injectionJs.reflectionTypesMod.GetterFn
import typingsJapgolly.injectionJs.reflectionTypesMod.MethodFn
import typingsJapgolly.injectionJs.reflectionTypesMod.SetterFn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reflectionReflectorMod {
  
  @JSImport("injection-js/reflection/reflector", "Reflector")
  @js.native
  open class Reflector protected () extends ReflectorReader {
    def this(reflectionCapabilities: PlatformReflectionCapabilities) = this()
    
    def annotations(typeOrFunc: Type[Any]): js.Array[Any] = js.native
    
    def factory(`type`: Type[Any]): js.Function = js.native
    
    def getter(name: String): GetterFn = js.native
    
    def hasLifecycleHook(`type`: Any, lcProperty: String): Boolean = js.native
    
    def method(name: String): MethodFn = js.native
    
    def parameters(typeOrFunc: Type[Any]): js.Array[js.Array[Any]] = js.native
    
    def propMetadata(typeOrFunc: Type[Any]): StringDictionary[js.Array[Any]] = js.native
    
    var reflectionCapabilities: PlatformReflectionCapabilities = js.native
    
    def resolveIdentifier(name: String, moduleUrl: String, members: Null, runtime: Any): Any = js.native
    
    def setter(name: String): SetterFn = js.native
    
    def updateCapabilities(caps: PlatformReflectionCapabilities): Unit = js.native
  }
}
