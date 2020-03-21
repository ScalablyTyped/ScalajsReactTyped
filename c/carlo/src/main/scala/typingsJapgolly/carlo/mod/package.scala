package typingsJapgolly.carlo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Channel = java.lang.String
  type EvaluateFunction = js.Function2[
    /* pageFunction */ (js.Function1[/* repeated */ js.Any, js.Any]) | java.lang.String, 
    /* repeated */ typingsJapgolly.puppeteer.mod.Serializable, 
    js.Promise[typingsJapgolly.puppeteer.mod.Serializable]
  ]
  type WindowEvent = typingsJapgolly.carlo.carloStrings.close
}
