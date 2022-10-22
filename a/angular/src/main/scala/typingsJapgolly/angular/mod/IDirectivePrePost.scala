package typingsJapgolly.angular.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.angular.JQLite
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDirectivePrePost[TScope /* <: IScope */, TElement /* <: JQLite */, TAttributes /* <: IAttributes */, TController /* <: IDirectiveController */] extends StObject {
  
  var post: js.UndefOr[IDirectiveLinkFn[TScope, TElement, TAttributes, TController]] = js.undefined
  
  var pre: js.UndefOr[IDirectiveLinkFn[TScope, TElement, TAttributes, TController]] = js.undefined
}
object IDirectivePrePost {
  
  inline def apply[TScope /* <: IScope */, TElement /* <: JQLite */, TAttributes /* <: IAttributes */, TController /* <: IDirectiveController */](): IDirectivePrePost[TScope, TElement, TAttributes, TController] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDirectivePrePost[TScope, TElement, TAttributes, TController]]
  }
  
  extension [Self <: IDirectivePrePost[?, ?, ?, ?], TScope /* <: IScope */, TElement /* <: JQLite */, TAttributes /* <: IAttributes */, TController /* <: IDirectiveController */](x: Self & (IDirectivePrePost[TScope, TElement, TAttributes, TController])) {
    
    inline def setPost(
      value: (TScope, TElement, TAttributes, /* controller */ js.UndefOr[TController], /* transclude */ js.UndefOr[ITranscludeFunction]) => Callback
    ): Self = StObject.set(x, "post", js.Any.fromFunction5((t0: TScope, t1: TElement, t2: TAttributes, t3: /* controller */ js.UndefOr[TController], t4: /* transclude */ js.UndefOr[ITranscludeFunction]) => (value(t0, t1, t2, t3, t4)).runNow()))
    
    inline def setPostUndefined: Self = StObject.set(x, "post", js.undefined)
    
    inline def setPre(
      value: (TScope, TElement, TAttributes, /* controller */ js.UndefOr[TController], /* transclude */ js.UndefOr[ITranscludeFunction]) => Callback
    ): Self = StObject.set(x, "pre", js.Any.fromFunction5((t0: TScope, t1: TElement, t2: TAttributes, t3: /* controller */ js.UndefOr[TController], t4: /* transclude */ js.UndefOr[ITranscludeFunction]) => (value(t0, t1, t2, t3, t4)).runNow()))
    
    inline def setPreUndefined: Self = StObject.set(x, "pre", js.undefined)
  }
}
