package typingsJapgolly.enzymeReactIntl

import japgolly.scalajs.react.facade.React.Component
import japgolly.scalajs.react.facade.React.Element
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.enzyme.mod.MountRendererProps
import typingsJapgolly.enzyme.mod.ReactWrapper
import typingsJapgolly.enzyme.mod.ShallowRendererProps
import typingsJapgolly.enzyme.mod.ShallowWrapper
import typingsJapgolly.reactIntl.mod.IntlProvider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("enzyme-react-intl", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getIntl(): IntlProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("getIntl")().asInstanceOf[IntlProvider]
  
  inline def getLocale(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getLocale")().asInstanceOf[String]
  
  inline def loadTranslation(translationFilePath: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("loadTranslation")(translationFilePath.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def loadTranslationObject[T /* <: StringDictionary[String] */](translations: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("loadTranslationObject")(translations.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def mountWithIntl[P](node: Element): ReactWrapper[P, Any, Component[js.Object, js.Object]] = ^.asInstanceOf[js.Dynamic].applyDynamic("mountWithIntl")(node.asInstanceOf[js.Any]).asInstanceOf[ReactWrapper[P, Any, Component[js.Object, js.Object]]]
  inline def mountWithIntl[P](node: Element, options: MountRendererProps): ReactWrapper[P, Any, Component[js.Object, js.Object]] = (^.asInstanceOf[js.Dynamic].applyDynamic("mountWithIntl")(node.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ReactWrapper[P, Any, Component[js.Object, js.Object]]]
  
  inline def mountWithIntl_CPS[C /* <: Component[js.Object, js.Object] */, P, S](node: Element): ReactWrapper[P, S, C] = ^.asInstanceOf[js.Dynamic].applyDynamic("mountWithIntl")(node.asInstanceOf[js.Any]).asInstanceOf[ReactWrapper[P, S, C]]
  inline def mountWithIntl_CPS[C /* <: Component[js.Object, js.Object] */, P, S](node: Element, options: MountRendererProps): ReactWrapper[P, S, C] = (^.asInstanceOf[js.Dynamic].applyDynamic("mountWithIntl")(node.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ReactWrapper[P, S, C]]
  
  inline def mountWithIntl_PS[P, S](node: Element): ReactWrapper[P, S, Component[js.Object, js.Object]] = ^.asInstanceOf[js.Dynamic].applyDynamic("mountWithIntl")(node.asInstanceOf[js.Any]).asInstanceOf[ReactWrapper[P, S, Component[js.Object, js.Object]]]
  inline def mountWithIntl_PS[P, S](node: Element, options: MountRendererProps): ReactWrapper[P, S, Component[js.Object, js.Object]] = (^.asInstanceOf[js.Dynamic].applyDynamic("mountWithIntl")(node.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ReactWrapper[P, S, Component[js.Object, js.Object]]]
  
  inline def renderWithIntl[P, S](node: Element): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("renderWithIntl")(node.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def renderWithIntl[P, S](node: Element, options: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("renderWithIntl")(node.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def setLocale(locale: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setLocale")(locale.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def shallowWithIntl[P](node: Element): ShallowWrapper[P, Any, Component[js.Object, js.Object]] = ^.asInstanceOf[js.Dynamic].applyDynamic("shallowWithIntl")(node.asInstanceOf[js.Any]).asInstanceOf[ShallowWrapper[P, Any, Component[js.Object, js.Object]]]
  inline def shallowWithIntl[P](node: Element, options: ShallowRendererProps): ShallowWrapper[P, Any, Component[js.Object, js.Object]] = (^.asInstanceOf[js.Dynamic].applyDynamic("shallowWithIntl")(node.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ShallowWrapper[P, Any, Component[js.Object, js.Object]]]
  
  inline def shallowWithIntl_CPS[C /* <: Component[js.Object, js.Object] */, P, S](node: Element): ShallowWrapper[P, S, C] = ^.asInstanceOf[js.Dynamic].applyDynamic("shallowWithIntl")(node.asInstanceOf[js.Any]).asInstanceOf[ShallowWrapper[P, S, C]]
  inline def shallowWithIntl_CPS[C /* <: Component[js.Object, js.Object] */, P, S](node: Element, options: ShallowRendererProps): ShallowWrapper[P, S, C] = (^.asInstanceOf[js.Dynamic].applyDynamic("shallowWithIntl")(node.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ShallowWrapper[P, S, C]]
  
  inline def shallowWithIntl_PS[P, S](node: Element): ShallowWrapper[P, S, Component[js.Object, js.Object]] = ^.asInstanceOf[js.Dynamic].applyDynamic("shallowWithIntl")(node.asInstanceOf[js.Any]).asInstanceOf[ShallowWrapper[P, S, Component[js.Object, js.Object]]]
  inline def shallowWithIntl_PS[P, S](node: Element, options: ShallowRendererProps): ShallowWrapper[P, S, Component[js.Object, js.Object]] = (^.asInstanceOf[js.Dynamic].applyDynamic("shallowWithIntl")(node.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ShallowWrapper[P, S, Component[js.Object, js.Object]]]
}
