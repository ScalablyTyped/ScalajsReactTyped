package typingsJapgolly.rdfExt.quadMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.rdfExt.AnonGraph
import typingsJapgolly.rdfExt.blankNodeMod.BlankNodeExt
import typingsJapgolly.rdfExt.defaultGraphMod.DefaultGraphExt
import typingsJapgolly.rdfExt.literalMod.LiteralExt
import typingsJapgolly.rdfExt.namedNodeMod.NamedNodeExt
import typingsJapgolly.rdfExt.variableMod.VariableExt
import typingsJapgolly.rdfJs.mod.BaseQuad
import typingsJapgolly.rdfJs.mod.Quad
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QuadExt extends Quad {
  @JSName("graph")
  var graph_QuadExt: DefaultGraphExt | NamedNodeExt | BlankNodeExt | VariableExt
  @JSName("object")
  var object_QuadExt: NamedNodeExt | LiteralExt | BlankNodeExt | VariableExt
  @JSName("predicate")
  var predicate_QuadExt: NamedNodeExt | VariableExt
  @JSName("subject")
  var subject_QuadExt: NamedNodeExt | BlankNodeExt | VariableExt
  def toCanonical(): String
  def toJSON(): AnonGraph
}

object QuadExt {
  @scala.inline
  def apply(
    equals: BaseQuad => CallbackTo[Boolean],
    graph: DefaultGraphExt | NamedNodeExt | BlankNodeExt | VariableExt,
    `object`: NamedNodeExt | LiteralExt | BlankNodeExt | VariableExt,
    predicate: NamedNodeExt | VariableExt,
    subject: NamedNodeExt | BlankNodeExt | VariableExt,
    toCanonical: CallbackTo[String],
    toJSON: CallbackTo[AnonGraph]
  ): QuadExt = {
    val __obj = js.Dynamic.literal(graph = graph.asInstanceOf[js.Any], predicate = predicate.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any])
    __obj.updateDynamic("equals")(js.Any.fromFunction1((t0: typingsJapgolly.rdfJs.mod.BaseQuad) => equals(t0).runNow()))
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("toCanonical")(toCanonical.toJsFn)
    __obj.updateDynamic("toJSON")(toJSON.toJsFn)
    __obj.asInstanceOf[QuadExt]
  }
}

