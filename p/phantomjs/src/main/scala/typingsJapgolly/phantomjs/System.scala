package typingsJapgolly.phantomjs

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait System extends js.Object {
  var args: js.Array[String]
  var env: StringDictionary[String]
  var os: AnonArchitecture
  var pid: Double
  var platform: String
}

object System {
  @scala.inline
  def apply(
    args: js.Array[String],
    env: StringDictionary[String],
    os: AnonArchitecture,
    pid: Double,
    platform: String
  ): System = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], env = env.asInstanceOf[js.Any], os = os.asInstanceOf[js.Any], pid = pid.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[System]
  }
}

