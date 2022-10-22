package typingsJapgolly.openui5.sapMLibraryMod

import typingsJapgolly.openui5.sapMImageMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ImageHelper {
  
  @JSImport("sap/m/library", "ImageHelper")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates or updates an image control.
    *
    * @returns The new or updated image control or icon
    */
  inline def getImageControl(
    /**
    * UD of the image to be dealt with.
    */
  sImgId: String,
    /**
    * The image to update. If undefined, a new image will be created.
    */
  oImage: default,
    /**
    * oImageControl's parentControl.
    */
  oParent: typingsJapgolly.openui5.sapUiCoreControlMod.default,
    /**
    * Settings for the image control; the `src` property MUST be contained; the keys of the object must be
    * valid names of image settings
    */
  mProperties: js.Object,
    /**
    * Array of CSS classes which will be added if the image needs to be created.
    */
  aCssClassesToAdd: js.Array[String],
    /**
    * All CSS classes that oImageControl has and which are contained in this array are removed before adding
    * the CSS classes listed in aCssClassesToAdd.
    */
  aCssClassesToRemove: js.Array[String]
  ): default | typingsJapgolly.openui5.sapUiCoreIconMod.default = (^.asInstanceOf[js.Dynamic].applyDynamic("getImageControl")(sImgId.asInstanceOf[js.Any], oImage.asInstanceOf[js.Any], oParent.asInstanceOf[js.Any], mProperties.asInstanceOf[js.Any], aCssClassesToAdd.asInstanceOf[js.Any], aCssClassesToRemove.asInstanceOf[js.Any])).asInstanceOf[default | typingsJapgolly.openui5.sapUiCoreIconMod.default]
}
