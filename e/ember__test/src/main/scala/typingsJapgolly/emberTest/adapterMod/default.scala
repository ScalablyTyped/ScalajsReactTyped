package typingsJapgolly.emberTest.adapterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ember/test/adapter", JSImport.Default)
@js.native
class default () extends Adapter {
  /**
    * This callback will be called whenever an async operation has completed.
    */
  /* CompleteClass */
  override def asyncEnd(): js.Any = js.native
  /**
    * This callback will be called whenever an async operation is about to start.
    */
  /* CompleteClass */
  override def asyncStart(): js.Any = js.native
  /**
    * Override this method with your testing framework's false assertion.
    * This function is called whenever an exception occurs causing the testing
    * promise to fail.
    */
  /* CompleteClass */
  override def exception(error: String): js.Any = js.native
}

