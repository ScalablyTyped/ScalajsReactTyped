package typingsJapgolly.needle.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object core {
  type BodyData = typingsJapgolly.node.Buffer | typingsJapgolly.needle.mod.core.KeyValue | typingsJapgolly.node.NodeJS.ReadableStream | java.lang.String | scala.Null
  type Cookies = org.scalablytyped.runtime.StringDictionary[js.Any]
  type KeyValue = org.scalablytyped.runtime.StringDictionary[js.Any]
  type NeedleCallback = js.Function3[
    /* error */ js.Error | scala.Null, 
    /* response */ typingsJapgolly.needle.mod.core.NeedleResponse, 
    /* body */ js.Any, 
    scala.Unit
  ]
  type NeedleOptions = typingsJapgolly.needle.mod.core.RequestOptions with typingsJapgolly.needle.mod.core.ResponseOptions with typingsJapgolly.needle.mod.core.RedirectOptions with typingsJapgolly.node.httpsMod.RequestOptions
  type ReadableStream = typingsJapgolly.node.NodeJS.ReadableStream
}
