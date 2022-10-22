package typingsJapgolly.unistBuilder

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.std.Record
import typingsJapgolly.unist.mod.Data
import typingsJapgolly.unist.mod.NodeData
import typingsJapgolly.unistBuilder.anon.Children
import typingsJapgolly.unistBuilder.anon.Type
import typingsJapgolly.unistBuilder.anon.TypeT
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("unist-builder", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("unist-builder", "u")
  @js.native
  def u: BuildVoid & BuildVoidWithProps & BuildLiteral & BuildLiteralWithProps & BuildParent & BuildParentWithProps = js.native
  inline def u_=(
    x: BuildVoid & BuildVoidWithProps & BuildLiteral & BuildLiteralWithProps & BuildParent & BuildParentWithProps
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("u")(x.asInstanceOf[js.Any])
  
  type BuildLiteral = js.Function2[/* type */ String, /* value */ String, Type[String]]
  
  type BuildLiteralWithProps = js.Function3[
    /* type */ String, 
    /* props */ Record[String, Any], 
    /* value */ String, 
    Type[String] & (Record[String, Any])
  ]
  
  type BuildParent = js.Function2[
    /* type */ String, 
    /* children */ js.Array[typingsJapgolly.unist.mod.Node[Data]], 
    Children[String, js.Array[typingsJapgolly.unist.mod.Node[Data]]]
  ]
  
  type BuildParentWithProps = js.Function3[
    /* type */ String, 
    /* props */ Record[String, Any], 
    /* children */ js.Array[typingsJapgolly.unist.mod.Node[Data]], 
    (Children[String, js.Array[typingsJapgolly.unist.mod.Node[Data]]]) & (Record[String, Any])
  ]
  
  type BuildVoid = js.Function1[/* type */ String, TypeT[String]]
  
  type BuildVoidWithProps = js.Function2[
    /* type */ String, 
    /* props */ Record[String, Any], 
    TypeT[String] & (Record[String, Any])
  ]
  
  type ChildrenOrValue = js.Array[Node] | String
  
  type Literal = typingsJapgolly.unist.mod.Literal[Any, Data]
  
  type Node = typingsJapgolly.unist.mod.Node[Data]
  
  type Parent = typingsJapgolly.unist.mod.Parent[
    typingsJapgolly.unist.mod.Node[Data], 
    NodeData[typingsJapgolly.unist.mod.Node[Data]]
  ]
  
  type Props = StringDictionary[Any]
}
