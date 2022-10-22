package typingsJapgolly.fpTs

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.fpTs.libSemigroupoidMod.Semigroupoid
import typingsJapgolly.fpTs.libSemigroupoidMod.Semigroupoid2
import typingsJapgolly.fpTs.libSemigroupoidMod.Semigroupoid3
import typingsJapgolly.fpTs.libSemigroupoidMod.Semigroupoid4
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCategoryMod {
  
  trait Category[F]
    extends StObject
       with Semigroupoid[F] {
    
    def id[A](): Any
  }
  object Category {
    
    inline def apply[F](
      URI: F,
      compose: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT2<F, B, C> */ Any, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT2<F, A, B> */ Any) => Any,
      id: CallbackTo[Any]
    ): Category[F] = {
      val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], compose = js.Any.fromFunction2(compose), id = id.toJsFn)
      __obj.asInstanceOf[Category[F]]
    }
    
    extension [Self <: Category[?], F](x: Self & Category[F]) {
      
      inline def setId(value: CallbackTo[Any]): Self = StObject.set(x, "id", value.toJsFn)
    }
  }
  
  trait Category2[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */]
    extends StObject
       with Semigroupoid2[F] {
    
    def id[A](): Any
  }
  object Category2 {
    
    inline def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](
      URI: F,
      compose: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, B, C> */ Any, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, A, B> */ Any) => Any,
      id: CallbackTo[Any]
    ): Category2[F] = {
      val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], compose = js.Any.fromFunction2(compose), id = id.toJsFn)
      __obj.asInstanceOf[Category2[F]]
    }
    
    extension [Self <: Category2[?], F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](x: Self & Category2[F]) {
      
      inline def setId(value: CallbackTo[Any]): Self = StObject.set(x, "id", value.toJsFn)
    }
  }
  
  trait Category3[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */]
    extends StObject
       with Semigroupoid3[F] {
    
    def id[R, A](): Any
  }
  object Category3 {
    
    inline def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](
      URI: F,
      compose: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, B, C> */ Any, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, A, B> */ Any) => Any,
      id: CallbackTo[Any]
    ): Category3[F] = {
      val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], compose = js.Any.fromFunction2(compose), id = id.toJsFn)
      __obj.asInstanceOf[Category3[F]]
    }
    
    extension [Self <: Category3[?], F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](x: Self & Category3[F]) {
      
      inline def setId(value: CallbackTo[Any]): Self = StObject.set(x, "id", value.toJsFn)
    }
  }
  
  trait Category4[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS4 */ Any */]
    extends StObject
       with Semigroupoid4[F] {
    
    def id[S, R, A](): Any
  }
  object Category4 {
    
    inline def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS4 */ Any */](
      URI: F,
      compose: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, B, C> */ Any, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, A, B> */ Any) => Any,
      id: CallbackTo[Any]
    ): Category4[F] = {
      val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], compose = js.Any.fromFunction2(compose), id = id.toJsFn)
      __obj.asInstanceOf[Category4[F]]
    }
    
    extension [Self <: Category4[?], F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS4 */ Any */](x: Self & Category4[F]) {
      
      inline def setId(value: CallbackTo[Any]): Self = StObject.set(x, "id", value.toJsFn)
    }
  }
}
