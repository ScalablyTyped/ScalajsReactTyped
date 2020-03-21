package typingsJapgolly.superagent

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type BrowserParser = js.Function1[/* str */ java.lang.String, js.Any]
  type CallbackHandler = js.Function2[/* err */ js.Any, /* res */ typingsJapgolly.superagent.mod.Response, scala.Unit]
  type MultipartValue = typingsJapgolly.superagent.mod.MultipartValueSingle | js.Array[typingsJapgolly.superagent.mod.MultipartValueSingle]
  type MultipartValueSingle = org.scalajs.dom.raw.Blob | typingsJapgolly.node.Buffer | typingsJapgolly.node.fsMod.ReadStream | java.lang.String | scala.Boolean | scala.Double
  type NodeParser = js.Function2[
    /* res */ typingsJapgolly.superagent.mod.Response, 
    /* callback */ js.Function2[/* err */ js.Error | scala.Null, /* body */ js.Any, scala.Unit], 
    scala.Unit
  ]
  type Parser = typingsJapgolly.superagent.mod.BrowserParser | typingsJapgolly.superagent.mod.NodeParser
  type Plugin = js.Function1[/* req */ typingsJapgolly.superagent.mod.SuperAgentRequest, scala.Unit]
  type Serializer = js.Function1[/* obj */ js.Any, java.lang.String]
}
