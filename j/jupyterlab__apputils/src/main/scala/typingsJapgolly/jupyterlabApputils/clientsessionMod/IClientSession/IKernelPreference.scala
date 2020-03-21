package typingsJapgolly.jupyterlabApputils.clientsessionMod.IClientSession

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A kernel preference.
  */
trait IKernelPreference extends js.Object {
  /**
    * Whether to auto-start the default kernel if no matching kernel is found.
    */
  val autoStartDefault: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether a kernel can be started.
    */
  val canStart: js.UndefOr[Boolean] = js.undefined
  /**
    * The id of an existing kernel.
    */
  val id: js.UndefOr[String] = js.undefined
  /**
    * The preferred kernel language.
    */
  val language: js.UndefOr[String] = js.undefined
  /**
    * The name of the kernel.
    */
  val name: js.UndefOr[String] = js.undefined
  /**
    * Whether to prefer starting a kernel.
    */
  val shouldStart: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether a kernel needs to be close with the associated session
    */
  val shutdownOnClose: js.UndefOr[Boolean] = js.undefined
}

object IKernelPreference {
  @scala.inline
  def apply(
    autoStartDefault: js.UndefOr[Boolean] = js.undefined,
    canStart: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    language: String = null,
    name: String = null,
    shouldStart: js.UndefOr[Boolean] = js.undefined,
    shutdownOnClose: js.UndefOr[Boolean] = js.undefined
  ): IKernelPreference = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoStartDefault)) __obj.updateDynamic("autoStartDefault")(autoStartDefault.asInstanceOf[js.Any])
    if (!js.isUndefined(canStart)) __obj.updateDynamic("canStart")(canStart.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(shouldStart)) __obj.updateDynamic("shouldStart")(shouldStart.asInstanceOf[js.Any])
    if (!js.isUndefined(shutdownOnClose)) __obj.updateDynamic("shutdownOnClose")(shutdownOnClose.asInstanceOf[js.Any])
    __obj.asInstanceOf[IKernelPreference]
  }
}

