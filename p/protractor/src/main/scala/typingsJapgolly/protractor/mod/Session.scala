package typingsJapgolly.protractor.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("protractor", "Session")
@js.native
class Session protected ()
  extends typingsJapgolly.seleniumWebdriver.mod.Session {
  def this(id: String, capabilities: js.Object) = this()
  // region Constructors
  /**
    * @param {string} id The session ID.
    * @param {!(Object|Capabilities)} capabilities The session
    *     capabilities.
    * @constructor
    */
  def this(id: String, capabilities: typingsJapgolly.seleniumWebdriver.capabilitiesMod.Capabilities) = this()
}

