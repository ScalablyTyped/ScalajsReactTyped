package typingsJapgolly.firebaseInstallations.firebaseDependenciesMod

import typingsJapgolly.firebaseComponent.mod.Provider
import typingsJapgolly.firebaseInstallations.appConfigMod.AppConfig
import typingsJapgolly.firebaseInstallations.firebaseInstallationsStrings.`platform-logger`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FirebaseDependencies extends js.Object {
  val appConfig: AppConfig
  val platformLoggerProvider: Provider[`platform-logger`]
}

object FirebaseDependencies {
  @scala.inline
  def apply(appConfig: AppConfig, platformLoggerProvider: Provider[`platform-logger`]): FirebaseDependencies = {
    val __obj = js.Dynamic.literal(appConfig = appConfig.asInstanceOf[js.Any], platformLoggerProvider = platformLoggerProvider.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FirebaseDependencies]
  }
}

