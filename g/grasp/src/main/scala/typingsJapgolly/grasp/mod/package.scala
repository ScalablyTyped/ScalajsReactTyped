package typingsJapgolly.grasp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type GraspReplaceWithQueryEngine = (js.Function1[
    /* selector */ java.lang.String, 
    typingsJapgolly.grasp.mod.GraspReplaceWithSelector
  ]) with (js.Function2[
    /* selector */ java.lang.String, 
    /* replacement */ typingsJapgolly.grasp.mod.Replacement, 
    js.Function1[/* input */ java.lang.String, java.lang.String]
  ]) with (js.Function3[
    /* selector */ java.lang.String, 
    /* replacement */ typingsJapgolly.grasp.mod.Replacement, 
    /* input */ java.lang.String, 
    java.lang.String
  ])
  type GraspReplaceWithSelector = (js.Function1[
    /* replacement */ typingsJapgolly.grasp.mod.Replacement, 
    js.Function1[/* input */ java.lang.String, java.lang.String]
  ]) with (js.Function2[
    /* replacement */ typingsJapgolly.grasp.mod.Replacement, 
    /* input */ java.lang.String, 
    java.lang.String
  ])
  type GraspSearchWithQueryEngine = (js.Function2[
    /* selector */ java.lang.String, 
    /* input */ java.lang.String, 
    js.Array[typingsJapgolly.estree.mod.Node]
  ]) with (js.Function1[
    /* selector */ java.lang.String, 
    js.Function1[/* input */ java.lang.String, js.Array[typingsJapgolly.estree.mod.Node]]
  ])
  type Replacement = java.lang.String | (js.Function4[
    /* getRaw */ js.Function1[/* node */ typingsJapgolly.estree.mod.Node, java.lang.String], 
    /* node */ typingsJapgolly.estree.mod.Node, 
    /* query */ js.Function1[/* q */ java.lang.String, js.Array[typingsJapgolly.estree.mod.Node]], 
    /* named */ org.scalablytyped.runtime.StringDictionary[java.lang.String | typingsJapgolly.estree.mod.Node], 
    java.lang.String
  ])
}
