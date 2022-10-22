package typingsJapgolly.refArrayDi

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typingsJapgolly.refArrayDi.mod.ArrayType
import typingsJapgolly.refArrayDi.mod.FixedLengthArrayType
import typingsJapgolly.refNapi.mod.NamedType
import typingsJapgolly.refNapi.mod.TypeLike
import typingsJapgolly.refNapi.mod.UnderlyingType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Call
    extends StObject
       with // NOTE: The `ref.NamedType` overload is a subset of the `ref.TypeLike` overload, but provides better completions.
  Instantiable1[
          (/* type */ NamedType) | (/* type */ TypeLike), 
          ArrayType[js.Object | (UnderlyingType[NamedType | TypeLike])]
        ]
       with // NOTE: The `ref.NamedType` overload is a subset of the `ref.TypeLike` overload, but provides better completions.
  Instantiable2[
          (/* type */ NamedType) | (/* type */ TypeLike), 
          /* length */ Double, 
          (ArrayType[js.Object | (UnderlyingType[NamedType | TypeLike])]) | (FixedLengthArrayType[js.Object | (UnderlyingType[NamedType | TypeLike]), Double])
        ] {
    
    def apply[T](`type`: TypeLike): ArrayType[T] = js.native
    def apply[T](`type`: TypeLike, length: Double): ArrayType[T] = js.native
    def apply[T, TLength /* <: Double */](`type`: TypeLike, length: TLength): FixedLengthArrayType[T, TLength] = js.native
  }
}
