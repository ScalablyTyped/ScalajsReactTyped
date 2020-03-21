package typingsJapgolly.rdfTransformTripleToQuad.mod

import typingsJapgolly.rdfJs.mod.DataFactory
import typingsJapgolly.rdfJs.mod.Quad
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TripleToQuadTransformOptions extends js.Object {
  var factory: DataFactory[Quad]
}

object TripleToQuadTransformOptions {
  @scala.inline
  def apply(factory: DataFactory[Quad]): TripleToQuadTransformOptions = {
    val __obj = js.Dynamic.literal(factory = factory.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TripleToQuadTransformOptions]
  }
}

