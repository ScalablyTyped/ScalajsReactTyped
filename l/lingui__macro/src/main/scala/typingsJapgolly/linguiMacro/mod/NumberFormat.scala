package typingsJapgolly.linguiMacro.mod

import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.linguiMacro.createFormatMod.FormatPropsWithoutI18n
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.ComponentClass
import typingsJapgolly.react.mod.ComponentState
import typingsJapgolly.std.Intl.NumberFormatOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@lingui/macro", "NumberFormat")
@js.native
class NumberFormat protected ()
  extends Component[FormatPropsWithoutI18n[Double, NumberFormatOptions], ComponentState, js.Any] {
  def this(props: FormatPropsWithoutI18n[Double, NumberFormatOptions]) = this()
  def this(props: FormatPropsWithoutI18n[Double, NumberFormatOptions], context: js.Any) = this()
}

@JSImport("@lingui/macro", "NumberFormat")
@js.native
object NumberFormat extends TopLevel[
      ComponentClass[FormatPropsWithoutI18n[Double, NumberFormatOptions], ComponentState]
    ]

