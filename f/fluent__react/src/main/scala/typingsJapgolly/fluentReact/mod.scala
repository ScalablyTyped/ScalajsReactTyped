package typingsJapgolly.fluentReact

import japgolly.scalajs.react.facade.React.Element
import typingsJapgolly.fluentBundle.mod.FluentBundle
import typingsJapgolly.fluentReact.esmLocalizedMod.LocalizedProps
import typingsJapgolly.fluentReact.esmMarkupMod.MarkupParser
import typingsJapgolly.fluentReact.esmProviderMod.LocalizationProviderProps
import typingsJapgolly.fluentReact.esmWithLocalizationMod.WithLocalizationProps
import typingsJapgolly.fluentReact.esmWithLocalizationMod.WithoutLocalizationProps
import typingsJapgolly.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@fluent/react", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def LocalizationProvider(props: LocalizationProviderProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("LocalizationProvider")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def Localized(props: LocalizedProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Localized")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@fluent/react", "ReactLocalization")
  @js.native
  open class ReactLocalization protected ()
    extends typingsJapgolly.fluentReact.esmLocalizationMod.ReactLocalization {
    def this(bundles: js.Iterable[FluentBundle]) = this()
    def this(bundles: js.Iterable[FluentBundle], parseMarkup: MarkupParser) = this()
  }
  
  @JSImport("@fluent/react", "useLocalization")
  @js.native
  val useLocalization: typingsJapgolly.fluentReact.esmUseLocalizationMod.useLocalization = js.native
  
  inline def withLocalization[P /* <: WithLocalizationProps */](Inner: ComponentType[P]): ComponentType[WithoutLocalizationProps[P]] = ^.asInstanceOf[js.Dynamic].applyDynamic("withLocalization")(Inner.asInstanceOf[js.Any]).asInstanceOf[ComponentType[WithoutLocalizationProps[P]]]
}
