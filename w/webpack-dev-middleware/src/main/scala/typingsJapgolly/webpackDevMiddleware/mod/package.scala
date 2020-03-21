package typingsJapgolly.webpackDevMiddleware

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Logger = typingsJapgolly.loglevel.mod.Logger
  type MimeTypeMap = org.scalablytyped.runtime.StringDictionary[js.Array[java.lang.String]]
  type Reporter = js.Function2[
    /* middlewareOptions */ typingsJapgolly.webpackDevMiddleware.mod.Options, 
    /* reporterOptions */ typingsJapgolly.webpackDevMiddleware.mod.ReporterOptions, 
    scala.Unit
  ]
}
