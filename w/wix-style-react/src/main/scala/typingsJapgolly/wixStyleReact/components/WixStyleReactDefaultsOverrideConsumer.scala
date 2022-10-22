package typingsJapgolly.wixStyleReact.components

import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.react.mod.ConsumerProps
import typingsJapgolly.wixStyleReact.distTypesWixStyleReactDefaultsOverrideProviderWixStyleReactDefaultsOverrideProviderMod.WixStyleReactDefaultsOverride
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object WixStyleReactDefaultsOverrideConsumer {
  
  inline def apply(children: WixStyleReactDefaultsOverride => Node): Default[js.Object] = {
    val __props = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[ConsumerProps[WixStyleReactDefaultsOverride]]))
  }
  
  @JSImport("wix-style-react/dist/types/WixStyleReactDefaultsOverrideProvider", "WixStyleReactDefaultsOverrideConsumer")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: ConsumerProps[WixStyleReactDefaultsOverride]): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
