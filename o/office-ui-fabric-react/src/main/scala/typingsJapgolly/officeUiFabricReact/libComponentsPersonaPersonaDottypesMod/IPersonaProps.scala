package typingsJapgolly.officeUiFabricReact.libComponentsPersonaPersonaDottypesMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.uifabricMergeStyles.libDeepPartialMod.DeepPartial
import typingsJapgolly.uifabricMergeStyles.libIstylefunctionMod.IStyleFunctionOrObject
import typingsJapgolly.uifabricUtilities.libCreateRefMod.IRefObject
import typingsJapgolly.uifabricUtilities.libIrenderfunctionMod.IRenderFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPersonaProps
  extends StObject
     with IPersonaSharedProps {
  
  /**
    * Optional callback to access the IPersona interface. Use this instead of ref for accessing
    * the public methods and properties of the component.
    */
  var componentRef: js.UndefOr[IRefObject[IPersona]] = js.undefined
  
  /**
    * Optional custom renderer for the optional text.
    */
  var onRenderOptionalText: js.UndefOr[IRenderFunction[IPersonaProps]] = js.undefined
  
  /**
    * Optional custom renderer for the primary text.
    */
  var onRenderPrimaryText: js.UndefOr[IRenderFunction[IPersonaProps]] = js.undefined
  
  /**
    * Optional custom renderer for the secondary text.
    */
  var onRenderSecondaryText: js.UndefOr[IRenderFunction[IPersonaProps]] = js.undefined
  
  /**
    * Optional custom renderer for the tertiary text.
    */
  var onRenderTertiaryText: js.UndefOr[IRenderFunction[IPersonaProps]] = js.undefined
  
  /**
    * Call to provide customized styling that will layer on top of variant rules
    */
  var styles: js.UndefOr[IStyleFunctionOrObject[IPersonaStyleProps, IPersonaStyles]] = js.undefined
}
object IPersonaProps {
  
  inline def apply(): IPersonaProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPersonaProps]
  }
  
  extension [Self <: IPersonaProps](x: Self) {
    
    inline def setComponentRef(value: IRefObject[IPersona]): Self = StObject.set(x, "componentRef", value.asInstanceOf[js.Any])
    
    inline def setComponentRefFunction1(value: /* ref */ IPersona | Null => Callback): Self = StObject.set(x, "componentRef", js.Any.fromFunction1((t0: /* ref */ IPersona | Null) => value(t0).runNow()))
    
    inline def setComponentRefUndefined: Self = StObject.set(x, "componentRef", js.undefined)
    
    inline def setOnRenderOptionalText(
      value: (/* props */ js.UndefOr[IPersonaProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IPersonaProps], Element | Null]]) => Element | Null
    ): Self = StObject.set(x, "onRenderOptionalText", js.Any.fromFunction2(value))
    
    inline def setOnRenderOptionalTextUndefined: Self = StObject.set(x, "onRenderOptionalText", js.undefined)
    
    inline def setOnRenderPrimaryText(
      value: (/* props */ js.UndefOr[IPersonaProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IPersonaProps], Element | Null]]) => Element | Null
    ): Self = StObject.set(x, "onRenderPrimaryText", js.Any.fromFunction2(value))
    
    inline def setOnRenderPrimaryTextUndefined: Self = StObject.set(x, "onRenderPrimaryText", js.undefined)
    
    inline def setOnRenderSecondaryText(
      value: (/* props */ js.UndefOr[IPersonaProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IPersonaProps], Element | Null]]) => Element | Null
    ): Self = StObject.set(x, "onRenderSecondaryText", js.Any.fromFunction2(value))
    
    inline def setOnRenderSecondaryTextUndefined: Self = StObject.set(x, "onRenderSecondaryText", js.undefined)
    
    inline def setOnRenderTertiaryText(
      value: (/* props */ js.UndefOr[IPersonaProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IPersonaProps], Element | Null]]) => Element | Null
    ): Self = StObject.set(x, "onRenderTertiaryText", js.Any.fromFunction2(value))
    
    inline def setOnRenderTertiaryTextUndefined: Self = StObject.set(x, "onRenderTertiaryText", js.undefined)
    
    inline def setStyles(value: IStyleFunctionOrObject[IPersonaStyleProps, IPersonaStyles]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    inline def setStylesFunction1(value: IPersonaStyleProps => DeepPartial[IPersonaStyles]): Self = StObject.set(x, "styles", js.Any.fromFunction1(value))
    
    inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
  }
}
