package typingsJapgolly.semanticUiReactEventStack.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.semanticUiReactEventStack.mod.default
import typingsJapgolly.semanticUiReactEventStack.typesEventStackMod.EventStackProps
import typingsJapgolly.semanticUiReactEventStack.typesMod.InputEventListener
import typingsJapgolly.semanticUiReactEventStack.typesMod.InputTargetElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object EventStack {
  def apply(
    name: String,
    on: InputEventListener,
    pool: String = null,
    target: InputTargetElement = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[EventStackProps, default, Unit, EventStackProps] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], on = on.asInstanceOf[js.Any])
  
      if (pool != null) __obj.updateDynamic("pool")(pool.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.semanticUiReactEventStack.typesEventStackMod.EventStackProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.semanticUiReactEventStack.mod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.semanticUiReactEventStack.typesEventStackMod.EventStackProps])(children: _*)
  }
  @JSImport("@semantic-ui-react/event-stack", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

