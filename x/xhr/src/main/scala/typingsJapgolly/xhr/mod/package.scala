package typingsJapgolly.xhr

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type XhrCallback = js.Function3[
    /* error */ js.Error, 
    /* response */ typingsJapgolly.xhr.mod.XhrResponse, 
    /* body */ js.Any, 
    scala.Unit
  ]
  type XhrHeaders = org.scalablytyped.runtime.StringDictionary[java.lang.String]
}
