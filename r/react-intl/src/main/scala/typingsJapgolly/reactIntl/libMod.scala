package typingsJapgolly.reactIntl

import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.intlMessageformat.srcFormattersMod.FormatXMLElementFn
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.Context
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.NamedExoticComponent
import typingsJapgolly.react.mod.PropsWithChildren
import typingsJapgolly.react.mod.PropsWithoutRef
import typingsJapgolly.react.mod.Provider
import typingsJapgolly.react.mod.ReactFragment
import typingsJapgolly.react.mod.ReactPortal
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.reactIntl.anon.Children
import typingsJapgolly.reactIntl.anon.DisplayNamesOptionsvalues
import typingsJapgolly.reactIntl.anon.IntlListFormatOptionsvalu
import typingsJapgolly.reactIntl.anon.OmitNumberFormatOptionslo
import typingsJapgolly.reactIntl.anon.PartialStateCache
import typingsJapgolly.reactIntl.anon.PickResolvedIntlConfigonE
import typingsJapgolly.reactIntl.anon.Value
import typingsJapgolly.reactIntl.anon.ValueNumber
import typingsJapgolly.reactIntl.anon.WrappedComponentComponentType
import typingsJapgolly.reactIntl.anon.`1`
import typingsJapgolly.reactIntl.anon.`2`
import typingsJapgolly.reactIntl.libSrcComponentsDateTimeRangeMod.Props
import typingsJapgolly.reactIntl.libSrcComponentsInjectIntlMod.Opts
import typingsJapgolly.reactIntl.libSrcComponentsInjectIntlMod.WithIntlProps
import typingsJapgolly.reactIntl.libSrcComponentsInjectIntlMod.WrappedComponentProps
import typingsJapgolly.reactIntl.libSrcComponentsProviderMod.State
import typingsJapgolly.reactIntl.libSrcComponentsProviderMod.default
import typingsJapgolly.reactIntl.libSrcTypesMod.IntlConfig
import typingsJapgolly.reactIntl.libSrcTypesMod.IntlShape
import typingsJapgolly.reactIntl.reactIntlBooleans.`true`
import typingsJapgolly.std.Intl.DateTimeFormatOptions
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMod {
  
  @JSImport("react-intl/lib", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-intl/lib", "FormattedDate")
  @js.native
  val FormattedDate: FC[
    DateTimeFormatOptions & (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CustomFormatConfig */ Any) & Children
  ] = js.native
  
  @JSImport("react-intl/lib", "FormattedDateParts")
  @js.native
  val FormattedDateParts: FC[
    (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FormatDateOptions */ Any) & Value
  ] = js.native
  
  @JSImport("react-intl/lib", "FormattedDateTimeRange")
  @js.native
  val FormattedDateTimeRange: FC[Props] = js.native
  
  @JSImport("react-intl/lib", "FormattedDisplayName")
  @js.native
  val FormattedDisplayName: FC[DisplayNamesOptionsvalues] = js.native
  
  @JSImport("react-intl/lib", "FormattedList")
  @js.native
  val FormattedList: FC[IntlListFormatOptionsvalu] = js.native
  
  @JSImport("react-intl/lib", "FormattedListParts")
  @js.native
  val FormattedListParts: FC[
    (/* import warning: importer.ImportType#apply Failed type conversion: react-intl.react-intl/lib/src/components/createFormattedComponent.Formatter['formatList'] */ js.Any) & `1`
  ] = js.native
  
  @JSImport("react-intl/lib", "FormattedMessage")
  @js.native
  val FormattedMessage: NamedExoticComponent[
    typingsJapgolly.reactIntl.libSrcComponentsMessageMod.Props[
      Record[
        String, 
        js.UndefOr[
          String | Double | Boolean | Element | ReactFragment | ReactPortal | js.Date | (FormatXMLElementFn[Node, Node]) | Null
        ]
      ]
    ]
  ] = js.native
  
  @JSImport("react-intl/lib", "FormattedNumber")
  @js.native
  val FormattedNumber: FC[
    OmitNumberFormatOptionslo & (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CustomFormatConfig<'number'> */ Any) & ValueNumber
  ] = js.native
  
  @JSImport("react-intl/lib", "FormattedNumberParts")
  @js.native
  val FormattedNumberParts: FC[
    (/* import warning: importer.ImportType#apply Failed type conversion: react-intl.react-intl/lib/src/components/createFormattedComponent.Formatter['formatNumber'] */ js.Any) & `2`
  ] = js.native
  
  @JSImport("react-intl/lib", "FormattedPlural")
  @js.native
  val FormattedPlural: FC[typingsJapgolly.reactIntl.libSrcComponentsPluralMod.Props] = js.native
  
  @JSImport("react-intl/lib", "FormattedRelativeTime")
  @js.native
  val FormattedRelativeTime: FC[typingsJapgolly.reactIntl.libSrcComponentsRelativeMod.Props] = js.native
  
  @JSImport("react-intl/lib", "FormattedTime")
  @js.native
  val FormattedTime: FC[
    DateTimeFormatOptions & (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CustomFormatConfig */ Any) & Children
  ] = js.native
  
  @JSImport("react-intl/lib", "FormattedTimeParts")
  @js.native
  val FormattedTimeParts: FC[
    (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FormatDateOptions */ Any) & Value
  ] = js.native
  
  @JSImport("react-intl/lib", "IntlContext")
  @js.native
  val IntlContext: Context[IntlShape] = js.native
  
  @JSImport("react-intl/lib", "IntlProvider")
  @js.native
  open class IntlProvider () extends default
  /* static members */
  object IntlProvider {
    
    @JSImport("react-intl/lib", "IntlProvider")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-intl/lib", "IntlProvider.defaultProps")
    @js.native
    def defaultProps: PickResolvedIntlConfigonE = js.native
    inline def defaultProps_=(x: PickResolvedIntlConfigonE): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("react-intl/lib", "IntlProvider.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    inline def getDerivedStateFromProps(props: IntlConfig, hasPrevConfigCache: State): PartialStateCache | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getDerivedStateFromProps")(props.asInstanceOf[js.Any], hasPrevConfigCache.asInstanceOf[js.Any])).asInstanceOf[PartialStateCache | Null]
  }
  
  @JSImport("react-intl/lib", "RawIntlProvider")
  @js.native
  val RawIntlProvider: Provider[IntlShape] = js.native
  
  @JSImport("react-intl/lib", "createIntl")
  @js.native
  val createIntl: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CreateIntlFn<React.ReactNode, IntlConfig, IntlShape> */ Any = js.native
  
  inline def defineMessage[T /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MessageDescriptor */ Any */](msg: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("defineMessage")(msg.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def defineMessages[K /* <: /* keyof any */ String */, T, U /* <: Record[K, T] */](msgs: U): U = ^.asInstanceOf[js.Dynamic].applyDynamic("defineMessages")(msgs.asInstanceOf[js.Any]).asInstanceOf[U]
  
  inline def injectIntl[IntlPropName /* <: String */, P /* <: WrappedComponentProps[IntlPropName] */, T /* <: ComponentType[P] */](WrappedComponent: ComponentType[P]): (ForwardRefExoticComponent[PropsWithoutRef[WithIntlProps[PropsWithChildren[P]]] & RefAttributes[T]]) & (WrappedComponentComponentType[P, IntlPropName]) = ^.asInstanceOf[js.Dynamic].applyDynamic("injectIntl")(WrappedComponent.asInstanceOf[js.Any]).asInstanceOf[(ForwardRefExoticComponent[PropsWithoutRef[WithIntlProps[PropsWithChildren[P]]] & RefAttributes[T]]) & (WrappedComponentComponentType[P, IntlPropName])]
  
  inline def injectIntl_true[IntlPropName /* <: String */, P /* <: WrappedComponentProps[IntlPropName] */, T /* <: ComponentType[P] */](WrappedComponent: ComponentType[P], options: Opts[IntlPropName, `true`]): (ForwardRefExoticComponent[PropsWithoutRef[WithIntlProps[PropsWithChildren[P]]] & RefAttributes[T]]) & (WrappedComponentComponentType[P, IntlPropName]) = (^.asInstanceOf[js.Dynamic].applyDynamic("injectIntl")(WrappedComponent.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[(ForwardRefExoticComponent[PropsWithoutRef[WithIntlProps[PropsWithChildren[P]]] & RefAttributes[T]]) & (WrappedComponentComponentType[P, IntlPropName])]
  
  inline def useIntl(): IntlShape = ^.asInstanceOf[js.Dynamic].applyDynamic("useIntl")().asInstanceOf[IntlShape]
}
