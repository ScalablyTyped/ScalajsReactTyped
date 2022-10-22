package typingsJapgolly.durandal

import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The binder joins an object instance and a DOM element tree by applying databinding and/or invoking binding lifecycle callbacks (binding and bindingComplete).
  * @requires system
  * @requires knockout
  */
object binderMod {
  
  @JSImport("durandal/binder", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def bind(obj: Any, view: HTMLElement): BindingInstruction = (^.asInstanceOf[js.Dynamic].applyDynamic("bind")(obj.asInstanceOf[js.Any], view.asInstanceOf[js.Any])).asInstanceOf[BindingInstruction]
  
  inline def bindContext(
    bindingContext: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutBindingContext */ Any,
    view: HTMLElement
  ): BindingInstruction = (^.asInstanceOf[js.Dynamic].applyDynamic("bindContext")(bindingContext.asInstanceOf[js.Any], view.asInstanceOf[js.Any])).asInstanceOf[BindingInstruction]
  inline def bindContext(
    bindingContext: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutBindingContext */ Any,
    view: HTMLElement,
    obj: Any
  ): BindingInstruction = (^.asInstanceOf[js.Dynamic].applyDynamic("bindContext")(bindingContext.asInstanceOf[js.Any], view.asInstanceOf[js.Any], obj.asInstanceOf[js.Any])).asInstanceOf[BindingInstruction]
  inline def bindContext(
    bindingContext: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutBindingContext */ Any,
    view: HTMLElement,
    obj: Any,
    dataAlias: String
  ): BindingInstruction = (^.asInstanceOf[js.Dynamic].applyDynamic("bindContext")(bindingContext.asInstanceOf[js.Any], view.asInstanceOf[js.Any], obj.asInstanceOf[js.Any], dataAlias.asInstanceOf[js.Any])).asInstanceOf[BindingInstruction]
  inline def bindContext(
    bindingContext: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutBindingContext */ Any,
    view: HTMLElement,
    obj: Unit,
    dataAlias: String
  ): BindingInstruction = (^.asInstanceOf[js.Dynamic].applyDynamic("bindContext")(bindingContext.asInstanceOf[js.Any], view.asInstanceOf[js.Any], obj.asInstanceOf[js.Any], dataAlias.asInstanceOf[js.Any])).asInstanceOf[BindingInstruction]
  
  @JSImport("durandal/binder", "binding")
  @js.native
  def binding: js.Function3[/* data */ Any, /* view */ HTMLElement, /* instruction */ BindingInstruction, Unit] = js.native
  
  @JSImport("durandal/binder", "bindingComplete")
  @js.native
  def bindingComplete: js.Function3[/* data */ Any, /* view */ HTMLElement, /* instruction */ BindingInstruction, Unit] = js.native
  inline def bindingComplete_=(
    x: js.Function3[/* data */ Any, /* view */ HTMLElement, /* instruction */ BindingInstruction, Unit]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bindingComplete")(x.asInstanceOf[js.Any])
  
  inline def binding_=(
    x: js.Function3[/* data */ Any, /* view */ HTMLElement, /* instruction */ BindingInstruction, Unit]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("binding")(x.asInstanceOf[js.Any])
  
  inline def getBindingInstruction(view: HTMLElement): BindingInstruction = ^.asInstanceOf[js.Dynamic].applyDynamic("getBindingInstruction")(view.asInstanceOf[js.Any]).asInstanceOf[BindingInstruction]
  
  @JSImport("durandal/binder", "throwOnErrors")
  @js.native
  def throwOnErrors: Boolean = js.native
  inline def throwOnErrors_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("throwOnErrors")(x.asInstanceOf[js.Any])
  
  trait BindingInstruction extends StObject {
    
    var applyBindings: Boolean
  }
  object BindingInstruction {
    
    inline def apply(applyBindings: Boolean): BindingInstruction = {
      val __obj = js.Dynamic.literal(applyBindings = applyBindings.asInstanceOf[js.Any])
      __obj.asInstanceOf[BindingInstruction]
    }
    
    extension [Self <: BindingInstruction](x: Self) {
      
      inline def setApplyBindings(value: Boolean): Self = StObject.set(x, "applyBindings", value.asInstanceOf[js.Any])
    }
  }
}
