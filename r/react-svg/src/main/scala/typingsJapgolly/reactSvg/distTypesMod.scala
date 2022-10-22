package typingsJapgolly.reactSvg

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.HTMLSpanElement
import org.scalajs.dom.SVGSVGElement
import typingsJapgolly.react.mod.DetailedHTMLProps
import typingsJapgolly.react.mod.HTMLAttributes
import typingsJapgolly.react.mod.SVGProps
import typingsJapgolly.reactSvg.reactSvgStrings.div
import typingsJapgolly.reactSvg.reactSvgStrings.span
import typingsJapgolly.reactSvg.reactSvgStrings.svg
import typingsJapgolly.tanemSvgInjector.distTypesMod.BeforeEach
import typingsJapgolly.tanemSvgInjector.distTypesMod.Errback
import typingsJapgolly.tanemSvgInjector.distTypesMod.EvalScripts
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesMod {
  
  trait BaseProps
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var afterInjection: js.UndefOr[Errback] = js.undefined
    
    var beforeInjection: js.UndefOr[BeforeEach] = js.undefined
    
    var evalScripts: js.UndefOr[EvalScripts] = js.undefined
    
    var fallback: js.UndefOr[ElementType] = js.undefined
    
    var httpRequestWithCredentials: js.UndefOr[Boolean] = js.undefined
    
    var loading: js.UndefOr[ElementType] = js.undefined
    
    var renumerateIRIElements: js.UndefOr[Boolean] = js.undefined
    
    var src: String
    
    var useRequestCache: js.UndefOr[Boolean] = js.undefined
    
    var wrapper: js.UndefOr[div | span | svg] = js.undefined
  }
  object BaseProps {
    
    inline def apply(src: String): BaseProps = {
      val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseProps]
    }
    
    extension [Self <: BaseProps](x: Self) {
      
      inline def setAfterInjection(value: (/* error */ js.Error | Null, /* svg */ js.UndefOr[SVGSVGElement]) => Callback): Self = StObject.set(x, "afterInjection", js.Any.fromFunction2((t0: /* error */ js.Error | Null, t1: /* svg */ js.UndefOr[SVGSVGElement]) => (value(t0, t1)).runNow()))
      
      inline def setAfterInjectionUndefined: Self = StObject.set(x, "afterInjection", js.undefined)
      
      inline def setBeforeInjection(value: /* svg */ SVGSVGElement => Callback): Self = StObject.set(x, "beforeInjection", js.Any.fromFunction1((t0: /* svg */ SVGSVGElement) => value(t0).runNow()))
      
      inline def setBeforeInjectionUndefined: Self = StObject.set(x, "beforeInjection", js.undefined)
      
      inline def setEvalScripts(value: EvalScripts): Self = StObject.set(x, "evalScripts", value.asInstanceOf[js.Any])
      
      inline def setEvalScriptsUndefined: Self = StObject.set(x, "evalScripts", js.undefined)
      
      inline def setFallback(value: ElementType): Self = StObject.set(x, "fallback", value.asInstanceOf[js.Any])
      
      inline def setFallbackUndefined: Self = StObject.set(x, "fallback", js.undefined)
      
      inline def setHttpRequestWithCredentials(value: Boolean): Self = StObject.set(x, "httpRequestWithCredentials", value.asInstanceOf[js.Any])
      
      inline def setHttpRequestWithCredentialsUndefined: Self = StObject.set(x, "httpRequestWithCredentials", js.undefined)
      
      inline def setLoading(value: ElementType): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
      
      inline def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
      
      inline def setRenumerateIRIElements(value: Boolean): Self = StObject.set(x, "renumerateIRIElements", value.asInstanceOf[js.Any])
      
      inline def setRenumerateIRIElementsUndefined: Self = StObject.set(x, "renumerateIRIElements", js.undefined)
      
      inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      inline def setUseRequestCache(value: Boolean): Self = StObject.set(x, "useRequestCache", value.asInstanceOf[js.Any])
      
      inline def setUseRequestCacheUndefined: Self = StObject.set(x, "useRequestCache", js.undefined)
      
      inline def setWrapper(value: div | span | svg): Self = StObject.set(x, "wrapper", value.asInstanceOf[js.Any])
      
      inline def setWrapperUndefined: Self = StObject.set(x, "wrapper", js.undefined)
    }
  }
  
  type HTMLWrapperType = HTMLSpanElement | HTMLDivElement
  
  type Props = BaseProps & (DetailedHTMLProps[HTMLAttributes[HTMLWrapperType], HTMLWrapperType]) & SVGProps[SVGSVGElement]
  
  type SVGWrapperType = SVGSVGElement
  
  trait State extends StObject {
    
    var hasError: Boolean
    
    var isLoading: Boolean
  }
  object State {
    
    inline def apply(hasError: Boolean, isLoading: Boolean): State = {
      val __obj = js.Dynamic.literal(hasError = hasError.asInstanceOf[js.Any], isLoading = isLoading.asInstanceOf[js.Any])
      __obj.asInstanceOf[State]
    }
    
    extension [Self <: State](x: Self) {
      
      inline def setHasError(value: Boolean): Self = StObject.set(x, "hasError", value.asInstanceOf[js.Any])
      
      inline def setIsLoading(value: Boolean): Self = StObject.set(x, "isLoading", value.asInstanceOf[js.Any])
    }
  }
  
  type WrapperType = HTMLWrapperType | SVGSVGElement
}
