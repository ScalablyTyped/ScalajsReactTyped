package typingsJapgolly.typesettable

import typingsJapgolly.typesettable.abstractMeasurerMod.AbstractMeasurer
import typingsJapgolly.typesettable.abstractMeasurerMod.IDimensions
import typingsJapgolly.typesettable.abstractMeasurerMod.IRuler
import typingsJapgolly.typesettable.contextsMod.IRulerFactoryContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typesettable/build/src/measurers/measurer", JSImport.Namespace)
@js.native
object measurerMod extends js.Object {
  @js.native
  class Measurer protected () extends AbstractMeasurer {
    def this(ruler: IRuler) = this()
    def this(ruler: IRulerFactoryContext) = this()
    def this(ruler: IRuler, useGuards: Boolean) = this()
    def this(ruler: IRulerFactoryContext, useGuards: Boolean) = this()
    var guardWidth: js.Any = js.native
    var useGuards: js.Any = js.native
    def _addGuards(text: String): String = js.native
    def _measureLine(line: String): IDimensions = js.native
    def _measureLine(line: String, forceGuards: Boolean): IDimensions = js.native
    /* private */ def getGuardWidth(): js.Any = js.native
  }
  
}

