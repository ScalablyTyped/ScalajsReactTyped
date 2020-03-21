package typingsJapgolly.barcode.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.node.NodeJS.ErrnoException
import typingsJapgolly.node.NodeJS.ReadableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BarcodeResult extends js.Object {
  def getBase64(callback: js.Function2[/* err */ ErrnoException, /* base64String */ String, Unit]): Unit
  def getStream(callback: js.Function2[/* err */ ErrnoException, /* stream */ ReadableStream, Unit]): Unit
  def saveImage(outputfilePath: String, callback: js.Function1[/* err */ ErrnoException, Unit]): Unit
}

object BarcodeResult {
  @scala.inline
  def apply(
    getBase64: js.Function2[/* err */ ErrnoException, /* base64String */ String, Unit] => Callback,
    getStream: js.Function2[/* err */ ErrnoException, /* stream */ ReadableStream, Unit] => Callback,
    saveImage: (String, js.Function1[/* err */ ErrnoException, Unit]) => Callback
  ): BarcodeResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getBase64")(js.Any.fromFunction1((t0: js.Function2[
  /* err */ typingsJapgolly.node.NodeJS.ErrnoException, 
  /* base64String */ java.lang.String, 
  scala.Unit]) => getBase64(t0).runNow()))
    __obj.updateDynamic("getStream")(js.Any.fromFunction1((t0: js.Function2[
  /* err */ typingsJapgolly.node.NodeJS.ErrnoException, 
  /* stream */ typingsJapgolly.node.NodeJS.ReadableStream, 
  scala.Unit]) => getStream(t0).runNow()))
    __obj.updateDynamic("saveImage")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function1[/* err */ typingsJapgolly.node.NodeJS.ErrnoException, scala.Unit]) => saveImage(t0, t1).runNow()))
    __obj.asInstanceOf[BarcodeResult]
  }
}

