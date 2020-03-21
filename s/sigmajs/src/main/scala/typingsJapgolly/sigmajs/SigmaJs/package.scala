package typingsJapgolly.sigmajs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object SigmaJs {
  type GexfParser = js.Function3[
    /* target */ java.lang.String, 
    /* sigma */ typingsJapgolly.sigmajs.SigmaJs.Sigma, 
    /* callback */ js.Function1[/* graph */ typingsJapgolly.sigmajs.SigmaJs.Sigma, scala.Unit], 
    scala.Unit
  ]
  type JsonParser = js.Function3[
    /* target */ java.lang.String, 
    /* sigma */ typingsJapgolly.sigmajs.SigmaJs.Sigma, 
    /* callback */ js.Function1[/* graph */ typingsJapgolly.sigmajs.SigmaJs.Sigma, scala.Unit], 
    scala.Unit
  ]
  type SVGEdgeLabels = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.sigmajs.SigmaJs.SVGObject[typingsJapgolly.sigmajs.SigmaJs.Edge]]
}
