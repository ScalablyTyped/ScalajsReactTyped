package typingsJapgolly.unistUtilVisitParents

import typingsJapgolly.unist.mod.Data
import typingsJapgolly.unist.mod.NodeData
import typingsJapgolly.unistUtilVisitParents.complexTypesMod.BuildVisitor
import typingsJapgolly.unistUtilVisitParents.unistUtilVisitParentsBooleans.`false`
import typingsJapgolly.unistUtilVisitParents.unistUtilVisitParentsBooleans.`true`
import typingsJapgolly.unistUtilVisitParents.unistUtilVisitParentsStrings.skip
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("unist-util-visit-parents", "CONTINUE")
  @js.native
  val CONTINUE: `true` = js.native
  
  @JSImport("unist-util-visit-parents", "EXIT")
  @js.native
  val EXIT: `false` = js.native
  
  @JSImport("unist-util-visit-parents", "SKIP")
  @js.native
  val SKIP: skip = js.native
  
  @JSImport("unist-util-visit-parents", "visitParents")
  @js.native
  val visitParents: (js.Function4[
    /* tree */ typingsJapgolly.unist.mod.Node[Data], 
    /* test */ typingsJapgolly.unistUtilIs.mod.Test, 
    /* visitor */ BuildVisitor[typingsJapgolly.unist.mod.Node[Data], typingsJapgolly.unistUtilIs.mod.Test], 
    /* reverse */ js.UndefOr[Boolean], 
    Unit
  ]) & (js.Function3[
    /* tree */ typingsJapgolly.unist.mod.Node[Data], 
    /* visitor */ BuildVisitor[typingsJapgolly.unist.mod.Node[Data], String], 
    /* reverse */ js.UndefOr[Boolean], 
    Unit
  ]) = js.native
  
  type Action = typingsJapgolly.unistUtilVisitParents.complexTypesMod.Action
  
  type ActionTuple = typingsJapgolly.unistUtilVisitParents.complexTypesMod.ActionTuple
  
  type Index = typingsJapgolly.unistUtilVisitParents.complexTypesMod.Index
  
  type Node = typingsJapgolly.unist.mod.Node[Data]
  
  type Parent = typingsJapgolly.unist.mod.Parent[
    typingsJapgolly.unist.mod.Node[Data], 
    NodeData[typingsJapgolly.unist.mod.Node[Data]]
  ]
  
  type Test = typingsJapgolly.unistUtilIs.mod.Test
  
  type Visitor = typingsJapgolly.unistUtilVisitParents.complexTypesMod.Visitor[
    typingsJapgolly.unist.mod.Node[Data], 
    typingsJapgolly.unist.mod.Parent[
      typingsJapgolly.unist.mod.Node[Data], 
      NodeData[typingsJapgolly.unist.mod.Node[Data]]
    ]
  ]
  
  type VisitorResult = typingsJapgolly.unistUtilVisitParents.complexTypesMod.VisitorResult
}
