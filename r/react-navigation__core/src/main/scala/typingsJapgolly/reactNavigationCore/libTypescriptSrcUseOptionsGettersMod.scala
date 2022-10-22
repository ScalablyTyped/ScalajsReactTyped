package typingsJapgolly.reactNavigationCore

import typingsJapgolly.reactNavigationCore.anon.GetCurrentOptions
import typingsJapgolly.reactNavigationCore.libTypescriptSrcTypesMod.Keyof
import typingsJapgolly.reactNavigationCore.libTypescriptSrcTypesMod.NavigationProp
import typingsJapgolly.reactNavigationRouters.libTypescriptSrcTypesMod.NavigationState
import typingsJapgolly.reactNavigationRouters.libTypescriptSrcTypesMod.ParamListBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptSrcUseOptionsGettersMod {
  
  @JSImport("@react-navigation/core/lib/typescript/src/useOptionsGetters", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(hasKeyOptionsNavigation: Options): GetCurrentOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasKeyOptionsNavigation.asInstanceOf[js.Any]).asInstanceOf[GetCurrentOptions]
  
  trait Options extends StObject {
    
    var key: js.UndefOr[String] = js.undefined
    
    var navigation: js.UndefOr[
        NavigationProp[
          ParamListBase, 
          Keyof[ParamListBase], 
          Unit, 
          NavigationState[ParamListBase], 
          js.Object, 
          js.Object
        ]
      ] = js.undefined
    
    var options: js.UndefOr[js.Object] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setNavigation(
        value: NavigationProp[
              ParamListBase, 
              Keyof[ParamListBase], 
              Unit, 
              NavigationState[ParamListBase], 
              js.Object, 
              js.Object
            ]
      ): Self = StObject.set(x, "navigation", value.asInstanceOf[js.Any])
      
      inline def setNavigationUndefined: Self = StObject.set(x, "navigation", js.undefined)
      
      inline def setOptions(value: js.Object): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    }
  }
}
