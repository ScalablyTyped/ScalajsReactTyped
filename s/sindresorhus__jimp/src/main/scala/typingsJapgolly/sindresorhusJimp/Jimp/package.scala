package typingsJapgolly.sindresorhusJimp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Jimp {
  type ImageCallback = js.Function2[
    /* err */ js.Error | scala.Null, 
    /* image */ typingsJapgolly.sindresorhusJimp.Jimp.Jimp, 
    js.Any
  ]
}
