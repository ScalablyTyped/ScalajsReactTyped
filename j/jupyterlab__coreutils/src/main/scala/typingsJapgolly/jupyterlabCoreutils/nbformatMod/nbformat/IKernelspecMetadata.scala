package typingsJapgolly.jupyterlabCoreutils.nbformatMod.nbformat

import typingsJapgolly.phosphorCoreutils.jsonMod.JSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The kernelspec metadata.
  */
trait IKernelspecMetadata extends JSONObject {
  var display_name: String
  var name: String
}

object IKernelspecMetadata {
  @scala.inline
  def apply(display_name: String, name: String): IKernelspecMetadata = {
    val __obj = js.Dynamic.literal(display_name = display_name.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IKernelspecMetadata]
  }
}

