package typingsJapgolly.cordovaPluginQrscanner

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Window extends js.Object {
  var QRScanner: typingsJapgolly.cordovaPluginQrscanner.QRScanner
}

object Window {
  @scala.inline
  def apply(QRScanner: QRScanner): Window = {
    val __obj = js.Dynamic.literal(QRScanner = QRScanner.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Window]
  }
}

