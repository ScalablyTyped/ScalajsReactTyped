package typingsJapgolly.elliptic.mod.curve

import typingsJapgolly.elliptic.ellipticStrings.hex
import typingsJapgolly.elliptic.mod.curve.base.BaseCurveOptions
import typingsJapgolly.elliptic.mod.curve.base.BasePoint
import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @description Base class for the curves
  */
@JSImport("elliptic", "curve.base")
@js.native
class base_ protected () extends js.Object {
  def this(`type`: String, conf: BaseCurveOptions) = this()
  var g: BasePoint = js.native
  var n: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any = js.native
  var one: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any = js.native
  var p: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any = js.native
  var red: js.Any = js.native
  var redN: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any = js.native
  var two: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any = js.native
  var `type`: String = js.native
   // ?
  var zero: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any = js.native
  def decodePoint(bytes: String): BasePoint = js.native
  def decodePoint(bytes: Buffer): BasePoint = js.native
  @JSName("decodePoint")
  def decodePoint_hex(bytes: String, enc: hex): BasePoint = js.native
  @JSName("decodePoint")
  def decodePoint_hex(bytes: Buffer, enc: hex): BasePoint = js.native
  def validate(point: BasePoint): Boolean = js.native
}

