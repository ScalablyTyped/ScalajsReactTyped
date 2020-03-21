package typingsJapgolly.builderUtil

import typingsJapgolly.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("builder-util/out/promise", JSImport.Namespace)
@js.native
object promiseMod extends js.Object {
  @js.native
  class NestedError protected () extends Error {
    def this(errors: js.Array[js.Error]) = this()
    def this(errors: js.Array[js.Error], message: String) = this()
    /* CompleteClass */
    override var message: String = js.native
    /* CompleteClass */
    override var name: String = js.native
  }
  
  def executeFinally[T](promise: js.Promise[T], task: js.Function1[/* isErrorOccurred */ Boolean, js.Promise[_]]): js.Promise[T] = js.native
  def orIfFileNotExist[T](promise: js.Promise[T], fallbackValue: T): js.Promise[T] = js.native
  def orNullIfFileNotExist[T](promise: js.Promise[T]): js.Promise[T | Null] = js.native
  def printErrorAndExit(error: js.Error): Unit = js.native
}

