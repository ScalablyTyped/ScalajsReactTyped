package typingsJapgolly.gulpInject

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ITagFunction = js.Function2[/* targetExt */ java.lang.String, /* sourceExt */ java.lang.String, java.lang.String]
  type ITransformFunction = js.Function5[
    /* filepath */ java.lang.String, 
    /* file */ js.UndefOr[typingsJapgolly.vinyl.mod.File], 
    /* index */ js.UndefOr[scala.Double], 
    /* length */ js.UndefOr[scala.Double], 
    /* targetFile */ js.UndefOr[typingsJapgolly.vinyl.mod.File], 
    java.lang.String
  ]
}
