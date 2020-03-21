package typingsJapgolly.pulumiKubernetes.outputMod.core.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * HTTPHeader describes a custom header to be used in HTTP probes
  */
trait HTTPHeader extends js.Object {
  /**
    * The header field name
    */
  val name: String
  /**
    * The header field value
    */
  val value: String
}

object HTTPHeader {
  @scala.inline
  def apply(name: String, value: String): HTTPHeader = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[HTTPHeader]
  }
}

