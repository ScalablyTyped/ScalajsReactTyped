package typingsJapgolly.mjmlReact.components

import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.mjmlReact.AnonInline
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object MjmlStyle {
  def apply(
    `inline`: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: String
  ): UnmountedWithRoot[AnonInline, typingsJapgolly.mjmlReact.mod.MjmlStyle, Unit, AnonInline] = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
  
      if (!js.isUndefined(`inline`)) __obj.updateDynamic("inline")(`inline`.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.mjmlReact.AnonInline, 
  japgolly.scalajs.react.Children.None, 
  typingsJapgolly.mjmlReact.mod.MjmlStyle](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.mjmlReact.AnonInline])
  }
  @JSImport("mjml-react", "MjmlStyle")
  @js.native
  object componentImport extends js.Object
  
}

