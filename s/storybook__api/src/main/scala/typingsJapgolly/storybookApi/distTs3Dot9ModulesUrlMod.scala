package typingsJapgolly.storybookApi

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.storybookApi.anon.Path
import typingsJapgolly.storybookApi.mod.ModuleFn
import typingsJapgolly.storybookRouter.mod.NavigateOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTs3Dot9ModulesUrlMod {
  
  @JSImport("@storybook/api/dist/ts3.9/modules/url", "init")
  @js.native
  val init: ModuleFn = js.native
  
  type QueryParams = StringDictionary[String | Null]
  
  trait SubAPI extends StObject {
    
    def getQueryParam(key: String): js.UndefOr[String]
    
    def getUrlState(): Path
    
    def navigateUrl(url: String, options: NavigateOptions): Unit
    
    def setQueryParams(input: QueryParams): Unit
  }
  object SubAPI {
    
    inline def apply(
      getQueryParam: String => js.UndefOr[String],
      getUrlState: CallbackTo[Path],
      navigateUrl: (String, NavigateOptions) => Callback,
      setQueryParams: QueryParams => Callback
    ): SubAPI = {
      val __obj = js.Dynamic.literal(getQueryParam = js.Any.fromFunction1(getQueryParam), getUrlState = getUrlState.toJsFn, navigateUrl = js.Any.fromFunction2((t0: String, t1: NavigateOptions) => (navigateUrl(t0, t1)).runNow()), setQueryParams = js.Any.fromFunction1((t0: QueryParams) => setQueryParams(t0).runNow()))
      __obj.asInstanceOf[SubAPI]
    }
    
    extension [Self <: SubAPI](x: Self) {
      
      inline def setGetQueryParam(value: String => js.UndefOr[String]): Self = StObject.set(x, "getQueryParam", js.Any.fromFunction1(value))
      
      inline def setGetUrlState(value: CallbackTo[Path]): Self = StObject.set(x, "getUrlState", value.toJsFn)
      
      inline def setNavigateUrl(value: (String, NavigateOptions) => Callback): Self = StObject.set(x, "navigateUrl", js.Any.fromFunction2((t0: String, t1: NavigateOptions) => (value(t0, t1)).runNow()))
      
      inline def setSetQueryParams(value: QueryParams => Callback): Self = StObject.set(x, "setQueryParams", js.Any.fromFunction1((t0: QueryParams) => value(t0).runNow()))
    }
  }
  
  trait SubState extends StObject {
    
    var customQueryParams: QueryParams
  }
  object SubState {
    
    inline def apply(customQueryParams: QueryParams): SubState = {
      val __obj = js.Dynamic.literal(customQueryParams = customQueryParams.asInstanceOf[js.Any])
      __obj.asInstanceOf[SubState]
    }
    
    extension [Self <: SubState](x: Self) {
      
      inline def setCustomQueryParams(value: QueryParams): Self = StObject.set(x, "customQueryParams", value.asInstanceOf[js.Any])
    }
  }
}
