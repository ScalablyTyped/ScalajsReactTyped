package typingsJapgolly.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.Database")
@js.native
open class Database protected ()
  extends StObject
     with typingsJapgolly.babylonjs.BABYLON.Database {
  /**
    * Creates a new Database
    * @param urlToScene defines the url to load the scene
    * @param callbackManifestChecked defines the callback to use when manifest is checked
    * @param disableManifestCheck defines a boolean indicating that we want to skip the manifest validation (it will be considered validated and up to date)
    */
  def this(urlToScene: String, callbackManifestChecked: js.Function1[/* checked */ Boolean, Any]) = this()
  def this(
    urlToScene: String,
    callbackManifestChecked: js.Function1[/* checked */ Boolean, Any],
    disableManifestCheck: Boolean
  ) = this()
}
/* static members */
object Database {
  
  @JSGlobal("BABYLON.Database")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Gets a boolean indicating if Database storage is enabled (off by default)
    */
  @JSGlobal("BABYLON.Database.IDBStorageEnabled")
  @js.native
  def IDBStorageEnabled: Boolean = js.native
  inline def IDBStorageEnabled_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IDBStorageEnabled")(x.asInstanceOf[js.Any])
  
  /** Gets a boolean indicating if the user agent supports blob storage (this value will be updated after creating the first Database object) */
  @JSGlobal("BABYLON.Database._IsUASupportingBlobStorage")
  @js.native
  def _IsUASupportingBlobStorage: Any = js.native
  inline def _IsUASupportingBlobStorage_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_IsUASupportingBlobStorage")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.Database._ParseURL")
  @js.native
  def _ParseURL: Any = js.native
  inline def _ParseURL_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_ParseURL")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.Database._ReturnFullUrlLocation")
  @js.native
  def _ReturnFullUrlLocation: Any = js.native
  inline def _ReturnFullUrlLocation_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_ReturnFullUrlLocation")(x.asInstanceOf[js.Any])
  
  /**
    * Validates if xhr data is correct
    * @param xhr defines the request to validate
    * @param dataType defines the expected data type
    * @returns true if data is correct
    */
  @JSGlobal("BABYLON.Database._ValidateXHRData")
  @js.native
  def _ValidateXHRData: Any = js.native
  inline def _ValidateXHRData_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_ValidateXHRData")(x.asInstanceOf[js.Any])
}
