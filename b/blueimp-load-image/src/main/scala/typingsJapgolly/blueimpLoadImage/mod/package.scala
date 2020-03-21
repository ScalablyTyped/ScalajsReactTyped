package typingsJapgolly.blueimpLoadImage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AspectRatio = scala.Double
  type Exif = org.scalablytyped.runtime.NumberDictionary[scala.Double | java.lang.String | js.Array[java.lang.String]]
  type Iptc = org.scalablytyped.runtime.NumberDictionary[scala.Double | java.lang.String | js.Array[java.lang.String]]
  type LoadImageCallback = js.Function2[
    /* eventOrImage */ typingsJapgolly.std.Event_ | org.scalajs.dom.raw.HTMLCanvasElement | org.scalajs.dom.raw.HTMLImageElement, 
    /* data */ js.UndefOr[typingsJapgolly.blueimpLoadImage.mod.MetaData], 
    scala.Unit
  ]
  type LoadImageOptions = typingsJapgolly.blueimpLoadImage.mod.BasicOptions with typingsJapgolly.blueimpLoadImage.mod.CanvasOptions with typingsJapgolly.blueimpLoadImage.mod.CropOptions with typingsJapgolly.blueimpLoadImage.mod.MetaOptions
  type Orientation = scala.Double | scala.Boolean
  type ParseMetaDataCallback = js.Function1[/* data */ typingsJapgolly.blueimpLoadImage.mod.ImageHead, scala.Unit]
}
