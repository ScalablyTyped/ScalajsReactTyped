package typingsJapgolly.csso

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AfterCompressFn = js.Function2[
    /* compressResult */ java.lang.String, 
    /* options */ typingsJapgolly.csso.mod.CompressOptions, 
    scala.Unit
  ]
  type BeforeCompressFn = js.Function2[
    /* ast */ js.Object, 
    /* options */ typingsJapgolly.csso.mod.CompressOptions, 
    scala.Unit
  ]
}
