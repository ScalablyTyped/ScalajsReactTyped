package typingsJapgolly.antd.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.antd.Anon_InsertExtraNode
import typingsJapgolly.antd.libUnderscoreUtilWaveMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Wave {
  def apply(
    insertExtraNode: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[Anon_InsertExtraNode, default, Unit, Anon_InsertExtraNode] = {
    val __obj = js.Dynamic.literal()
  
      if (!js.isUndefined(insertExtraNode)) __obj.updateDynamic("insertExtraNode")(insertExtraNode.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.antd.Anon_InsertExtraNode, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.antd.libUnderscoreUtilWaveMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.antd.Anon_InsertExtraNode])(children: _*)
  }
  @JSImport("antd/lib/_util/wave", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

