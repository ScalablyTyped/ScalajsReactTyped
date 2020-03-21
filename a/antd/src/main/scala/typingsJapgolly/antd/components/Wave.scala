package typingsJapgolly.antd.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.antd.AnonInsertExtraNode
import typingsJapgolly.antd.waveMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Wave {
  def apply(
    insertExtraNode: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[AnonInsertExtraNode, default, Unit, AnonInsertExtraNode] = {
    val __obj = js.Dynamic.literal()
  
      if (!js.isUndefined(insertExtraNode)) __obj.updateDynamic("insertExtraNode")(insertExtraNode.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.antd.AnonInsertExtraNode, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.antd.waveMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.antd.AnonInsertExtraNode])(children: _*)
  }
  @JSImport("antd/lib/_util/wave", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

