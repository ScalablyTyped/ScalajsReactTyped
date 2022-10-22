package typingsJapgolly.antd.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.antd.libTransferListBodyMod.TransferListBodyProps
import typingsJapgolly.antd.libTransferListBodyMod.default
import typingsJapgolly.antd.libTransferListMod.RenderedItem
import typingsJapgolly.antd.libTransferMod.KeyWiseTransferItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ListBody {
  
  inline def apply[RecordType /* <: KeyWiseTransferItem */](
    filteredItems: js.Array[RecordType],
    filteredRenderItems: js.Array[RenderedItem[RecordType]],
    selectedKeys: js.Array[String]
  ): Builder[RecordType] = {
    val __props = js.Dynamic.literal(filteredItems = filteredItems.asInstanceOf[js.Any], filteredRenderItems = filteredRenderItems.asInstanceOf[js.Any], selectedKeys = selectedKeys.asInstanceOf[js.Any])
    new Builder[RecordType](js.Array(this.component, __props.asInstanceOf[TransferListBodyProps[RecordType]]))
  }
  
  @JSImport("antd/lib/transfer/ListBody", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[RecordType /* <: KeyWiseTransferItem */] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default[RecordType]]
  
  def withProps[RecordType /* <: KeyWiseTransferItem */](p: TransferListBodyProps[RecordType]): Builder[RecordType] = new Builder[RecordType](js.Array(this.component, p.asInstanceOf[js.Any]))
}
