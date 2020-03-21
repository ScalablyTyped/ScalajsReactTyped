package typingsJapgolly.gulpIstanbul.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Coverage extends js.Object {
  var branches: CoverageStats
  var functions: CoverageStats
  var lines: CoverageStats
  var statements: CoverageStats
}

object Coverage {
  @scala.inline
  def apply(branches: CoverageStats, functions: CoverageStats, lines: CoverageStats, statements: CoverageStats): Coverage = {
    val __obj = js.Dynamic.literal(branches = branches.asInstanceOf[js.Any], functions = functions.asInstanceOf[js.Any], lines = lines.asInstanceOf[js.Any], statements = statements.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Coverage]
  }
}

