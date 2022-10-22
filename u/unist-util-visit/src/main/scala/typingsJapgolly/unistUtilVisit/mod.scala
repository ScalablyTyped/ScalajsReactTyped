package typingsJapgolly.unistUtilVisit

import typingsJapgolly.unist.mod.Data
import typingsJapgolly.unist.mod.NodeData
import typingsJapgolly.unistUtilVisit.complexTypesMod.BuildVisitor
import typingsJapgolly.unistUtilVisit.unistUtilVisitBooleans.`false`
import typingsJapgolly.unistUtilVisit.unistUtilVisitBooleans.`true`
import typingsJapgolly.unistUtilVisit.unistUtilVisitStrings.skip
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("unist-util-visit", "CONTINUE")
  @js.native
  val CONTINUE: `true` = js.native
  
  @JSImport("unist-util-visit", "EXIT")
  @js.native
  val EXIT: `false` = js.native
  
  @JSImport("unist-util-visit", "SKIP")
  @js.native
  val SKIP: skip = js.native
  
  @JSImport("unist-util-visit", "visit")
  @js.native
  val visit: (js.Function4[
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
  
  type Node = typingsJapgolly.unist.mod.Node[Data]
  
  type Parent = typingsJapgolly.unist.mod.Parent[
    typingsJapgolly.unist.mod.Node[Data], 
    NodeData[typingsJapgolly.unist.mod.Node[Data]]
  ]
  
  type Test = typingsJapgolly.unistUtilIs.mod.Test
  
  type Visitor = typingsJapgolly.unistUtilVisit.complexTypesMod.Visitor[
    typingsJapgolly.unist.mod.Node[Data], 
    typingsJapgolly.unist.mod.Parent[
      typingsJapgolly.unist.mod.Node[Data], 
      NodeData[typingsJapgolly.unist.mod.Node[Data]]
    ]
  ]
  
  type VisitorResult = typingsJapgolly.unistUtilVisitParents.mod.VisitorResult
}
