package typingsJapgolly.babelTraverse

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Node = typingsJapgolly.babelTypes.mod.Node
  type NodePaths[T /* <: typingsJapgolly.babelTraverse.mod.Node | js.Array[typingsJapgolly.babelTraverse.mod.Node] */] = js.Array[typingsJapgolly.babelTraverse.mod.NodePath[T]] | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]: @babel/traverse.@babel/traverse.NodePath<T[K]>}
    */ typingsJapgolly.babelTraverse.babelTraverseStrings.NodePaths with T)
  type VisitNode[S, P] = (typingsJapgolly.babelTraverse.mod.VisitNodeFunction[S, P]) | (typingsJapgolly.babelTraverse.mod.VisitNodeObject[S, P])
  type VisitNodeFunction[S, P] = js.ThisFunction2[
    /* this */ S, 
    /* path */ typingsJapgolly.babelTraverse.mod.NodePath[P], 
    /* state */ S, 
    scala.Unit
  ]
  type Visitor[S] = (typingsJapgolly.babelTraverse.mod.VisitNodeObject[S, typingsJapgolly.babelTraverse.mod.Node]) with typingsJapgolly.babelTraverse.babelTraverseStrings.Visitor with js.Any with typingsJapgolly.babelTypes.mod.Aliases
}
