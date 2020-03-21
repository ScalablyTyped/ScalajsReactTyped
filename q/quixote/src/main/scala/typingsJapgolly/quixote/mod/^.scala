package typingsJapgolly.quixote.mod

import typingsJapgolly.quixote.QFrame
import typingsJapgolly.quixote.QuixoteFrameOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("quixote", JSImport.Namespace)
@js.native
class ^ () extends Quixote {
  /* CompleteClass */
  override def createFrame(
    options: QuixoteFrameOptions,
    callback: js.Function2[/* err */ js.Error, /* loadedFrame */ QFrame, Unit]
  ): QFrame = js.native
}

