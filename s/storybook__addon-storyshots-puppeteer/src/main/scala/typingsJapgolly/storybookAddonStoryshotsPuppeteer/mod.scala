package typingsJapgolly.storybookAddonStoryshotsPuppeteer

import typingsJapgolly.storybookAddonStoryshotsPuppeteer.configMod.CommonConfig
import typingsJapgolly.storybookAddonStoryshotsPuppeteer.configMod.ImageSnapshotConfig
import typingsJapgolly.storybookAddonStoryshotsPuppeteer.configMod.PuppeteerTestConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/addon-storyshots-puppeteer", JSImport.Namespace)
@js.native
object mod extends js.Object {
  val defaultCommonConfig: CommonConfig = js.native
  val defaultImageSnapshotConfig: ImageSnapshotConfig = js.native
  val defaultPuppeteerTestConfig: PuppeteerTestConfig = js.native
  def axeTest(): AnonAfterAll = js.native
  def axeTest(customConfig: PartialCommonConfig): AnonAfterAll = js.native
  def imageSnapshot(): AnonAfterAll = js.native
  def imageSnapshot(customConfig: PartialImageSnapshotConfi): AnonAfterAll = js.native
  def puppeteerTest(): AnonAfterAll = js.native
  def puppeteerTest(customConfig: PartialPuppeteerTestConfi): AnonAfterAll = js.native
}

