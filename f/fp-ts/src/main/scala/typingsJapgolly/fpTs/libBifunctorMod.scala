package typingsJapgolly.fpTs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libBifunctorMod {
  
  trait Bifunctor[F] extends StObject {
    
    val URI: F
    
    def bimap[E, A, G, B](
      fea: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT2<F, E, A> */ Any,
      f: js.Function1[/* e */ E, G],
      g: js.Function1[/* a */ A, B]
    ): Any
    
    def mapLeft[E, A, G](
      fea: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT2<F, E, A> */ Any,
      f: js.Function1[/* e */ E, G]
    ): Any
  }
  object Bifunctor {
    
    inline def apply[F](
      URI: F,
      bimap: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT2<F, E, A> */ Any, js.Function1[Any, Any], js.Function1[Any, Any]) => Any,
      mapLeft: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT2<F, E, A> */ Any, js.Function1[Any, Any]) => Any
    ): Bifunctor[F] = {
      val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], bimap = js.Any.fromFunction3(bimap), mapLeft = js.Any.fromFunction2(mapLeft))
      __obj.asInstanceOf[Bifunctor[F]]
    }
    
    extension [Self <: Bifunctor[?], F](x: Self & Bifunctor[F]) {
      
      inline def setBimap(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT2<F, E, A> */ Any, js.Function1[Any, Any], js.Function1[Any, Any]) => Any
      ): Self = StObject.set(x, "bimap", js.Any.fromFunction3(value))
      
      inline def setMapLeft(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT2<F, E, A> */ Any, js.Function1[Any, Any]) => Any
      ): Self = StObject.set(x, "mapLeft", js.Any.fromFunction2(value))
      
      inline def setURI(value: F): Self = StObject.set(x, "URI", value.asInstanceOf[js.Any])
    }
  }
  
  trait Bifunctor2[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */] extends StObject {
    
    val URI: F
    
    def bimap[E, A, G, B](
      fea: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ Any,
      f: js.Function1[/* e */ E, G],
      g: js.Function1[/* a */ A, B]
    ): Any
    
    def mapLeft[E, A, G](
      fea: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ Any,
      f: js.Function1[/* e */ E, G]
    ): Any
  }
  object Bifunctor2 {
    
    inline def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](
      URI: F,
      bimap: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ Any, js.Function1[Any, Any], js.Function1[Any, Any]) => Any,
      mapLeft: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ Any, js.Function1[Any, Any]) => Any
    ): Bifunctor2[F] = {
      val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], bimap = js.Any.fromFunction3(bimap), mapLeft = js.Any.fromFunction2(mapLeft))
      __obj.asInstanceOf[Bifunctor2[F]]
    }
    
    extension [Self <: Bifunctor2[?], F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](x: Self & Bifunctor2[F]) {
      
      inline def setBimap(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ Any, js.Function1[Any, Any], js.Function1[Any, Any]) => Any
      ): Self = StObject.set(x, "bimap", js.Any.fromFunction3(value))
      
      inline def setMapLeft(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ Any, js.Function1[Any, Any]) => Any
      ): Self = StObject.set(x, "mapLeft", js.Any.fromFunction2(value))
      
      inline def setURI(value: F): Self = StObject.set(x, "URI", value.asInstanceOf[js.Any])
    }
  }
  
  trait Bifunctor2C[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, E] extends StObject {
    
    val URI: F
    
    val _E: E
    
    def bimap[A, G, B](
      fea: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ Any,
      f: js.Function1[/* e */ E, G],
      g: js.Function1[/* a */ A, B]
    ): Any
    
    def mapLeft[A, M](
      fea: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ Any,
      f: js.Function1[/* e */ E, M]
    ): Any
  }
  object Bifunctor2C {
    
    inline def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, E](
      URI: F,
      _E: E,
      bimap: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ Any, js.Function1[/* e */ E, Any], js.Function1[Any, Any]) => Any,
      mapLeft: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ Any, js.Function1[/* e */ E, Any]) => Any
    ): Bifunctor2C[F, E] = {
      val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], _E = _E.asInstanceOf[js.Any], bimap = js.Any.fromFunction3(bimap), mapLeft = js.Any.fromFunction2(mapLeft))
      __obj.asInstanceOf[Bifunctor2C[F, E]]
    }
    
    extension [Self <: Bifunctor2C[?, ?], F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, E](x: Self & (Bifunctor2C[F, E])) {
      
      inline def setBimap(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ Any, js.Function1[/* e */ E, Any], js.Function1[Any, Any]) => Any
      ): Self = StObject.set(x, "bimap", js.Any.fromFunction3(value))
      
      inline def setMapLeft(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ Any, js.Function1[/* e */ E, Any]) => Any
      ): Self = StObject.set(x, "mapLeft", js.Any.fromFunction2(value))
      
      inline def setURI(value: F): Self = StObject.set(x, "URI", value.asInstanceOf[js.Any])
      
      inline def set_E(value: E): Self = StObject.set(x, "_E", value.asInstanceOf[js.Any])
    }
  }
  
  trait Bifunctor3[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */] extends StObject {
    
    val URI: F
    
    def bimap[R, E, A, G, B](
      fea: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ Any,
      f: js.Function1[/* e */ E, G],
      g: js.Function1[/* a */ A, B]
    ): Any
    
    def mapLeft[R, E, A, G](
      fea: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ Any,
      f: js.Function1[/* e */ E, G]
    ): Any
  }
  object Bifunctor3 {
    
    inline def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](
      URI: F,
      bimap: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ Any, js.Function1[Any, Any], js.Function1[Any, Any]) => Any,
      mapLeft: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ Any, js.Function1[Any, Any]) => Any
    ): Bifunctor3[F] = {
      val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], bimap = js.Any.fromFunction3(bimap), mapLeft = js.Any.fromFunction2(mapLeft))
      __obj.asInstanceOf[Bifunctor3[F]]
    }
    
    extension [Self <: Bifunctor3[?], F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](x: Self & Bifunctor3[F]) {
      
      inline def setBimap(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ Any, js.Function1[Any, Any], js.Function1[Any, Any]) => Any
      ): Self = StObject.set(x, "bimap", js.Any.fromFunction3(value))
      
      inline def setMapLeft(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ Any, js.Function1[Any, Any]) => Any
      ): Self = StObject.set(x, "mapLeft", js.Any.fromFunction2(value))
      
      inline def setURI(value: F): Self = StObject.set(x, "URI", value.asInstanceOf[js.Any])
    }
  }
  
  trait Bifunctor3C[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */, E] extends StObject {
    
    val URI: F
    
    val _E: E
    
    def bimap[R, A, G, B](
      fea: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ Any,
      f: js.Function1[/* e */ E, G],
      g: js.Function1[/* a */ A, B]
    ): Any
    
    def mapLeft[R, A, G](
      fea: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ Any,
      f: js.Function1[/* e */ E, G]
    ): Any
  }
  object Bifunctor3C {
    
    inline def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */, E](
      URI: F,
      _E: E,
      bimap: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ Any, js.Function1[/* e */ E, Any], js.Function1[Any, Any]) => Any,
      mapLeft: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ Any, js.Function1[/* e */ E, Any]) => Any
    ): Bifunctor3C[F, E] = {
      val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], _E = _E.asInstanceOf[js.Any], bimap = js.Any.fromFunction3(bimap), mapLeft = js.Any.fromFunction2(mapLeft))
      __obj.asInstanceOf[Bifunctor3C[F, E]]
    }
    
    extension [Self <: Bifunctor3C[?, ?], F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */, E](x: Self & (Bifunctor3C[F, E])) {
      
      inline def setBimap(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ Any, js.Function1[/* e */ E, Any], js.Function1[Any, Any]) => Any
      ): Self = StObject.set(x, "bimap", js.Any.fromFunction3(value))
      
      inline def setMapLeft(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ Any, js.Function1[/* e */ E, Any]) => Any
      ): Self = StObject.set(x, "mapLeft", js.Any.fromFunction2(value))
      
      inline def setURI(value: F): Self = StObject.set(x, "URI", value.asInstanceOf[js.Any])
      
      inline def set_E(value: E): Self = StObject.set(x, "_E", value.asInstanceOf[js.Any])
    }
  }
  
  trait Bifunctor4[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS4 */ Any */] extends StObject {
    
    val URI: F
    
    def bimap[S, R, E, A, G, B](
      fea: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, A> */ Any,
      f: js.Function1[/* e */ E, G],
      g: js.Function1[/* a */ A, B]
    ): Any
    
    def mapLeft[S, R, E, A, G](
      fea: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, A> */ Any,
      f: js.Function1[/* e */ E, G]
    ): Any
  }
  object Bifunctor4 {
    
    inline def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS4 */ Any */](
      URI: F,
      bimap: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, A> */ Any, js.Function1[Any, Any], js.Function1[Any, Any]) => Any,
      mapLeft: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, A> */ Any, js.Function1[Any, Any]) => Any
    ): Bifunctor4[F] = {
      val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], bimap = js.Any.fromFunction3(bimap), mapLeft = js.Any.fromFunction2(mapLeft))
      __obj.asInstanceOf[Bifunctor4[F]]
    }
    
    extension [Self <: Bifunctor4[?], F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS4 */ Any */](x: Self & Bifunctor4[F]) {
      
      inline def setBimap(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, A> */ Any, js.Function1[Any, Any], js.Function1[Any, Any]) => Any
      ): Self = StObject.set(x, "bimap", js.Any.fromFunction3(value))
      
      inline def setMapLeft(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind4<F, S, R, E, A> */ Any, js.Function1[Any, Any]) => Any
      ): Self = StObject.set(x, "mapLeft", js.Any.fromFunction2(value))
      
      inline def setURI(value: F): Self = StObject.set(x, "URI", value.asInstanceOf[js.Any])
    }
  }
}
