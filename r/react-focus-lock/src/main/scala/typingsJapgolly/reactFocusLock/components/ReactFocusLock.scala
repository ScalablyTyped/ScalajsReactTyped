package typingsJapgolly.reactFocusLock.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.ElementType
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.raw.React.Ref
import japgolly.scalajs.react.raw.React.RefHandle
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.reactFocusLock.interfacesMod.ReactFocusLockProps
import typingsJapgolly.reactFocusLock.reactFocusLockStrings.tail
import typingsJapgolly.std.FocusOptions
import typingsJapgolly.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactFocusLock {
  def apply(
    allowTextSelection: js.UndefOr[Boolean] = js.undefined,
    as: String | ElementType = null,
    autoFocus: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    group: String = null,
    lockProps: Record[String, js.Any] = null,
    noFocusGuards: Boolean | tail = null,
    onActivation: /* node */ HTMLElement => Callback = null,
    onDeactivation: /* node */ HTMLElement => Callback = null,
    persistentFocus: js.UndefOr[Boolean] = js.undefined,
    returnFocus: Boolean | FocusOptions = null,
    shards: js.Array[RefHandle[_] | HTMLElement] = null,
    whiteList: /* activeElement */ HTMLElement => CallbackTo[Boolean] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    ReactFocusLockProps[Node, Record[String, js.Any]], 
    Ref, 
    Unit, 
    ReactFocusLockProps[Node, Record[String, js.Any]]
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (!js.isUndefined(allowTextSelection)) __obj.updateDynamic("allowTextSelection")(allowTextSelection.asInstanceOf[js.Any])
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (group != null) __obj.updateDynamic("group")(group.asInstanceOf[js.Any])
    if (lockProps != null) __obj.updateDynamic("lockProps")(lockProps.asInstanceOf[js.Any])
    if (noFocusGuards != null) __obj.updateDynamic("noFocusGuards")(noFocusGuards.asInstanceOf[js.Any])
    if (onActivation != null) __obj.updateDynamic("onActivation")(js.Any.fromFunction1((t0: /* node */ org.scalajs.dom.raw.HTMLElement) => onActivation(t0).runNow()))
    if (onDeactivation != null) __obj.updateDynamic("onDeactivation")(js.Any.fromFunction1((t0: /* node */ org.scalajs.dom.raw.HTMLElement) => onDeactivation(t0).runNow()))
    if (!js.isUndefined(persistentFocus)) __obj.updateDynamic("persistentFocus")(persistentFocus.asInstanceOf[js.Any])
    if (returnFocus != null) __obj.updateDynamic("returnFocus")(returnFocus.asInstanceOf[js.Any])
    if (shards != null) __obj.updateDynamic("shards")(shards.asInstanceOf[js.Any])
    if (whiteList != null) __obj.updateDynamic("whiteList")(js.Any.fromFunction1((t0: /* activeElement */ org.scalajs.dom.raw.HTMLElement) => whiteList(t0).runNow()))
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactFocusLock.interfacesMod.ReactFocusLockProps[
    japgolly.scalajs.react.raw.React.Node, 
    typingsJapgolly.std.Record[java.lang.String, js.Any]
  ], 
  japgolly.scalajs.react.Children.Varargs, 
  japgolly.scalajs.react.raw.React.Ref](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactFocusLock.interfacesMod.ReactFocusLockProps[
  japgolly.scalajs.react.raw.React.Node, 
  typingsJapgolly.std.Record[java.lang.String, js.Any]]])(children: _*)
  }
  @JSImport("react-focus-lock", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

