package typingsJapgolly.interactjsTypes

import typingsJapgolly.interactjsTypes.anon.PartialRestrictSizeOption
import typingsJapgolly.interactjsTypes.anon.RestrictSizeOptionsinnerR
import typingsJapgolly.interactjsTypes.anon.SetStartStop
import typingsJapgolly.interactjsTypes.anon.Start
import typingsJapgolly.interactjsTypes.coreInteractionMod.Interaction
import typingsJapgolly.interactjsTypes.coreTypesMod.ActionName
import typingsJapgolly.interactjsTypes.coreTypesMod.Element
import typingsJapgolly.interactjsTypes.coreTypesMod.Point
import typingsJapgolly.interactjsTypes.coreTypesMod.Rect
import typingsJapgolly.interactjsTypes.coreTypesMod.RectResolvable
import typingsJapgolly.interactjsTypes.coreTypesMod.Size
import typingsJapgolly.interactjsTypes.interactjsTypesStrings.restrictSize
import typingsJapgolly.interactjsTypes.modifiersRestrictEdgesMod.RestrictEdgesOptions
import typingsJapgolly.interactjsTypes.modifiersRestrictEdgesMod.RestrictEdgesState
import typingsJapgolly.interactjsTypes.modifiersTypesMod.Modifier
import typingsJapgolly.interactjsTypes.modifiersTypesMod.ModifierArg
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modifiersRestrictSizeMod {
  
  object default {
    
    inline def apply(): Modifier[RestrictSizeOptions, RestrictEdgesState, restrictSize, Unit] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Modifier[RestrictSizeOptions, RestrictEdgesState, restrictSize, Unit]]
    inline def apply(_options: PartialRestrictSizeOption): Modifier[RestrictSizeOptions, RestrictEdgesState, restrictSize, Unit] = ^.asInstanceOf[js.Dynamic].apply(_options.asInstanceOf[js.Any]).asInstanceOf[Modifier[RestrictSizeOptions, RestrictEdgesState, restrictSize, Unit]]
    
    @JSImport("@interactjs/modifiers/restrict/size", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@interactjs/modifiers/restrict/size", "default._defaults")
    @js.native
    def defaults: RestrictSizeOptions = js.native
    
    inline def defaults_=(x: RestrictSizeOptions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_defaults")(x.asInstanceOf[js.Any])
    
    @JSImport("@interactjs/modifiers/restrict/size", "default._methods")
    @js.native
    def methods: SetStartStop = js.native
    
    inline def methods_=(x: SetStartStop): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_methods")(x.asInstanceOf[js.Any])
  }
  
  object restrictSize {
    
    @JSImport("@interactjs/modifiers/restrict/size", "restrictSize")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@interactjs/modifiers/restrict/size", "restrictSize.defaults")
    @js.native
    def defaults: RestrictSizeOptions = js.native
    inline def defaults_=(x: RestrictSizeOptions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaults")(x.asInstanceOf[js.Any])
    
    @JSImport("@interactjs/modifiers/restrict/size", "restrictSize.set")
    @js.native
    def set: js.Function1[/* arg */ ModifierArg[RestrictSizeState], Unit] = js.native
    inline def set(arg: ModifierArg[RestrictSizeState]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("set")(arg.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def set_=(x: js.Function1[/* arg */ ModifierArg[RestrictSizeState], Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("set")(x.asInstanceOf[js.Any])
    
    @JSImport("@interactjs/modifiers/restrict/size", "restrictSize.start")
    @js.native
    def start: js.Function1[/* arg */ ModifierArg[RestrictEdgesState], Unit] = js.native
    inline def start(arg: ModifierArg[RestrictEdgesState]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("start")(arg.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def start_=(x: js.Function1[/* arg */ ModifierArg[RestrictEdgesState], Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("start")(x.asInstanceOf[js.Any])
  }
  
  trait RestrictSizeOptions extends StObject {
    
    var enabled: js.UndefOr[Boolean] = js.undefined
    
    var endOnly: Boolean
    
    var max: js.UndefOr[
        Size | Point | (RectResolvable[js.Tuple3[Double, Double, Interaction[ActionName]]])
      ] = js.undefined
    
    var min: js.UndefOr[
        Size | Point | (RectResolvable[js.Tuple3[Double, Double, Interaction[ActionName]]])
      ] = js.undefined
  }
  object RestrictSizeOptions {
    
    inline def apply(endOnly: Boolean): RestrictSizeOptions = {
      val __obj = js.Dynamic.literal(endOnly = endOnly.asInstanceOf[js.Any])
      __obj.asInstanceOf[RestrictSizeOptions]
    }
    
    extension [Self <: RestrictSizeOptions](x: Self) {
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setEndOnly(value: Boolean): Self = StObject.set(x, "endOnly", value.asInstanceOf[js.Any])
      
      inline def setMax(value: Size | Point | (RectResolvable[js.Tuple3[Double, Double, Interaction[ActionName]]])): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxFunction1(value: js.Tuple3[Double, Double, Interaction[ActionName]] => Rect | Element): Self = StObject.set(x, "max", js.Any.fromFunction1(value))
      
      inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      inline def setMin(value: Size | Point | (RectResolvable[js.Tuple3[Double, Double, Interaction[ActionName]]])): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setMinFunction1(value: js.Tuple3[Double, Double, Interaction[ActionName]] => Rect | Element): Self = StObject.set(x, "min", js.Any.fromFunction1(value))
      
      inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    }
  }
  
  /* Inlined parent @interactjs/types.@interactjs/modifiers/restrict/edges.RestrictEdgesState */
  /* Inlined parent @interactjs/types.@interactjs/modifiers/types.ModifierState<@interactjs/types.@interactjs/modifiers/restrict/size.RestrictSizeOptions & {  inner :@interactjs/types.@interactjs/core/types.Rect,   outer :@interactjs/types.@interactjs/core/types.Rect}, {  min :@interactjs/types.@interactjs/core/types.Rect,   max :@interactjs/types.@interactjs/core/types.Rect}, any> */
  trait RestrictSizeState extends StObject {
    
    var index: js.UndefOr[Double] = js.undefined
    
    var inner: Rect
    
    var max: Rect
    
    var methods: js.UndefOr[Start] = js.undefined
    
    var min: Rect
    
    var name: js.UndefOr[Any] = js.undefined
    
    var offset: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: @interactjs/types.@interactjs/modifiers/restrict/pointer.RestrictOptions['offset'] */ js.Any
      ] = js.undefined
    
    var options: RestrictEdgesOptions & RestrictSizeOptionsinnerR
    
    var outer: Rect
  }
  object RestrictSizeState {
    
    inline def apply(
      inner: Rect,
      max: Rect,
      min: Rect,
      options: RestrictEdgesOptions & RestrictSizeOptionsinnerR,
      outer: Rect
    ): RestrictSizeState = {
      val __obj = js.Dynamic.literal(inner = inner.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], outer = outer.asInstanceOf[js.Any])
      __obj.asInstanceOf[RestrictSizeState]
    }
    
    extension [Self <: RestrictSizeState](x: Self) {
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      inline def setInner(value: Rect): Self = StObject.set(x, "inner", value.asInstanceOf[js.Any])
      
      inline def setMax(value: Rect): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMethods(value: Start): Self = StObject.set(x, "methods", value.asInstanceOf[js.Any])
      
      inline def setMethodsUndefined: Self = StObject.set(x, "methods", js.undefined)
      
      inline def setMin(value: Rect): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setName(value: Any): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOffset(
        value: /* import warning: importer.ImportType#apply Failed type conversion: @interactjs/types.@interactjs/modifiers/restrict/pointer.RestrictOptions['offset'] */ js.Any
      ): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      inline def setOptions(value: RestrictEdgesOptions & RestrictSizeOptionsinnerR): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOuter(value: Rect): Self = StObject.set(x, "outer", value.asInstanceOf[js.Any])
    }
  }
}
