package typingsJapgolly.gapiClientAppengine.gapi.client.appengine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Application extends js.Object {
  /** Google Apps authentication domain that controls which users can access this application.Defaults to open access for any Google Account. */
  var authDomain: js.UndefOr[String] = js.undefined
  /**
    * Google Cloud Storage bucket that can be used for storing files associated with this application. This bucket is associated with the application and can
    * be used by the gcloud deployment commands.@OutputOnly
    */
  var codeBucket: js.UndefOr[String] = js.undefined
  /** Google Cloud Storage bucket that can be used by this application to store content.@OutputOnly */
  var defaultBucket: js.UndefOr[String] = js.undefined
  /** Cookie expiration policy for this application. */
  var defaultCookieExpiration: js.UndefOr[String] = js.undefined
  /** Hostname used to reach this application, as resolved by App Engine.@OutputOnly */
  var defaultHostname: js.UndefOr[String] = js.undefined
  /**
    * HTTP path dispatch rules for requests to the application that do not explicitly target a service or version. Rules are order-dependent. Up to 20
    * dispatch rules can be supported.@OutputOnly
    */
  var dispatchRules: js.UndefOr[js.Array[UrlDispatchRule]] = js.undefined
  /** The feature specific settings to be used in the application. */
  var featureSettings: js.UndefOr[FeatureSettings] = js.undefined
  /** The Google Container Registry domain used for storing managed build docker images for this application. */
  var gcrDomain: js.UndefOr[String] = js.undefined
  var iap: js.UndefOr[IdentityAwareProxy] = js.undefined
  /**
    * Identifier of the Application resource. This identifier is equivalent to the project ID of the Google Cloud Platform project where you want to deploy
    * your application. Example: myapp.
    */
  var id: js.UndefOr[String] = js.undefined
  /**
    * Location from which this application will be run. Application instances will run out of data centers in the chosen location, which is also where all of
    * the application's end user content is stored.Defaults to us-central.Options are:us-central - Central USeurope-west - Western Europeus-east1 - Eastern
    * US
    */
  var locationId: js.UndefOr[String] = js.undefined
  /** Full path to the Application resource in the API. Example: apps/myapp.@OutputOnly */
  var name: js.UndefOr[String] = js.undefined
  /** Serving status of this application. */
  var servingStatus: js.UndefOr[String] = js.undefined
}

object Application {
  @scala.inline
  def apply(
    authDomain: String = null,
    codeBucket: String = null,
    defaultBucket: String = null,
    defaultCookieExpiration: String = null,
    defaultHostname: String = null,
    dispatchRules: js.Array[UrlDispatchRule] = null,
    featureSettings: FeatureSettings = null,
    gcrDomain: String = null,
    iap: IdentityAwareProxy = null,
    id: String = null,
    locationId: String = null,
    name: String = null,
    servingStatus: String = null
  ): Application = {
    val __obj = js.Dynamic.literal()
    if (authDomain != null) __obj.updateDynamic("authDomain")(authDomain.asInstanceOf[js.Any])
    if (codeBucket != null) __obj.updateDynamic("codeBucket")(codeBucket.asInstanceOf[js.Any])
    if (defaultBucket != null) __obj.updateDynamic("defaultBucket")(defaultBucket.asInstanceOf[js.Any])
    if (defaultCookieExpiration != null) __obj.updateDynamic("defaultCookieExpiration")(defaultCookieExpiration.asInstanceOf[js.Any])
    if (defaultHostname != null) __obj.updateDynamic("defaultHostname")(defaultHostname.asInstanceOf[js.Any])
    if (dispatchRules != null) __obj.updateDynamic("dispatchRules")(dispatchRules.asInstanceOf[js.Any])
    if (featureSettings != null) __obj.updateDynamic("featureSettings")(featureSettings.asInstanceOf[js.Any])
    if (gcrDomain != null) __obj.updateDynamic("gcrDomain")(gcrDomain.asInstanceOf[js.Any])
    if (iap != null) __obj.updateDynamic("iap")(iap.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (locationId != null) __obj.updateDynamic("locationId")(locationId.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (servingStatus != null) __obj.updateDynamic("servingStatus")(servingStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[Application]
  }
}

