package typingsJapgolly.reactIntl.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.reactIntl.anon.OmitNumberFormatOptionslo
import typingsJapgolly.reactIntl.anon.ValueNumber
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Couldn't find props for typingsJapgolly.reactIntl.anon.OmitNumberFormatOptionslo & (/ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CustomFormatConfig<'number'> * / scala.Any) & typingsJapgolly.reactIntl.anon.ValueNumber because: IArray(Could't extract props from / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CustomFormatConfig<'number'> * / scala.Any because couldn't resolve ClassTree.) */
object FormattedNumber {
  
  def apply(
    p: OmitNumberFormatOptionslo & (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CustomFormatConfig<'number'> */ Any) & ValueNumber
  ): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @JSImport("react-intl", "FormattedNumber")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: FormattedNumber.type): Default[js.Object] = new Default[js.Object](js.Array(this.component, js.Dictionary.empty))()
}
