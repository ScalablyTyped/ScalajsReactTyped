package typingsJapgolly.tizenCommonWeb.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentChangeCallback extends StObject {
  
  /**
    * Called when content is added.
    *
    * @param content The content to add.
    */
  def oncontentadded(content: Content_): Unit
  
  /**
    * Called when a content directory is added.
    *
    * @since 2.4
    *
    * @param contentDir The added content directory.
    */
  def oncontentdiradded(contentDir: ContentDirectory): Unit
  
  /**
    * Called when a content directory is removed.
    *
    * @since 2.4
    *
    * @param id The ID of removed content directory.
    */
  def oncontentdirremoved(id: ContentDirectoryId): Unit
  
  /**
    * Called when a content directory is updated.
    *
    * @since 2.4
    *
    * @param contentDir The content directory after the update operation.
    */
  def oncontentdirupdated(contentDir: ContentDirectory): Unit
  
  /**
    * Called when content is removed.
    *
    * @param id The ID of removed content.
    */
  def oncontentremoved(id: ContentId): Unit
  
  /**
    * Called when content is updated.
    *
    * @param content The content to update.
    */
  def oncontentupdated(content: Content_): Unit
}
object ContentChangeCallback {
  
  inline def apply(
    oncontentadded: Content_ => Callback,
    oncontentdiradded: ContentDirectory => Callback,
    oncontentdirremoved: ContentDirectoryId => Callback,
    oncontentdirupdated: ContentDirectory => Callback,
    oncontentremoved: ContentId => Callback,
    oncontentupdated: Content_ => Callback
  ): ContentChangeCallback = {
    val __obj = js.Dynamic.literal(oncontentadded = js.Any.fromFunction1((t0: Content_) => oncontentadded(t0).runNow()), oncontentdiradded = js.Any.fromFunction1((t0: ContentDirectory) => oncontentdiradded(t0).runNow()), oncontentdirremoved = js.Any.fromFunction1((t0: ContentDirectoryId) => oncontentdirremoved(t0).runNow()), oncontentdirupdated = js.Any.fromFunction1((t0: ContentDirectory) => oncontentdirupdated(t0).runNow()), oncontentremoved = js.Any.fromFunction1((t0: ContentId) => oncontentremoved(t0).runNow()), oncontentupdated = js.Any.fromFunction1((t0: Content_) => oncontentupdated(t0).runNow()))
    __obj.asInstanceOf[ContentChangeCallback]
  }
  
  extension [Self <: ContentChangeCallback](x: Self) {
    
    inline def setOncontentadded(value: Content_ => Callback): Self = StObject.set(x, "oncontentadded", js.Any.fromFunction1((t0: Content_) => value(t0).runNow()))
    
    inline def setOncontentdiradded(value: ContentDirectory => Callback): Self = StObject.set(x, "oncontentdiradded", js.Any.fromFunction1((t0: ContentDirectory) => value(t0).runNow()))
    
    inline def setOncontentdirremoved(value: ContentDirectoryId => Callback): Self = StObject.set(x, "oncontentdirremoved", js.Any.fromFunction1((t0: ContentDirectoryId) => value(t0).runNow()))
    
    inline def setOncontentdirupdated(value: ContentDirectory => Callback): Self = StObject.set(x, "oncontentdirupdated", js.Any.fromFunction1((t0: ContentDirectory) => value(t0).runNow()))
    
    inline def setOncontentremoved(value: ContentId => Callback): Self = StObject.set(x, "oncontentremoved", js.Any.fromFunction1((t0: ContentId) => value(t0).runNow()))
    
    inline def setOncontentupdated(value: Content_ => Callback): Self = StObject.set(x, "oncontentupdated", js.Any.fromFunction1((t0: Content_) => value(t0).runNow()))
  }
}
