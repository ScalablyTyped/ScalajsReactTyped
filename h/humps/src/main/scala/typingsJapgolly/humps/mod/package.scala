package typingsJapgolly.humps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type HumpsProcessor = js.Function3[
    /* key */ java.lang.String, 
    /* convert */ typingsJapgolly.humps.mod.HumpsProcessorParameter, 
    /* options */ js.UndefOr[typingsJapgolly.humps.mod.HumpsOptions], 
    java.lang.String
  ]
  type HumpsProcessorParameter = js.Function2[
    /* key */ java.lang.String, 
    /* options */ js.UndefOr[typingsJapgolly.humps.mod.HumpsOptions], 
    java.lang.String
  ]
  type OptionOrProcessor = typingsJapgolly.humps.mod.HumpsOptions | typingsJapgolly.humps.mod.HumpsProcessor
}
