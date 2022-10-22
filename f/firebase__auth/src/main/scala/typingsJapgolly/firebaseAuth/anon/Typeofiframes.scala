package typingsJapgolly.firebaseAuth.anon

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.Instantiable0
import typingsJapgolly.firebaseAuth.gapi.iframes.Context
import typingsJapgolly.firebaseAuth.gapi.iframes.Iframe
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Typeofiframes extends StObject {
  
  def CROSS_ORIGIN_IFRAMES_FILTER(iframe: Iframe): Boolean
  
  var Context: Instantiable0[typingsJapgolly.firebaseAuth.gapi.iframes.Context]
  
  var Iframe: Instantiable0[typingsJapgolly.firebaseAuth.gapi.iframes.Iframe]
  
  def getContext(): Context
}
object Typeofiframes {
  
  inline def apply(
    CROSS_ORIGIN_IFRAMES_FILTER: Iframe => Boolean,
    Context: Instantiable0[Context],
    Iframe: Instantiable0[Iframe],
    getContext: CallbackTo[Context]
  ): Typeofiframes = {
    val __obj = js.Dynamic.literal(CROSS_ORIGIN_IFRAMES_FILTER = js.Any.fromFunction1(CROSS_ORIGIN_IFRAMES_FILTER), Context = Context.asInstanceOf[js.Any], Iframe = Iframe.asInstanceOf[js.Any], getContext = getContext.toJsFn)
    __obj.asInstanceOf[Typeofiframes]
  }
  
  extension [Self <: Typeofiframes](x: Self) {
    
    inline def setCROSS_ORIGIN_IFRAMES_FILTER(value: Iframe => Boolean): Self = StObject.set(x, "CROSS_ORIGIN_IFRAMES_FILTER", js.Any.fromFunction1(value))
    
    inline def setContext(value: Instantiable0[Context]): Self = StObject.set(x, "Context", value.asInstanceOf[js.Any])
    
    inline def setGetContext(value: CallbackTo[Context]): Self = StObject.set(x, "getContext", value.toJsFn)
    
    inline def setIframe(value: Instantiable0[Iframe]): Self = StObject.set(x, "Iframe", value.asInstanceOf[js.Any])
  }
}
