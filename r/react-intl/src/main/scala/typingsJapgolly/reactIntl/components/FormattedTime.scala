package typingsJapgolly.reactIntl.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.reactIntl.anon.Children
import typingsJapgolly.std.Intl.DateTimeFormatOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Couldn't find props for typingsJapgolly.std.Intl.DateTimeFormatOptions & (/ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CustomFormatConfig * / scala.Any) & typingsJapgolly.reactIntl.anon.Children because: IArray(Could't extract props from / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CustomFormatConfig * / scala.Any because couldn't resolve ClassTree.) */
object FormattedTime {
  
  def apply(
    p: DateTimeFormatOptions & (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CustomFormatConfig */ Any) & Children
  ): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @JSImport("react-intl", "FormattedTime")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: FormattedTime.type): Default[js.Object] = new Default[js.Object](js.Array(this.component, js.Dictionary.empty))()
}
