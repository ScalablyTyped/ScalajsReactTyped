package typingsJapgolly.vsoNodeApi.testInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CodeCoverageSummary extends js.Object {
  /**
    * Uri of build for which data is retrieved/published
    */
  var build: ShallowReference
  /**
    * List of coverage data and details for the build
    */
  var coverageData: js.Array[CodeCoverageData]
  /**
    * Uri of build against which difference in coverage is computed
    */
  var deltaBuild: ShallowReference
}

object CodeCoverageSummary {
  @scala.inline
  def apply(build: ShallowReference, coverageData: js.Array[CodeCoverageData], deltaBuild: ShallowReference): CodeCoverageSummary = {
    val __obj = js.Dynamic.literal(build = build.asInstanceOf[js.Any], coverageData = coverageData.asInstanceOf[js.Any], deltaBuild = deltaBuild.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CodeCoverageSummary]
  }
}

