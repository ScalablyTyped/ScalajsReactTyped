package typingsJapgolly.reactOverlays

import japgolly.scalajs.react.Callback
import org.scalajs.dom.HTMLElement
import typingsJapgolly.reactOverlays.anon.Enabled
import typingsJapgolly.reactOverlays.anon.PartialCSSStyleDeclaratio
import typingsJapgolly.reactOverlays.reactOverlaysStrings.modifiers
import typingsJapgolly.reactOverlays.reactOverlaysStrings.placement
import typingsJapgolly.reactOverlays.reactOverlaysStrings.strategy
import typingsJapgolly.std.Omit
import typingsJapgolly.std.Partial
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmUsePopperMod {
  
  @JSImport("react-overlays/esm/usePopper", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Position an element relative some reference element using Popper.js
    *
    * @param referenceElement
    * @param popperElement
    * @param {object}      options
    * @param {object=}     options.modifiers Popper.js modifiers
    * @param {boolean=}    options.enabled toggle the popper functionality on/off
    * @param {string=}     options.placement The popper element placement relative to the reference element
    * @param {string=}     options.strategy the positioning strategy
    * @param {boolean=}    options.eventsEnabled have Popper listen on window resize events to reposition the element
    * @param {function=}   options.onCreate called when the popper is created
    * @param {function=}   options.onUpdate called when the popper is updated
    *
    * @returns {UsePopperState} The popper state
    */
  inline def default(): UsePopperState = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[UsePopperState]
  inline def default(referenceElement: Null, popperElement: HTMLElement): UsePopperState = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(referenceElement.asInstanceOf[js.Any], popperElement.asInstanceOf[js.Any])).asInstanceOf[UsePopperState]
  inline def default(
    referenceElement: Null,
    popperElement: HTMLElement,
    hasEnabledPlacementStrategyModifiersConfig: UsePopperOptions
  ): UsePopperState = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(referenceElement.asInstanceOf[js.Any], popperElement.asInstanceOf[js.Any], hasEnabledPlacementStrategyModifiersConfig.asInstanceOf[js.Any])).asInstanceOf[UsePopperState]
  inline def default(
    referenceElement: Null,
    popperElement: Null,
    hasEnabledPlacementStrategyModifiersConfig: UsePopperOptions
  ): UsePopperState = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(referenceElement.asInstanceOf[js.Any], popperElement.asInstanceOf[js.Any], hasEnabledPlacementStrategyModifiersConfig.asInstanceOf[js.Any])).asInstanceOf[UsePopperState]
  inline def default(
    referenceElement: Null,
    popperElement: Unit,
    hasEnabledPlacementStrategyModifiersConfig: UsePopperOptions
  ): UsePopperState = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(referenceElement.asInstanceOf[js.Any], popperElement.asInstanceOf[js.Any], hasEnabledPlacementStrategyModifiersConfig.asInstanceOf[js.Any])).asInstanceOf[UsePopperState]
  inline def default(referenceElement: Unit, popperElement: HTMLElement): UsePopperState = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(referenceElement.asInstanceOf[js.Any], popperElement.asInstanceOf[js.Any])).asInstanceOf[UsePopperState]
  inline def default(
    referenceElement: Unit,
    popperElement: HTMLElement,
    hasEnabledPlacementStrategyModifiersConfig: UsePopperOptions
  ): UsePopperState = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(referenceElement.asInstanceOf[js.Any], popperElement.asInstanceOf[js.Any], hasEnabledPlacementStrategyModifiersConfig.asInstanceOf[js.Any])).asInstanceOf[UsePopperState]
  inline def default(
    referenceElement: Unit,
    popperElement: Null,
    hasEnabledPlacementStrategyModifiersConfig: UsePopperOptions
  ): UsePopperState = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(referenceElement.asInstanceOf[js.Any], popperElement.asInstanceOf[js.Any], hasEnabledPlacementStrategyModifiersConfig.asInstanceOf[js.Any])).asInstanceOf[UsePopperState]
  inline def default(
    referenceElement: Unit,
    popperElement: Unit,
    hasEnabledPlacementStrategyModifiersConfig: UsePopperOptions
  ): UsePopperState = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(referenceElement.asInstanceOf[js.Any], popperElement.asInstanceOf[js.Any], hasEnabledPlacementStrategyModifiersConfig.asInstanceOf[js.Any])).asInstanceOf[UsePopperState]
  inline def default(referenceElement: VirtualElement): UsePopperState = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(referenceElement.asInstanceOf[js.Any]).asInstanceOf[UsePopperState]
  inline def default(referenceElement: VirtualElement, popperElement: HTMLElement): UsePopperState = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(referenceElement.asInstanceOf[js.Any], popperElement.asInstanceOf[js.Any])).asInstanceOf[UsePopperState]
  inline def default(
    referenceElement: VirtualElement,
    popperElement: HTMLElement,
    hasEnabledPlacementStrategyModifiersConfig: UsePopperOptions
  ): UsePopperState = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(referenceElement.asInstanceOf[js.Any], popperElement.asInstanceOf[js.Any], hasEnabledPlacementStrategyModifiersConfig.asInstanceOf[js.Any])).asInstanceOf[UsePopperState]
  inline def default(
    referenceElement: VirtualElement,
    popperElement: Null,
    hasEnabledPlacementStrategyModifiersConfig: UsePopperOptions
  ): UsePopperState = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(referenceElement.asInstanceOf[js.Any], popperElement.asInstanceOf[js.Any], hasEnabledPlacementStrategyModifiersConfig.asInstanceOf[js.Any])).asInstanceOf[UsePopperState]
  inline def default(
    referenceElement: VirtualElement,
    popperElement: Unit,
    hasEnabledPlacementStrategyModifiersConfig: UsePopperOptions
  ): UsePopperState = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(referenceElement.asInstanceOf[js.Any], popperElement.asInstanceOf[js.Any], hasEnabledPlacementStrategyModifiersConfig.asInstanceOf[js.Any])).asInstanceOf[UsePopperState]
  
  type Instance = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Popper.Instance */ Any
  
  type Modifier[Name, Options /* <: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Popper.Obj */ Any
  ] */] = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Popper.Modifier<Name, OptionsWithUndefined<Options>> */ Any
  
  type ModifierMap = Record[String, Partial[Modifier[Any, Any]]]
  
  type Modifiers = (/* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Popper.Options * / any['modifiers'] */ js.Any) | (Record[String, Partial[Modifier[Any, Any]]])
  
  type Offset = OffsetFunction | OffsetValue
  
  type OffsetFunction = js.Function1[/* details */ typingsJapgolly.reactOverlays.anon.Placement, OffsetValue]
  
  type OffsetValue = js.Tuple2[js.UndefOr[Double | Null], js.UndefOr[Double | Null]]
  
  type Options = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Popper.Options */ Any
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Popper.Obj * / any ? T : / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Popper.Obj * / any
    }}}
    */
  @js.native
  trait OptionsWithUndefined[T /* <: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Popper.Obj */ Any
  ] */] extends StObject
  
  type Placement = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Popper.Placement */ Any
  
  type State = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Popper.State */ Any
  
  type UsePopperOptions = (Omit[Options, modifiers | placement | strategy]) & Enabled
  
  trait UsePopperState extends StObject {
    
    var attributes: Record[String, Record[String, Any]]
    
    def forceUpdate(): Unit
    
    var placement: Placement
    
    var state: js.UndefOr[State] = js.undefined
    
    var styles: Record[String, PartialCSSStyleDeclaratio]
    
    def update(): Unit
  }
  object UsePopperState {
    
    inline def apply(
      attributes: Record[String, Record[String, Any]],
      forceUpdate: Callback,
      placement: Placement,
      styles: Record[String, PartialCSSStyleDeclaratio],
      update: Callback
    ): UsePopperState = {
      val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], forceUpdate = forceUpdate.toJsFn, placement = placement.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any], update = update.toJsFn)
      __obj.asInstanceOf[UsePopperState]
    }
    
    extension [Self <: UsePopperState](x: Self) {
      
      inline def setAttributes(value: Record[String, Record[String, Any]]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setForceUpdate(value: Callback): Self = StObject.set(x, "forceUpdate", value.toJsFn)
      
      inline def setPlacement(value: Placement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      inline def setState(value: State): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      
      inline def setStyles(value: Record[String, PartialCSSStyleDeclaratio]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setUpdate(value: Callback): Self = StObject.set(x, "update", value.toJsFn)
    }
  }
  
  type VirtualElement = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Popper.VirtualElement */ Any
}
