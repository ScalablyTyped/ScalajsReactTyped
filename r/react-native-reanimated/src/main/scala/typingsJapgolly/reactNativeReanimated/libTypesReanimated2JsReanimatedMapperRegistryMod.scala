package typingsJapgolly.reactNativeReanimated

import typingsJapgolly.reactNativeReanimated.libTypesReanimated2JsReanimatedCommonTypesMod.JSReanimated
import typingsJapgolly.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypesReanimated2JsReanimatedMapperRegistryMod {
  
  @JSImport("react-native-reanimated/lib/types/reanimated2/js-reanimated/MapperRegistry", JSImport.Default)
  @js.native
  open class default[T] protected ()
    extends StObject
       with MapperRegistry[T] {
    def this(module: JSReanimated) = this()
  }
  
  @js.native
  trait MapperRegistry[T] extends StObject {
    
    var _module: JSReanimated = js.native
    
    def execute(): Unit = js.native
    
    var mappers: Map[
        Double, 
        typingsJapgolly.reactNativeReanimated.libTypesReanimated2JsReanimatedMapperMod.default[T]
      ] = js.native
    
    def needRunOnRender: Boolean = js.native
    
    var sortedMappers: js.Array[
        typingsJapgolly.reactNativeReanimated.libTypesReanimated2JsReanimatedMapperMod.default[T]
      ] = js.native
    
    def startMapper(mapper: typingsJapgolly.reactNativeReanimated.libTypesReanimated2JsReanimatedMapperMod.default[T]): Double = js.native
    
    def stopMapper(id: Double): Unit = js.native
    
    def updateOrder(): Unit = js.native
    
    var updatedSinceLastExecute: Boolean = js.native
  }
}
