package typingsJapgolly.linguiMacro.mod

import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.linguiMacro.createFormatMod.FormatPropsWithoutI18n
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.ComponentClass
import typingsJapgolly.react.mod.ComponentState
import typingsJapgolly.std.Date
import typingsJapgolly.std.Intl.DateTimeFormatOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@lingui/macro", "DateFormat")
@js.native
class DateFormat protected ()
  extends Component[FormatPropsWithoutI18n[Date, DateTimeFormatOptions], ComponentState, js.Any] {
  def this(props: FormatPropsWithoutI18n[js.Date, DateTimeFormatOptions]) = this()
  def this(props: FormatPropsWithoutI18n[js.Date, DateTimeFormatOptions], context: js.Any) = this()
}

@JSImport("@lingui/macro", "DateFormat")
@js.native
object DateFormat extends TopLevel[
      ComponentClass[FormatPropsWithoutI18n[Date, DateTimeFormatOptions], ComponentState]
    ]

