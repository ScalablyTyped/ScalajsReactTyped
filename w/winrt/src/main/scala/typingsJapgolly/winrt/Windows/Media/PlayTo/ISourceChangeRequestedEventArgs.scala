package typingsJapgolly.winrt.Windows.Media.PlayTo

import typingsJapgolly.winrt.Windows.Foundation.Collections.IMapView
import typingsJapgolly.winrt.Windows.Storage.Streams.IRandomAccessStreamReference
import typingsJapgolly.winrt.Windows.Storage.Streams.IRandomAccessStreamWithContentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISourceChangeRequestedEventArgs extends js.Object {
  var album: String
  var author: String
  var date: js.Date
  var description: String
  var genre: String
  var properties: IMapView[String, _]
  var rating: Double
  var stream: IRandomAccessStreamWithContentType
  var thumbnail: IRandomAccessStreamReference
  var title: String
}

object ISourceChangeRequestedEventArgs {
  @scala.inline
  def apply(
    album: String,
    author: String,
    date: js.Date,
    description: String,
    genre: String,
    properties: IMapView[String, _],
    rating: Double,
    stream: IRandomAccessStreamWithContentType,
    thumbnail: IRandomAccessStreamReference,
    title: String
  ): ISourceChangeRequestedEventArgs = {
    val __obj = js.Dynamic.literal(album = album.asInstanceOf[js.Any], author = author.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], genre = genre.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], rating = rating.asInstanceOf[js.Any], stream = stream.asInstanceOf[js.Any], thumbnail = thumbnail.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ISourceChangeRequestedEventArgs]
  }
}

