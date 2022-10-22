package typingsJapgolly.linguiReact

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.linguiCore.mod.I18n_
import typingsJapgolly.linguiReact.cjsTransMod.TransRenderProps
import typingsJapgolly.linguiReact.linguiReactStrings.i18n
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.FunctionComponent
import typingsJapgolly.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cjsI18nProviderMod {
  
  @JSImport("@lingui/react/cjs/I18nProvider", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@lingui/react/cjs/I18nProvider", "I18nProvider")
  @js.native
  val I18nProvider: FunctionComponent[I18nProviderProps] = js.native
  
  inline def useLingui(): I18nContext = ^.asInstanceOf[js.Dynamic].applyDynamic("useLingui")().asInstanceOf[I18nContext]
  
  inline def withI18n(): js.Function1[
    /* Component */ ComponentType[withI18nProps], 
    ComponentType[Omit[withI18nProps, i18n]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withI18n")().asInstanceOf[js.Function1[
    /* Component */ ComponentType[withI18nProps], 
    ComponentType[Omit[withI18nProps, i18n]]
  ]]
  inline def withI18n(o: js.Object): js.Function1[
    /* Component */ ComponentType[withI18nProps], 
    ComponentType[Omit[withI18nProps, i18n]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withI18n")(o.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* Component */ ComponentType[withI18nProps], 
    ComponentType[Omit[withI18nProps, i18n]]
  ]]
  
  trait I18nContext extends StObject {
    
    var defaultComponent: js.UndefOr[ComponentType[TransRenderProps]] = js.undefined
    
    var i18n: I18n_
  }
  object I18nContext {
    
    inline def apply(i18n: I18n_): I18nContext = {
      val __obj = js.Dynamic.literal(i18n = i18n.asInstanceOf[js.Any])
      __obj.asInstanceOf[I18nContext]
    }
    
    extension [Self <: I18nContext](x: Self) {
      
      inline def setDefaultComponent(value: ComponentType[TransRenderProps]): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      inline def setDefaultComponentUndefined: Self = StObject.set(x, "defaultComponent", js.undefined)
      
      inline def setI18n(value: I18n_): Self = StObject.set(x, "i18n", value.asInstanceOf[js.Any])
    }
  }
  
  trait I18nProviderProps
    extends StObject
       with I18nContext {
    
    var children: js.UndefOr[Node] = js.undefined
    
    var forceRenderOnLocaleChange: js.UndefOr[Boolean] = js.undefined
  }
  object I18nProviderProps {
    
    inline def apply(i18n: I18n_): I18nProviderProps = {
      val __obj = js.Dynamic.literal(i18n = i18n.asInstanceOf[js.Any])
      __obj.asInstanceOf[I18nProviderProps]
    }
    
    extension [Self <: I18nProviderProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setForceRenderOnLocaleChange(value: Boolean): Self = StObject.set(x, "forceRenderOnLocaleChange", value.asInstanceOf[js.Any])
      
      inline def setForceRenderOnLocaleChangeUndefined: Self = StObject.set(x, "forceRenderOnLocaleChange", js.undefined)
    }
  }
  
  trait withI18nProps extends StObject {
    
    var i18n: I18n_
  }
  object withI18nProps {
    
    inline def apply(i18n: I18n_): withI18nProps = {
      val __obj = js.Dynamic.literal(i18n = i18n.asInstanceOf[js.Any])
      __obj.asInstanceOf[withI18nProps]
    }
    
    extension [Self <: withI18nProps](x: Self) {
      
      inline def setI18n(value: I18n_): Self = StObject.set(x, "i18n", value.asInstanceOf[js.Any])
    }
  }
}
