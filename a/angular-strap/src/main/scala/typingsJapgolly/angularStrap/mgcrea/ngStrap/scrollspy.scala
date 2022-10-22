package typingsJapgolly.angularStrap.mgcrea.ngStrap

import japgolly.scalajs.react.Callback
import typingsJapgolly.angular.mod.IAugmentedJQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

///////////////////////////////////////////////////////////////////////////
// Scrollspy
// see http://mgcrea.github.io/angular-strap/#/scrollspy
///////////////////////////////////////////////////////////////////////////
object scrollspy {
  
  trait IScrollspy extends StObject {
    
    def activate(index: Double): Unit
    
    def checkOffsets(): Unit
    
    def trackElement(target: Any, source: Any): Unit
    
    def untrackElement(target: Any, source: Any): Unit
  }
  object IScrollspy {
    
    inline def apply(
      activate: Double => Callback,
      checkOffsets: Callback,
      trackElement: (Any, Any) => Callback,
      untrackElement: (Any, Any) => Callback
    ): IScrollspy = {
      val __obj = js.Dynamic.literal(activate = js.Any.fromFunction1((t0: Double) => activate(t0).runNow()), checkOffsets = checkOffsets.toJsFn, trackElement = js.Any.fromFunction2((t0: Any, t1: Any) => (trackElement(t0, t1)).runNow()), untrackElement = js.Any.fromFunction2((t0: Any, t1: Any) => (untrackElement(t0, t1)).runNow()))
      __obj.asInstanceOf[IScrollspy]
    }
    
    extension [Self <: IScrollspy](x: Self) {
      
      inline def setActivate(value: Double => Callback): Self = StObject.set(x, "activate", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
      
      inline def setCheckOffsets(value: Callback): Self = StObject.set(x, "checkOffsets", value.toJsFn)
      
      inline def setTrackElement(value: (Any, Any) => Callback): Self = StObject.set(x, "trackElement", js.Any.fromFunction2((t0: Any, t1: Any) => (value(t0, t1)).runNow()))
      
      inline def setUntrackElement(value: (Any, Any) => Callback): Self = StObject.set(x, "untrackElement", js.Any.fromFunction2((t0: Any, t1: Any) => (value(t0, t1)).runNow()))
    }
  }
  
  trait IScrollspyOptions extends StObject {
    
    var offset: js.UndefOr[Double] = js.undefined
    
    var target: js.UndefOr[String] = js.undefined
  }
  object IScrollspyOptions {
    
    inline def apply(): IScrollspyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IScrollspyOptions]
    }
    
    extension [Self <: IScrollspyOptions](x: Self) {
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    }
  }
  
  trait IScrollspyProvider extends StObject {
    
    var defaults: IScrollspyOptions
  }
  object IScrollspyProvider {
    
    inline def apply(defaults: IScrollspyOptions): IScrollspyProvider = {
      val __obj = js.Dynamic.literal(defaults = defaults.asInstanceOf[js.Any])
      __obj.asInstanceOf[IScrollspyProvider]
    }
    
    extension [Self <: IScrollspyProvider](x: Self) {
      
      inline def setDefaults(value: IScrollspyOptions): Self = StObject.set(x, "defaults", value.asInstanceOf[js.Any])
    }
  }
  
  type IScrollspyService = js.Function2[/* element */ IAugmentedJQuery, /* options */ IScrollspyOptions, IScrollspy]
}
