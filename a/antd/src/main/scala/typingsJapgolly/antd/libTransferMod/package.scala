package typingsJapgolly.antd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libTransferMod {
  import japgolly.scalajs.react.raw.React.Element

  type RenderResult = Element | RenderResultObject | String | Null
  type TransferRender = js.Function1[/* item */ TransferItem, RenderResult]
}
