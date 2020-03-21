package typingsJapgolly.cypress.cypressMod

import typingsJapgolly.cypress.PartialCypressConfigurati
import typingsJapgolly.cypress.cypressBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * All options that one can pass to "cypress.open"
  * @see https://on.cypress.io/module-api#cypress-open
  * @example
  ```
  const cypress = require('cypress')
  cypress.open({
  env: {
  username: 'Joe Doe',
  email: 'joe@acme.co'
  },
  project: '~/demos/my-project'
  })
  ```
  */
trait CypressOpenOptions extends CypressCommonOptions {
  /**
    * Specify a filesystem path to a custom browser
    */
  var browser: String
  /**
    * Open Cypress in detached mode
    */
  var detached: Boolean
  /**
    * Run in global mode
    */
  var global: Boolean
  /**
    * Override default port
    */
  var port: Double
}

object CypressOpenOptions {
  @scala.inline
  def apply(
    browser: String,
    config: PartialCypressConfigurati,
    configFile: String | `false`,
    detached: Boolean,
    env: js.Object,
    global: Boolean,
    port: Double,
    project: String
  ): CypressOpenOptions = {
    val __obj = js.Dynamic.literal(browser = browser.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], configFile = configFile.asInstanceOf[js.Any], detached = detached.asInstanceOf[js.Any], env = env.asInstanceOf[js.Any], global = global.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CypressOpenOptions]
  }
}

