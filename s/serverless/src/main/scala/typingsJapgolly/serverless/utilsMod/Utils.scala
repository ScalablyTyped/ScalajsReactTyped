package typingsJapgolly.serverless.utilsMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Utils extends js.Object {
  def appendFileSync(filePath: String, contents: String): js.Thenable[js.Object]
  def copyDirContentsSync(srcDir: String, destDir: String): Unit
  def dirExistsSync(dirPath: String): Boolean
  def fileExistsSync(filePath: String): Boolean
  def findServicePath(): String
  def generateShortId(length: Double): String
  def getVersion(): String
  def logStat(serverless: typingsJapgolly.serverless.mod.^, context: String): js.Thenable[js.Object]
  def readFile(filePath: String): js.Thenable[js.Object]
  def readFileSync(filePath: String): js.Object
  def walkDirSync(dirPath: String): js.Array[String]
  def writeFile(filePath: String, contents: String): js.Thenable[js.Object]
  def writeFileDir(filePath: String): Unit
  def writeFileSync(filePath: String, contents: String): Unit
}

object Utils {
  @scala.inline
  def apply(
    appendFileSync: (String, String) => CallbackTo[js.Thenable[js.Object]],
    copyDirContentsSync: (String, String) => Callback,
    dirExistsSync: String => CallbackTo[Boolean],
    fileExistsSync: String => CallbackTo[Boolean],
    findServicePath: CallbackTo[String],
    generateShortId: Double => CallbackTo[String],
    getVersion: CallbackTo[String],
    logStat: (typingsJapgolly.serverless.mod.^, String) => CallbackTo[js.Thenable[js.Object]],
    readFile: String => CallbackTo[js.Thenable[js.Object]],
    readFileSync: String => CallbackTo[js.Object],
    walkDirSync: String => CallbackTo[js.Array[String]],
    writeFile: (String, String) => CallbackTo[js.Thenable[js.Object]],
    writeFileDir: String => Callback,
    writeFileSync: (String, String) => Callback
  ): Utils = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("appendFileSync")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => appendFileSync(t0, t1).runNow()))
    __obj.updateDynamic("copyDirContentsSync")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => copyDirContentsSync(t0, t1).runNow()))
    __obj.updateDynamic("dirExistsSync")(js.Any.fromFunction1((t0: java.lang.String) => dirExistsSync(t0).runNow()))
    __obj.updateDynamic("fileExistsSync")(js.Any.fromFunction1((t0: java.lang.String) => fileExistsSync(t0).runNow()))
    __obj.updateDynamic("findServicePath")(findServicePath.toJsFn)
    __obj.updateDynamic("generateShortId")(js.Any.fromFunction1((t0: scala.Double) => generateShortId(t0).runNow()))
    __obj.updateDynamic("getVersion")(getVersion.toJsFn)
    __obj.updateDynamic("logStat")(js.Any.fromFunction2((t0: typingsJapgolly.serverless.mod.^, t1: java.lang.String) => logStat(t0, t1).runNow()))
    __obj.updateDynamic("readFile")(js.Any.fromFunction1((t0: java.lang.String) => readFile(t0).runNow()))
    __obj.updateDynamic("readFileSync")(js.Any.fromFunction1((t0: java.lang.String) => readFileSync(t0).runNow()))
    __obj.updateDynamic("walkDirSync")(js.Any.fromFunction1((t0: java.lang.String) => walkDirSync(t0).runNow()))
    __obj.updateDynamic("writeFile")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => writeFile(t0, t1).runNow()))
    __obj.updateDynamic("writeFileDir")(js.Any.fromFunction1((t0: java.lang.String) => writeFileDir(t0).runNow()))
    __obj.updateDynamic("writeFileSync")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => writeFileSync(t0, t1).runNow()))
    __obj.asInstanceOf[Utils]
  }
}

