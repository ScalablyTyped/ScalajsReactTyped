package typingsJapgolly.linguiReact

import japgolly.scalajs.react.raw.React.ComponentClassP
import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.linguiReact.createFormatMod.FormatPropsWithoutI18n
import typingsJapgolly.linguiReact.i18nMod.I18nComponentProps
import typingsJapgolly.linguiReact.i18nProviderMod.I18nProviderProps
import typingsJapgolly.linguiReact.linguiReactStrings.i18n
import typingsJapgolly.linguiReact.selectMod.PluralPropsWithoutI18n
import typingsJapgolly.linguiReact.selectMod.SelectPropsWithoutI18n
import typingsJapgolly.linguiReact.transMod.TransPropsWithoutI18n
import typingsJapgolly.linguiReact.withI18nMod.ComponentConstructor
import typingsJapgolly.linguiReact.withI18nMod.withI18nOptions
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.ComponentClass
import typingsJapgolly.react.mod.ComponentState
import typingsJapgolly.std.Date
import typingsJapgolly.std.Exclude
import typingsJapgolly.std.Intl.DateTimeFormatOptions
import typingsJapgolly.std.Intl.NumberFormatOptions
import typingsJapgolly.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@lingui/react", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class DateFormat protected ()
    extends Component[FormatPropsWithoutI18n[Date, DateTimeFormatOptions], ComponentState, js.Any] {
    def this(props: FormatPropsWithoutI18n[js.Date, DateTimeFormatOptions]) = this()
    def this(props: FormatPropsWithoutI18n[js.Date, DateTimeFormatOptions], context: js.Any) = this()
  }
  
  @js.native
  class I18n ()
    extends Component[I18nComponentProps, js.Object, js.Any]
  
  @js.native
  class I18nProvider ()
    extends Component[I18nProviderProps, js.Object, js.Any]
  
  @js.native
  class NumberFormat protected ()
    extends Component[FormatPropsWithoutI18n[Double, NumberFormatOptions], ComponentState, js.Any] {
    def this(props: FormatPropsWithoutI18n[Double, NumberFormatOptions]) = this()
    def this(props: FormatPropsWithoutI18n[Double, NumberFormatOptions], context: js.Any) = this()
  }
  
  @js.native
  class Plural ()
    extends Component[PluralPropsWithoutI18n, js.Object, js.Any]
  
  @js.native
  class Select ()
    extends Component[SelectPropsWithoutI18n, js.Object, js.Any]
  
  @js.native
  class SelectOrdinal ()
    extends Component[PluralPropsWithoutI18n, js.Object, js.Any]
  
  @js.native
  class Trans ()
    extends Component[TransPropsWithoutI18n, js.Object, js.Any]
  
  def i18nMark(id: String): String = js.native
  def withI18n(): js.Function1[
    /* WrappedComponent */ ComponentConstructor[_], 
    ComponentClassP[(Pick[_, Exclude[String, i18n]]) with js.Object]
  ] = js.native
  def withI18n(options: withI18nOptions): js.Function1[
    /* WrappedComponent */ ComponentConstructor[_], 
    ComponentClassP[(Pick[_, Exclude[String, i18n]]) with js.Object]
  ] = js.native
  @js.native
  object DateFormat extends TopLevel[
          ComponentClass[FormatPropsWithoutI18n[Date, DateTimeFormatOptions], ComponentState]
        ]
  
  @js.native
  object NumberFormat extends TopLevel[
          ComponentClass[FormatPropsWithoutI18n[Double, NumberFormatOptions], ComponentState]
        ]
  
}

