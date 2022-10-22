package typingsJapgolly.senchaTouch.Ext.draw.sprite

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IComposite
  extends StObject
     with ISprite {
  
  /** [Method] Adds a sprite to the composite
    * @param sprite Object
    */
  var add: js.UndefOr[js.Function1[/* sprite */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] Renders all sprites contained in the composite to the surface
    * @param surface Object
    * @param ctx Object
    * @param region Object
    */
  @JSName("render")
  var render_IComposite: js.UndefOr[
    js.Function3[
      /* surface */ js.UndefOr[Any], 
      /* ctx */ js.UndefOr[Any], 
      /* region */ js.UndefOr[Any], 
      Unit
    ]
  ] = js.undefined
}
object IComposite {
  
  inline def apply(): IComposite = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IComposite]
  }
  
  extension [Self <: IComposite](x: Self) {
    
    inline def setAdd(value: /* sprite */ js.UndefOr[Any] => Callback): Self = StObject.set(x, "add", js.Any.fromFunction1((t0: /* sprite */ js.UndefOr[Any]) => value(t0).runNow()))
    
    inline def setAddUndefined: Self = StObject.set(x, "add", js.undefined)
    
    inline def setRender(
      value: (/* surface */ js.UndefOr[Any], /* ctx */ js.UndefOr[Any], /* region */ js.UndefOr[Any]) => Callback
    ): Self = StObject.set(x, "render", js.Any.fromFunction3((t0: /* surface */ js.UndefOr[Any], t1: /* ctx */ js.UndefOr[Any], t2: /* region */ js.UndefOr[Any]) => (value(t0, t1, t2)).runNow()))
    
    inline def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
  }
}
