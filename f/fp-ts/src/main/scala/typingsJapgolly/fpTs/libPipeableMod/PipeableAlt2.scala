package typingsJapgolly.fpTs.libPipeableMod

import typingsJapgolly.fpTs.libFunctionMod.Lazy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PipeableAlt2[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */] extends StObject {
  
  def alt[E, A](
    that: Lazy[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ Any
    ]
  ): js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ /* fa */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ Any
  ]
}
object PipeableAlt2 {
  
  inline def apply[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](
    alt: Lazy[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ Any
    ] => js.Function1[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ /* fa */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ Any
    ]
  ): PipeableAlt2[F] = {
    val __obj = js.Dynamic.literal(alt = js.Any.fromFunction1(alt))
    __obj.asInstanceOf[PipeableAlt2[F]]
  }
  
  extension [Self <: PipeableAlt2[?], F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](x: Self & PipeableAlt2[F]) {
    
    inline def setAlt(
      value: Lazy[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ Any
        ] => js.Function1[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ /* fa */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ Any
        ]
    ): Self = StObject.set(x, "alt", js.Any.fromFunction1(value))
  }
}
