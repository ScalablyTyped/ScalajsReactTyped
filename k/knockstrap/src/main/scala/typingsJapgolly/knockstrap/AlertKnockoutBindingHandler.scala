package typingsJapgolly.knockstrap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutBindingHandler * / any */ trait AlertKnockoutBindingHandler extends StObject {
  
  var init: js.UndefOr[
    js.Function5[
      /* element */ Any, 
      /* valueAccessor */ js.Function0[Any], 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutAllBindingsAccessor */ /* allBindingsAccessor */ Any, 
      /* viewModel */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutBindingContext */ /* bindingContext */ Any, 
      KnockoutControlsDescendantBindings
    ]
  ] = js.undefined
}
object AlertKnockoutBindingHandler {
  
  inline def apply(): AlertKnockoutBindingHandler = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AlertKnockoutBindingHandler]
  }
  
  extension [Self <: AlertKnockoutBindingHandler](x: Self) {
    
    inline def setInit(
      value: (/* element */ Any, /* valueAccessor */ js.Function0[Any], /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutAllBindingsAccessor */ /* allBindingsAccessor */ Any, /* viewModel */ Any, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutBindingContext */ /* bindingContext */ Any) => KnockoutControlsDescendantBindings
    ): Self = StObject.set(x, "init", js.Any.fromFunction5(value))
    
    inline def setInitUndefined: Self = StObject.set(x, "init", js.undefined)
  }
}
