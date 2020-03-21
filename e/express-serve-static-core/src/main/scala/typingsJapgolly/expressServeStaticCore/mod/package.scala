package typingsJapgolly.expressServeStaticCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ApplicationRequestHandler[T] = typingsJapgolly.expressServeStaticCore.mod.IRouterHandler[T] with typingsJapgolly.expressServeStaticCore.mod.IRouterMatcher[T] with (js.Function1[
    /* repeated */ typingsJapgolly.expressServeStaticCore.mod.RequestHandlerParams[typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary, _, _], 
    T
  ])
  type Dictionary[T] = org.scalablytyped.runtime.StringDictionary[T]
  type Errback = js.Function1[/* err */ js.Error, scala.Unit]
  type ErrorRequestHandler[P /* <: typingsJapgolly.expressServeStaticCore.mod.Params */, ResBody, ReqBody] = js.Function4[
    /* err */ js.Any, 
    /* req */ typingsJapgolly.expressServeStaticCore.mod.Request[P, ResBody, ReqBody], 
    /* res */ typingsJapgolly.expressServeStaticCore.mod.Response[ResBody], 
    /* next */ typingsJapgolly.expressServeStaticCore.mod.NextFunction, 
    js.Any
  ]
  type Handler = typingsJapgolly.expressServeStaticCore.mod.RequestHandler[typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary, js.Any, js.Any]
  type NextFunction = js.Function1[/* err */ js.UndefOr[js.Any], scala.Unit]
  type Params = typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary | typingsJapgolly.expressServeStaticCore.mod.ParamsArray
  type ParamsArray = js.Array[java.lang.String]
  type ParamsDictionary = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  type PathParams = java.lang.String | js.RegExp | (js.Array[java.lang.String | js.RegExp])
  type RequestHandler[P /* <: typingsJapgolly.expressServeStaticCore.mod.Params */, ResBody, ReqBody] = js.Function3[
    /* req */ typingsJapgolly.expressServeStaticCore.mod.Request[P, ResBody, ReqBody], 
    /* res */ typingsJapgolly.expressServeStaticCore.mod.Response[ResBody], 
    /* next */ typingsJapgolly.expressServeStaticCore.mod.NextFunction, 
    js.Any
  ]
  type RequestHandlerParams[P /* <: typingsJapgolly.expressServeStaticCore.mod.Params */, ResBody, ReqBody] = (typingsJapgolly.expressServeStaticCore.mod.RequestHandler[P, ResBody, ReqBody]) | (typingsJapgolly.expressServeStaticCore.mod.ErrorRequestHandler[P, ResBody, ReqBody]) | (js.Array[
    (typingsJapgolly.expressServeStaticCore.mod.RequestHandler[P, js.Any, js.Any]) | (typingsJapgolly.expressServeStaticCore.mod.ErrorRequestHandler[P, js.Any, js.Any])
  ])
  type RequestParamHandler = js.Function5[
    /* req */ typingsJapgolly.expressServeStaticCore.mod.Request[typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary, js.Any, js.Any], 
    /* res */ typingsJapgolly.expressServeStaticCore.mod.Response[js.Any], 
    /* next */ typingsJapgolly.expressServeStaticCore.mod.NextFunction, 
    /* value */ js.Any, 
    /* name */ java.lang.String, 
    js.Any
  ]
  type RequestRanges = typingsJapgolly.rangeParser.mod.Ranges
  type Router = typingsJapgolly.expressServeStaticCore.mod.IRouter
  type Send[ResBody, T] = js.Function1[/* body */ js.UndefOr[ResBody], T]
}
