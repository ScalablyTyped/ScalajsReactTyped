package typingsJapgolly.reactNavigationNative

import japgolly.scalajs.react.facade.React.RefHandle
import typingsJapgolly.reactNavigationCore.libTypescriptSrcTypesMod.NavigationContainerRef
import typingsJapgolly.reactNavigationNative.anon.GetInitialState
import typingsJapgolly.reactNavigationNative.libTypescriptSrcTypesMod.LinkingOptions
import typingsJapgolly.reactNavigationRouters.libTypescriptSrcTypesMod.ParamListBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptSrcUseLinkingDotnativeMod {
  
  @JSImport("@react-navigation/native/lib/typescript/src/useLinking.native", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(
    ref: RefHandle[NavigationContainerRef[ParamListBase]],
    hasIndependentEnabledPrefixesFilterConfigGetInitialURLSubscribeGetStateFromPathGetActionFromState: Options
  ): GetInitialState = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(ref.asInstanceOf[js.Any], hasIndependentEnabledPrefixesFilterConfigGetInitialURLSubscribeGetStateFromPathGetActionFromState.asInstanceOf[js.Any])).asInstanceOf[GetInitialState]
  
  trait Options
    extends StObject
       with LinkingOptions[ParamListBase] {
    
    var independent: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(prefixes: js.Array[String]): Options = {
      val __obj = js.Dynamic.literal(prefixes = prefixes.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setIndependent(value: Boolean): Self = StObject.set(x, "independent", value.asInstanceOf[js.Any])
      
      inline def setIndependentUndefined: Self = StObject.set(x, "independent", js.undefined)
    }
  }
}
