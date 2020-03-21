package typingsJapgolly.broccoliNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type InputNode = typingsJapgolly.broccoliNodeApi.mod.Node | java.lang.String
  type Node = typingsJapgolly.broccoliNodeApi.mod.SourceNode | typingsJapgolly.broccoliNodeApi.mod.TransformNode
  type SourceNode = typingsJapgolly.broccoliNodeApi.mod.NodeCommon[typingsJapgolly.broccoliNodeApi.mod.SourceNodeInfo]
  type TransformNode = typingsJapgolly.broccoliNodeApi.mod.NodeCommon[typingsJapgolly.broccoliNodeApi.mod.TransformNodeInfo]
}
