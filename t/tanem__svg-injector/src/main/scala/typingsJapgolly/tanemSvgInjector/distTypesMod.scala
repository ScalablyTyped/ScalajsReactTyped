package typingsJapgolly.tanemSvgInjector

import org.scalajs.dom.SVGSVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesMod {
  
  type AfterAll = js.Function1[/* elementsLoaded */ Double, Unit]
  
  type BeforeEach = js.Function1[/* svg */ SVGSVGElement, Unit]
  
  type Errback = js.Function2[/* error */ js.Error | Null, /* svg */ js.UndefOr[SVGSVGElement], Unit]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.tanemSvgInjector.tanemSvgInjectorStrings.always
    - typingsJapgolly.tanemSvgInjector.tanemSvgInjectorStrings.once
    - typingsJapgolly.tanemSvgInjector.tanemSvgInjectorStrings.never
  */
  trait EvalScripts extends StObject
  object EvalScripts {
    
    inline def always: typingsJapgolly.tanemSvgInjector.tanemSvgInjectorStrings.always = "always".asInstanceOf[typingsJapgolly.tanemSvgInjector.tanemSvgInjectorStrings.always]
    
    inline def never: typingsJapgolly.tanemSvgInjector.tanemSvgInjectorStrings.never = "never".asInstanceOf[typingsJapgolly.tanemSvgInjector.tanemSvgInjectorStrings.never]
    
    inline def once: typingsJapgolly.tanemSvgInjector.tanemSvgInjectorStrings.once = "once".asInstanceOf[typingsJapgolly.tanemSvgInjector.tanemSvgInjectorStrings.once]
  }
}
