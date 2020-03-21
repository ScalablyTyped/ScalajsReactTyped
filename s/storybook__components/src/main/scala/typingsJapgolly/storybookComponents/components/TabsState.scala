package typingsJapgolly.storybookComponents.components

import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.storybookComponents.tabsMod.FuncChilden
import typingsJapgolly.storybookComponents.tabsMod.TabsStateProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TabsState {
  def apply(
    absolute: Boolean,
    backgroundColor: String,
    bordered: Boolean,
    initial: String,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: js.Array[Node | FuncChilden]
  ): UnmountedWithRoot[
    TabsStateProps, 
    typingsJapgolly.storybookComponents.mod.TabsState, 
    Unit, 
    TabsStateProps
  ] = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], absolute = absolute.asInstanceOf[js.Any], backgroundColor = backgroundColor.asInstanceOf[js.Any], bordered = bordered.asInstanceOf[js.Any], initial = initial.asInstanceOf[js.Any])
  
      key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.storybookComponents.tabsMod.TabsStateProps, 
  japgolly.scalajs.react.Children.None, 
  typingsJapgolly.storybookComponents.mod.TabsState](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.storybookComponents.tabsMod.TabsStateProps])
  }
  @JSImport("@storybook/components", "TabsState")
  @js.native
  object componentImport extends js.Object
  
}

