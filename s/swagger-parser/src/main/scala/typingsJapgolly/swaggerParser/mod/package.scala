package typingsJapgolly.swaggerParser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ApiCallback = js.Function2[
    /* err */ js.Error | scala.Null, 
    /* api */ js.UndefOr[typingsJapgolly.openapiTypes.mod.OpenAPI.Document], 
    js.Any
  ]
  type RefsCallback = js.Function2[
    /* err */ js.Error | scala.Null, 
    /* $refs */ js.UndefOr[typingsJapgolly.swaggerParser.mod.Refs], 
    js.Any
  ]
}
