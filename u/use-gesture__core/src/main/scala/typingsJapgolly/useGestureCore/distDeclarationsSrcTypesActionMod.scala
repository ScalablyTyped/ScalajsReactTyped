package typingsJapgolly.useGestureCore

import org.scalablytyped.runtime.Instantiable3
import typingsJapgolly.useGestureCore.distDeclarationsSrcConfigResolverMod.ResolverMap
import typingsJapgolly.useGestureCore.distDeclarationsSrcControllerMod.Controller
import typingsJapgolly.useGestureCore.distDeclarationsSrcEnginesEngineMod.Engine
import typingsJapgolly.useGestureCore.distDeclarationsSrcTypesConfigMod.GestureKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDeclarationsSrcTypesActionMod {
  
  trait Action extends StObject {
    
    var engine: EngineClass[GestureKey]
    
    var key: GestureKey
    
    var resolver: ResolverMap
  }
  object Action {
    
    inline def apply(engine: EngineClass[GestureKey], key: GestureKey, resolver: ResolverMap): Action = {
      val __obj = js.Dynamic.literal(engine = engine.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], resolver = resolver.asInstanceOf[js.Any])
      __obj.asInstanceOf[Action]
    }
    
    extension [Self <: Action](x: Self) {
      
      inline def setEngine(value: EngineClass[GestureKey]): Self = StObject.set(x, "engine", value.asInstanceOf[js.Any])
      
      inline def setKey(value: GestureKey): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setResolver(value: ResolverMap): Self = StObject.set(x, "resolver", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait EngineClass[Key /* <: GestureKey */]
    extends StObject
       with Instantiable3[/* controller */ Controller, /* args */ js.Array[Any], /* key */ Key, Engine[Key]]
}
