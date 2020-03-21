package typingsJapgolly.rdfExt.dataFactoryMod

import typingsJapgolly.rdfExt.quadMod.QuadExt
import typingsJapgolly.rdfExt.variableMod.VariableExt
import typingsJapgolly.rdfJs.mod.DataFactory
import typingsJapgolly.rdfJs.mod.QuadGraph
import typingsJapgolly.rdfJs.mod.QuadObject
import typingsJapgolly.rdfJs.mod.QuadPredicate
import typingsJapgolly.rdfJs.mod.QuadSubject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataFactoryExt extends DataFactory[QuadExt] {
  def quad(subject: QuadSubject, predicate: QuadPredicate, `object`: QuadObject): QuadExt = js.native
  def quad(subject: QuadSubject, predicate: QuadPredicate, `object`: QuadObject, graph: QuadGraph): QuadExt = js.native
  def triple(subject: QuadSubject, predicate: QuadPredicate, `object`: QuadObject): QuadExt = js.native
  @JSName("variable")
  def variable_MDataFactoryExt(value: String): VariableExt = js.native
}

