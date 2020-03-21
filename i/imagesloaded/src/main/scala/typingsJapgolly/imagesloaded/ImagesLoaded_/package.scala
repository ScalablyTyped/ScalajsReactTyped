package typingsJapgolly.imagesloaded

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ImagesLoaded_ {
  type ElementSelector = org.scalajs.dom.raw.Element | org.scalajs.dom.raw.NodeList | js.Array[org.scalajs.dom.raw.Element] | java.lang.String
  type ImagesLoadedCallback = js.Function1[
    /* instance */ js.UndefOr[typingsJapgolly.imagesloaded.ImagesLoaded_.ImagesLoaded], 
    scala.Unit
  ]
  type ImagesLoadedListener = js.Function2[
    /* instance */ typingsJapgolly.imagesloaded.ImagesLoaded_.ImagesLoaded, 
    /* image */ js.UndefOr[typingsJapgolly.imagesloaded.ImagesLoaded_.LoadingImage], 
    scala.Unit
  ]
}
