package typingsJapgolly.googleapis.dataprocV1Mod.dataprocV1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The runtime logging config of the job.
  */
@js.native
trait SchemaLoggingConfig extends js.Object {
  /**
    * The per-package log levels for the driver. This may include
    * &quot;root&quot; package name to configure rootLogger. Examples:
    * &#39;com.google = FATAL&#39;, &#39;root = INFO&#39;, &#39;org.apache =
    * DEBUG&#39;
    */
  var driverLogLevels: js.UndefOr[StringDictionary[String]] = js.native
}

object SchemaLoggingConfig {
  @scala.inline
  def apply(driverLogLevels: StringDictionary[String] = null): SchemaLoggingConfig = {
    val __obj = js.Dynamic.literal()
    if (driverLogLevels != null) __obj.updateDynamic("driverLogLevels")(driverLogLevels.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaLoggingConfig]
  }
}

