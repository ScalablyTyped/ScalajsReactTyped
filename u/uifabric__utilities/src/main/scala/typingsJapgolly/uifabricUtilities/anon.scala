package typingsJapgolly.uifabricUtilities

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.RefHandle
import org.scalajs.dom.HTMLElement
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.reactTestRenderer.mod.ReactTestRenderer
import typingsJapgolly.reactTestRenderer.mod.TestRendererOptions
import typingsJapgolly.uifabricMergeStyles.libIstylefunctionMod.IStyleFunctionOrObject
import typingsJapgolly.uifabricUtilities.libCustomizationsCustomizationsMod.ICustomizations
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AsyncPlaceholder extends StObject {
    
    var asyncPlaceholder: js.UndefOr[
        /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 177, starting with typingsJapgolly.uifabricUtilities.uifabricUtilitiesStrings.symbol, typingsJapgolly.uifabricUtilities.uifabricUtilitiesStrings.`object`, typingsJapgolly.uifabricUtilities.uifabricUtilitiesStrings.text */ Any
      ] = js.undefined
  }
  object AsyncPlaceholder {
    
    inline def apply(): AsyncPlaceholder = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AsyncPlaceholder]
    }
    
    extension [Self <: AsyncPlaceholder](x: Self) {
      
      inline def setAsyncPlaceholder(
        value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 177, starting with typingsJapgolly.uifabricUtilities.uifabricUtilitiesStrings.symbol, typingsJapgolly.uifabricUtilities.uifabricUtilitiesStrings.`object`, typingsJapgolly.uifabricUtilities.uifabricUtilitiesStrings.text */ Any
      ): Self = StObject.set(x, "asyncPlaceholder", value.asInstanceOf[js.Any])
      
      inline def setAsyncPlaceholderUndefined: Self = StObject.set(x, "asyncPlaceholder", js.undefined)
    }
  }
  
  trait CachedInputs[TStyleProps, TStyleSet] extends StObject {
    
    /** Cache for all style functions. */
    var __cachedInputs__ : js.Array[js.UndefOr[IStyleFunctionOrObject[TStyleProps, TStyleSet]]]
    
    /** True if no styles prop or styles from Customizer is passed to wrapped component. */
    var __noStyleOverride__ : Boolean
  }
  object CachedInputs {
    
    inline def apply[TStyleProps, TStyleSet](
      __cachedInputs__ : js.Array[js.UndefOr[IStyleFunctionOrObject[TStyleProps, TStyleSet]]],
      __noStyleOverride__ : Boolean
    ): CachedInputs[TStyleProps, TStyleSet] = {
      val __obj = js.Dynamic.literal(__cachedInputs__ = __cachedInputs__.asInstanceOf[js.Any], __noStyleOverride__ = __noStyleOverride__.asInstanceOf[js.Any])
      __obj.asInstanceOf[CachedInputs[TStyleProps, TStyleSet]]
    }
    
    extension [Self <: CachedInputs[?, ?], TStyleProps, TStyleSet](x: Self & (CachedInputs[TStyleProps, TStyleSet])) {
      
      inline def set__cachedInputs__(value: js.Array[js.UndefOr[IStyleFunctionOrObject[TStyleProps, TStyleSet]]]): Self = StObject.set(x, "__cachedInputs__", value.asInstanceOf[js.Any])
      
      inline def set__cachedInputs__Varargs(value: (js.UndefOr[IStyleFunctionOrObject[TStyleProps, TStyleSet]])*): Self = StObject.set(x, "__cachedInputs__", js.Array(value*))
      
      inline def set__noStyleOverride__(value: Boolean): Self = StObject.set(x, "__noStyleOverride__", value.asInstanceOf[js.Any])
    }
  }
  
  trait Configurable[T /* <: js.Function */] extends StObject {
    
    var configurable: Boolean
    
    def get(): T
  }
  object Configurable {
    
    inline def apply[T /* <: js.Function */](configurable: Boolean, get: CallbackTo[T]): Configurable[T] = {
      val __obj = js.Dynamic.literal(configurable = configurable.asInstanceOf[js.Any], get = get.toJsFn)
      __obj.asInstanceOf[Configurable[T]]
    }
    
    extension [Self <: Configurable[?], T /* <: js.Function */](x: Self & Configurable[T]) {
      
      inline def setConfigurable(value: Boolean): Self = StObject.set(x, "configurable", value.asInstanceOf[js.Any])
      
      inline def setGet(value: CallbackTo[T]): Self = StObject.set(x, "get", value.toJsFn)
    }
  }
  
  trait DefaultRender[T] extends StObject {
    
    var defaultRender: js.UndefOr[ComponentType[T]] = js.undefined
  }
  object DefaultRender {
    
    inline def apply[T](): DefaultRender[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DefaultRender[T]]
    }
    
    extension [Self <: DefaultRender[?], T](x: Self & DefaultRender[T]) {
      
      inline def setDefaultRender(value: ComponentType[T]): Self = StObject.set(x, "defaultRender", value.asInstanceOf[js.Any])
      
      inline def setDefaultRenderUndefined: Self = StObject.set(x, "defaultRender", js.undefined)
    }
  }
  
  trait Delay extends StObject {
    
    var delay: Double
  }
  object Delay {
    
    inline def apply(delay: Double): Delay = {
      val __obj = js.Dynamic.literal(delay = delay.asInstanceOf[js.Any])
      __obj.asInstanceOf[Delay]
    }
    
    extension [Self <: Delay](x: Self) {
      
      inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(nextElement: Element): ReactTestRenderer = js.native
    def apply(nextElement: Element, options: TestRendererOptions): ReactTestRenderer = js.native
  }
  
  trait Focus extends StObject {
    
    def focus(): Unit
  }
  object Focus {
    
    inline def apply(focus: Callback): Focus = {
      val __obj = js.Dynamic.literal(focus = focus.toJsFn)
      __obj.asInstanceOf[Focus]
    }
    
    extension [Self <: Focus](x: Self) {
      
      inline def setFocus(value: Callback): Self = StObject.set(x, "focus", value.toJsFn)
    }
  }
  
  trait Leading extends StObject {
    
    var leading: js.UndefOr[Boolean] = js.undefined
    
    var trailing: js.UndefOr[Boolean] = js.undefined
  }
  object Leading {
    
    inline def apply(): Leading = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Leading]
    }
    
    extension [Self <: Leading](x: Self) {
      
      inline def setLeading(value: Boolean): Self = StObject.set(x, "leading", value.asInstanceOf[js.Any])
      
      inline def setLeadingUndefined: Self = StObject.set(x, "leading", js.undefined)
      
      inline def setTrailing(value: Boolean): Self = StObject.set(x, "trailing", value.asInstanceOf[js.Any])
      
      inline def setTrailingUndefined: Self = StObject.set(x, "trailing", js.undefined)
    }
  }
  
  trait MaxWait extends StObject {
    
    var leading: js.UndefOr[Boolean] = js.undefined
    
    var maxWait: js.UndefOr[Double] = js.undefined
    
    var trailing: js.UndefOr[Boolean] = js.undefined
  }
  object MaxWait {
    
    inline def apply(): MaxWait = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MaxWait]
    }
    
    extension [Self <: MaxWait](x: Self) {
      
      inline def setLeading(value: Boolean): Self = StObject.set(x, "leading", value.asInstanceOf[js.Any])
      
      inline def setLeadingUndefined: Self = StObject.set(x, "leading", js.undefined)
      
      inline def setMaxWait(value: Double): Self = StObject.set(x, "maxWait", value.asInstanceOf[js.Any])
      
      inline def setMaxWaitUndefined: Self = StObject.set(x, "maxWait", js.undefined)
      
      inline def setTrailing(value: Boolean): Self = StObject.set(x, "trailing", value.asInstanceOf[js.Any])
      
      inline def setTrailingUndefined: Self = StObject.set(x, "trailing", js.undefined)
    }
  }
  
  /* Inlined std.Readonly<@uifabric/utilities.@uifabric/utilities/lib/customizations/CustomizerContext.ICustomizerContext> */
  trait ReadonlyICustomizerContex extends StObject {
    
    val customizations: ICustomizations
  }
  object ReadonlyICustomizerContex {
    
    inline def apply(customizations: ICustomizations): ReadonlyICustomizerContex = {
      val __obj = js.Dynamic.literal(customizations = customizations.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReadonlyICustomizerContex]
    }
    
    extension [Self <: ReadonlyICustomizerContex](x: Self) {
      
      inline def setCustomizations(value: ICustomizations): Self = StObject.set(x, "customizations", value.asInstanceOf[js.Any])
    }
  }
  
  trait RootRef extends StObject {
    
    var rootRef: js.UndefOr[RefHandle[HTMLElement]] = js.undefined
  }
  object RootRef {
    
    inline def apply(): RootRef = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RootRef]
    }
    
    extension [Self <: RootRef](x: Self) {
      
      inline def setRootRef(value: RefHandle[HTMLElement]): Self = StObject.set(x, "rootRef", value.asInstanceOf[js.Any])
      
      inline def setRootRefUndefined: Self = StObject.set(x, "rootRef", js.undefined)
    }
  }
  
  trait Rtl extends StObject {
    
    var rtl: js.UndefOr[Boolean] = js.undefined
  }
  object Rtl {
    
    inline def apply(): Rtl = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Rtl]
    }
    
    extension [Self <: Rtl](x: Self) {
      
      inline def setRtl(value: Boolean): Self = StObject.set(x, "rtl", value.asInstanceOf[js.Any])
      
      inline def setRtlUndefined: Self = StObject.set(x, "rtl", js.undefined)
    }
  }
}
