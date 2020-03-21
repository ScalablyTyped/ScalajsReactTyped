package typingsJapgolly.pulumiKubernetes.outputMod.rbac.v1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * RoleRef contains information that points to the role being used
  */
trait RoleRef extends js.Object {
  /**
    * APIGroup is the group for the resource being referenced
    */
  val apiGroup: String
  /**
    * Kind is the type of resource being referenced
    */
  val kind: String
  /**
    * Name is the name of resource being referenced
    */
  val name: String
}

object RoleRef {
  @scala.inline
  def apply(apiGroup: String, kind: String, name: String): RoleRef = {
    val __obj = js.Dynamic.literal(apiGroup = apiGroup.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RoleRef]
  }
}

