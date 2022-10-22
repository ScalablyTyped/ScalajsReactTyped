package typingsJapgolly.senchaTouch.Ext.chart

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.senchaTouch.Ext.draw.modifier.IModifier
import typingsJapgolly.senchaTouch.Ext.draw.sprite.IText
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object label {
  
  trait ICallout
    extends StObject
       with IModifier
  object ICallout {
    
    inline def apply(): ICallout = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ICallout]
    }
  }
  
  trait ILabel
    extends StObject
       with IText {
    
    /** [Config Option] (Object) */
    var fx: js.UndefOr[Any] = js.undefined
    
    /** [Method] Returns the value of field
      * @returns Object
      */
    var getField: js.UndefOr[js.Function0[Any]] = js.undefined
    
    /** [Method] Returns the value of fx
      * @returns Object
      */
    var getFx: js.UndefOr[js.Function0[Any]] = js.undefined
    
    /** [Method] Render method
      * @param surface Object
      * @param ctx Object
      * @param clipRegion Object
      * @returns * returns false to stop rendering in this frame. All the sprite haven't been rendered will have their dirty flag untouched.
      */
    @JSName("render")
    var render_ILabel: js.UndefOr[
        js.Function3[
          /* surface */ js.UndefOr[Any], 
          /* ctx */ js.UndefOr[Any], 
          /* clipRegion */ js.UndefOr[Any], 
          Any
        ]
      ] = js.undefined
    
    /** [Method] Sets the value of field
      * @param field Object The new value.
      */
    var setField: js.UndefOr[js.Function1[/* field */ js.UndefOr[Any], Unit]] = js.undefined
    
    /** [Method] Sets the value of fx
      * @param fx Object The new value.
      */
    var setFx: js.UndefOr[js.Function1[/* fx */ js.UndefOr[Any], Unit]] = js.undefined
  }
  object ILabel {
    
    inline def apply(): ILabel = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ILabel]
    }
    
    extension [Self <: ILabel](x: Self) {
      
      inline def setFx(value: Any): Self = StObject.set(x, "fx", value.asInstanceOf[js.Any])
      
      inline def setFxUndefined: Self = StObject.set(x, "fx", js.undefined)
      
      inline def setGetField(value: CallbackTo[Any]): Self = StObject.set(x, "getField", value.toJsFn)
      
      inline def setGetFieldUndefined: Self = StObject.set(x, "getField", js.undefined)
      
      inline def setGetFx(value: CallbackTo[Any]): Self = StObject.set(x, "getFx", value.toJsFn)
      
      inline def setGetFxUndefined: Self = StObject.set(x, "getFx", js.undefined)
      
      inline def setRender(
        value: (/* surface */ js.UndefOr[Any], /* ctx */ js.UndefOr[Any], /* clipRegion */ js.UndefOr[Any]) => Any
      ): Self = StObject.set(x, "render", js.Any.fromFunction3(value))
      
      inline def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
      
      inline def setSetField(value: /* field */ js.UndefOr[Any] => Callback): Self = StObject.set(x, "setField", js.Any.fromFunction1((t0: /* field */ js.UndefOr[Any]) => value(t0).runNow()))
      
      inline def setSetFieldUndefined: Self = StObject.set(x, "setField", js.undefined)
      
      inline def setSetFx(value: /* fx */ js.UndefOr[Any] => Callback): Self = StObject.set(x, "setFx", js.Any.fromFunction1((t0: /* fx */ js.UndefOr[Any]) => value(t0).runNow()))
      
      inline def setSetFxUndefined: Self = StObject.set(x, "setFx", js.undefined)
    }
  }
}
