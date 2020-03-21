package typingsJapgolly.getenv

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ParseWithEachType = typingsJapgolly.getenv.mod.ParseWithType[
    typingsJapgolly.getenv.getenvStrings.string | typingsJapgolly.getenv.getenvStrings.int | typingsJapgolly.getenv.getenvStrings.float | typingsJapgolly.getenv.getenvStrings.bool | typingsJapgolly.getenv.getenvStrings.boolish | typingsJapgolly.getenv.getenvStrings.url
  ]
  type ParseWithFallback = js.Tuple2[java.lang.String, java.lang.String]
  type ParseWithType[T /* <: typingsJapgolly.getenv.mod.ParseTypes */] = js.Tuple3[
    java.lang.String, 
    /* import warning: importer.ImportType#apply Failed type conversion: getenv.getenv.ParseMappings[T] */ js.Any, 
    T
  ]
}
