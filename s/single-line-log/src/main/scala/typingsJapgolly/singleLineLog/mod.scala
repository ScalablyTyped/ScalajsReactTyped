package typingsJapgolly.singleLineLog

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("single-line-log", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  trait SingleLineLog extends js.Object {
    def apply(data: String): Unit = js.native
    def clear(): Unit = js.native
    def write(data: String): Unit = js.native
  }
  
  val stderr: SingleLineLog = js.native
  val stdout: SingleLineLog = js.native
}

