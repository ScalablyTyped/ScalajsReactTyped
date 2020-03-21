package typingsJapgolly.std

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides event properties that are specific to modifications to the Document Object Model (DOM) hierarchy and nodes. */
@js.native
trait MutationEvent extends Event_ {
  val ADDITION: Double = js.native
  val MODIFICATION: Double = js.native
  val REMOVAL: Double = js.native
  val attrChange: Double = js.native
  val attrName: java.lang.String = js.native
  val newValue: java.lang.String = js.native
  val prevValue: java.lang.String = js.native
  val relatedNode: org.scalajs.dom.raw.Node = js.native
  def initMutationEvent(
    typeArg: java.lang.String,
    canBubbleArg: scala.Boolean,
    cancelableArg: scala.Boolean,
    relatedNodeArg: org.scalajs.dom.raw.Node,
    prevValueArg: java.lang.String,
    newValueArg: java.lang.String,
    attrNameArg: java.lang.String,
    attrChangeArg: Double
  ): Unit = js.native
}

@JSGlobal("MutationEvent")
@js.native
object MutationEvent extends Instantiable0[MutationEvent] {
  val ADDITION: Double = js.native
  val MODIFICATION: Double = js.native
  val REMOVAL: Double = js.native
}

