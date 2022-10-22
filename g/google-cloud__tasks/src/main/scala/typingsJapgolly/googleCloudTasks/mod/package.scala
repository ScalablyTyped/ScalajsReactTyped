package typingsJapgolly.googleCloudTasks.mod

import typingsJapgolly.googleGax.mod.GoogleError
import typingsJapgolly.std.Partial
import typingsJapgolly.std.Pick
import typingsJapgolly.std.Required
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type APICallback[T] = js.Function2[/* err */ GoogleError | Null, /* response */ js.UndefOr[T], Unit]

type APIPaginatedCallback[T, U, V] = js.Function4[
/* err */ GoogleError | Null, 
/* response */ js.UndefOr[T], 
/* next */ js.UndefOr[U | Null], 
/* rawResponse */ js.UndefOr[V], 
Unit]

type CreateNamedRequest[N /* <: String */, T] = ParentRequest & (/* import warning: importer.ImportType#apply Failed type conversion: {[ P in N ]: T} */ js.Any)

type EnhancedPick[T, Req /* <: /* keyof T */ String */, Opt /* <: /* keyof T */ String */] = (Required[Pick[T, Req]]) & (Partial[Pick[T, Req]])

type Keys[T] = /* keyof T */ String

type ProjectIdCallback = js.Function2[
/* err */ js.UndefOr[js.Error | Null], 
/* projectId */ js.UndefOr[String | Null], 
Unit]

type UpdateNamedRequest[N /* <: String */, T] = ParentRequest & (/* import warning: importer.ImportType#apply Failed type conversion: {[ P in N ]: T} */ js.Any)
