package typingsJapgolly.materialUiCore.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Ref
import japgolly.scalajs.react.raw.React.RefHandle
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.materialUiCore.PartialClassNameMapCollap
import typingsJapgolly.materialUiCore.collapseCollapseMod.CollapseProps
import typingsJapgolly.materialUiCore.collapseMod.default
import typingsJapgolly.materialUiCore.createMuiThemeMod.Theme
import typingsJapgolly.materialUiCore.materialUiCoreStrings.auto
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.ReactType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Collapse {
  def apply(
    addEndListener: js.Any = null,
    appear: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    classes: PartialClassNameMapCollap = null,
    collapsedHeight: String = null,
    component: ReactType[CollapseProps] = null,
    enter: js.UndefOr[Boolean] = js.undefined,
    exit: js.UndefOr[Boolean] = js.undefined,
    in: js.Any = null,
    innerRef: Ref | RefHandle[_] = null,
    mountOnEnter: js.Any = null,
    onEnter: js.Any = null,
    onEntered: js.Any = null,
    onEntering: js.Any = null,
    onExit: js.Any = null,
    onExited: js.Any = null,
    onExiting: js.Any = null,
    style: CSSProperties = null,
    theme: Theme = null,
    timeout: js.Any | auto = null,
    unmountOnExit: js.Any = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[CollapseProps, default, Unit, CollapseProps] = {
    val __obj = js.Dynamic.literal()
  
      if (addEndListener != null) __obj.updateDynamic("addEndListener")(addEndListener.asInstanceOf[js.Any])
    if (!js.isUndefined(appear)) __obj.updateDynamic("appear")(appear.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (classes != null) __obj.updateDynamic("classes")(classes.asInstanceOf[js.Any])
    if (collapsedHeight != null) __obj.updateDynamic("collapsedHeight")(collapsedHeight.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (!js.isUndefined(enter)) __obj.updateDynamic("enter")(enter.asInstanceOf[js.Any])
    if (!js.isUndefined(exit)) __obj.updateDynamic("exit")(exit.asInstanceOf[js.Any])
    if (in != null) __obj.updateDynamic("in")(in.asInstanceOf[js.Any])
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (mountOnEnter != null) __obj.updateDynamic("mountOnEnter")(mountOnEnter.asInstanceOf[js.Any])
    if (onEnter != null) __obj.updateDynamic("onEnter")(onEnter.asInstanceOf[js.Any])
    if (onEntered != null) __obj.updateDynamic("onEntered")(onEntered.asInstanceOf[js.Any])
    if (onEntering != null) __obj.updateDynamic("onEntering")(onEntering.asInstanceOf[js.Any])
    if (onExit != null) __obj.updateDynamic("onExit")(onExit.asInstanceOf[js.Any])
    if (onExited != null) __obj.updateDynamic("onExited")(onExited.asInstanceOf[js.Any])
    if (onExiting != null) __obj.updateDynamic("onExiting")(onExiting.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (unmountOnExit != null) __obj.updateDynamic("unmountOnExit")(unmountOnExit.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.materialUiCore.collapseCollapseMod.CollapseProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.materialUiCore.collapseMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.materialUiCore.collapseCollapseMod.CollapseProps])(children: _*)
  }
  @JSImport("@material-ui/core/Collapse", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

