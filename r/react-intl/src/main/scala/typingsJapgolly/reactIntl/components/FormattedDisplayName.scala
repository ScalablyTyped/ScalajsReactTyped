package typingsJapgolly.reactIntl.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactIntl.anon.DisplayNamesOptionsvalues
import typingsJapgolly.reactIntl.reactIntlStrings.`best fit`
import typingsJapgolly.reactIntl.reactIntlStrings.code
import typingsJapgolly.reactIntl.reactIntlStrings.currency
import typingsJapgolly.reactIntl.reactIntlStrings.language
import typingsJapgolly.reactIntl.reactIntlStrings.long
import typingsJapgolly.reactIntl.reactIntlStrings.lookup
import typingsJapgolly.reactIntl.reactIntlStrings.narrow
import typingsJapgolly.reactIntl.reactIntlStrings.none
import typingsJapgolly.reactIntl.reactIntlStrings.region
import typingsJapgolly.reactIntl.reactIntlStrings.script
import typingsJapgolly.reactIntl.reactIntlStrings.short
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FormattedDisplayName {
  
  inline def apply(`type`: language | region | script | currency, value: String | Double | (Record[String, Any])): Builder = {
    val __props = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __props.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[DisplayNamesOptionsvalues]))
  }
  
  @JSImport("react-intl", "FormattedDisplayName")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def fallback(value: code | none): this.type = set("fallback", value.asInstanceOf[js.Any])
    
    inline def localeMatcher(value: lookup | (`best fit`)): this.type = set("localeMatcher", value.asInstanceOf[js.Any])
    
    inline def style(value: narrow | short | long): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: DisplayNamesOptionsvalues): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
