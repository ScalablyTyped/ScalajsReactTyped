package typingsJapgolly.natural

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type BayesClassifierCallback = js.Function2[/* err */ js.Any, /* classifier */ js.Any, scala.Unit]
  type LogisticRegressionClassifierCallback = js.Function2[/* err */ js.Any, /* classifier */ js.Any, scala.Unit]
  type TfIdfCallback = js.Function2[/* i */ scala.Double, /* measure */ scala.Double, scala.Unit]
  type WordNetGetCallback = js.Function1[/* results */ typingsJapgolly.natural.mod.WordNetLookupResults, scala.Unit]
  type WordNetLookupCallback = js.Function1[
    /* results */ js.Array[typingsJapgolly.natural.mod.WordNetLookupResults], 
    scala.Unit
  ]
}
