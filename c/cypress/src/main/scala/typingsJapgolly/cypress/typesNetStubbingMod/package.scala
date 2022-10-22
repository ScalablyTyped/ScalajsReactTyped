package typingsJapgolly.cypress.typesNetStubbingMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.cypress.typesNetStubbingMod.CyHttpMessages.IncomingHttpRequest
import typingsJapgolly.cypress.typesNetStubbingMod.CyHttpMessages.IncomingHttpResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type DictMatcher[T] = StringDictionary[T]

type GlobPattern = String

type HttpRequestInterceptor = js.Function1[/* req */ IncomingHttpRequest, Unit | js.Promise[Unit]]

type HttpResponseInterceptor = js.Function1[/* res */ IncomingHttpResponse, Unit | js.Promise[Unit]]

type NumberMatcher = Double | js.Array[Double]

type RouteHandler = String | StaticResponse | RouteHandlerController | js.Object

type RouteHandlerController = HttpRequestInterceptor

type RouteMap = StringDictionary[Route]

type RouteMatcher = StringMatcher | RouteMatcherOptions

type RouteMatcherOptions = RouteMatcherOptionsGeneric[StringMatcher]

type StringMatcher = GlobPattern | js.RegExp
