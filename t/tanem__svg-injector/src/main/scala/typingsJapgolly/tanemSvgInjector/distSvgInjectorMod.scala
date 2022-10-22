package typingsJapgolly.tanemSvgInjector

import japgolly.scalajs.react.Callback
import org.scalajs.dom.Element
import org.scalajs.dom.Node
import org.scalajs.dom.NodeList
import org.scalajs.dom.SVGSVGElement
import typingsJapgolly.std.HTMLCollectionOf
import typingsJapgolly.tanemSvgInjector.distTypesMod.AfterAll
import typingsJapgolly.tanemSvgInjector.distTypesMod.BeforeEach
import typingsJapgolly.tanemSvgInjector.distTypesMod.Errback
import typingsJapgolly.tanemSvgInjector.distTypesMod.EvalScripts
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSvgInjectorMod {
  
  @JSImport("@tanem/svg-injector/dist/svg-injector", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(elements: Elements): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(elements.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def default(
    elements: Elements,
    hasAfterAllAfterEachBeforeEachCacheRequestsEvalScriptsHttpRequestWithCredentialsRenumerateIRIElements: OptionalArgs
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(elements.asInstanceOf[js.Any], hasAfterAllAfterEachBeforeEachCacheRequestsEvalScriptsHttpRequestWithCredentialsRenumerateIRIElements.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  type Elements = HTMLCollectionOf[Element] | (NodeList[Element & Node]) | Element | Null
  
  trait OptionalArgs extends StObject {
    
    var afterAll: js.UndefOr[AfterAll] = js.undefined
    
    var afterEach: js.UndefOr[Errback] = js.undefined
    
    var beforeEach: js.UndefOr[BeforeEach] = js.undefined
    
    var cacheRequests: js.UndefOr[Boolean] = js.undefined
    
    var evalScripts: js.UndefOr[EvalScripts] = js.undefined
    
    var httpRequestWithCredentials: js.UndefOr[Boolean] = js.undefined
    
    var renumerateIRIElements: js.UndefOr[Boolean] = js.undefined
  }
  object OptionalArgs {
    
    inline def apply(): OptionalArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OptionalArgs]
    }
    
    extension [Self <: OptionalArgs](x: Self) {
      
      inline def setAfterAll(value: /* elementsLoaded */ Double => Callback): Self = StObject.set(x, "afterAll", js.Any.fromFunction1((t0: /* elementsLoaded */ Double) => value(t0).runNow()))
      
      inline def setAfterAllUndefined: Self = StObject.set(x, "afterAll", js.undefined)
      
      inline def setAfterEach(value: (/* error */ js.Error | Null, /* svg */ js.UndefOr[SVGSVGElement]) => Callback): Self = StObject.set(x, "afterEach", js.Any.fromFunction2((t0: /* error */ js.Error | Null, t1: /* svg */ js.UndefOr[SVGSVGElement]) => (value(t0, t1)).runNow()))
      
      inline def setAfterEachUndefined: Self = StObject.set(x, "afterEach", js.undefined)
      
      inline def setBeforeEach(value: /* svg */ SVGSVGElement => Callback): Self = StObject.set(x, "beforeEach", js.Any.fromFunction1((t0: /* svg */ SVGSVGElement) => value(t0).runNow()))
      
      inline def setBeforeEachUndefined: Self = StObject.set(x, "beforeEach", js.undefined)
      
      inline def setCacheRequests(value: Boolean): Self = StObject.set(x, "cacheRequests", value.asInstanceOf[js.Any])
      
      inline def setCacheRequestsUndefined: Self = StObject.set(x, "cacheRequests", js.undefined)
      
      inline def setEvalScripts(value: EvalScripts): Self = StObject.set(x, "evalScripts", value.asInstanceOf[js.Any])
      
      inline def setEvalScriptsUndefined: Self = StObject.set(x, "evalScripts", js.undefined)
      
      inline def setHttpRequestWithCredentials(value: Boolean): Self = StObject.set(x, "httpRequestWithCredentials", value.asInstanceOf[js.Any])
      
      inline def setHttpRequestWithCredentialsUndefined: Self = StObject.set(x, "httpRequestWithCredentials", js.undefined)
      
      inline def setRenumerateIRIElements(value: Boolean): Self = StObject.set(x, "renumerateIRIElements", value.asInstanceOf[js.Any])
      
      inline def setRenumerateIRIElementsUndefined: Self = StObject.set(x, "renumerateIRIElements", js.undefined)
    }
  }
}
