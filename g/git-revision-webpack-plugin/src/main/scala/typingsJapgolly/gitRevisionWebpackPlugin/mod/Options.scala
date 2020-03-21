package typingsJapgolly.gitRevisionWebpackPlugin.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var branch: js.UndefOr[Boolean] = js.undefined
  var branchCommand: js.UndefOr[String] = js.undefined
  var commithashCommand: js.UndefOr[String] = js.undefined
  var gitWorkTree: js.UndefOr[String] = js.undefined
  var lightweightTags: js.UndefOr[Boolean] = js.undefined
  var versionCommand: js.UndefOr[String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    branch: js.UndefOr[Boolean] = js.undefined,
    branchCommand: String = null,
    commithashCommand: String = null,
    gitWorkTree: String = null,
    lightweightTags: js.UndefOr[Boolean] = js.undefined,
    versionCommand: String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(branch)) __obj.updateDynamic("branch")(branch.asInstanceOf[js.Any])
    if (branchCommand != null) __obj.updateDynamic("branchCommand")(branchCommand.asInstanceOf[js.Any])
    if (commithashCommand != null) __obj.updateDynamic("commithashCommand")(commithashCommand.asInstanceOf[js.Any])
    if (gitWorkTree != null) __obj.updateDynamic("gitWorkTree")(gitWorkTree.asInstanceOf[js.Any])
    if (!js.isUndefined(lightweightTags)) __obj.updateDynamic("lightweightTags")(lightweightTags.asInstanceOf[js.Any])
    if (versionCommand != null) __obj.updateDynamic("versionCommand")(versionCommand.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

