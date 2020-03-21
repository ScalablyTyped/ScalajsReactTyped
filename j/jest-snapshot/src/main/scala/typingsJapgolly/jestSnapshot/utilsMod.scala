package typingsJapgolly.jestSnapshot

import typingsJapgolly.jestSnapshot.jestSnapshotStrings.`1`
import typingsJapgolly.jestSnapshot.jestSnapshotStrings.httpsColonSlashSlashgooDotglSlashfbAQLP
import typingsJapgolly.jestTypes.configMod.SnapshotUpdateState
import typingsJapgolly.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest-snapshot/build/utils", JSImport.Namespace)
@js.native
object utilsMod extends js.Object {
  val SNAPSHOT_GUIDE_LINK: httpsColonSlashSlashgooDotglSlashfbAQLP = js.native
  val SNAPSHOT_VERSION: `1` = js.native
  val SNAPSHOT_VERSION_WARNING: String = js.native
  def deepMerge(target: js.Any, source: js.Any): js.Any = js.native
  def ensureDirectoryExists(filePath: String): Unit = js.native
  def escapeBacktickString(str: String): String = js.native
  def getSnapshotData(snapshotPath: String, update: SnapshotUpdateState): AnonData = js.native
  def keyToTestName(key: String): String = js.native
  def saveSnapshotFile(snapshotData: Record[String, String], snapshotPath: String): Unit = js.native
  def serialize(data: String): String = js.native
  def testNameToKey(testName: String, count: Double): String = js.native
  def unescape(data: String): String = js.native
}

