package typingsJapgolly.scriptableIos.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * _Provides access to your photo library._
  * @see https://docs.scriptable.app/photos
  */
object Photos {
  
  @JSGlobal("Photos")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * _Opens the camera for taking an image._
    *
    * Use this for taking a new image using the camera.
    * @see https://docs.scriptable.app/photos/#fromcamera
    */
  inline def fromCamera(): js.Promise[typingsJapgolly.scriptableIos.Image] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromCamera")().asInstanceOf[js.Promise[typingsJapgolly.scriptableIos.Image]]
  
  /**
    * _Presents the photo library for picking an image._
    *
    * Use this for picking an image from the photo library.
    * @see https://docs.scriptable.app/photos/#fromlibrary
    */
  inline def fromLibrary(): js.Promise[typingsJapgolly.scriptableIos.Image] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromLibrary")().asInstanceOf[js.Promise[typingsJapgolly.scriptableIos.Image]]
  
  /**
    * _Get latest photo._
    *
    * Reads the latest photo from your photo library. If no photo is available, the promise will be rejected.
    * @see https://docs.scriptable.app/photos/#latestphoto
    */
  inline def latestPhoto(): js.Promise[typingsJapgolly.scriptableIos.Image] = ^.asInstanceOf[js.Dynamic].applyDynamic("latestPhoto")().asInstanceOf[js.Promise[typingsJapgolly.scriptableIos.Image]]
  
  /**
    * _Get latest photos._
    *
    * Reads the latests photos from your photo library. If no photo is available, the promise will be rejected.
    * @param count - Number of photos to fetch.
    * @see https://docs.scriptable.app/photos/#latestphotos
    */
  inline def latestPhotos(count: Double): js.Promise[js.Array[typingsJapgolly.scriptableIos.Image]] = ^.asInstanceOf[js.Dynamic].applyDynamic("latestPhotos")(count.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[typingsJapgolly.scriptableIos.Image]]]
  
  /**
    * _Get latest screenshot._
    *
    * Reads the latest screenshot from your photo library. If no screenshot is available, the promise will be rejected.
    * @see https://docs.scriptable.app/photos/#latestscreenshot
    */
  inline def latestScreenshot(): js.Promise[typingsJapgolly.scriptableIos.Image] = ^.asInstanceOf[js.Dynamic].applyDynamic("latestScreenshot")().asInstanceOf[js.Promise[typingsJapgolly.scriptableIos.Image]]
  
  /**
    * _Get latest screenshots._
    *
    * Reads the latests screenshots from your photo library. If no screenshot is available, the promise will be rejected.
    * @param count - Number of screenshots to fetch.
    * @see https://docs.scriptable.app/photos/#latestscreenshots
    */
  inline def latestScreenshots(count: Double): js.Promise[js.Array[typingsJapgolly.scriptableIos.Image]] = ^.asInstanceOf[js.Dynamic].applyDynamic("latestScreenshots")(count.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[typingsJapgolly.scriptableIos.Image]]]
  
  /**
    * _Removes latest photo._
    *
    * Before removing the photo, an alert is shown prompting you to confirm the removal.
    * @see https://docs.scriptable.app/photos/#removelatestphoto
    */
  inline def removeLatestPhoto(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeLatestPhoto")().asInstanceOf[Unit]
  
  /**
    * _Removes latest photos._
    *
    * Before removing the photos, an alert is shown prompting you to confirm the removal.
    * @param count - Number of photos to remove.
    * @see https://docs.scriptable.app/photos/#removelatestphotos
    */
  inline def removeLatestPhotos(count: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeLatestPhotos")(count.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * _Removes latest screenshot._
    *
    * Before removing the screenshot, an alert is shown prompting you to confirm the removal.
    * @see https://docs.scriptable.app/photos/#removelatestscreenshot
    */
  inline def removeLatestScreenshot(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeLatestScreenshot")().asInstanceOf[Unit]
  
  /**
    * _Removes latest screenshots._
    *
    * Before removing the screenshots, an alert is shown prompting you to confirm the removal.
    * @param count - Number of screenshots to remove.
    * @see https://docs.scriptable.app/photos/#removelatestscreenshots
    */
  inline def removeLatestScreenshots(count: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeLatestScreenshots")(count.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * _Save an image._
    *
    * Saves the image to the photo library.
    * @param image - The image to save.
    * @see https://docs.scriptable.app/photos/#save
    */
  inline def save(image: typingsJapgolly.scriptableIos.Image): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("save")(image.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
