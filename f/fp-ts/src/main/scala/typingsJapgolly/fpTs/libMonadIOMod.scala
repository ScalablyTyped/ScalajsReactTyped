package typingsJapgolly.fpTs

import typingsJapgolly.fpTs.libFromIOMod.FromIO
import typingsJapgolly.fpTs.libFromIOMod.FromIO1
import typingsJapgolly.fpTs.libFromIOMod.FromIO2
import typingsJapgolly.fpTs.libFromIOMod.FromIO2C
import typingsJapgolly.fpTs.libFromIOMod.FromIO3
import typingsJapgolly.fpTs.libFromIOMod.FromIO3C
import typingsJapgolly.fpTs.libFromIOMod.FromIO4
import typingsJapgolly.fpTs.libIOMod.IO_
import typingsJapgolly.fpTs.libMonadMod.Monad
import typingsJapgolly.fpTs.libMonadMod.Monad1
import typingsJapgolly.fpTs.libMonadMod.Monad2
import typingsJapgolly.fpTs.libMonadMod.Monad2C
import typingsJapgolly.fpTs.libMonadMod.Monad3
import typingsJapgolly.fpTs.libMonadMod.Monad3C
import typingsJapgolly.fpTs.libMonadMod.Monad4
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMonadIOMod {
  
  trait MonadIO[M]
    extends StObject
       with Monad[M]
       with FromIO[M] {
    
    /* InferMemberOverrides */
    override val URI: M
  }
  object MonadIO {
    
    inline def apply[M](
      URI: M,
      ap: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, (a : A): B> */ Any, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, A> */ Any) => Any,
      chain: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, A> */ Any, js.Function1[
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, B> */ Any
        ]) => Any,
      fromIO: IO_[Any] => Any,
      map: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, A> */ Any, js.Function1[Any, Any]) => Any,
      of: Any => Any
    ): MonadIO[M] = {
      val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], ap = js.Any.fromFunction2(ap), chain = js.Any.fromFunction2(chain), fromIO = js.Any.fromFunction1(fromIO), map = js.Any.fromFunction2(map), of = js.Any.fromFunction1(of))
      __obj.asInstanceOf[MonadIO[M]]
    }
    
    extension [Self <: MonadIO[?], M](x: Self & MonadIO[M]) {
      
      inline def setURI(value: M): Self = StObject.set(x, "URI", value.asInstanceOf[js.Any])
    }
  }
  
  trait MonadIO1[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */]
    extends StObject
       with Monad1[M]
       with FromIO1[M] {
    
    /* InferMemberOverrides */
    override val URI: M
  }
  object MonadIO1 {
    
    inline def apply[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](
      URI: M,
      ap: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, (a : A): B> */ Any, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ Any) => Any,
      chain: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ Any, js.Function1[
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, B> */ Any
        ]) => Any,
      fromIO: IO_[Any] => Any,
      map: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ Any, js.Function1[Any, Any]) => Any,
      of: Any => Any
    ): MonadIO1[M] = {
      val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], ap = js.Any.fromFunction2(ap), chain = js.Any.fromFunction2(chain), fromIO = js.Any.fromFunction1(fromIO), map = js.Any.fromFunction2(map), of = js.Any.fromFunction1(of))
      __obj.asInstanceOf[MonadIO1[M]]
    }
    
    extension [Self <: MonadIO1[?], M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](x: Self & MonadIO1[M]) {
      
      inline def setURI(value: M): Self = StObject.set(x, "URI", value.asInstanceOf[js.Any])
    }
  }
  
  trait MonadIO2[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */]
    extends StObject
       with Monad2[M]
       with FromIO2[M] {
    
    /* InferMemberOverrides */
    override val URI: M
  }
  object MonadIO2 {
    
    inline def apply[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](
      URI: M,
      ap: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, (a : A): B> */ Any, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ Any) => Any,
      chain: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ Any, js.Function1[
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, B> */ Any
        ]) => Any,
      fromIO: IO_[Any] => Any,
      map: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ Any, js.Function1[Any, Any]) => Any,
      of: Any => Any
    ): MonadIO2[M] = {
      val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], ap = js.Any.fromFunction2(ap), chain = js.Any.fromFunction2(chain), fromIO = js.Any.fromFunction1(fromIO), map = js.Any.fromFunction2(map), of = js.Any.fromFunction1(of))
      __obj.asInstanceOf[MonadIO2[M]]
    }
    
    extension [Self <: MonadIO2[?], M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](x: Self & MonadIO2[M]) {
      
      inline def setURI(value: M): Self = StObject.set(x, "URI", value.asInstanceOf[js.Any])
    }
  }
  
  trait MonadIO2C[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, E]
    extends StObject
       with Monad2C[M, E]
       with FromIO2C[M, E] {
    
    /* InferMemberOverrides */
    override val URI: M
    
    /* InferMemberOverrides */
    override val _E: E
  }
  object MonadIO2C {
    
    inline def apply[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, E](
      URI: M,
      _E: E,
      ap: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, (a : A): B> */ Any, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ Any) => Any,
      chain: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ Any, js.Function1[
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, B> */ Any
        ]) => Any,
      fromIO: IO_[Any] => Any,
      map: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ Any, js.Function1[Any, Any]) => Any,
      of: Any => Any
    ): MonadIO2C[M, E] = {
      val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], _E = _E.asInstanceOf[js.Any], ap = js.Any.fromFunction2(ap), chain = js.Any.fromFunction2(chain), fromIO = js.Any.fromFunction1(fromIO), map = js.Any.fromFunction2(map), of = js.Any.fromFunction1(of))
      __obj.asInstanceOf[MonadIO2C[M, E]]
    }
    
    extension [Self <: MonadIO2C[?, ?], M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, E](x: Self & (MonadIO2C[M, E])) {
      
      inline def setURI(value: M): Self = StObject.set(x, "URI", value.asInstanceOf[js.Any])
      
      inline def set_E(value: E): Self = StObject.set(x, "_E", value.asInstanceOf[js.Any])
    }
  }
  
  trait MonadIO3[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */]
    extends StObject
       with Monad3[M]
       with FromIO3[M] {
    
    /* InferMemberOverrides */
    override val URI: M
  }
  object MonadIO3 {
    
    inline def apply[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](
      URI: M,
      ap: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, (a : A): B> */ Any, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ Any) => Any,
      chain: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ Any, js.Function1[
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, B> */ Any
        ]) => Any,
      fromIO: IO_[Any] => Any,
      map: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ Any, js.Function1[Any, Any]) => Any,
      of: Any => Any
    ): MonadIO3[M] = {
      val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], ap = js.Any.fromFunction2(ap), chain = js.Any.fromFunction2(chain), fromIO = js.Any.fromFunction1(fromIO), map = js.Any.fromFunction2(map), of = js.Any.fromFunction1(of))
      __obj.asInstanceOf[MonadIO3[M]]
    }
    
    extension [Self <: MonadIO3[?], M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](x: Self & MonadIO3[M]) {
      
      inline def setURI(value: M): Self = StObject.set(x, "URI", value.asInstanceOf[js.Any])
    }
  }
  
  trait MonadIO3C[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */, E]
    extends StObject
       with Monad3C[M, E]
       with FromIO3C[M, E] {
    
    /* InferMemberOverrides */
    override val URI: M
    
    /* InferMemberOverrides */
    override val _E: E
  }
  object MonadIO3C {
    
    inline def apply[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */, E](
      URI: M,
      _E: E,
      ap: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, (a : A): B> */ Any, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ Any) => Any,
      chain: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ Any, js.Function1[
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, B> */ Any
        ]) => Any,
      fromIO: IO_[Any] => Any,
      map: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ Any, js.Function1[Any, Any]) => Any,
      of: Any => Any
    ): MonadIO3C[M, E] = {
      val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], _E = _E.asInstanceOf[js.Any], ap = js.Any.fromFunction2(ap), chain = js.Any.fromFunction2(chain), fromIO = js.Any.fromFunction1(fromIO), map = js.Any.fromFunction2(map), of = js.Any.fromFunction1(of))
      __obj.asInstanceOf[MonadIO3C[M, E]]
    }
    
    extension [Self <: MonadIO3C[?, ?], M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */, E](x: Self & (MonadIO3C[M, E])) {
      
      inline def setURI(value: M): Self = StObject.set(x, "URI", value.asInstanceOf[js.Any])
      
      inline def set_E(value: E): Self = StObject.set(x, "_E", value.asInstanceOf[js.Any])
    }
  }
  
  trait MonadIO4[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS4 */ Any */]
    extends StObject
       with Monad4[M]
       with FromIO4[M] {
    
    /* InferMemberOverrides */
    override val URI: M
  }
  object MonadIO4 {
    
    inline def apply[M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS4 */ Any */](
      URI: M,
      ap: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, (a : A): B> */ Any, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, A> */ Any) => Any,
      chain: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, A> */ Any, js.Function1[
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, B> */ Any
        ]) => Any,
      fromIO: IO_[Any] => Any,
      map: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, A> */ Any, js.Function1[Any, Any]) => Any,
      of: Any => Any
    ): MonadIO4[M] = {
      val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], ap = js.Any.fromFunction2(ap), chain = js.Any.fromFunction2(chain), fromIO = js.Any.fromFunction1(fromIO), map = js.Any.fromFunction2(map), of = js.Any.fromFunction1(of))
      __obj.asInstanceOf[MonadIO4[M]]
    }
    
    extension [Self <: MonadIO4[?], M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS4 */ Any */](x: Self & MonadIO4[M]) {
      
      inline def setURI(value: M): Self = StObject.set(x, "URI", value.asInstanceOf[js.Any])
    }
  }
}
