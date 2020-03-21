package typingsJapgolly.clownface.clownfaceMod

import typingsJapgolly.clownface.mod.ClownfaceInit
import typingsJapgolly.clownface.mod.WithSingleTerm
import typingsJapgolly.clownface.mod.WithSingleValue
import typingsJapgolly.clownface.mod.WithTerms
import typingsJapgolly.clownface.mod.WithValues
import typingsJapgolly.rdfJs.mod.DatasetCore
import typingsJapgolly.rdfJs.mod.Quad
import typingsJapgolly.rdfJs.mod.Term
import typingsJapgolly.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("clownface/lib/Clownface", JSImport.Namespace)
@js.native
class ^[D /* <: DatasetCore[Quad, Quad] */, T /* <: Term */] protected () extends Clownface[D, T] {
  def this(options: (ClownfaceInit[DatasetCore[Quad, Quad], Term]) with (Partial[WithSingleTerm[T] | WithTerms[T]]) with (Partial[WithSingleValue | WithValues])) = this()
}

