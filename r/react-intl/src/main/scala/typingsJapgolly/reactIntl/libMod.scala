package typingsJapgolly.reactIntl

import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.Context
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.PropsWithoutRef
import typingsJapgolly.react.mod.Provider
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.reactIntl.htmlMessageMod.default
import typingsJapgolly.reactIntl.injectIntlMod.Opts
import typingsJapgolly.reactIntl.injectIntlMod.WithIntlProps
import typingsJapgolly.reactIntl.injectIntlMod.WrappedComponentProps
import typingsJapgolly.reactIntl.providerMod.OptionalIntlConfig
import typingsJapgolly.reactIntl.reactIntlBooleans.`false`
import typingsJapgolly.reactIntl.reactIntlBooleans.`true`
import typingsJapgolly.reactIntl.relativeMod.Props
import typingsJapgolly.reactIntl.relativeMod.State
import typingsJapgolly.reactIntl.typesMod.FormatNumberOptions
import typingsJapgolly.reactIntl.typesMod.IntlCache
import typingsJapgolly.reactIntl.typesMod.IntlShape
import typingsJapgolly.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-intl/lib", JSImport.Namespace)
@js.native
object libMod extends js.Object {
  @js.native
  class FormattedHTMLMessage () extends default
  
  @js.native
  class FormattedMessage[V /* <: Record[String, _] */] ()
    extends typingsJapgolly.reactIntl.messageMod.default[V]
  
  @js.native
  class FormattedRelativeTime protected ()
    extends typingsJapgolly.reactIntl.relativeMod.default {
    def this(props: Props) = this()
  }
  
  @js.native
  class IntlProvider ()
    extends typingsJapgolly.reactIntl.providerMod.default
  
  val FormattedDate: FC[DateTimeFormatOptionsCust] = js.native
  val FormattedDateParts: FC[DateTimeFormatOptionsCustChildren] = js.native
  val FormattedDisplayName: FC[DisplayNamesOptionsvalues] = js.native
  val FormattedList: FC[IntlListFormatOptionsvalu] = js.native
  val FormattedNumber: FC[UnifiedNumberFormatOption] = js.native
  val FormattedNumberParts: FC[FormatNumberOptions with AnonChildren] = js.native
  val FormattedTime: FC[DateTimeFormatOptionsCust] = js.native
  val FormattedTimeParts: FC[DateTimeFormatOptionsCustChildren] = js.native
  val IntlContext: Context[IntlShape] = js.native
  val RawIntlProvider: Provider[IntlShape] = js.native
  def createIntl(config: OptionalIntlConfig): IntlShape = js.native
  def createIntl(config: OptionalIntlConfig, cache: IntlCache): IntlShape = js.native
  def createIntlCache(): IntlCache = js.native
  def defineMessages[T, U /* <: Record[String, T] */](msgs: U): U = js.native
  def injectIntl[IntlPropName /* <: String */, P /* <: WrappedComponentProps[IntlPropName] */](WrappedComponent: ComponentType[P]): FC[WithIntlProps[P]] with AnonWrappedComponent[P] = js.native
  @JSName("injectIntl")
  def injectIntl_IntlPropName_StringP_WrappedComponentPropsIntlPropNameT_ComponentTypeP[IntlPropName /* <: String */, P /* <: WrappedComponentProps[IntlPropName] */, T /* <: ComponentType[P] */](WrappedComponent: ComponentType[P]): (ForwardRefExoticComponent[PropsWithoutRef[WithIntlProps[P]] with RefAttributes[T]]) with AnonWrappedComponent[P] = js.native
  @JSName("injectIntl")
  def injectIntl_false[IntlPropName /* <: String */, P /* <: WrappedComponentProps[IntlPropName] */](WrappedComponent: ComponentType[P], options: Opts[IntlPropName, `false`]): FC[WithIntlProps[P]] with AnonWrappedComponent[P] = js.native
  @JSName("injectIntl")
  def injectIntl_true[IntlPropName /* <: String */, P /* <: WrappedComponentProps[IntlPropName] */, T /* <: ComponentType[P] */](WrappedComponent: ComponentType[P], options: Opts[IntlPropName, `true`]): (ForwardRefExoticComponent[PropsWithoutRef[WithIntlProps[P]] with RefAttributes[T]]) with AnonWrappedComponent[P] = js.native
  def useIntl(): IntlShape = js.native
  /* static members */
  @js.native
  object FormattedHTMLMessage extends js.Object {
    var defaultProps: AnonTagName = js.native
    var displayName: String = js.native
  }
  
  /* static members */
  @js.native
  object FormattedMessage extends js.Object {
    var defaultProps: AnonValues = js.native
    var displayName: String = js.native
  }
  
  @js.native
  object FormattedPlural extends js.Object {
    @JSName("$$typeof")
    val DollarDollartypeof: js.Symbol = js.native
    var WrappedComponent: ComponentType[typingsJapgolly.reactIntl.pluralMod.Props] = js.native
    var defaultProps: js.UndefOr[PartialPickPropschildreno] = js.native
    var displayName: js.UndefOr[String] = js.native
    var propTypes: js.UndefOr[WeakValidationMapPickProp] = js.native
    /**
      * **NOTE**: Exotic components are not callable.
      */
    def apply(props: PickPropschildrenotherzer): Element | Null = js.native
  }
  
  /* static members */
  @js.native
  object FormattedRelativeTime extends js.Object {
    var defaultProps: PickPropsunitvalue = js.native
    var displayName: String = js.native
    def getDerivedStateFromProps(props: Props, state: State): PartialStateCurrentValueInSeconds | Null = js.native
  }
  
  /* static members */
  @js.native
  object IntlProvider extends js.Object {
    var defaultProps: PickIntlConfigformatsmess = js.native
    var displayName: String = js.native
    def getDerivedStateFromProps(props: OptionalIntlConfig, hasPrevConfigCache: typingsJapgolly.reactIntl.providerMod.State): PartialState | Null = js.native
  }
  
}

