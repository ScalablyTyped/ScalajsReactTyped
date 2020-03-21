package typingsJapgolly.reactBootstrapTypeahead.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLUListElement
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.LegacyRef
import typingsJapgolly.reactBootstrapTypeahead.mod.TypeaheadLabelKey
import typingsJapgolly.reactBootstrapTypeahead.mod.TypeaheadMenuProps
import typingsJapgolly.reactBootstrapTypeahead.mod.TypeaheadModel
import typingsJapgolly.reactBootstrapTypeahead.mod.TypeaheadResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TypeaheadMenu {
  def apply[T /* <: TypeaheadModel */](
    id: String,
    options: js.Array[T],
    className: String = null,
    emptyLabel: String = null,
    innerRef: LegacyRef[HTMLUListElement] = null,
    labelKey: TypeaheadLabelKey[T] = null,
    maxHeight: String = null,
    newSelectionPrefix: String = null,
    renderMenuItemChildren: (/* option */ TypeaheadResult[T], /* props */ TypeaheadMenuProps[T], /* index */ Double) => CallbackTo[Node] = null,
    style: CSSProperties = null,
    text: String = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    TypeaheadMenuProps[T], 
    typingsJapgolly.reactBootstrapTypeahead.mod.TypeaheadMenu[T], 
    Unit, 
    TypeaheadMenuProps[T]
  ] = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
  
      if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (emptyLabel != null) __obj.updateDynamic("emptyLabel")(emptyLabel.asInstanceOf[js.Any])
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (labelKey != null) __obj.updateDynamic("labelKey")(labelKey.asInstanceOf[js.Any])
    if (maxHeight != null) __obj.updateDynamic("maxHeight")(maxHeight.asInstanceOf[js.Any])
    if (newSelectionPrefix != null) __obj.updateDynamic("newSelectionPrefix")(newSelectionPrefix.asInstanceOf[js.Any])
    if (renderMenuItemChildren != null) __obj.updateDynamic("renderMenuItemChildren")(js.Any.fromFunction3((t0: /* option */ typingsJapgolly.reactBootstrapTypeahead.mod.TypeaheadResult[T], t1: /* props */ typingsJapgolly.reactBootstrapTypeahead.mod.TypeaheadMenuProps[T], t2: /* index */ scala.Double) => renderMenuItemChildren(t0, t1, t2).runNow()))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactBootstrapTypeahead.mod.TypeaheadMenuProps[T], 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactBootstrapTypeahead.mod.TypeaheadMenu[T]](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactBootstrapTypeahead.mod.TypeaheadMenuProps[T]])(children: _*)
  }
  @JSImport("react-bootstrap-typeahead", "TypeaheadMenu")
  @js.native
  object componentImport extends js.Object
  
}

