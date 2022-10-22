package typingsJapgolly.storybookApi.components

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.std.ReturnType
import typingsJapgolly.storybookApi.mod.Combo
import typingsJapgolly.storybookApi.mod.ManagerProviderProps
import typingsJapgolly.storybookRouter.anon.PartialLocationAncestorOrigins
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Provider {
  
  inline def apply(
    docsMode: Boolean,
    location: PartialLocationAncestorOrigins,
    navigate: ReturnType[
      js.Function0[
        js.Function2[/* to */ String | Double, /* hasPlainOptions */ js.UndefOr[Any], Unit]
      ]
    ],
    path: String,
    provider: typingsJapgolly.storybookApi.distTs3Dot9ModulesProviderMod.Provider
  ): Builder = {
    val __props = js.Dynamic.literal(docsMode = docsMode.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], navigate = navigate.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ManagerProviderProps]))
  }
  
  @JSImport("@storybook/api", "Provider")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.storybookApi.mod.Provider] {
    
    inline def children(value: Node | (js.Function1[/* props */ Combo, Node])): this.type = set("children", value.asInstanceOf[js.Any])
    
    inline def childrenFunction1(value: /* props */ Combo => Node): this.type = set("children", js.Any.fromFunction1(value))
    
    inline def childrenNull: this.type = set("children", null)
    
    inline def childrenVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("children", js.Array(value*))
    
    inline def childrenVdomElement(value: VdomElement): this.type = set("children", value.rawElement.asInstanceOf[js.Any])
    
    inline def refId(value: String): this.type = set("refId", value.asInstanceOf[js.Any])
    
    inline def singleStory(value: Boolean): this.type = set("singleStory", value.asInstanceOf[js.Any])
    
    inline def storyId(value: String): this.type = set("storyId", value.asInstanceOf[js.Any])
    
    inline def viewMode(value: String): this.type = set("viewMode", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ManagerProviderProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
