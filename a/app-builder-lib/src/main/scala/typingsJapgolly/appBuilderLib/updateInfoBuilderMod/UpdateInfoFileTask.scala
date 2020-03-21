package typingsJapgolly.appBuilderLib.updateInfoBuilderMod

import typingsJapgolly.appBuilderLib.platformPackagerMod.PlatformPackager
import typingsJapgolly.builderUtilRuntime.publishOptionsMod.PublishConfiguration
import typingsJapgolly.builderUtilRuntime.updateInfoMod.UpdateInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateInfoFileTask extends js.Object {
  val file: String
  val info: UpdateInfo
  val packager: PlatformPackager[_]
  val publishConfiguration: PublishConfiguration
}

object UpdateInfoFileTask {
  @scala.inline
  def apply(
    file: String,
    info: UpdateInfo,
    packager: PlatformPackager[_],
    publishConfiguration: PublishConfiguration
  ): UpdateInfoFileTask = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], packager = packager.asInstanceOf[js.Any], publishConfiguration = publishConfiguration.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UpdateInfoFileTask]
  }
}

