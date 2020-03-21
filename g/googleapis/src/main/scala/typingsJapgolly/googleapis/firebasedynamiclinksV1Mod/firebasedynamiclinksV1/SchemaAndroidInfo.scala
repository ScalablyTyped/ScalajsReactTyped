package typingsJapgolly.googleapis.firebasedynamiclinksV1Mod.firebasedynamiclinksV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Android related attributes to the Dynamic Link.
  */
@js.native
trait SchemaAndroidInfo extends js.Object {
  /**
    * Link to open on Android if the app is not installed.
    */
  var androidFallbackLink: js.UndefOr[String] = js.native
  /**
    * If specified, this overrides the ‘link’ parameter on Android.
    */
  var androidLink: js.UndefOr[String] = js.native
  /**
    * Minimum version code for the Android app. If the installed app’s version
    * code is lower, then the user is taken to the Play Store.
    */
  var androidMinPackageVersionCode: js.UndefOr[String] = js.native
  /**
    * Android package name of the app.
    */
  var androidPackageName: js.UndefOr[String] = js.native
}

object SchemaAndroidInfo {
  @scala.inline
  def apply(
    androidFallbackLink: String = null,
    androidLink: String = null,
    androidMinPackageVersionCode: String = null,
    androidPackageName: String = null
  ): SchemaAndroidInfo = {
    val __obj = js.Dynamic.literal()
    if (androidFallbackLink != null) __obj.updateDynamic("androidFallbackLink")(androidFallbackLink.asInstanceOf[js.Any])
    if (androidLink != null) __obj.updateDynamic("androidLink")(androidLink.asInstanceOf[js.Any])
    if (androidMinPackageVersionCode != null) __obj.updateDynamic("androidMinPackageVersionCode")(androidMinPackageVersionCode.asInstanceOf[js.Any])
    if (androidPackageName != null) __obj.updateDynamic("androidPackageName")(androidPackageName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAndroidInfo]
  }
}

