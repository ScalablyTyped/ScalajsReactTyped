package typingsJapgolly.nickThompsonElementary

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import typingsJapgolly.nickThompsonElementary.nickThompsonElementaryStrings.abs
import typingsJapgolly.nickThompsonElementary.nickThompsonElementaryStrings.add
import typingsJapgolly.nickThompsonElementary.nickThompsonElementaryStrings.asinh
import typingsJapgolly.nickThompsonElementary.nickThompsonElementaryStrings.biquad
import typingsJapgolly.nickThompsonElementary.nickThompsonElementaryStrings.ceil
import typingsJapgolly.nickThompsonElementary.nickThompsonElementaryStrings.const
import typingsJapgolly.nickThompsonElementary.nickThompsonElementaryStrings.convolve
import typingsJapgolly.nickThompsonElementary.nickThompsonElementaryStrings.cos
import typingsJapgolly.nickThompsonElementary.nickThompsonElementaryStrings.counter
import typingsJapgolly.nickThompsonElementary.nickThompsonElementaryStrings.delay
import typingsJapgolly.nickThompsonElementary.nickThompsonElementaryStrings.div
import typingsJapgolly.nickThompsonElementary.nickThompsonElementaryStrings.exp
import typingsJapgolly.nickThompsonElementary.nickThompsonElementaryStrings.floor
import typingsJapgolly.nickThompsonElementary.nickThompsonElementaryStrings.ge
import typingsJapgolly.nickThompsonElementary.nickThompsonElementaryStrings.geq
import typingsJapgolly.nickThompsonElementary.nickThompsonElementaryStrings.in
import typingsJapgolly.nickThompsonElementary.nickThompsonElementaryStrings.latch
import typingsJapgolly.nickThompsonElementary.nickThompsonElementaryStrings.le
import typingsJapgolly.nickThompsonElementary.nickThompsonElementaryStrings.leq
import typingsJapgolly.nickThompsonElementary.nickThompsonElementaryStrings.ln
import typingsJapgolly.nickThompsonElementary.nickThompsonElementaryStrings.log
import typingsJapgolly.nickThompsonElementary.nickThompsonElementaryStrings.log2
import typingsJapgolly.nickThompsonElementary.nickThompsonElementaryStrings.max
import typingsJapgolly.nickThompsonElementary.nickThompsonElementaryStrings.min
import typingsJapgolly.nickThompsonElementary.nickThompsonElementaryStrings.mod
import typingsJapgolly.nickThompsonElementary.nickThompsonElementaryStrings.mul
import typingsJapgolly.nickThompsonElementary.nickThompsonElementaryStrings.phasor
import typingsJapgolly.nickThompsonElementary.nickThompsonElementaryStrings.pole
import typingsJapgolly.nickThompsonElementary.nickThompsonElementaryStrings.pow
import typingsJapgolly.nickThompsonElementary.nickThompsonElementaryStrings.rand
import typingsJapgolly.nickThompsonElementary.nickThompsonElementaryStrings.root
import typingsJapgolly.nickThompsonElementary.nickThompsonElementaryStrings.sample
import typingsJapgolly.nickThompsonElementary.nickThompsonElementaryStrings.seq
import typingsJapgolly.nickThompsonElementary.nickThompsonElementaryStrings.sin
import typingsJapgolly.nickThompsonElementary.nickThompsonElementaryStrings.sqrt
import typingsJapgolly.nickThompsonElementary.nickThompsonElementaryStrings.sr
import typingsJapgolly.nickThompsonElementary.nickThompsonElementaryStrings.sub
import typingsJapgolly.nickThompsonElementary.nickThompsonElementaryStrings.table
import typingsJapgolly.nickThompsonElementary.nickThompsonElementaryStrings.tan
import typingsJapgolly.nickThompsonElementary.nickThompsonElementaryStrings.tanh
import typingsJapgolly.nickThompsonElementary.nickThompsonElementaryStrings.z
import typingsJapgolly.nickThompsonElementary.srcCoreChildrenMod.NodeChildren
import typingsJapgolly.nickThompsonElementary.srcCorePropsMod.NodeProps
import typingsJapgolly.nickThompsonElementary.srcCoreTypesMod.CompositeNodeType
import typingsJapgolly.nickThompsonElementary.srcCoreTypesMod.NativeNodeType
import typingsJapgolly.nickThompsonElementary.srcCoreTypesMod.NodeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcCoreNodeMod {
  
  type AbsNode = NativeNode[abs]
  
  type AddNode = NativeNode[add]
  
  type AsinhNode = NativeNode[asinh]
  
  type BiquadNode = NativeNode[biquad]
  
  type CeilNode = NativeNode[ceil]
  
  trait CompositeNode[T /* <: CompositeNodeType */]
    extends StObject
       with Node
  object CompositeNode {
    
    inline def apply[T /* <: CompositeNodeType */](DollarDollartypeof: Any): CompositeNode[T] = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("$$typeof")(DollarDollartypeof.asInstanceOf[js.Any])
      __obj.asInstanceOf[CompositeNode[T]]
    }
  }
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends @nick-thompson/elementary.@nick-thompson/elementary/src/core/types.NativeNodeType ? @nick-thompson/elementary.@nick-thompson/elementary/src/core/node.NativeNode<T> : T extends @nick-thompson/elementary.@nick-thompson/elementary/src/core/types.CompositeNodeType ? @nick-thompson/elementary.@nick-thompson/elementary/src/core/node.CompositeNode<T> : never
    }}}
    */
  @js.native
  trait ConcreteNode[T /* <: NodeType */] extends StObject
  
  type ConstNode = NativeNode[const]
  
  type ConvolveNode = NativeNode[convolve]
  
  type CosNode = NativeNode[cos]
  
  type CounterNode = NativeNode[counter]
  
  type DelayNode = NativeNode[delay]
  
  type DivNode = NativeNode[div]
  
  type ExpNode = NativeNode[exp]
  
  type FloorNode = NativeNode[floor]
  
  type GeNode = NativeNode[ge]
  
  type GeqNode = NativeNode[geq]
  
  type InNode = NativeNode[in]
  
  type LatchNode = NativeNode[latch]
  
  type LeNode = NativeNode[le]
  
  type LeqNode = NativeNode[leq]
  
  type LnNode = NativeNode[ln]
  
  type Log2Node = NativeNode[log2]
  
  type LogNode = NativeNode[log]
  
  type MaxNode = NativeNode[max]
  
  type MinNode = NativeNode[min]
  
  type ModNode = NativeNode[mod]
  
  type MulNode = NativeNode[mul]
  
  trait NativeNode[T /* <: NativeNodeType */]
    extends StObject
       with Node
  object NativeNode {
    
    inline def apply[T /* <: NativeNodeType */](DollarDollartypeof: Any): NativeNode[T] = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("$$typeof")(DollarDollartypeof.asInstanceOf[js.Any])
      __obj.asInstanceOf[NativeNode[T]]
    }
  }
  
  trait Node extends StObject {
    
    /**
      * Do not use this! It is only here to differentiate {@link Node} and
      * {@link Props} types.
      *
      * @see Node
      * @see Props
      */
    @JSName("$$typeof")
    var DollarDollartypeof: Any
  }
  object Node {
    
    inline def apply(DollarDollartypeof: Any): Node = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("$$typeof")(DollarDollartypeof.asInstanceOf[js.Any])
      __obj.asInstanceOf[Node]
    }
    
    extension [Self <: Node](x: Self) {
      
      inline def setDollarDollartypeof(value: Any): Self = StObject.set(x, "$$typeof", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait NodeConstructor
    extends StObject
       with Instantiable2[/* type */ NodeType, /* children */ NodeChildren[NodeType], ConcreteNode[NodeType]]
       with Instantiable3[
          /* type */ NodeType, 
          /* props */ NodeProps[NodeType], 
          /* children */ NodeChildren[NodeType], 
          ConcreteNode[NodeType]
        ]
  
  type NodeFactory[T /* <: NodeType */, P /* <: NodeProps[T] */, C /* <: NodeChildren[T] */, R /* <: ConcreteNode[T] */] = (js.Function2[/* props */ P, /* children */ C, R]) & (js.Function1[/* children */ C, R])
  
  @js.native
  trait NodeStatic
    extends StObject
       with NodeConstructor {
    
    /**
      * Checks whether an object is a {@link Node}
      *
      * @param toCheck
      * object to check whether it is a {@link Node}
      *
      * @returns
      * whether toCheck is a {@link Node}
      *
      * @see NodeStatic
      * @see Node
      */
    def isNode(toCheck: Any): /* is @nick-thompson/elementary.@nick-thompson/elementary/src/core/node.Node */ Boolean = js.native
  }
  
  type PhasorNode = NativeNode[phasor]
  
  type PoleNode = NativeNode[pole]
  
  type PowNode = NativeNode[pow]
  
  type RandNode = NativeNode[rand]
  
  type RootNode = NativeNode[root]
  
  type SampleNode = NativeNode[sample]
  
  type SeqNode = NativeNode[seq]
  
  type SinNode = NativeNode[sin]
  
  type SqrtNode = NativeNode[sqrt]
  
  type SrNode = NativeNode[sr]
  
  type SubNode = NativeNode[sub]
  
  type TableNode = NativeNode[table]
  
  type TanNode = NativeNode[tan]
  
  type TanhNode = NativeNode[tanh]
  
  type ZNode = NativeNode[z]
}
