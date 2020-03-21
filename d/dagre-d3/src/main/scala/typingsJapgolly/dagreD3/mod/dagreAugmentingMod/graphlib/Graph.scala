package typingsJapgolly.dagreD3.mod.dagreAugmentingMod.graphlib

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.d3Selection.mod.BaseType
import typingsJapgolly.d3Selection.mod.Selection_
import typingsJapgolly.d3Transition.mod.Transition_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// coupled with dagre.d.ts' Graph
// a lot of these methods come from graphlib.core.js
trait Graph extends js.Object {
  var height: Double
  // see source of http://cpettitt.github.io/project/dagre-d3/latest/demo/interactive-demo.html
  var transition: js.UndefOr[
    js.Function1[
      /* selection */ Selection_[
        _, 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ _, 
        BaseType, 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ _
      ], 
      Transition_[
        _, 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ _, 
        BaseType, 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ _
      ]
    ]
  ] = js.undefined
  var width: Double
  def graph(): Graph
  def predecessors(id: String): js.Array[String]
  def successors(id: String): js.Array[String]
}

object Graph {
  @scala.inline
  def apply(
    graph: CallbackTo[Graph],
    height: Double,
    predecessors: String => CallbackTo[js.Array[String]],
    successors: String => CallbackTo[js.Array[String]],
    width: Double,
    transition: /* selection */ Selection_[js.Any, js.Any, BaseType, js.Any] => CallbackTo[Transition_[js.Any, js.Any, BaseType, js.Any]] = null
  ): Graph = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.updateDynamic("graph")(graph.toJsFn)
    __obj.updateDynamic("predecessors")(js.Any.fromFunction1((t0: java.lang.String) => predecessors(t0).runNow()))
    __obj.updateDynamic("successors")(js.Any.fromFunction1((t0: java.lang.String) => successors(t0).runNow()))
    if (transition != null) __obj.updateDynamic("transition")(js.Any.fromFunction1((t0: /* selection */ typingsJapgolly.d3Selection.mod.Selection_[js.Any, js.Any, typingsJapgolly.d3Selection.mod.BaseType, js.Any]) => transition(t0).runNow()))
    __obj.asInstanceOf[Graph]
  }
}

