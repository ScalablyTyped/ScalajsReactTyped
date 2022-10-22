package typingsJapgolly.fluentuiUtilities

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.facade.React.ElementType
import typingsJapgolly.fluentuiUtilities.anon.AsyncPlaceholder
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.PropsWithoutRef
import typingsJapgolly.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libAsAsyncMod {
  
  @JSImport("@fluentui/utilities/lib/asAsync", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def asAsync[TProps](options: IAsAsyncOptions[TProps]): ForwardRefExoticComponent[(PropsWithoutRef[TProps & AsyncPlaceholder]) & RefAttributes[ElementType]] = ^.asInstanceOf[js.Dynamic].applyDynamic("asAsync")(options.asInstanceOf[js.Any]).asInstanceOf[ForwardRefExoticComponent[(PropsWithoutRef[TProps & AsyncPlaceholder]) & RefAttributes[ElementType]]]
  
  trait IAsAsyncOptions[TProps] extends StObject {
    
    /**
      * Callback which returns a promise resolving an object which exports the component.
      */
    def load(): js.Promise[ElementType]
    
    /**
      * Callback when async loading fails.
      */
    var onError: js.UndefOr[js.Function1[/* error */ js.Error, Unit]] = js.undefined
    
    /**
      * Callback executed when async loading is complete.
      */
    var onLoad: js.UndefOr[js.Function0[Unit]] = js.undefined
  }
  object IAsAsyncOptions {
    
    inline def apply[TProps](load: CallbackTo[js.Promise[ElementType]]): IAsAsyncOptions[TProps] = {
      val __obj = js.Dynamic.literal(load = load.toJsFn)
      __obj.asInstanceOf[IAsAsyncOptions[TProps]]
    }
    
    extension [Self <: IAsAsyncOptions[?], TProps](x: Self & IAsAsyncOptions[TProps]) {
      
      inline def setLoad(value: CallbackTo[js.Promise[ElementType]]): Self = StObject.set(x, "load", value.toJsFn)
      
      inline def setOnError(value: /* error */ js.Error => Callback): Self = StObject.set(x, "onError", js.Any.fromFunction1((t0: /* error */ js.Error) => value(t0).runNow()))
      
      inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      inline def setOnLoad(value: Callback): Self = StObject.set(x, "onLoad", value.toJsFn)
      
      inline def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
    }
  }
}
