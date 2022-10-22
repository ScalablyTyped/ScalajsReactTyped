package typingsJapgolly.ionicCore.distTypesStencilPublicRuntimeMod

import japgolly.scalajs.react.Callback
import org.scalajs.dom.CustomEvent
import org.scalajs.dom.EventTarget
import typingsJapgolly.std.AddEventListenerOptions
import typingsJapgolly.std.EventListenerOrEventListenerObject
import typingsJapgolly.std.FrameRequestCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomElementsDefineOptions extends StObject {
  
  var ael: js.UndefOr[
    js.Function4[
      /* el */ EventTarget, 
      /* eventName */ String, 
      /* listener */ EventListenerOrEventListenerObject, 
      /* options */ Boolean | AddEventListenerOptions, 
      Unit
    ]
  ] = js.undefined
  
  var ce: js.UndefOr[js.Function2[/* eventName */ String, /* opts */ js.UndefOr[Any], CustomEvent]] = js.undefined
  
  var exclude: js.UndefOr[js.Array[String]] = js.undefined
  
  var jmp: js.UndefOr[js.Function1[/* c */ js.Function, Any]] = js.undefined
  
  var raf: js.UndefOr[js.Function1[/* c */ FrameRequestCallback, Double]] = js.undefined
  
  var rel: js.UndefOr[
    js.Function4[
      /* el */ EventTarget, 
      /* eventName */ String, 
      /* listener */ EventListenerOrEventListenerObject, 
      /* options */ Boolean | AddEventListenerOptions, 
      Unit
    ]
  ] = js.undefined
  
  var resourcesUrl: js.UndefOr[String] = js.undefined
  
  var syncQueue: js.UndefOr[Boolean] = js.undefined
  
  var transformTagName: js.UndefOr[js.Function1[/* tagName */ String, String]] = js.undefined
}
object CustomElementsDefineOptions {
  
  inline def apply(): CustomElementsDefineOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomElementsDefineOptions]
  }
  
  extension [Self <: CustomElementsDefineOptions](x: Self) {
    
    inline def setAel(
      value: (/* el */ EventTarget, /* eventName */ String, /* listener */ EventListenerOrEventListenerObject, /* options */ Boolean | AddEventListenerOptions) => Callback
    ): Self = StObject.set(x, "ael", js.Any.fromFunction4((t0: /* el */ EventTarget, t1: /* eventName */ String, t2: /* listener */ EventListenerOrEventListenerObject, t3: /* options */ Boolean | AddEventListenerOptions) => (value(t0, t1, t2, t3)).runNow()))
    
    inline def setAelUndefined: Self = StObject.set(x, "ael", js.undefined)
    
    inline def setCe(value: (/* eventName */ String, /* opts */ js.UndefOr[Any]) => CustomEvent): Self = StObject.set(x, "ce", js.Any.fromFunction2(value))
    
    inline def setCeUndefined: Self = StObject.set(x, "ce", js.undefined)
    
    inline def setExclude(value: js.Array[String]): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
    
    inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
    
    inline def setExcludeVarargs(value: String*): Self = StObject.set(x, "exclude", js.Array(value*))
    
    inline def setJmp(value: /* c */ js.Function => Any): Self = StObject.set(x, "jmp", js.Any.fromFunction1(value))
    
    inline def setJmpUndefined: Self = StObject.set(x, "jmp", js.undefined)
    
    inline def setRaf(value: /* c */ FrameRequestCallback => Double): Self = StObject.set(x, "raf", js.Any.fromFunction1(value))
    
    inline def setRafUndefined: Self = StObject.set(x, "raf", js.undefined)
    
    inline def setRel(
      value: (/* el */ EventTarget, /* eventName */ String, /* listener */ EventListenerOrEventListenerObject, /* options */ Boolean | AddEventListenerOptions) => Callback
    ): Self = StObject.set(x, "rel", js.Any.fromFunction4((t0: /* el */ EventTarget, t1: /* eventName */ String, t2: /* listener */ EventListenerOrEventListenerObject, t3: /* options */ Boolean | AddEventListenerOptions) => (value(t0, t1, t2, t3)).runNow()))
    
    inline def setRelUndefined: Self = StObject.set(x, "rel", js.undefined)
    
    inline def setResourcesUrl(value: String): Self = StObject.set(x, "resourcesUrl", value.asInstanceOf[js.Any])
    
    inline def setResourcesUrlUndefined: Self = StObject.set(x, "resourcesUrl", js.undefined)
    
    inline def setSyncQueue(value: Boolean): Self = StObject.set(x, "syncQueue", value.asInstanceOf[js.Any])
    
    inline def setSyncQueueUndefined: Self = StObject.set(x, "syncQueue", js.undefined)
    
    inline def setTransformTagName(value: /* tagName */ String => String): Self = StObject.set(x, "transformTagName", js.Any.fromFunction1(value))
    
    inline def setTransformTagNameUndefined: Self = StObject.set(x, "transformTagName", js.undefined)
  }
}
