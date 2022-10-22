package typingsJapgolly.angularCommon.httpMod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.angularCommon.httpMod.^
import typingsJapgolly.angularCore.mod.InjectionToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def HTTP_INTERCEPTORS: InjectionToken[js.Array[HttpInterceptor]] = ^.asInstanceOf[js.Dynamic].selectDynamic("HTTP_INTERCEPTORS").asInstanceOf[InjectionToken[js.Array[HttpInterceptor]]]

inline def XhrFactory: Instantiable0[typingsJapgolly.angularCommon.mod.XhrFactory] = ^.asInstanceOf[js.Dynamic].selectDynamic("XhrFactory").asInstanceOf[Instantiable0[typingsJapgolly.angularCommon.mod.XhrFactory]]
type XhrFactory = typingsJapgolly.angularCommon.mod.XhrFactory

/**
  * DI token/abstract type representing a map of JSONP callbacks.
  *
  * In the browser, this should always be the `window` object.
  *
  *
  */
type JsonpCallbackContext = StringDictionary[js.Function1[/* data */ Any, Unit]]
