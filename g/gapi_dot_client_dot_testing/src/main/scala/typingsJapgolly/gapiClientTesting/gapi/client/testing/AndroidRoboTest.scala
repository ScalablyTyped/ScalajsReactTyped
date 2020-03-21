package typingsJapgolly.gapiClientTesting.gapi.client.testing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AndroidRoboTest extends js.Object {
  /**
    * The APK for the application under test.
    * Required
    */
  var appApk: js.UndefOr[FileReference] = js.undefined
  /**
    * The initial activity that should be used to start the app.
    * Optional
    */
  var appInitialActivity: js.UndefOr[String] = js.undefined
  /**
    * The java package for the application under test.
    * Optional, default is determined by examining the application's manifest.
    */
  var appPackageId: js.UndefOr[String] = js.undefined
  /**
    * The max depth of the traversal stack Robo can explore. Needs to be at least
    * 2 to make Robo explore the app beyond the first activity.
    * Default is 50.
    * Optional
    */
  var maxDepth: js.UndefOr[Double] = js.undefined
  /**
    * The max number of steps Robo can execute.
    * Default is no limit.
    * Optional
    */
  var maxSteps: js.UndefOr[Double] = js.undefined
  /**
    * A set of directives Robo should apply during the crawl.
    * This allows users to customize the crawl. For example, the username and
    * password for a test account can be provided.
    * Optional
    */
  var roboDirectives: js.UndefOr[js.Array[RoboDirective]] = js.undefined
}

object AndroidRoboTest {
  @scala.inline
  def apply(
    appApk: FileReference = null,
    appInitialActivity: String = null,
    appPackageId: String = null,
    maxDepth: Int | Double = null,
    maxSteps: Int | Double = null,
    roboDirectives: js.Array[RoboDirective] = null
  ): AndroidRoboTest = {
    val __obj = js.Dynamic.literal()
    if (appApk != null) __obj.updateDynamic("appApk")(appApk.asInstanceOf[js.Any])
    if (appInitialActivity != null) __obj.updateDynamic("appInitialActivity")(appInitialActivity.asInstanceOf[js.Any])
    if (appPackageId != null) __obj.updateDynamic("appPackageId")(appPackageId.asInstanceOf[js.Any])
    if (maxDepth != null) __obj.updateDynamic("maxDepth")(maxDepth.asInstanceOf[js.Any])
    if (maxSteps != null) __obj.updateDynamic("maxSteps")(maxSteps.asInstanceOf[js.Any])
    if (roboDirectives != null) __obj.updateDynamic("roboDirectives")(roboDirectives.asInstanceOf[js.Any])
    __obj.asInstanceOf[AndroidRoboTest]
  }
}

