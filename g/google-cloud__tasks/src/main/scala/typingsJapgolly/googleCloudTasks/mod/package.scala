package typingsJapgolly.googleCloudTasks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type APICallback[T] = js.Function2[
    /* err */ typingsJapgolly.googleCloudTasks.mod.GoogleError | scala.Null, 
    /* response */ js.UndefOr[T], 
    scala.Unit
  ]
  type APIPaginatedCallback[T, U, V] = js.Function4[
    /* err */ typingsJapgolly.googleCloudTasks.mod.GoogleError | scala.Null, 
    /* response */ js.UndefOr[T], 
    /* next */ js.UndefOr[U | scala.Null], 
    /* rawResponse */ js.UndefOr[V], 
    scala.Unit
  ]
  type CallOptions = js.Any
  type CreateNamedRequest[N /* <: java.lang.String */, T] = typingsJapgolly.googleCloudTasks.mod.ParentRequest with typingsJapgolly.googleCloudTasks.googleCloudTasksStrings.CreateNamedRequest with js.Any
  type EnhancedPick[T, Req /* <: java.lang.String */, Opt /* <: java.lang.String */] = (typingsJapgolly.std.Required[typingsJapgolly.std.Pick[T, Req]]) with (typingsJapgolly.std.Partial[typingsJapgolly.std.Pick[T, Req]])
  type GoogleAuth = js.Any
  type GoogleAuthOptions = js.Any
  type GoogleError = js.Any
  type Keys[T] = java.lang.String
  type ProjectIdCallback = js.Function2[
    /* err */ js.UndefOr[js.Error | scala.Null], 
    /* projectId */ js.UndefOr[java.lang.String | scala.Null], 
    scala.Unit
  ]
  type UpdateNamedRequest[N /* <: java.lang.String */, T] = typingsJapgolly.googleCloudTasks.mod.ParentRequest with typingsJapgolly.googleCloudTasks.googleCloudTasksStrings.UpdateNamedRequest with js.Any
}
