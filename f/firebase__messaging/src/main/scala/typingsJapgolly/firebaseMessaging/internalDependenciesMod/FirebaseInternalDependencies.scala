package typingsJapgolly.firebaseMessaging.internalDependenciesMod

import typingsJapgolly.firebaseComponent.mod.Provider
import typingsJapgolly.firebaseInstallationsTypes.mod.FirebaseInstallations
import typingsJapgolly.firebaseMessaging.appConfigMod.AppConfig
import typingsJapgolly.firebaseMessaging.mod.FirebaseApp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FirebaseInternalDependencies extends js.Object {
  var analyticsProvider: Provider[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FirebaseAnalyticsInternalName */ _
  ]
  var app: FirebaseApp
  var appConfig: AppConfig
  var installations: FirebaseInstallations
}

object FirebaseInternalDependencies {
  @scala.inline
  def apply(
    analyticsProvider: Provider[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FirebaseAnalyticsInternalName */ _
    ],
    app: FirebaseApp,
    appConfig: AppConfig,
    installations: FirebaseInstallations
  ): FirebaseInternalDependencies = {
    val __obj = js.Dynamic.literal(analyticsProvider = analyticsProvider.asInstanceOf[js.Any], app = app.asInstanceOf[js.Any], appConfig = appConfig.asInstanceOf[js.Any], installations = installations.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FirebaseInternalDependencies]
  }
}

