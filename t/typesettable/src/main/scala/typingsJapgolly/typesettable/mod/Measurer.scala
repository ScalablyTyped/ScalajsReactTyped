package typingsJapgolly.typesettable.mod

import typingsJapgolly.typesettable.abstractMeasurerMod.IRuler
import typingsJapgolly.typesettable.contextsMod.IRulerFactoryContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typesettable", "Measurer")
@js.native
class Measurer protected ()
  extends typingsJapgolly.typesettable.measurersMod.Measurer {
  def this(ruler: IRuler) = this()
  def this(ruler: IRulerFactoryContext) = this()
  def this(ruler: IRuler, useGuards: Boolean) = this()
  def this(ruler: IRulerFactoryContext, useGuards: Boolean) = this()
}

