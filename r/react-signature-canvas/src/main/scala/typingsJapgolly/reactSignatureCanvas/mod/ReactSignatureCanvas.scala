package typingsJapgolly.reactSignatureCanvas.mod

import org.scalajs.dom.raw.HTMLCanvasElement
import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactSignatureCanvas.FnCall
import typingsJapgolly.reactSignatureCanvas.FnCallTypeEncoderOptions
import typingsJapgolly.signaturePad.mod.SignaturePad.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReactSignatureCanvas
  extends Component[ReactSignatureCanvasProps, js.Object, js.Any] {
  var clear: js.Function0[Unit] = js.native
  var fromData: js.Function1[/* pointGroups */ js.Array[js.Array[Point]], Unit] = js.native
  var fromDataURL: FnCall = js.native
  var isEmpty: js.Function0[Boolean] = js.native
  var off: js.Function0[Unit] = js.native
  var on: js.Function0[Unit] = js.native
  var toData: js.Function0[js.Array[js.Array[Point]]] = js.native
  var toDataURL: FnCallTypeEncoderOptions = js.native
  def getCanvas(): HTMLCanvasElement = js.native
  def getSignaturePad(): typingsJapgolly.signaturePad.mod.default = js.native
  def getTrimmedCanvas(): HTMLCanvasElement = js.native
}

