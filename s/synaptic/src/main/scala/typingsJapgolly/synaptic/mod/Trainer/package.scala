package typingsJapgolly.synaptic.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Trainer {
  type CostFunction = js.Function2[
    /* targetValues */ js.Array[scala.Double], 
    /* outputValues */ js.Array[scala.Double], 
    scala.Double
  ]
  type TrainingSet = js.Array[typingsJapgolly.synaptic.mod.Trainer.TrainingPair]
}
