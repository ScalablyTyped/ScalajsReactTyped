package typingsJapgolly.jestSnapshot

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.jestSnapshot.jestSnapshotStrings.`1`
import typingsJapgolly.jestSnapshot.jestSnapshotStrings.httpsColonSlashSlashgooDotglSlashfbAQLP
import typingsJapgolly.jestTypes.configMod.SnapshotUpdateState
import typingsJapgolly.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofutils extends js.Object {
  val SNAPSHOT_GUIDE_LINK: httpsColonSlashSlashgooDotglSlashfbAQLP
  val SNAPSHOT_VERSION: `1`
  val SNAPSHOT_VERSION_WARNING: String
  def deepMerge(target: js.Any, source: js.Any): js.Any
  def ensureDirectoryExists(filePath: String): Unit
  def escapeBacktickString(str: String): String
  def getSnapshotData(snapshotPath: String, update: SnapshotUpdateState): AnonData
  def keyToTestName(key: String): String
  def saveSnapshotFile(snapshotData: Record[String, String], snapshotPath: String): Unit
  def serialize(data: String): String
  def testNameToKey(testName: String, count: Double): String
  def unescape(data: String): String
}

object Typeofutils {
  @scala.inline
  def apply(
    SNAPSHOT_GUIDE_LINK: httpsColonSlashSlashgooDotglSlashfbAQLP,
    SNAPSHOT_VERSION: `1`,
    SNAPSHOT_VERSION_WARNING: String,
    deepMerge: (js.Any, js.Any) => CallbackTo[js.Any],
    ensureDirectoryExists: String => Callback,
    escapeBacktickString: String => CallbackTo[String],
    getSnapshotData: (String, SnapshotUpdateState) => CallbackTo[AnonData],
    keyToTestName: String => CallbackTo[String],
    saveSnapshotFile: (Record[String, String], String) => Callback,
    serialize: String => CallbackTo[String],
    testNameToKey: (String, Double) => CallbackTo[String],
    unescape: String => CallbackTo[String]
  ): Typeofutils = {
    val __obj = js.Dynamic.literal(SNAPSHOT_GUIDE_LINK = SNAPSHOT_GUIDE_LINK.asInstanceOf[js.Any], SNAPSHOT_VERSION = SNAPSHOT_VERSION.asInstanceOf[js.Any], SNAPSHOT_VERSION_WARNING = SNAPSHOT_VERSION_WARNING.asInstanceOf[js.Any])
    __obj.updateDynamic("deepMerge")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => deepMerge(t0, t1).runNow()))
    __obj.updateDynamic("ensureDirectoryExists")(js.Any.fromFunction1((t0: java.lang.String) => ensureDirectoryExists(t0).runNow()))
    __obj.updateDynamic("escapeBacktickString")(js.Any.fromFunction1((t0: java.lang.String) => escapeBacktickString(t0).runNow()))
    __obj.updateDynamic("getSnapshotData")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.jestTypes.configMod.SnapshotUpdateState) => getSnapshotData(t0, t1).runNow()))
    __obj.updateDynamic("keyToTestName")(js.Any.fromFunction1((t0: java.lang.String) => keyToTestName(t0).runNow()))
    __obj.updateDynamic("saveSnapshotFile")(js.Any.fromFunction2((t0: typingsJapgolly.std.Record[java.lang.String, java.lang.String], t1: java.lang.String) => saveSnapshotFile(t0, t1).runNow()))
    __obj.updateDynamic("serialize")(js.Any.fromFunction1((t0: java.lang.String) => serialize(t0).runNow()))
    __obj.updateDynamic("testNameToKey")(js.Any.fromFunction2((t0: java.lang.String, t1: scala.Double) => testNameToKey(t0, t1).runNow()))
    __obj.updateDynamic("unescape")(js.Any.fromFunction1((t0: java.lang.String) => unescape(t0).runNow()))
    __obj.asInstanceOf[Typeofutils]
  }
}

