package typingsJapgolly.jupyterlabCoreutils.tokensMod.ISettingRegistry

import typingsJapgolly.phosphorCoreutils.jsonMod.JSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The setting values for a plugin.
  */
trait ISettingBundle extends JSONObject {
  /**
    * A composite of the user setting values and the plugin schema defaults.
    *
    * #### Notes
    * The `composite` values will always be a superset of the `user` values.
    */
  var composite: JSONObject
  /**
    * The user setting values.
    */
  var user: JSONObject
}

object ISettingBundle {
  @scala.inline
  def apply(composite: JSONObject, user: JSONObject): ISettingBundle = {
    val __obj = js.Dynamic.literal(composite = composite.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ISettingBundle]
  }
}

