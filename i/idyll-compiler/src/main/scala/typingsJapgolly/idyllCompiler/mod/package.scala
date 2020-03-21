package typingsJapgolly.idyllCompiler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AST = js.Array[typingsJapgolly.idyllCompiler.mod.Node]
  type Node = typingsJapgolly.idyllCompiler.mod.TreeNode | java.lang.String
  type PostProcessor = (js.Function1[
    /* ast */ typingsJapgolly.idyllCompiler.mod.AST, 
    typingsJapgolly.idyllCompiler.mod.AST
  ]) | (js.Function2[
    /* ast */ typingsJapgolly.idyllCompiler.mod.AST, 
    /* callback */ js.Function2[/* err */ js.Any, /* value */ typingsJapgolly.idyllCompiler.mod.AST, scala.Unit], 
    scala.Unit
  ])
  type PropData = java.lang.String | scala.Double | scala.Boolean
  type PropKey = java.lang.String
  type PropValue = js.Tuple2[
    typingsJapgolly.idyllCompiler.mod.PropType, 
    typingsJapgolly.idyllCompiler.mod.PropData
  ]
  type Property = js.Tuple2[
    typingsJapgolly.idyllCompiler.mod.PropKey, 
    typingsJapgolly.idyllCompiler.mod.PropValue
  ]
  type RecursiveNode[T] = js.Tuple3[java.lang.String, js.Array[typingsJapgolly.idyllCompiler.mod.Property], js.Array[T]]
}
