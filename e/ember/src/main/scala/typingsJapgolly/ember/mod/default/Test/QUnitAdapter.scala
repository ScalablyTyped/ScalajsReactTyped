package typingsJapgolly.ember.mod.default.Test

import typingsJapgolly.emberTest.adapterMod.Adapter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This class implements the methods defined by Ember.Test.Adapter for the
  * QUnit testing framework.
  */
@JSImport("ember", "Test.QUnitAdapter")
@js.native
class QUnitAdapter () extends Adapter {
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

