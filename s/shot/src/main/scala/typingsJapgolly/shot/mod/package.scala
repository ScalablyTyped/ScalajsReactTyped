package typingsJapgolly.shot

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Headers = org.scalablytyped.runtime.StringDictionary[java.lang.String | js.Array[java.lang.String]]
  type Listener = js.Function2[
    /* req */ typingsJapgolly.shot.mod.SimulatedRequestObject, 
    /* res */ typingsJapgolly.shot.mod.SimulatedResponseObject, 
    scala.Unit
  ]
  type SimulatedRequestObject = typingsJapgolly.node.streamMod.Readable
  type SimulatedResponseObject = typingsJapgolly.node.httpMod.ServerResponse
}
