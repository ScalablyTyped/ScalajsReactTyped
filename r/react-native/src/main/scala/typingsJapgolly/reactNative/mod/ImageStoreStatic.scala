package typingsJapgolly.reactNative.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageStoreStatic extends js.Object {
  /**
    * Stores a base64-encoded image in the ImageStore, and returns a URI that
    * can be used to access or display the image later. Images are stored in
    * memory only, and must be manually deleted when you are finished with
    * them by calling `removeImageForTag()`.
    *
    * Note that it is very inefficient to transfer large quantities of binary
    * data between JS and native code, so you should avoid calling this more
    * than necessary.
    * @platform ios
    */
  def addImageFromBase64(
    base64ImageData: String,
    success: js.Function1[/* uri */ String, Unit],
    failure: js.Function1[/* error */ js.Any, Unit]
  ): Unit
  /**
    * Retrieves the base64-encoded data for an image in the ImageStore. If the
    * specified URI does not match an image in the store, the failure callback
    * will be called.
    *
    * Note that it is very inefficient to transfer large quantities of binary
    * data between JS and native code, so you should avoid calling this more
    * than necessary. To display an image in the ImageStore, you can just pass
    * the URI to an `<Image/>` component; there is no need to retrieve the
    * base64 data.
    */
  def getBase64ForTag(
    uri: String,
    success: js.Function1[/* base64ImageData */ String, Unit],
    failure: js.Function1[/* error */ js.Any, Unit]
  ): Unit
  /**
    * Check if the ImageStore contains image data for the specified URI.
    * @platform ios
    */
  def hasImageForTag(uri: String, callback: js.Function1[/* hasImage */ Boolean, Unit]): Unit
  /**
    * Delete an image from the ImageStore. Images are stored in memory and
    * must be manually removed when you are finished with them, otherwise they
    * will continue to use up RAM until the app is terminated. It is safe to
    * call `removeImageForTag()` without first calling `hasImageForTag()`, it
    * will simply fail silently.
    * @platform ios
    */
  def removeImageForTag(uri: String): Unit
}

object ImageStoreStatic {
  @scala.inline
  def apply(
    addImageFromBase64: (String, js.Function1[/* uri */ String, Unit], js.Function1[/* error */ js.Any, Unit]) => Callback,
    getBase64ForTag: (String, js.Function1[/* base64ImageData */ String, Unit], js.Function1[/* error */ js.Any, Unit]) => Callback,
    hasImageForTag: (String, js.Function1[/* hasImage */ Boolean, Unit]) => Callback,
    removeImageForTag: String => Callback
  ): ImageStoreStatic = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addImageFromBase64")(js.Any.fromFunction3((t0: java.lang.String, t1: js.Function1[/* uri */ java.lang.String, scala.Unit], t2: js.Function1[/* error */ js.Any, scala.Unit]) => addImageFromBase64(t0, t1, t2).runNow()))
    __obj.updateDynamic("getBase64ForTag")(js.Any.fromFunction3((t0: java.lang.String, t1: js.Function1[/* base64ImageData */ java.lang.String, scala.Unit], t2: js.Function1[/* error */ js.Any, scala.Unit]) => getBase64ForTag(t0, t1, t2).runNow()))
    __obj.updateDynamic("hasImageForTag")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function1[/* hasImage */ scala.Boolean, scala.Unit]) => hasImageForTag(t0, t1).runNow()))
    __obj.updateDynamic("removeImageForTag")(js.Any.fromFunction1((t0: java.lang.String) => removeImageForTag(t0).runNow()))
    __obj.asInstanceOf[ImageStoreStatic]
  }
}

