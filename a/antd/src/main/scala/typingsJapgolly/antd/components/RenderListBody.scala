package typingsJapgolly.antd.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.antd.libTransferListMod.RenderedItem
import typingsJapgolly.antd.libTransferMod.TransferItem
import typingsJapgolly.antd.libTransferRenderListBodyMod.TransferListBodyProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object RenderListBody {
  def apply(
    filteredItems: js.Array[TransferItem],
    filteredRenderItems: js.Array[RenderedItem],
    selectedKeys: js.Array[String],
    key: js.UndefOr[Key] = js.undefined,
    overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[
    TransferListBodyProps, 
    MountedWithRawType[TransferListBodyProps, js.Object, RawMounted[TransferListBodyProps, js.Object]]
  ] = {
    val __obj = js.Dynamic.literal(filteredItems = filteredItems.asInstanceOf[js.Any], filteredRenderItems = filteredRenderItems.asInstanceOf[js.Any], selectedKeys = selectedKeys.asInstanceOf[js.Any])
  
      key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.antd.libTransferRenderListBodyMod.TransferListBodyProps, 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.antd.libTransferRenderListBodyMod.TransferListBodyProps])(children: _*)
  }
  @JSImport("antd/lib/transfer/renderListBody", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

