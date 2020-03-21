package typingsJapgolly.typesettable.mod

import typingsJapgolly.typesettable.abstractMeasurerMod.IRuler
import typingsJapgolly.typesettable.contextsMod.IRulerFactoryContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typesettable", "AbstractMeasurer")
@js.native
class AbstractMeasurer protected ()
  extends typingsJapgolly.typesettable.measurersMod.AbstractMeasurer {
  def this(ruler: IRuler) = this()
  def this(ruler: IRulerFactoryContext) = this()
}

/* static members */
@JSImport("typesettable", "AbstractMeasurer")
@js.native
object AbstractMeasurer extends js.Object {
  /**
    * A string representing the full ascender/descender range of your text.
    *
    * Note that this is really only applicable to western alphabets. If you are
    * using a different locale language such as arabic or chinese, you may want
    * to override this.
    */
  var HEIGHT_TEXT: String = js.native
}

