package typingsJapgolly.mjmlReact.components

import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.mjmlReact.AnonCondition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object MjmlConditionalComment {
  def apply(
    condition: String,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: String
  ): UnmountedWithRoot[
    AnonCondition, 
    typingsJapgolly.mjmlReact.extensionsMod.MjmlConditionalComment, 
    Unit, 
    AnonCondition
  ] = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], condition = condition.asInstanceOf[js.Any])
  
      key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.mjmlReact.AnonCondition, 
  japgolly.scalajs.react.Children.None, 
  typingsJapgolly.mjmlReact.extensionsMod.MjmlConditionalComment](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.mjmlReact.AnonCondition])
  }
  @JSImport("mjml-react/extensions", "MjmlConditionalComment")
  @js.native
  object componentImport extends js.Object
  
}

