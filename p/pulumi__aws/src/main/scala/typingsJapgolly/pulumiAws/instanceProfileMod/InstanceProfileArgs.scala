package typingsJapgolly.pulumiAws.instanceProfileMod

import typingsJapgolly.pulumiAws.roleMod.Role
import typingsJapgolly.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceProfileArgs extends js.Object {
  /**
    * The profile's name. If omitted, this provider will assign a random, unique name.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * Creates a unique name beginning with the specified prefix. Conflicts with `name`.
    */
  val namePrefix: js.UndefOr[Input[String]] = js.native
  /**
    * Path in which to create the profile.
    */
  val path: js.UndefOr[Input[String]] = js.native
  /**
    * The role name to include in the profile.
    */
  val role: js.UndefOr[Input[String | Role]] = js.native
  /**
    *
    * A list of role names to include in the profile.  The current default is 1.  If you see an error message similar to `Cannot exceed quota for InstanceSessionsPerInstanceProfile: 1`, then you must contact AWS support and ask for a limit increase.
    */
  val roles: js.UndefOr[Input[js.Array[Input[String | Role]]]] = js.native
}

object InstanceProfileArgs {
  @scala.inline
  def apply(
    name: Input[String] = null,
    namePrefix: Input[String] = null,
    path: Input[String] = null,
    role: Input[String | Role] = null,
    roles: Input[js.Array[Input[String | Role]]] = null
  ): InstanceProfileArgs = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (namePrefix != null) __obj.updateDynamic("namePrefix")(namePrefix.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (roles != null) __obj.updateDynamic("roles")(roles.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceProfileArgs]
  }
}

