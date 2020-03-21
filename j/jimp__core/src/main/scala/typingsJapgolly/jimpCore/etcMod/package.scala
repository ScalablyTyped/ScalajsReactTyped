package typingsJapgolly.jimpCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object etcMod {
  type DecoderFn = js.Function1[/* data */ typingsJapgolly.node.Buffer, typingsJapgolly.jimpCore.etcMod.Bitmap]
  type EncoderFn[ImageType /* <: typingsJapgolly.jimpCore.etcMod.Image */] = js.Function1[/* image */ ImageType, typingsJapgolly.node.Buffer]
  type GenericCallback[T, U, TThis] = js.ThisFunction2[/* this */ TThis, /* err */ js.Error | scala.Null, /* value */ T, U]
  type ImageCallback[jimp] = js.ThisFunction3[
    /* this */ jimp, 
    /* err */ js.Error | scala.Null, 
    /* value */ jimp, 
    /* coords */ typingsJapgolly.jimpCore.AnonX, 
    js.Any
  ]
}
