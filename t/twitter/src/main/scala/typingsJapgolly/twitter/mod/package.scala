package typingsJapgolly.twitter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Callback = js.Function3[
    /* error */ js.Any, 
    /* data */ typingsJapgolly.twitter.mod.ResponseData, 
    /* response */ typingsJapgolly.request.mod.Response, 
    scala.Unit
  ]
  type ResponseData = org.scalablytyped.runtime.StringDictionary[js.Any]
}
