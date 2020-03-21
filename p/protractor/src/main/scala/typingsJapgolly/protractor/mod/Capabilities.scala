package typingsJapgolly.protractor.mod

import typingsJapgolly.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("protractor", "Capabilities")
@js.native
// region Constructors
/**
  * @param {(Capabilities|Map<string, ?>|Object)=} other Another set of
  *     capabilities to initialize this instance from.
  */
class Capabilities ()
  extends typingsJapgolly.seleniumWebdriver.mod.Capabilities {
  def this(other: js.Object) = this()
  def this(other: typingsJapgolly.seleniumWebdriver.capabilitiesMod.Capabilities) = this()
  def this(other: Map[String, _]) = this()
}

/* static members */
@JSImport("protractor", "Capabilities")
@js.native
object Capabilities extends js.Object {
  // endregion
  // region Static Methods
  /**
    * @return {!Capabilities} A basic set of capabilities for Chrome.
    */
  def chrome(): typingsJapgolly.seleniumWebdriver.capabilitiesMod.Capabilities = js.native
  /**
    * @return {!Capabilities} A basic set of capabilities for Microsoft Edge.
    */
  def edge(): typingsJapgolly.seleniumWebdriver.capabilitiesMod.Capabilities = js.native
  /**
    * @return {!Capabilities} A basic set of capabilities for Firefox.
    */
  def firefox(): typingsJapgolly.seleniumWebdriver.capabilitiesMod.Capabilities = js.native
  /**
    * @return {!Capabilities} A basic set of capabilities for
    *     Internet Explorer.
    */
  def ie(): typingsJapgolly.seleniumWebdriver.capabilitiesMod.Capabilities = js.native
  /**
    * @return {!Capabilities} A basic set of capabilities for Safari.
    */
  def safari(): typingsJapgolly.seleniumWebdriver.capabilitiesMod.Capabilities = js.native
}

