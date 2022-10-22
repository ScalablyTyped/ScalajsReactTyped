package typingsJapgolly.blueimpLoadImage.mod

import org.scalablytyped.runtime.NumberDictionary
import typingsJapgolly.blueimpLoadImage.blueimpLoadImageStrings.GPSInfo
import typingsJapgolly.blueimpLoadImage.blueimpLoadImageStrings.Interoperability
import typingsJapgolly.blueimpLoadImage.blueimpLoadImageStrings.Thumbnail
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Exif
  extends StObject
     with /* tag */ NumberDictionary[ExifTagValue] {
  
  def get(
    tagName: typingsJapgolly.blueimpLoadImage.blueimpLoadImageStrings.Orientation | Thumbnail | typingsJapgolly.blueimpLoadImage.blueimpLoadImageStrings.Exif | GPSInfo | Interoperability
  ): ExifTagValue
}
object Exif {
  
  inline def apply(
    get: typingsJapgolly.blueimpLoadImage.blueimpLoadImageStrings.Orientation | Thumbnail | typingsJapgolly.blueimpLoadImage.blueimpLoadImageStrings.Exif | GPSInfo | Interoperability => ExifTagValue
  ): Exif = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
    __obj.asInstanceOf[Exif]
  }
  
  extension [Self <: Exif](x: Self) {
    
    inline def setGet(
      value: typingsJapgolly.blueimpLoadImage.blueimpLoadImageStrings.Orientation | Thumbnail | typingsJapgolly.blueimpLoadImage.blueimpLoadImageStrings.Exif | GPSInfo | Interoperability => ExifTagValue
    ): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
  }
}
