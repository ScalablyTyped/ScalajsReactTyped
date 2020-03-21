package typingsJapgolly.winrt.Windows.Security.Cryptography.Core

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IKeyDerivationParametersStatics extends js.Object {
  def buildForPbkdf2(pbkdf2Salt: IBuffer, iterationCount: Double): KeyDerivationParameters
  def buildForSP800108(label: IBuffer, context: IBuffer): KeyDerivationParameters
  def buildForSP80056a(
    algorithmId: IBuffer,
    partyUInfo: IBuffer,
    partyVInfo: IBuffer,
    suppPubInfo: IBuffer,
    suppPrivInfo: IBuffer
  ): KeyDerivationParameters
}

object IKeyDerivationParametersStatics {
  @scala.inline
  def apply(
    buildForPbkdf2: (IBuffer, Double) => CallbackTo[KeyDerivationParameters],
    buildForSP800108: (IBuffer, IBuffer) => CallbackTo[KeyDerivationParameters],
    buildForSP80056a: (IBuffer, IBuffer, IBuffer, IBuffer, IBuffer) => CallbackTo[KeyDerivationParameters]
  ): IKeyDerivationParametersStatics = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("buildForPbkdf2")(js.Any.fromFunction2((t0: typingsJapgolly.winrt.Windows.Storage.Streams.IBuffer, t1: scala.Double) => buildForPbkdf2(t0, t1).runNow()))
    __obj.updateDynamic("buildForSP800108")(js.Any.fromFunction2((t0: typingsJapgolly.winrt.Windows.Storage.Streams.IBuffer, t1: typingsJapgolly.winrt.Windows.Storage.Streams.IBuffer) => buildForSP800108(t0, t1).runNow()))
    __obj.updateDynamic("buildForSP80056a")(js.Any.fromFunction5((t0: typingsJapgolly.winrt.Windows.Storage.Streams.IBuffer, t1: typingsJapgolly.winrt.Windows.Storage.Streams.IBuffer, t2: typingsJapgolly.winrt.Windows.Storage.Streams.IBuffer, t3: typingsJapgolly.winrt.Windows.Storage.Streams.IBuffer, t4: typingsJapgolly.winrt.Windows.Storage.Streams.IBuffer) => buildForSP80056a(t0, t1, t2, t3, t4).runNow()))
    __obj.asInstanceOf[IKeyDerivationParametersStatics]
  }
}

