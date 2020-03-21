package typingsJapgolly.inputmask

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type DefinitionValidator = js.Function5[
    /* chrs */ java.lang.String, 
    /* buffer */ js.Array[java.lang.String], 
    /* pos */ scala.Double, 
    /* strict */ scala.Boolean, 
    /* opts */ typingsJapgolly.inputmask.mod.Options, 
    scala.Boolean | typingsJapgolly.inputmask.AnonC
  ]
  type Range = typingsJapgolly.inputmask.AnonEnd | (js.Tuple2[java.lang.String, java.lang.String])
}
