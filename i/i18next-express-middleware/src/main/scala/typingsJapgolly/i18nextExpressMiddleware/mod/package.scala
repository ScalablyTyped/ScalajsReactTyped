package typingsJapgolly.i18nextExpressMiddleware

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type App = typingsJapgolly.express.mod.Application_ | typingsJapgolly.express.mod.Router
  type I18next = typingsJapgolly.i18next.mod.i18n
  type IgnoreRoutesFunction = js.Function4[
    /* req */ typingsJapgolly.express.mod.Request_[typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary], 
    /* res */ typingsJapgolly.express.mod.Response_, 
    /* options */ typingsJapgolly.i18nextExpressMiddleware.mod.HandleOptions, 
    /* i18next */ typingsJapgolly.i18nextExpressMiddleware.mod.I18next, 
    scala.Boolean
  ]
  type LanguageDetectorCaches = scala.Boolean | js.Array[java.lang.String]
  type LanguageDetectorInterfaceOptions = org.scalablytyped.runtime.StringDictionary[js.Any]
  type LanguageDetectorOrder = js.Array[java.lang.String]
  // LanguageDetector
  type LanguageDetectorServices = js.Any
}
