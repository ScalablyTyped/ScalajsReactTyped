package typingsJapgolly.cssFontLoadingModule.mod._Global_

import typingsJapgolly.cssFontLoadingModule.mod.BinaryData
import typingsJapgolly.cssFontLoadingModule.mod.FontFaceDescriptors
import typingsJapgolly.cssFontLoadingModule.mod.FontFaceLoadStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("FontFace")
@js.native
class FontFace protected () extends js.Object {
  def this(family: String, source: String) = this()
  def this(family: String, source: BinaryData) = this()
  def this(family: String, source: String, descriptors: FontFaceDescriptors) = this()
  def this(family: String, source: BinaryData, descriptors: FontFaceDescriptors) = this()
  var display: String = js.native
  var family: String = js.native
  var featureSettings: String = js.native
  val loaded: js.Promise[FontFace] = js.native
  val status: FontFaceLoadStatus = js.native
  var stretch: String = js.native
  var style: String = js.native
  var unicodeRange: String = js.native
  var variant: String = js.native
  var variationSettings: String = js.native
  var weight: String = js.native
  def load(): js.Promise[FontFace] = js.native
}

