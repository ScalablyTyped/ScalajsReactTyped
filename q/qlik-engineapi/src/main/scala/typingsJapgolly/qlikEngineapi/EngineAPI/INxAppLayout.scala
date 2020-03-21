package typingsJapgolly.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NxAppLayout ...
  */
trait INxAppLayout extends js.Object {
  /**
    * In Qlik Sense Enterprise, this property corresponds to the app identifier (GUID).
    * In Qlik Sense Desktop, this property corresponds to the full path of the app.
    */
  var qFileName: String
  /**
    * Is set to true if the app contains data following a script reload.
    */
  var qHasData: Boolean
  /**
    * Is set to true if a script is defined in the app.
    */
  var qHasScript: Boolean
  /**
    * If set to true, it means that the app was opened without loading its data.
    */
  var qIsOpenedWithoutData: Boolean
  /**
    * Date and time of the last reload of the app in ISO format.
    */
  var qLastReloadTime: String
  /**
    * Information about the locale.
    */
  var qLocaleInfo: ILocaleInfo
  /**
    * Information on publishing and permissions.
    */
  var qMeta: INxMeta
  /**
    * Is set to true if the app has been updated since the last save.
    */
  var qModified: Boolean
  /**
    * If set to true, it means that the app is read-only.
    */
  var qReadOnly: Boolean
  /**
    * Array of alternate states.
    */
  var qStateNames: js.Array[String]
  /**
    * App thumbnail.
    */
  var qThumbnail: IStaticContentUrl
  /**
    * Title of the app.
    */
  var qTitle: String
}

object INxAppLayout {
  @scala.inline
  def apply(
    qFileName: String,
    qHasData: Boolean,
    qHasScript: Boolean,
    qIsOpenedWithoutData: Boolean,
    qLastReloadTime: String,
    qLocaleInfo: ILocaleInfo,
    qMeta: INxMeta,
    qModified: Boolean,
    qReadOnly: Boolean,
    qStateNames: js.Array[String],
    qThumbnail: IStaticContentUrl,
    qTitle: String
  ): INxAppLayout = {
    val __obj = js.Dynamic.literal(qFileName = qFileName.asInstanceOf[js.Any], qHasData = qHasData.asInstanceOf[js.Any], qHasScript = qHasScript.asInstanceOf[js.Any], qIsOpenedWithoutData = qIsOpenedWithoutData.asInstanceOf[js.Any], qLastReloadTime = qLastReloadTime.asInstanceOf[js.Any], qLocaleInfo = qLocaleInfo.asInstanceOf[js.Any], qMeta = qMeta.asInstanceOf[js.Any], qModified = qModified.asInstanceOf[js.Any], qReadOnly = qReadOnly.asInstanceOf[js.Any], qStateNames = qStateNames.asInstanceOf[js.Any], qThumbnail = qThumbnail.asInstanceOf[js.Any], qTitle = qTitle.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[INxAppLayout]
  }
}

