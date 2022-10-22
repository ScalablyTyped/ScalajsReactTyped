package typingsJapgolly.storybookTheming.components

import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.storybookTheming.`distTs3Dot9Modules@emotionReactTypesIndexMod`.ClassNamesContent
import typingsJapgolly.storybookTheming.`distTs3Dot9Modules@emotionReactTypesIndexMod`.ClassNamesProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ClassNames {
  
  inline def apply(children: ClassNamesContent => Node): Default[js.Object] = {
    val __props = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[ClassNamesProps]))
  }
  
  @JSImport("@storybook/theming", "ClassNames")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: ClassNamesProps): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
