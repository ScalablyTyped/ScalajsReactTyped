package typingsJapgolly.useragent.mod

import typingsJapgolly.useragent.AnonFamily
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("useragent", "OperatingSystem")
@js.native
/**
  * The representation of a parsed Operating System.
  * @param family The name of the os
  * @param major Major version of the os
  * @param minor Minor version of the os
  * @param patch Patch version of the os
  */
class OperatingSystem () extends js.Object {
  def this(family: String) = this()
  def this(family: String, major: String) = this()
  def this(family: String, major: String, minor: String) = this()
  def this(family: String, major: String, minor: String, patch: String) = this()
  var family: String = js.native
  var major: String = js.native
  var minor: String = js.native
  var patch: String = js.native
  /**
    * Outputs a JSON string of the OS, values are defaulted to undefined so they are not outputed in the stringify.
    */
  def toJSON(): AnonFamily = js.native
  /**
    * Generates the version of the Operating System.
    */
  def toVersion(): String = js.native
}

