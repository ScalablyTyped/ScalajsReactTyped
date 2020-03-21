package typingsJapgolly.rdfExt

import typingsJapgolly.rdfExt.propTypeMod.PropType
import typingsJapgolly.rdfExt.quadMod.QuadExt
import typingsJapgolly.rdfExt.rdfExtStrings.has
import typingsJapgolly.rdfJs.mod.Dataset
import typingsJapgolly.rdfJs.mod.Quad
import typingsJapgolly.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rdf-ext/lib/Dataset", JSImport.Namespace)
@js.native
object datasetMod extends js.Object {
  @js.native
  trait DatasetExt extends Dataset[QuadExt, Quad] {
    val includes: PropType[Dataset[Quad, Quad], has] = js.native
    val length: Double = js.native
    def merge(other: js.Array[Quad]): this.type = js.native
    def merge(other: Dataset[Quad, Quad]): this.type = js.native
    def removeMatches(subject: js.Any, predicate: js.Any, `object`: js.Any, graph: js.Any): this.type = js.native
    def toJSON(): js.Array[ReturnType[PropType[QuadExt, typingsJapgolly.rdfExt.rdfExtStrings.toJSON]]] = js.native
  }
  
}

