package typingsJapgolly.domMediacaptureRecord

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typingsJapgolly.std.MediaStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofMediaRecorder
  extends Instantiable1[/* stream */ MediaStream, MediaRecorder]
     with Instantiable2[/* stream */ MediaStream, /* options */ MediaRecorderOptions, MediaRecorder] {
  def isTypeSupported(`type`: String): Boolean = js.native
}

