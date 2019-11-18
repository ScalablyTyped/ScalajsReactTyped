package typingsJapgolly.std

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConstantSourceNode extends AudioScheduledSourceNode {
  val offset: org.scalajs.dom.raw.AudioParam = js.native
}

@JSGlobal("ConstantSourceNode")
@js.native
object ConstantSourceNode
  extends Instantiable1[/* context */ BaseAudioContext, ConstantSourceNode]
     with Instantiable2[
      /* context */ BaseAudioContext, 
      /* options */ ConstantSourceOptions, 
      ConstantSourceNode
    ]

