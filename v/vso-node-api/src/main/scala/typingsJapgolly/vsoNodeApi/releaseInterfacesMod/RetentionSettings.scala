package typingsJapgolly.vsoNodeApi.releaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RetentionSettings extends js.Object {
  var daysToKeepDeletedReleases: Double
  var defaultEnvironmentRetentionPolicy: EnvironmentRetentionPolicy
  var maximumEnvironmentRetentionPolicy: EnvironmentRetentionPolicy
}

object RetentionSettings {
  @scala.inline
  def apply(
    daysToKeepDeletedReleases: Double,
    defaultEnvironmentRetentionPolicy: EnvironmentRetentionPolicy,
    maximumEnvironmentRetentionPolicy: EnvironmentRetentionPolicy
  ): RetentionSettings = {
    val __obj = js.Dynamic.literal(daysToKeepDeletedReleases = daysToKeepDeletedReleases.asInstanceOf[js.Any], defaultEnvironmentRetentionPolicy = defaultEnvironmentRetentionPolicy.asInstanceOf[js.Any], maximumEnvironmentRetentionPolicy = maximumEnvironmentRetentionPolicy.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RetentionSettings]
  }
}

