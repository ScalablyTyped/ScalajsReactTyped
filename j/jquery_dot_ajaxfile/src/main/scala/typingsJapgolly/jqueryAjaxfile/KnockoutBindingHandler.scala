package typingsJapgolly.jqueryAjaxfile

import japgolly.scalajs.react.Callback
import typingsJapgolly.jqueryAjaxfile.anon.ControlsDescendantBindings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KnockoutBindingHandler extends StObject {
  
  var init: js.UndefOr[
    js.Function5[
      /* element */ Any, 
      /* valueAccessor */ js.Function0[Any], 
      /* allBindingsAccessor */ js.UndefOr[KnockoutAllBindingsAccessor], 
      /* viewModel */ js.UndefOr[Any], 
      /* bindingContext */ js.UndefOr[KnockoutBindingContext], 
      Unit | ControlsDescendantBindings
    ]
  ] = js.undefined
  
  var options: js.UndefOr[Any] = js.undefined
  
  var preprocess: js.UndefOr[
    js.Function3[
      /* value */ String, 
      /* name */ String, 
      /* addBindingCallback */ js.UndefOr[js.Function2[/* name */ String, /* value */ String, Unit]], 
      String
    ]
  ] = js.undefined
  
  var update: js.UndefOr[
    js.Function5[
      /* element */ Any, 
      /* valueAccessor */ js.Function0[Any], 
      /* allBindingsAccessor */ js.UndefOr[KnockoutAllBindingsAccessor], 
      /* viewModel */ js.UndefOr[Any], 
      /* bindingContext */ js.UndefOr[KnockoutBindingContext], 
      Unit
    ]
  ] = js.undefined
}
object KnockoutBindingHandler {
  
  inline def apply(): KnockoutBindingHandler = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KnockoutBindingHandler]
  }
  
  extension [Self <: KnockoutBindingHandler](x: Self) {
    
    inline def setInit(
      value: (/* element */ Any, /* valueAccessor */ js.Function0[Any], /* allBindingsAccessor */ js.UndefOr[KnockoutAllBindingsAccessor], /* viewModel */ js.UndefOr[Any], /* bindingContext */ js.UndefOr[KnockoutBindingContext]) => Unit | ControlsDescendantBindings
    ): Self = StObject.set(x, "init", js.Any.fromFunction5(value))
    
    inline def setInitUndefined: Self = StObject.set(x, "init", js.undefined)
    
    inline def setOptions(value: Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setPreprocess(
      value: (/* value */ String, /* name */ String, /* addBindingCallback */ js.UndefOr[js.Function2[/* name */ String, /* value */ String, Unit]]) => String
    ): Self = StObject.set(x, "preprocess", js.Any.fromFunction3(value))
    
    inline def setPreprocessUndefined: Self = StObject.set(x, "preprocess", js.undefined)
    
    inline def setUpdate(
      value: (/* element */ Any, /* valueAccessor */ js.Function0[Any], /* allBindingsAccessor */ js.UndefOr[KnockoutAllBindingsAccessor], /* viewModel */ js.UndefOr[Any], /* bindingContext */ js.UndefOr[KnockoutBindingContext]) => Callback
    ): Self = StObject.set(x, "update", js.Any.fromFunction5((t0: /* element */ Any, t1: /* valueAccessor */ js.Function0[Any], t2: /* allBindingsAccessor */ js.UndefOr[KnockoutAllBindingsAccessor], t3: /* viewModel */ js.UndefOr[Any], t4: /* bindingContext */ js.UndefOr[KnockoutBindingContext]) => (value(t0, t1, t2, t3, t4)).runNow()))
    
    inline def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
  }
}
