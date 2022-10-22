package typingsJapgolly.mergerino

import typingsJapgolly.std.ReadonlyArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("mergerino", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[S /* <: js.Object */](source: S, patches: MultipleTopLevelPatch[S]*): S = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(scala.List(source.asInstanceOf[js.Any]).`++`(patches.asInstanceOf[Seq[js.Any]])*).asInstanceOf[S]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends std.Array<infer V> ? mergerino.mergerino.ObjectPatch<std.Record<number, V>> : never
    }}}
    */
  @js.native
  trait ArrayPatch[T]
    extends StObject
       with _TopLevelPatch[T]
  
  @js.native
  trait DeepArray[T]
    extends StObject
       with ReadonlyArray[T | DeepArray[T]]
  
  type DeletePatch = Unit
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.mergerino.mergerinoBooleans.`false`
    - typingsJapgolly.mergerino.mergerinoInts.`0`
    - typingsJapgolly.mergerino.mergerinoStrings._empty
    - scala.Null
    - scala.Unit
  */
  type Falsy = js.UndefOr[_Falsy | Null]
  
  type FunctionPatch[T] = js.Function2[
    /* val */ T, 
    /* merge */ Merge[
      /* import warning: importer.ImportType#apply Failed type conversion: T extends object ? T : never */ js.Any
    ], 
    T
  ]
  
  @js.native
  trait Merge[S /* <: js.Object */] extends StObject {
    
    def apply(source: S, patches: MultipleTopLevelPatch[S]*): S = js.native
  }
  
  type MultipleTopLevelPatch[S /* <: js.Object */] = TopLevelPatch[S] | Any
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends object ? mergerino.mergerino.ObjectPatch<T> : never
    }}}
    */
  @js.native
  trait NestedPatch[T] extends StObject
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ K in keyof S ]:? S[K] | mergerino.mergerino.DeletePatch | mergerino.mergerino.FunctionPatch<S[K]> | mergerino.mergerino.NestedPatch<S[K]> | mergerino.mergerino.ArrayPatch<S[K]>}
    }}}
    */
  @js.native
  trait ObjectPatch[S /* <: js.Object */]
    extends StObject
       with _TopLevelPatch[S]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.mergerino.mod.FunctionPatch[S]
    - typingsJapgolly.mergerino.mod.ObjectPatch[S]
    - typingsJapgolly.mergerino.mod.ArrayPatch[S]
    - typingsJapgolly.mergerino.mod.Falsy
  */
  type TopLevelPatch[S /* <: js.Object */] = js.UndefOr[_TopLevelPatch[S] | FunctionPatch[S] | Null]
  
  trait _Falsy
    extends StObject
       with _TopLevelPatch[Any]
  
  trait _TopLevelPatch[S /* <: js.Object */] extends StObject
}
