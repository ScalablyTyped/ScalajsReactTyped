package typingsJapgolly.officeUiFabricReact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Element
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.officeUiFabricReact.suggestionsDottypesMod.ISuggestionsHeaderFooterItemProps
import typingsJapgolly.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object SuggestionsHeaderFooterItem {
  def apply(
    id: String,
    isSelected: Boolean,
    renderItem: CallbackTo[Element],
    className: String = null,
    componentRef: IRefObject[js.Object] = null,
    onExecute: js.UndefOr[Callback] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    ISuggestionsHeaderFooterItemProps, 
    typingsJapgolly.officeUiFabricReact.mod.SuggestionsHeaderFooterItem, 
    Unit, 
    ISuggestionsHeaderFooterItemProps
  ] = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], isSelected = isSelected.asInstanceOf[js.Any])
  
      __obj.updateDynamic("renderItem")(renderItem.toJsFn)
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    onExecute.foreach(p => __obj.updateDynamic("onExecute")(p.toJsFn))
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.officeUiFabricReact.suggestionsDottypesMod.ISuggestionsHeaderFooterItemProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.officeUiFabricReact.mod.SuggestionsHeaderFooterItem](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.officeUiFabricReact.suggestionsDottypesMod.ISuggestionsHeaderFooterItemProps])(children: _*)
  }
  @JSImport("office-ui-fabric-react", "SuggestionsHeaderFooterItem")
  @js.native
  object componentImport extends js.Object
  
}

