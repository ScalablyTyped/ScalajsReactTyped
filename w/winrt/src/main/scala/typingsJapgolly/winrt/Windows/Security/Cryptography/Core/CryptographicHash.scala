package typingsJapgolly.winrt.Windows.Security.Cryptography.Core

import typingsJapgolly.winrt.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Security.Cryptography.Core.CryptographicHash")
@js.native
class CryptographicHash () extends IHashComputation {
  /* CompleteClass */
  override def append(data: IBuffer): Unit = js.native
  /* CompleteClass */
  override def getValueAndReset(): IBuffer = js.native
}

