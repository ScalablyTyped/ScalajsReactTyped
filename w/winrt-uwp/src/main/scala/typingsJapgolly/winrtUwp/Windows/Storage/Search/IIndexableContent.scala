package typingsJapgolly.winrtUwp.Windows.Storage.Search

import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IMap
import typingsJapgolly.winrtUwp.Windows.Storage.Streams.IRandomAccessStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents app content and properties that can be added to the ContentIndexer . */
trait IIndexableContent extends js.Object {
  /** Gets or sets the identifier for the content properties in the IIndexableContent object. Changes to the actual representation of the item in the index can be made using the ContentIndexer class. */
  var id: String
  /** Gets the content properties. */
  var properties: IMap[String, _]
  /** Gets or sets a stream that provides full-text content. Changes to the actual representation of the item in the index can be made using the ContentIndexer class. */
  var stream: IRandomAccessStream
  /** Specifies the type of content in the Stream . */
  var streamContentType: String
}

object IIndexableContent {
  @scala.inline
  def apply(id: String, properties: IMap[String, _], stream: IRandomAccessStream, streamContentType: String): IIndexableContent = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], stream = stream.asInstanceOf[js.Any], streamContentType = streamContentType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IIndexableContent]
  }
}

