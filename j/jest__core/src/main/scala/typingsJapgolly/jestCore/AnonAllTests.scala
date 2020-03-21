package typingsJapgolly.jestCore

import typingsJapgolly.jestCore.jestCoreStrings.globalSetup
import typingsJapgolly.jestCore.jestCoreStrings.globalTeardown
import typingsJapgolly.jestRunner.typesMod.Test
import typingsJapgolly.jestTypes.configMod.GlobalConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAllTests extends js.Object {
  var allTests: js.Array[Test]
  var globalConfig: GlobalConfig
  var moduleName: globalSetup | globalTeardown
}

object AnonAllTests {
  @scala.inline
  def apply(allTests: js.Array[Test], globalConfig: GlobalConfig, moduleName: globalSetup | globalTeardown): AnonAllTests = {
    val __obj = js.Dynamic.literal(allTests = allTests.asInstanceOf[js.Any], globalConfig = globalConfig.asInstanceOf[js.Any], moduleName = moduleName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAllTests]
  }
}

