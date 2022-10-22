package typingsJapgolly.popperjsCore

import org.scalajs.dom.Element
import org.scalajs.dom.HTMLElement
import typingsJapgolly.popperjsCore.anon.PartialModifieranyany
import typingsJapgolly.popperjsCore.anon.PartialOptions
import typingsJapgolly.popperjsCore.anon.PartialOptionsGenericany
import typingsJapgolly.popperjsCore.libTypesMod.Instance
import typingsJapgolly.popperjsCore.libTypesMod.Modifier
import typingsJapgolly.popperjsCore.libTypesMod.OptionsGeneric
import typingsJapgolly.popperjsCore.libTypesMod.SideObject
import typingsJapgolly.popperjsCore.libTypesMod.State
import typingsJapgolly.popperjsCore.libTypesMod.VirtualElement
import typingsJapgolly.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCreatePopperMod {
  
  @JSImport("@popperjs/core/lib/createPopper", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createPopper[TModifier /* <: PartialModifieranyany */](reference: Element, popper: HTMLElement): Instance = (^.asInstanceOf[js.Dynamic].applyDynamic("createPopper")(reference.asInstanceOf[js.Any], popper.asInstanceOf[js.Any])).asInstanceOf[Instance]
  inline def createPopper[TModifier /* <: PartialModifieranyany */](reference: Element, popper: HTMLElement, options: Partial[OptionsGeneric[TModifier]]): Instance = (^.asInstanceOf[js.Dynamic].applyDynamic("createPopper")(reference.asInstanceOf[js.Any], popper.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Instance]
  inline def createPopper[TModifier /* <: PartialModifieranyany */](reference: VirtualElement, popper: HTMLElement): Instance = (^.asInstanceOf[js.Dynamic].applyDynamic("createPopper")(reference.asInstanceOf[js.Any], popper.asInstanceOf[js.Any])).asInstanceOf[Instance]
  inline def createPopper[TModifier /* <: PartialModifieranyany */](reference: VirtualElement, popper: HTMLElement, options: Partial[OptionsGeneric[TModifier]]): Instance = (^.asInstanceOf[js.Dynamic].applyDynamic("createPopper")(reference.asInstanceOf[js.Any], popper.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Instance]
  
  inline def detectOverflow(state: State): SideObject = ^.asInstanceOf[js.Dynamic].applyDynamic("detectOverflow")(state.asInstanceOf[js.Any]).asInstanceOf[SideObject]
  inline def detectOverflow(state: State, options: PartialOptions): SideObject = (^.asInstanceOf[js.Dynamic].applyDynamic("detectOverflow")(state.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SideObject]
  
  inline def popperGenerator(): js.Function3[
    /* reference */ Element | VirtualElement, 
    /* popper */ HTMLElement, 
    /* options */ js.UndefOr[Partial[OptionsGeneric[PartialModifieranyany]]], 
    Instance
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("popperGenerator")().asInstanceOf[js.Function3[
    /* reference */ Element | VirtualElement, 
    /* popper */ HTMLElement, 
    /* options */ js.UndefOr[Partial[OptionsGeneric[PartialModifieranyany]]], 
    Instance
  ]]
  inline def popperGenerator(generatorOptions: PopperGeneratorArgs): js.Function3[
    /* reference */ Element | VirtualElement, 
    /* popper */ HTMLElement, 
    /* options */ js.UndefOr[Partial[OptionsGeneric[PartialModifieranyany]]], 
    Instance
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("popperGenerator")(generatorOptions.asInstanceOf[js.Any]).asInstanceOf[js.Function3[
    /* reference */ Element | VirtualElement, 
    /* popper */ HTMLElement, 
    /* options */ js.UndefOr[Partial[OptionsGeneric[PartialModifieranyany]]], 
    Instance
  ]]
  
  trait PopperGeneratorArgs extends StObject {
    
    var defaultModifiers: js.UndefOr[js.Array[Modifier[Any, Any]]] = js.undefined
    
    var defaultOptions: js.UndefOr[PartialOptionsGenericany] = js.undefined
  }
  object PopperGeneratorArgs {
    
    inline def apply(): PopperGeneratorArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PopperGeneratorArgs]
    }
    
    extension [Self <: PopperGeneratorArgs](x: Self) {
      
      inline def setDefaultModifiers(value: js.Array[Modifier[Any, Any]]): Self = StObject.set(x, "defaultModifiers", value.asInstanceOf[js.Any])
      
      inline def setDefaultModifiersUndefined: Self = StObject.set(x, "defaultModifiers", js.undefined)
      
      inline def setDefaultModifiersVarargs(value: (Modifier[Any, Any])*): Self = StObject.set(x, "defaultModifiers", js.Array(value*))
      
      inline def setDefaultOptions(value: PartialOptionsGenericany): Self = StObject.set(x, "defaultOptions", value.asInstanceOf[js.Any])
      
      inline def setDefaultOptionsUndefined: Self = StObject.set(x, "defaultOptions", js.undefined)
    }
  }
}
