package typingsJapgolly.jsprintmanager.mod.JSPM

import org.scalajs.dom.raw.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsprintmanager", "JSPM.ClientPrintJob")
@js.native
class ClientPrintJob () extends js.Object {
  var _binaryPrinterCommands: js.Any = js.native
  var _clientPrinter: js.Any = js.native
  var _printFileGroup: js.Any = js.native
  var _printerCommands: js.Any = js.native
  var _printerCommandsCopies: js.Any = js.native
  var binaryPrinterCommands: scala.scalajs.js.typedarray.Uint8Array = js.native
  var clientPrinter: IClientPrinter = js.native
  val files: js.Array[PrintFile] = js.native
  var printerCommands: String = js.native
  var printerCommandsCopies: Double = js.native
  def _genPCArrayAsync(
    printerCommands: String,
    binPrinterCommands: scala.scalajs.js.typedarray.Uint8Array,
    printerCopies: Double
  ): js.Promise[Blob] = js.native
  def _genPFGArrayAsync(printFileGroup: js.Array[PrintFile]): js.Promise[Blob] = js.native
  def _genPrinterArrayAsync(clientPrinter: IClientPrinter): js.Promise[scala.scalajs.js.typedarray.Uint8Array] = js.native
  def _generateDataAsync(): js.Promise[Blob] = js.native
  def _intToByteArray(number: Double): scala.scalajs.js.typedarray.Uint8Array = js.native
  def _str2UTF8Array(str: String): js.Array[Double] = js.native
  def sendToClient(): js.Promise[js.Object] = js.native
}

