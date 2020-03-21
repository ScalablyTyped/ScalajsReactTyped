package typingsJapgolly.typesettable.mod

import typingsJapgolly.typesettable.abstractMeasurerMod.IRuler
import typingsJapgolly.typesettable.contextsMod.IRulerFactoryContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typesettable", "CacheMeasurer")
@js.native
class CacheMeasurer protected ()
  extends typingsJapgolly.typesettable.measurersMod.CacheMeasurer {
  def this(ruler: IRuler) = this()
  def this(ruler: IRulerFactoryContext) = this()
}

