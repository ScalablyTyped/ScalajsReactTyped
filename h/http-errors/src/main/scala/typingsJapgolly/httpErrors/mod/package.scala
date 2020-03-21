package typingsJapgolly.httpErrors

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type CreateHttpError = js.Function1[
    /* repeated */ typingsJapgolly.httpErrors.mod.UnknownError, 
    typingsJapgolly.httpErrors.mod.HttpError
  ]
  type HttpErrorConstructor = org.scalablytyped.runtime.Instantiable1[js.UndefOr[/* msg */ java.lang.String], typingsJapgolly.httpErrors.mod.HttpError]
  type UnknownError = js.Error | java.lang.String | scala.Double | org.scalablytyped.runtime.StringDictionary[js.Any]
}
