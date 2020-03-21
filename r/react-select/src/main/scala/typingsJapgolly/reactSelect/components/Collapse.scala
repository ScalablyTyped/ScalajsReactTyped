package typingsJapgolly.reactSelect.components

import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactSelect.transitionsMod.CollapseProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Collapse {
  def apply(
    in: Boolean,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: js.Any
  ): UnmountedWithRoot[
    CollapseProps, 
    typingsJapgolly.reactSelect.transitionsMod.Collapse, 
    Unit, 
    CollapseProps
  ] = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], in = in.asInstanceOf[js.Any])
  
      key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactSelect.transitionsMod.CollapseProps, 
  japgolly.scalajs.react.Children.None, 
  typingsJapgolly.reactSelect.transitionsMod.Collapse](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactSelect.transitionsMod.CollapseProps])
  }
  @JSImport("react-select/src/animated/transitions", "Collapse")
  @js.native
  object componentImport extends js.Object
  
}

