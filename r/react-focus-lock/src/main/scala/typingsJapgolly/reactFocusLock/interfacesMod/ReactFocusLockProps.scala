package typingsJapgolly.reactFocusLock.interfacesMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.ElementType
import japgolly.scalajs.react.raw.React.Ref
import japgolly.scalajs.react.raw.React.RefHandle
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.reactFocusLock.reactFocusLockStrings.tail
import typingsJapgolly.std.FocusOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactFocusLockProps[ChildrenType, LockProps] extends js.Object {
  /**
    * @deprecated Use persistentFocus=false instead
    * enables(or disables) text selection. This also allows not to have ANY focus.
    */
  var allowTextSelection: js.UndefOr[Boolean] = js.undefined
  /**
    * Component to use, defaults to 'div'
    */
  var as: js.UndefOr[String | ElementType] = js.undefined
  /**
    * enables or disables autoFocusing feature.
    * If enabled - will move focus inside Lock, selecting the first or autoFocusable element
    * If disable - will blur any focus on Lock activation.
    * @default true
    */
  var autoFocus: js.UndefOr[Boolean] = js.undefined
  var children: js.UndefOr[ChildrenType] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  /**
    * named focus group for focus scattering aka combined lock targets
    */
  var group: js.UndefOr[String] = js.undefined
  var lockProps: js.UndefOr[LockProps] = js.undefined
  /**
    * disables hidden inputs before and after the lock.
    */
  var noFocusGuards: js.UndefOr[Boolean | tail] = js.undefined
  /**
    * life-cycle hook, called on lock activation
    * @param node the observed node
    */
  var onActivation: js.UndefOr[js.Function1[/* node */ HTMLElement, Unit]] = js.undefined
  /**
    * life-cycle hook, called on deactivation
    * @param node the observed node
    */
  var onDeactivation: js.UndefOr[js.Function1[/* node */ HTMLElement, Unit]] = js.undefined
  /**
    * enables of disables "sticky" behavior, when any focusable element shall be focused.
    * This disallow any text selection on the page.
    * @default false
    */
  var persistentFocus: js.UndefOr[Boolean] = js.undefined
  var ref: js.UndefOr[Ref] = js.undefined
  /**
    * if true, will return focus to the previous position on trap disable.
    * Optionally, can pass focus options instead of `true` to control the focus
    * more precisely (ie. `{ preventScroll: true }`)
    */
  var returnFocus: js.UndefOr[Boolean | FocusOptions] = js.undefined
  /**
    * Shards forms a scattered lock, same as `group` does, but in more "low" and controlled way
    */
  var shards: js.UndefOr[js.Array[RefHandle[_] | HTMLElement]] = js.undefined
  /**
    * Controls focus lock working areas. Lock will silently ignore all the events from `not allowed` areas
    * @param activeElement
    * @returns {Boolean} true if focus lock should handle activeElement, false if not
    */
  var whiteList: js.UndefOr[js.Function1[/* activeElement */ HTMLElement, Boolean]] = js.undefined
}

object ReactFocusLockProps {
  @scala.inline
  def apply[ChildrenType, LockProps](
    allowTextSelection: js.UndefOr[Boolean] = js.undefined,
    as: String | ElementType = null,
    autoFocus: js.UndefOr[Boolean] = js.undefined,
    children: ChildrenType = null,
    className: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    group: String = null,
    lockProps: LockProps = null,
    noFocusGuards: Boolean | tail = null,
    onActivation: /* node */ HTMLElement => Callback = null,
    onDeactivation: /* node */ HTMLElement => Callback = null,
    persistentFocus: js.UndefOr[Boolean] = js.undefined,
    ref: Ref = null,
    returnFocus: Boolean | FocusOptions = null,
    shards: js.Array[RefHandle[_] | HTMLElement] = null,
    whiteList: /* activeElement */ HTMLElement => CallbackTo[Boolean] = null
  ): ReactFocusLockProps[ChildrenType, LockProps] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowTextSelection)) __obj.updateDynamic("allowTextSelection")(allowTextSelection.asInstanceOf[js.Any])
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (group != null) __obj.updateDynamic("group")(group.asInstanceOf[js.Any])
    if (lockProps != null) __obj.updateDynamic("lockProps")(lockProps.asInstanceOf[js.Any])
    if (noFocusGuards != null) __obj.updateDynamic("noFocusGuards")(noFocusGuards.asInstanceOf[js.Any])
    if (onActivation != null) __obj.updateDynamic("onActivation")(js.Any.fromFunction1((t0: /* node */ org.scalajs.dom.raw.HTMLElement) => onActivation(t0).runNow()))
    if (onDeactivation != null) __obj.updateDynamic("onDeactivation")(js.Any.fromFunction1((t0: /* node */ org.scalajs.dom.raw.HTMLElement) => onDeactivation(t0).runNow()))
    if (!js.isUndefined(persistentFocus)) __obj.updateDynamic("persistentFocus")(persistentFocus.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (returnFocus != null) __obj.updateDynamic("returnFocus")(returnFocus.asInstanceOf[js.Any])
    if (shards != null) __obj.updateDynamic("shards")(shards.asInstanceOf[js.Any])
    if (whiteList != null) __obj.updateDynamic("whiteList")(js.Any.fromFunction1((t0: /* activeElement */ org.scalajs.dom.raw.HTMLElement) => whiteList(t0).runNow()))
    __obj.asInstanceOf[ReactFocusLockProps[ChildrenType, LockProps]]
  }
}

