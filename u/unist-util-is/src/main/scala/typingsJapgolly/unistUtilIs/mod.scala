package typingsJapgolly.unistUtilIs

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.std.Partial
import typingsJapgolly.unist.mod.Data
import typingsJapgolly.unist.mod.NodeData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("unist-util-is", "convert")
  @js.native
  val convert: (js.Function1[
    /* test */ (/* import warning: importer.ImportType#apply Failed type conversion: unist.unist.Node<unist.unist.Data>['type'] */ js.Any) | Partial[typingsJapgolly.unist.mod.Node[Data]] | TestFunctionPredicate[typingsJapgolly.unist.mod.Node[Data]], 
    AssertPredicate[typingsJapgolly.unist.mod.Node[Data]]
  ]) & (js.Function1[/* test */ js.UndefOr[Test], AssertAnything]) = js.native
  
  @JSImport("unist-util-is", "is")
  @js.native
  val is: (js.Function5[
    /* node */ Any, 
    /* test */ (/* import warning: importer.ImportType#apply Failed type conversion: unist.unist.Node<unist.unist.Data>['type'] */ js.Any) | Partial[typingsJapgolly.unist.mod.Node[Data]] | TestFunctionPredicate[typingsJapgolly.unist.mod.Node[Data]] | (js.Array[
      (/* import warning: importer.ImportType#apply Failed type conversion: unist.unist.Node<unist.unist.Data>['type'] */ js.Any) | Partial[typingsJapgolly.unist.mod.Node[Data]] | TestFunctionPredicate[typingsJapgolly.unist.mod.Node[Data]]
    ]), 
    /* index */ js.UndefOr[Double | Null], 
    /* parent */ js.UndefOr[Parent | Null], 
    /* context */ js.UndefOr[Any], 
    /* is unist.unist.Node<unist.unist.Data> */ Boolean
  ]) & (js.Function5[
    /* node */ js.UndefOr[Any], 
    /* test */ js.UndefOr[Test], 
    /* index */ js.UndefOr[Double | Null], 
    /* parent */ js.UndefOr[Parent | Null], 
    /* context */ js.UndefOr[Any], 
    Boolean
  ]) = js.native
  
  type AssertAnything = js.Function3[
    /* node */ js.UndefOr[Any], 
    /* index */ js.UndefOr[Double | Null], 
    /* parent */ js.UndefOr[Parent | Null], 
    Boolean
  ]
  
  type AssertPredicate[Y /* <: typingsJapgolly.unist.mod.Node[Data] */] = js.Function3[
    /* node */ js.UndefOr[Any], 
    /* index */ js.UndefOr[Double | Null], 
    /* parent */ js.UndefOr[Parent | Null], 
    /* is Y */ Boolean
  ]
  
  type Node = typingsJapgolly.unist.mod.Node[Data]
  
  type Parent = typingsJapgolly.unist.mod.Parent[
    typingsJapgolly.unist.mod.Node[Data], 
    NodeData[typingsJapgolly.unist.mod.Node[Data]]
  ]
  
  type Props = StringDictionary[Any]
  
  type Test = js.UndefOr[
    Null | Type | Props | TestFunctionAnything | (js.Array[Type | Props | TestFunctionAnything])
  ]
  
  type TestFunctionAnything = js.Function3[
    /* node */ Node, 
    /* index */ js.UndefOr[Double | Null], 
    /* parent */ js.UndefOr[Parent | Null], 
    Boolean | Unit
  ]
  
  type TestFunctionPredicate[X /* <: typingsJapgolly.unist.mod.Node[Data] */] = js.Function3[
    /* node */ Node, 
    /* index */ js.UndefOr[Double | Null], 
    /* parent */ js.UndefOr[Parent | Null], 
    /* is X */ Boolean
  ]
  
  type Type = String
}
