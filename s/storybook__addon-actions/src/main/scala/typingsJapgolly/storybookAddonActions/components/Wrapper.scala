package typingsJapgolly.storybookAddonActions.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.std.Pick
import typingsJapgolly.storybookTheming.anon.`0`
import typingsJapgolly.storybookTheming.mod.DistributiveOmit
import typingsJapgolly.storybookTheming.mod.Theme
import typingsJapgolly.storybookTheming.storybookThemingStrings.theme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Couldn't find props for scala.Any & (typingsJapgolly.storybookTheming.mod.DistributiveOmit[
typingsJapgolly.std.Pick[scala.Any, java.lang.String | scala.Double | js.Symbol], 
typingsJapgolly.storybookTheming.storybookThemingStrings.theme]) & typingsJapgolly.storybookTheming.anon.`0`[typingsJapgolly.storybookTheming.mod.Theme] because: IArray(Could't extract props from scala.Any because couldn't resolve ClassTree.) */
object Wrapper {
  
  def apply(p: Any & (DistributiveOmit[Pick[Any, String | Double | js.Symbol], theme]) & `0`[Theme]): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @JSImport("@storybook/addon-actions/dist/ts3.9/components/ActionLogger", "Wrapper")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Wrapper.type): Default[js.Object] = new Default[js.Object](js.Array(this.component, js.Dictionary.empty))()
}
