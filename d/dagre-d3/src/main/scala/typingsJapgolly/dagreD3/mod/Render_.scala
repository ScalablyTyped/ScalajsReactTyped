package typingsJapgolly.dagreD3.mod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.d3Selection.mod.BaseType
import typingsJapgolly.d3Selection.mod.Selection_
import typingsJapgolly.dagre.mod.Edge
import typingsJapgolly.dagre.mod.Node
import typingsJapgolly.dagre.mod.graphlib.Graph
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Render_ extends js.Object {
  def apply(
    selection: Selection_[
      _, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ _, 
      BaseType, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ _
    ],
    g: Graph
  ): Unit = js.native
  // see http://cpettitt.github.io/project/dagre-d3/latest/demo/user-defined.html for example usage
  def arrows(): StringDictionary[
    js.Function4[
      /* parent */ Selection_[
        _, 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ _, 
        BaseType, 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ _
      ], 
      /* id */ String, 
      /* edge */ Edge, 
      /* type */ String, 
      Unit
    ]
  ] = js.native
  def shapes(): StringDictionary[
    js.Function3[
      /* parent */ Selection_[
        _, 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for Datum */ _, 
        BaseType, 
        /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for PDatum */ _
      ], 
      /* bbox */ js.Any, 
      /* node */ Node, 
      Unit
    ]
  ] = js.native
}

