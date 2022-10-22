package typingsJapgolly.nickThompsonElementary

import typingsJapgolly.nickThompsonElementary.nickThompsonElementaryInts.`0`
import typingsJapgolly.nickThompsonElementary.nickThompsonElementaryInts.`1`
import typingsJapgolly.nickThompsonElementary.nickThompsonElementaryInts.`2`
import typingsJapgolly.nickThompsonElementary.nickThompsonElementaryInts.`3`
import typingsJapgolly.nickThompsonElementary.nickThompsonElementaryInts.`4`
import typingsJapgolly.nickThompsonElementary.nickThompsonElementaryInts.`5`
import typingsJapgolly.nickThompsonElementary.nickThompsonElementaryInts.`6`
import typingsJapgolly.nickThompsonElementary.nickThompsonElementaryInts.`7`
import typingsJapgolly.nickThompsonElementary.nickThompsonElementaryInts.`8`
import typingsJapgolly.nickThompsonElementary.srcCoreNodeMod.Node
import typingsJapgolly.nickThompsonElementary.srcCoreTypesMod.CompositeNodeType
import typingsJapgolly.nickThompsonElementary.srcCoreTypesMod.NativeNodeType
import typingsJapgolly.nickThompsonElementary.srcCoreTypesMod.NodeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcCoreChildrenMod {
  
  type Child = Node | Double
  
  type Children = ChildrenArray
  
  type ChildrenArray = SizedChildrenArray[`0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8`]
  
  type ChildrenArraySize[A /* <: js.Array[Any] */] = (/* import warning: importer.ImportType#apply Failed type conversion: A['length'] */ js.Any) & ChildrenArraySizeRange
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.nickThompsonElementary.nickThompsonElementaryInts.`0`
    - typingsJapgolly.nickThompsonElementary.nickThompsonElementaryInts.`1`
    - typingsJapgolly.nickThompsonElementary.nickThompsonElementaryInts.`2`
    - typingsJapgolly.nickThompsonElementary.nickThompsonElementaryInts.`3`
    - typingsJapgolly.nickThompsonElementary.nickThompsonElementaryInts.`4`
    - typingsJapgolly.nickThompsonElementary.nickThompsonElementaryInts.`5`
    - typingsJapgolly.nickThompsonElementary.nickThompsonElementaryInts.`6`
    - typingsJapgolly.nickThompsonElementary.nickThompsonElementaryInts.`7`
    - typingsJapgolly.nickThompsonElementary.nickThompsonElementaryInts.`8`
  */
  trait ChildrenArraySizeRange extends StObject
  object ChildrenArraySizeRange {
    
    inline def `0`: typingsJapgolly.nickThompsonElementary.nickThompsonElementaryInts.`0` = 0.asInstanceOf[typingsJapgolly.nickThompsonElementary.nickThompsonElementaryInts.`0`]
    
    inline def `1`: typingsJapgolly.nickThompsonElementary.nickThompsonElementaryInts.`1` = 1.asInstanceOf[typingsJapgolly.nickThompsonElementary.nickThompsonElementaryInts.`1`]
    
    inline def `2`: typingsJapgolly.nickThompsonElementary.nickThompsonElementaryInts.`2` = 2.asInstanceOf[typingsJapgolly.nickThompsonElementary.nickThompsonElementaryInts.`2`]
    
    inline def `3`: typingsJapgolly.nickThompsonElementary.nickThompsonElementaryInts.`3` = 3.asInstanceOf[typingsJapgolly.nickThompsonElementary.nickThompsonElementaryInts.`3`]
    
    inline def `4`: typingsJapgolly.nickThompsonElementary.nickThompsonElementaryInts.`4` = 4.asInstanceOf[typingsJapgolly.nickThompsonElementary.nickThompsonElementaryInts.`4`]
    
    inline def `5`: typingsJapgolly.nickThompsonElementary.nickThompsonElementaryInts.`5` = 5.asInstanceOf[typingsJapgolly.nickThompsonElementary.nickThompsonElementaryInts.`5`]
    
    inline def `6`: typingsJapgolly.nickThompsonElementary.nickThompsonElementaryInts.`6` = 6.asInstanceOf[typingsJapgolly.nickThompsonElementary.nickThompsonElementaryInts.`6`]
    
    inline def `7`: typingsJapgolly.nickThompsonElementary.nickThompsonElementaryInts.`7` = 7.asInstanceOf[typingsJapgolly.nickThompsonElementary.nickThompsonElementaryInts.`7`]
    
    inline def `8`: typingsJapgolly.nickThompsonElementary.nickThompsonElementaryInts.`8` = 8.asInstanceOf[typingsJapgolly.nickThompsonElementary.nickThompsonElementaryInts.`8`]
  }
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    std.Parameters<T> extends [] ? [] : std.Parameters<T> extends [infer IProps, ...infer IChildren] ? IProps extends @nick-thompson/elementary.@nick-thompson/elementary/src/core/children.Child ? @nick-thompson/elementary.@nick-thompson/elementary/src/core/children.SizedChildrenArray<@nick-thompson/elementary.@nick-thompson/elementary/src/core/children.ChildrenArraySize<[IProps, ...IChildren]>> : @nick-thompson/elementary.@nick-thompson/elementary/src/core/children.SizedChildrenArray<@nick-thompson/elementary.@nick-thompson/elementary/src/core/children.ChildrenArraySize<IChildren>> : never
    }}}
    */
  @js.native
  trait CompositeNodeChildren[T /* <: CompositeNodeType */] extends StObject
  
  type NativeNodeChildren[T /* <: NativeNodeType */] = /* import warning: importer.ImportType#apply Failed type conversion: @nick-thompson/elementary.anon.keyininSizedChildrenArray[T] */ js.Any
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    @nick-thompson/elementary.@nick-thompson/elementary/src/core/types.NodeType extends T ? @nick-thompson/elementary.@nick-thompson/elementary/src/core/children.Children : T extends @nick-thompson/elementary.@nick-thompson/elementary/src/core/types.NativeNodeType ? @nick-thompson/elementary.@nick-thompson/elementary/src/core/children.NativeNodeChildren<T> : T extends @nick-thompson/elementary.@nick-thompson/elementary/src/core/types.CompositeNodeType ? @nick-thompson/elementary.@nick-thompson/elementary/src/core/children.CompositeNodeChildren<T> : never
    }}}
    */
  @js.native
  trait NodeChildren[T /* <: NodeType */] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    Size extends 1 ? [@nick-thompson/elementary.@nick-thompson/elementary/src/core/children.Child] : Size extends 2 ? [@nick-thompson/elementary.@nick-thompson/elementary/src/core/children.Child, @nick-thompson/elementary.@nick-thompson/elementary/src/core/children.Child] : Size extends 3 ? [@nick-thompson/elementary.@nick-thompson/elementary/src/core/children.Child, @nick-thompson/elementary.@nick-thompson/elementary/src/core/children.Child, @nick-thompson/elementary.@nick-thompson/elementary/src/core/children.Child] : Size extends 4 ? [@nick-thompson/elementary.@nick-thompson/elementary/src/core/children.Child, @nick-thompson/elementary.@nick-thompson/elementary/src/core/children.Child, @nick-thompson/elementary.@nick-thompson/elementary/src/core/children.Child, @nick-thompson/elementary.@nick-thompson/elementary/src/core/children.Child] : Size extends 5 ? [@nick-thompson/elementary.@nick-thompson/elementary/src/core/children.Child, @nick-thompson/elementary.@nick-thompson/elementary/src/core/children.Child, @nick-thompson/elementary.@nick-thompson/elementary/src/core/children.Child, @nick-thompson/elementary.@nick-thompson/elementary/src/core/children.Child, @nick-thompson/elementary.@nick-thompson/elementary/src/core/children.Child] : Size extends 6 ? [@nick-thompson/elementary.@nick-thompson/elementary/src/core/children.Child, @nick-thompson/elementary.@nick-thompson/elementary/src/core/children.Child, @nick-thompson/elementary.@nick-thompson/elementary/src/core/children.Child, @nick-thompson/elementary.@nick-thompson/elementary/src/core/children.Child, @nick-thompson/elementary.@nick-thompson/elementary/src/core/children.Child, @nick-thompson/elementary.@nick-thompson/elementary/src/core/children.Child] : Size extends 7 ? [@nick-thompson/elementary.@nick-thompson/elementary/src/core/children.Child, @nick-thompson/elementary.@nick-thompson/elementary/src/core/children.Child, @nick-thompson/elementary.@nick-thompson/elementary/src/core/children.Child, @nick-thompson/elementary.@nick-thompson/elementary/src/core/children.Child, @nick-thompson/elementary.@nick-thompson/elementary/src/core/children.Child, @nick-thompson/elementary.@nick-thompson/elementary/src/core/children.Child, @nick-thompson/elementary.@nick-thompson/elementary/src/core/children.Child] : Size extends 8 ? [@nick-thompson/elementary.@nick-thompson/elementary/src/core/children.Child, @nick-thompson/elementary.@nick-thompson/elementary/src/core/children.Child, @nick-thompson/elementary.@nick-thompson/elementary/src/core/children.Child, @nick-thompson/elementary.@nick-thompson/elementary/src/core/children.Child, @nick-thompson/elementary.@nick-thompson/elementary/src/core/children.Child, @nick-thompson/elementary.@nick-thompson/elementary/src/core/children.Child, @nick-thompson/elementary.@nick-thompson/elementary/src/core/children.Child, @nick-thompson/elementary.@nick-thompson/elementary/src/core/children.Child] : std.Array<never>
    }}}
    */
  @js.native
  trait SizedChildrenArray[Size /* <: ChildrenArraySizeRange */] extends StObject
  
  type VariadicChildrenArray = SizedChildrenArray[`1` | `2` | `3` | `4` | `5` | `6` | `7` | `8`]
}
