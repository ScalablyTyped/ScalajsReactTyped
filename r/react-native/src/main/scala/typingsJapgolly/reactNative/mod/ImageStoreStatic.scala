package typingsJapgolly.reactNative.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageStoreStatic extends StObject {
  
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
    failure: js.Function1[/* error */ Any, Unit]
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
    failure: js.Function1[/* error */ Any, Unit]
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
  
  inline def apply(
    addImageFromBase64: (String, js.Function1[/* uri */ String, Unit], js.Function1[/* error */ Any, Unit]) => Callback,
    getBase64ForTag: (String, js.Function1[/* base64ImageData */ String, Unit], js.Function1[/* error */ Any, Unit]) => Callback,
    hasImageForTag: (String, js.Function1[/* hasImage */ Boolean, Unit]) => Callback,
    removeImageForTag: String => Callback
  ): ImageStoreStatic = {
    val __obj = js.Dynamic.literal(addImageFromBase64 = js.Any.fromFunction3((t0: String, t1: js.Function1[/* uri */ String, Unit], t2: js.Function1[/* error */ Any, Unit]) => (addImageFromBase64(t0, t1, t2)).runNow()), getBase64ForTag = js.Any.fromFunction3((t0: String, t1: js.Function1[/* base64ImageData */ String, Unit], t2: js.Function1[/* error */ Any, Unit]) => (getBase64ForTag(t0, t1, t2)).runNow()), hasImageForTag = js.Any.fromFunction2((t0: String, t1: js.Function1[/* hasImage */ Boolean, Unit]) => (hasImageForTag(t0, t1)).runNow()), removeImageForTag = js.Any.fromFunction1((t0: String) => removeImageForTag(t0).runNow()))
    __obj.asInstanceOf[ImageStoreStatic]
  }
  
  extension [Self <: ImageStoreStatic](x: Self) {
    
    inline def setAddImageFromBase64(
      value: (String, js.Function1[/* uri */ String, Unit], js.Function1[/* error */ Any, Unit]) => Callback
    ): Self = StObject.set(x, "addImageFromBase64", js.Any.fromFunction3((t0: String, t1: js.Function1[/* uri */ String, Unit], t2: js.Function1[/* error */ Any, Unit]) => (value(t0, t1, t2)).runNow()))
    
    inline def setGetBase64ForTag(
      value: (String, js.Function1[/* base64ImageData */ String, Unit], js.Function1[/* error */ Any, Unit]) => Callback
    ): Self = StObject.set(x, "getBase64ForTag", js.Any.fromFunction3((t0: String, t1: js.Function1[/* base64ImageData */ String, Unit], t2: js.Function1[/* error */ Any, Unit]) => (value(t0, t1, t2)).runNow()))
    
    inline def setHasImageForTag(value: (String, js.Function1[/* hasImage */ Boolean, Unit]) => Callback): Self = StObject.set(x, "hasImageForTag", js.Any.fromFunction2((t0: String, t1: js.Function1[/* hasImage */ Boolean, Unit]) => (value(t0, t1)).runNow()))
    
    inline def setRemoveImageForTag(value: String => Callback): Self = StObject.set(x, "removeImageForTag", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
