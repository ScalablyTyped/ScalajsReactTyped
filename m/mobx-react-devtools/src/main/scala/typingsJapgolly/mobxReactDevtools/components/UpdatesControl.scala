package typingsJapgolly.mobxReactDevtools.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.mobxReactDevtools.AnonHighlightTimeout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object UpdatesControl {
  def apply(
    highlightTimeout: Int | Double = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    AnonHighlightTimeout, 
    typingsJapgolly.mobxReactDevtools.mod.UpdatesControl, 
    Unit, 
    AnonHighlightTimeout
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (highlightTimeout != null) __obj.updateDynamic("highlightTimeout")(highlightTimeout.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.mobxReactDevtools.AnonHighlightTimeout, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.mobxReactDevtools.mod.UpdatesControl](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.mobxReactDevtools.AnonHighlightTimeout])(children: _*)
  }
  @JSImport("mobx-react-devtools", "UpdatesControl")
  @js.native
  object componentImport extends js.Object
  
}

