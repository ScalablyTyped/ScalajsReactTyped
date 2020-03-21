package typingsJapgolly.wonderJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015", "ProgramTable")
@js.native
class ProgramTable ()
  extends typingsJapgolly.wonderJs.programTableMod.ProgramTable

/* static members */
@JSImport("wonder.js/dist/es2015", "ProgramTable")
@js.native
object ProgramTable extends js.Object {
  var lastUsedProgram: typingsJapgolly.wonderJs.programMod.Program = js.native
  def addProgram(key: String, program: typingsJapgolly.wonderJs.programMod.Program): Unit = js.native
  def clearAll(): Unit = js.native
  def dispose(): Unit = js.native
  def getProgram(key: String): typingsJapgolly.wonderJs.programMod.Program = js.native
  def hasProgram(key: String): Boolean = js.native
}

