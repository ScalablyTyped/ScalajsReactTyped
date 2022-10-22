package typingsJapgolly.reactIntl.components

import japgolly.scalajs.react.facade.React.Element
import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.formatjsIntlListformat.mod.Part
import typingsJapgolly.reactIntl.anon.ChildrenValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FormattedListParts {
  
  inline def apply(
    children: js.Array[Part[String]] => Element | Null,
    value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<react-intl.react-intl/src/types.IntlShape['formatList']>[0] */ js.Any
  ): Default[js.Object] = {
    val __props = js.Dynamic.literal(children = js.Any.fromFunction1(children), value = value.asInstanceOf[js.Any])
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[(/* import warning: importer.ImportType#apply Failed type conversion: react-intl.react-intl/src/components/createFormattedComponent.Formatter['formatList'] */ js.Any) & ChildrenValue]))
  }
  
  @JSImport("react-intl", "FormattedListParts")
  @js.native
  val component: js.Object = js.native
  
  def withProps(
    p: (/* import warning: importer.ImportType#apply Failed type conversion: react-intl.react-intl/src/components/createFormattedComponent.Formatter['formatList'] */ js.Any) & ChildrenValue
  ): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
