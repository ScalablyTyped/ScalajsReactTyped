package typingsJapgolly.reactIntl.components

import japgolly.scalajs.react.facade.React.Element
import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.reactIntl.anon.`0`
import typingsJapgolly.std.Intl.NumberFormatPart
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FormattedNumberParts {
  
  inline def apply(
    children: js.Array[NumberFormatPart] => Element | Null,
    value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<react-intl.react-intl/src/types.IntlShape['formatNumber']>[0] */ js.Any
  ): Default[js.Object] = {
    val __props = js.Dynamic.literal(children = js.Any.fromFunction1(children), value = value.asInstanceOf[js.Any])
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[(/* import warning: importer.ImportType#apply Failed type conversion: react-intl.react-intl/src/components/createFormattedComponent.Formatter['formatNumber'] */ js.Any) & `0`]))
  }
  
  @JSImport("react-intl", "FormattedNumberParts")
  @js.native
  val component: js.Object = js.native
  
  def withProps(
    p: (/* import warning: importer.ImportType#apply Failed type conversion: react-intl.react-intl/src/components/createFormattedComponent.Formatter['formatNumber'] */ js.Any) & `0`
  ): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
