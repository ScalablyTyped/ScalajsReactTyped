package typingsJapgolly.linguiReact

import japgolly.scalajs.react.facade.React.Element
import typingsJapgolly.linguiReact.cjsI18nProviderMod.I18nContext
import typingsJapgolly.linguiReact.cjsI18nProviderMod.I18nProviderProps
import typingsJapgolly.linguiReact.cjsI18nProviderMod.withI18nProps
import typingsJapgolly.linguiReact.cjsTransMod.TransProps
import typingsJapgolly.linguiReact.linguiReactStrings.i18n
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.FunctionComponent
import typingsJapgolly.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@lingui/react", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@lingui/react", "I18nProvider")
  @js.native
  val I18nProvider: FunctionComponent[I18nProviderProps] = js.native
  
  inline def Trans(props: TransProps): Element | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("Trans")(props.asInstanceOf[js.Any]).asInstanceOf[Element | Null]
  
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
}
