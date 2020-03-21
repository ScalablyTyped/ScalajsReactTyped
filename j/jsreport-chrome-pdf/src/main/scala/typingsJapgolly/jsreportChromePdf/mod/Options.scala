package typingsJapgolly.jsreportChromePdf.mod

import typingsJapgolly.jsreportChromePdf.PartialLaunchOptions
import typingsJapgolly.jsreportChromePdf.jsreportChromePdfStrings.`dedicated-process`
import typingsJapgolly.jsreportChromePdf.jsreportChromePdfStrings.`http-server`
import typingsJapgolly.jsreportChromePdf.jsreportChromePdfStrings.`in-process`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://jsreport.net/learn/configuration
trait Options extends js.Object {
  var allowLocalFilesAccess: Boolean
  var allowedModules: js.Array[String]
  var host: String
  var launchOptions: PartialLaunchOptions
  var numberOfWorkers: Double
  var portLeftBoundary: Double
  var portRightBoundary: Double
  var strategy: `dedicated-process` | `http-server` | `in-process`
  var timeout: Double
}

object Options {
  @scala.inline
  def apply(
    allowLocalFilesAccess: Boolean,
    allowedModules: js.Array[String],
    host: String,
    launchOptions: PartialLaunchOptions,
    numberOfWorkers: Double,
    portLeftBoundary: Double,
    portRightBoundary: Double,
    strategy: `dedicated-process` | `http-server` | `in-process`,
    timeout: Double
  ): Options = {
    val __obj = js.Dynamic.literal(allowLocalFilesAccess = allowLocalFilesAccess.asInstanceOf[js.Any], allowedModules = allowedModules.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], launchOptions = launchOptions.asInstanceOf[js.Any], numberOfWorkers = numberOfWorkers.asInstanceOf[js.Any], portLeftBoundary = portLeftBoundary.asInstanceOf[js.Any], portRightBoundary = portRightBoundary.asInstanceOf[js.Any], strategy = strategy.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Options]
  }
}

