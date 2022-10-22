package typingsJapgolly.reactIntl.components

import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactIntl.anon.IntlListFormatOptionsvalu
import typingsJapgolly.reactIntl.reactIntlStrings.`best fit`
import typingsJapgolly.reactIntl.reactIntlStrings.conjunction
import typingsJapgolly.reactIntl.reactIntlStrings.disjunction
import typingsJapgolly.reactIntl.reactIntlStrings.long
import typingsJapgolly.reactIntl.reactIntlStrings.lookup
import typingsJapgolly.reactIntl.reactIntlStrings.narrow
import typingsJapgolly.reactIntl.reactIntlStrings.short
import typingsJapgolly.reactIntl.reactIntlStrings.unit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FormattedList {
  
  inline def apply(value: js.Array[Node]): Builder = {
    val __props = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[IntlListFormatOptionsvalu]))
  }
  
  @JSImport("react-intl", "FormattedList")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def localeMatcher(value: (`best fit`) | lookup): this.type = set("localeMatcher", value.asInstanceOf[js.Any])
    
    inline def style(value: long | short | narrow): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def `type`(value: conjunction | disjunction | unit): this.type = set("type", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: IntlListFormatOptionsvalu): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
