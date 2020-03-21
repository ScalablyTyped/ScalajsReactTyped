package typingsJapgolly.awsSdk.sesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigurationSet extends js.Object {
  /**
    * The name of the configuration set. The name must meet the following requirements:   Contain only letters (a-z, A-Z), numbers (0-9), underscores (_), or dashes (-).   Contain 64 characters or fewer.  
    */
  var Name: ConfigurationSetName = js.native
}

object ConfigurationSet {
  @scala.inline
  def apply(Name: ConfigurationSetName): ConfigurationSet = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ConfigurationSet]
  }
}

