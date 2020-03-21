package typingsJapgolly.typesettable.mod

import typingsJapgolly.typesettable.KinIXAlignnumber
import typingsJapgolly.typesettable.KinIYAlignnumber
import typingsJapgolly.typesettable.contextsMod.IPenFactoryContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typesettable", "Writer")
@js.native
class Writer protected ()
  extends typingsJapgolly.typesettable.writersMod.Writer {
  def this(
    _measurer: typingsJapgolly.typesettable.measurersMod.AbstractMeasurer,
    _penFactory: IPenFactoryContext[_]
  ) = this()
  def this(
    _measurer: typingsJapgolly.typesettable.measurersMod.AbstractMeasurer,
    _penFactory: IPenFactoryContext[_],
    _wrapper: typingsJapgolly.typesettable.wrappersMod.Wrapper
  ) = this()
}

/* static members */
@JSImport("typesettable", "Writer")
@js.native
object Writer extends js.Object {
  var SupportedRotation: js.Any = js.native
  var XOffsetFactor: KinIXAlignnumber = js.native
  var YOffsetFactor: KinIYAlignnumber = js.native
}

