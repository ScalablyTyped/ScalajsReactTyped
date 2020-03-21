package typingsJapgolly.hapiShot

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Headers = org.scalablytyped.runtime.StringDictionary[java.lang.String | js.Array[java.lang.String]]
  type Listener = js.Function2[
    /* req */ typingsJapgolly.hapiShot.mod.SimulatedRequestObject, 
    /* res */ typingsJapgolly.hapiShot.mod.SimulatedResponseObject, 
    scala.Unit
  ]
  type SimulatedRequestObject = typingsJapgolly.node.streamMod.Readable
  type SimulatedResponseObject = typingsJapgolly.node.httpMod.ServerResponse
}
