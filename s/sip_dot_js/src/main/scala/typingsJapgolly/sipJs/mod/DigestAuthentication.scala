package typingsJapgolly.sipJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js", "DigestAuthentication")
@js.native
class DigestAuthentication protected ()
  extends typingsJapgolly.sipJs.coreMod.DigestAuthentication {
  def this(loggerFactory: typingsJapgolly.sipJs.logMod.LoggerFactory) = this()
  def this(loggerFactory: typingsJapgolly.sipJs.logMod.LoggerFactory, username: String) = this()
  def this(
    loggerFactory: typingsJapgolly.sipJs.logMod.LoggerFactory,
    username: js.UndefOr[scala.Nothing],
    password: String
  ) = this()
  /**
    * Constructor.
    * @param loggerFactory - LoggerFactory.
    * @param username - Username.
    * @param password - Password.
    */
  def this(loggerFactory: typingsJapgolly.sipJs.logMod.LoggerFactory, username: String, password: String) = this()
}

