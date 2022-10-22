package typingsJapgolly.aureliaTemplating.mod

import japgolly.scalajs.react.Callback
import org.scalajs.dom.DocumentFragment
import typingsJapgolly.aureliaDependencyInjection.mod.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ViewEngineHooks_ extends StObject {
  
  /**
  	* Invoked after a template is compiled.
  	* @param viewFactory The view factory that was produced from the compilation process.
  	*/
  var afterCompile: js.UndefOr[js.Function1[/* viewFactory */ ViewFactory, Unit]] = js.undefined
  
  /**
  	* Invoked after a view is created.
  	* @param view The view that was created by the factory.
  	*/
  var afterCreate: js.UndefOr[js.Function1[/* view */ View_, Unit]] = js.undefined
  
  /**
  	* Invoked after the bindingContext and overrideContext are configured on the view but before the view is bound.
  	* @param view The view that was created by the factory.
  	*/
  var beforeBind: js.UndefOr[js.Function1[/* view */ View_, Unit]] = js.undefined
  
  /**
  	* Invoked before a template is compiled.
  	* @param content The DocumentFragment to compile.
  	* @param resources The resources to compile the view against.
  	* @param instruction The compilation instruction associated with the compilation process.
  	*/
  var beforeCompile: js.UndefOr[
    js.Function3[
      /* content */ DocumentFragment, 
      /* resources */ ViewResources_, 
      /* instruction */ ViewCompileInstruction, 
      Unit
    ]
  ] = js.undefined
  
  /**
  	* Invoked before a view is created.
  	* @param viewFactory The view factory that will be used to create the view.
  	* @param container The DI container used during view creation.
  	* @param content The cloned document fragment representing the view.
  	* @param instruction The view creation instruction associated with this creation process.
  	*/
  var beforeCreate: js.UndefOr[
    js.Function4[
      /* viewFactory */ ViewFactory, 
      /* container */ Container, 
      /* content */ DocumentFragment, 
      /* instruction */ ViewCreateInstruction, 
      Unit
    ]
  ] = js.undefined
  
  /**
  	* Invoked before the view is unbind. The bindingContext and overrideContext are still available on the view.
  	* @param view The view that was created by the factory.
  	*/
  var beforeUnbind: js.UndefOr[js.Function1[/* view */ View_, Unit]] = js.undefined
}
object ViewEngineHooks_ {
  
  inline def apply(): ViewEngineHooks_ = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ViewEngineHooks_]
  }
  
  extension [Self <: ViewEngineHooks_](x: Self) {
    
    inline def setAfterCompile(value: /* viewFactory */ ViewFactory => Callback): Self = StObject.set(x, "afterCompile", js.Any.fromFunction1((t0: /* viewFactory */ ViewFactory) => value(t0).runNow()))
    
    inline def setAfterCompileUndefined: Self = StObject.set(x, "afterCompile", js.undefined)
    
    inline def setAfterCreate(value: /* view */ View_ => Callback): Self = StObject.set(x, "afterCreate", js.Any.fromFunction1((t0: /* view */ View_) => value(t0).runNow()))
    
    inline def setAfterCreateUndefined: Self = StObject.set(x, "afterCreate", js.undefined)
    
    inline def setBeforeBind(value: /* view */ View_ => Callback): Self = StObject.set(x, "beforeBind", js.Any.fromFunction1((t0: /* view */ View_) => value(t0).runNow()))
    
    inline def setBeforeBindUndefined: Self = StObject.set(x, "beforeBind", js.undefined)
    
    inline def setBeforeCompile(
      value: (/* content */ DocumentFragment, /* resources */ ViewResources_, /* instruction */ ViewCompileInstruction) => Callback
    ): Self = StObject.set(x, "beforeCompile", js.Any.fromFunction3((t0: /* content */ DocumentFragment, t1: /* resources */ ViewResources_, t2: /* instruction */ ViewCompileInstruction) => (value(t0, t1, t2)).runNow()))
    
    inline def setBeforeCompileUndefined: Self = StObject.set(x, "beforeCompile", js.undefined)
    
    inline def setBeforeCreate(
      value: (/* viewFactory */ ViewFactory, /* container */ Container, /* content */ DocumentFragment, /* instruction */ ViewCreateInstruction) => Callback
    ): Self = StObject.set(x, "beforeCreate", js.Any.fromFunction4((t0: /* viewFactory */ ViewFactory, t1: /* container */ Container, t2: /* content */ DocumentFragment, t3: /* instruction */ ViewCreateInstruction) => (value(t0, t1, t2, t3)).runNow()))
    
    inline def setBeforeCreateUndefined: Self = StObject.set(x, "beforeCreate", js.undefined)
    
    inline def setBeforeUnbind(value: /* view */ View_ => Callback): Self = StObject.set(x, "beforeUnbind", js.Any.fromFunction1((t0: /* view */ View_) => value(t0).runNow()))
    
    inline def setBeforeUnbindUndefined: Self = StObject.set(x, "beforeUnbind", js.undefined)
  }
}
