package typingsJapgolly.winrt.Windows.System.Profile

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHardwareIdentificationStatics extends js.Object {
  def getPackageSpecificToken(nonce: IBuffer): HardwareToken
}

object IHardwareIdentificationStatics {
  @scala.inline
  def apply(getPackageSpecificToken: IBuffer => CallbackTo[HardwareToken]): IHardwareIdentificationStatics = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getPackageSpecificToken")(js.Any.fromFunction1((t0: typingsJapgolly.winrt.Windows.Storage.Streams.IBuffer) => getPackageSpecificToken(t0).runNow()))
    __obj.asInstanceOf[IHardwareIdentificationStatics]
  }
}

