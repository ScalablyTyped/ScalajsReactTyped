package typingsJapgolly.chaiJestSnapshot.mod

import typingsJapgolly.chai.Chai_.ChaiPlugin
import typingsJapgolly.mocha.Mocha_.IBeforeAndAfterContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChaiJestSnapshot extends ChaiPlugin {
  /** Add a serializer plugin */
  def addSerializer(serializer: js.Any): Unit = js.native
  /** Configure snapshot name using mocha context */
  def configureUsingMochaContext(context: IBeforeAndAfterContext): Unit = js.native
  /** Reset snapshot registry */
  def resetSnapshotRegistry(): Unit = js.native
  /** Set snapshot file name */
  def setFilename(filename: String): Unit = js.native
  /**
    * Set snapshot test name
    */
  def setTestName(testname: String): Unit = js.native
}

