package typingsJapgolly.expo.creatorWebMod

import org.scalajs.dom.raw.Blob
import org.scalajs.dom.raw.Element
import typingsJapgolly.reactNativeViewShot.mod.CaptureOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo/build/takeSnapshotAsync/Creator.web", "createBlobAsync")
@js.native
object createBlobAsync extends js.Object {
  def apply(element: Element, hasQualityOptions: CaptureOptions): js.Promise[Blob] = js.native
}

