package typingsJapgolly.jimp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type GenericCallback[T, U, TThis] = js.ThisFunction2[/* this */ TThis, /* err */ js.Error | scala.Null, /* value */ T, U]
  type ImageCallback[U] = js.ThisFunction3[
    /* this */ typingsJapgolly.jimp.mod.DepreciatedJimp, 
    /* err */ js.Error | scala.Null, 
    /* value */ typingsJapgolly.jimp.mod.DepreciatedJimp, 
    /* coords */ typingsJapgolly.jimp.AnonX, 
    U
  ]
  type PrintableText = js.Any | typingsJapgolly.jimp.AnonAlignmentX
}
