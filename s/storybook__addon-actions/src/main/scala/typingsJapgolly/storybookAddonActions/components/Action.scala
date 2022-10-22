package typingsJapgolly.storybookAddonActions.components

import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.react.mod.DetailedHTMLProps
import typingsJapgolly.react.mod.HTMLAttributes
import typingsJapgolly.storybookAddonActions.anon.PickDetailedHTMLPropsHTML
import typingsJapgolly.storybookTheming.anon.`0`
import typingsJapgolly.storybookTheming.mod.DistributiveOmit
import typingsJapgolly.storybookTheming.mod.Theme
import typingsJapgolly.storybookTheming.storybookThemingStrings.theme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Action {
  
  @JSImport("@storybook/addon-actions/dist/ts3.9/components/ActionLogger/style", "Action")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Action.type): SharedBuilder_DetailedHTMLPropsDistributiveOmit0679140864[HTMLDivElement] = new SharedBuilder_DetailedHTMLPropsDistributiveOmit0679140864[HTMLDivElement](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(
    p: (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]) & (DistributiveOmit[PickDetailedHTMLPropsHTML, theme]) & `0`[Theme]
  ): SharedBuilder_DetailedHTMLPropsDistributiveOmit0679140864[HTMLDivElement] = new SharedBuilder_DetailedHTMLPropsDistributiveOmit0679140864[HTMLDivElement](js.Array(this.component, p.asInstanceOf[js.Any]))
}
