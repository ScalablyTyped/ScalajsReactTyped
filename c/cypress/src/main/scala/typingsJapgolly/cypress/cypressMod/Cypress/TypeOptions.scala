package typingsJapgolly.cypress.cypressMod.Cypress

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options that control `cy.type` command
  *
  * @see https://on.cypress.io/type
  */
trait TypeOptions
  extends Loggable
     with Timeoutable {
  /**
    * Delay after each keypress (ms)
    *
    * @default 10
    */
  var delay: Double
  /**
    * Forces the action, disables waiting for actionability
    *
    * @default false
    */
  var force: Boolean
  /**
    * Parse special characters for strings surrounded by `{}`,
    * such as `{esc}`. Set to `false` to type the literal characters instead
    *
    * @default true
    */
  var parseSpecialCharSequences: Boolean
  /**
    * Keep a modifier activated between commands
    *
    * @default true
    */
  var release: Boolean
}

object TypeOptions {
  @scala.inline
  def apply(
    delay: Double,
    force: Boolean,
    log: Boolean,
    parseSpecialCharSequences: Boolean,
    release: Boolean,
    timeout: Double
  ): TypeOptions = {
    val __obj = js.Dynamic.literal(delay = delay.asInstanceOf[js.Any], force = force.asInstanceOf[js.Any], log = log.asInstanceOf[js.Any], parseSpecialCharSequences = parseSpecialCharSequences.asInstanceOf[js.Any], release = release.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TypeOptions]
  }
}

