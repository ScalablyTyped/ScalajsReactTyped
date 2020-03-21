package typingsJapgolly.gulpProtractor.mod

import typingsJapgolly.gulp.mod.TaskCallback
import typingsJapgolly.node.NodeJS.ReadWriteStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGulpProtractor extends js.Object {
  var webdriver_standalone: TaskCallback = js.native
  var webdriver_update: TaskCallback = js.native
  def getProtractorDir(): String = js.native
  def protractor(): ReadWriteStream = js.native
  def protractor(options: IOptions): ReadWriteStream = js.native
}

