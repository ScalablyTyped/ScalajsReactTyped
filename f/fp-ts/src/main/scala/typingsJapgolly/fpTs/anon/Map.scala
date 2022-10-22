package typingsJapgolly.fpTs.anon

import typingsJapgolly.fpTs.libTheseTMod.TheseT2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Map[E, M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */] extends StObject {
  
  val _E: E
  
  def ap[R, A, B](mab: TheseT2[M, R, E, js.Function1[/* a */ A, B]], ma: TheseT2[M, R, E, A]): TheseT2[M, R, E, B]
  
  def chain[R, A, B](ma: TheseT2[M, R, E, A], f: js.Function1[/* a */ A, TheseT2[M, R, E, B]]): TheseT2[M, R, E, B]
  
  def map[R, A, B](ma: TheseT2[M, R, E, A], f: js.Function1[/* a */ A, B]): TheseT2[M, R, E, B]
  
  def of[R, A](a: A): TheseT2[M, R, E, A]
}
object Map {
  
  inline def apply[E, M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](
    _E: E,
    ap: (TheseT2[M, Any, E, js.Function1[Any, Any]], TheseT2[M, Any, E, Any]) => TheseT2[M, Any, E, Any],
    chain: (TheseT2[M, Any, E, Any], js.Function1[Any, TheseT2[M, Any, E, Any]]) => TheseT2[M, Any, E, Any],
    map: (TheseT2[M, Any, E, Any], js.Function1[Any, Any]) => TheseT2[M, Any, E, Any],
    of: Any => TheseT2[M, Any, E, Any]
  ): Map[E, M] = {
    val __obj = js.Dynamic.literal(_E = _E.asInstanceOf[js.Any], ap = js.Any.fromFunction2(ap), chain = js.Any.fromFunction2(chain), map = js.Any.fromFunction2(map), of = js.Any.fromFunction1(of))
    __obj.asInstanceOf[Map[E, M]]
  }
  
  extension [Self <: Map[?, ?], E, M /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](x: Self & (Map[E, M])) {
    
    inline def setAp(
      value: (TheseT2[M, Any, E, js.Function1[Any, Any]], TheseT2[M, Any, E, Any]) => TheseT2[M, Any, E, Any]
    ): Self = StObject.set(x, "ap", js.Any.fromFunction2(value))
    
    inline def setChain(
      value: (TheseT2[M, Any, E, Any], js.Function1[Any, TheseT2[M, Any, E, Any]]) => TheseT2[M, Any, E, Any]
    ): Self = StObject.set(x, "chain", js.Any.fromFunction2(value))
    
    inline def setMap(value: (TheseT2[M, Any, E, Any], js.Function1[Any, Any]) => TheseT2[M, Any, E, Any]): Self = StObject.set(x, "map", js.Any.fromFunction2(value))
    
    inline def setOf(value: Any => TheseT2[M, Any, E, Any]): Self = StObject.set(x, "of", js.Any.fromFunction1(value))
    
    inline def set_E(value: E): Self = StObject.set(x, "_E", value.asInstanceOf[js.Any])
  }
}
