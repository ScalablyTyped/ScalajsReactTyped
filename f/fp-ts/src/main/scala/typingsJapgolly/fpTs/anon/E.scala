package typingsJapgolly.fpTs.anon

import typingsJapgolly.fpTs.libWriterTMod.WriterT
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait E[W, M] extends StObject {
  
  val _E: W
  
  def ap[A, B](mab: WriterT[M, W, js.Function1[/* a */ A, B]], ma: WriterT[M, W, A]): WriterT[M, W, B]
  
  def chain[A, B](ma: WriterT[M, W, A], f: js.Function1[/* a */ A, WriterT[M, W, B]]): WriterT[M, W, B]
  
  def map[A, B](ma: WriterT[M, W, A], f: js.Function1[/* a */ A, B]): WriterT[M, W, B]
  
  def of[A](a: A): WriterT[M, W, A]
}
object E {
  
  inline def apply[W, M](
    _E: W,
    ap: (WriterT[M, W, js.Function1[Any, Any]], WriterT[M, W, Any]) => WriterT[M, W, Any],
    chain: (WriterT[M, W, Any], js.Function1[Any, WriterT[M, W, Any]]) => WriterT[M, W, Any],
    map: (WriterT[M, W, Any], js.Function1[Any, Any]) => WriterT[M, W, Any],
    of: Any => WriterT[M, W, Any]
  ): E[W, M] = {
    val __obj = js.Dynamic.literal(_E = _E.asInstanceOf[js.Any], ap = js.Any.fromFunction2(ap), chain = js.Any.fromFunction2(chain), map = js.Any.fromFunction2(map), of = js.Any.fromFunction1(of))
    __obj.asInstanceOf[E[W, M]]
  }
  
  extension [Self <: E[?, ?], W, M](x: Self & (E[W, M])) {
    
    inline def setAp(value: (WriterT[M, W, js.Function1[Any, Any]], WriterT[M, W, Any]) => WriterT[M, W, Any]): Self = StObject.set(x, "ap", js.Any.fromFunction2(value))
    
    inline def setChain(value: (WriterT[M, W, Any], js.Function1[Any, WriterT[M, W, Any]]) => WriterT[M, W, Any]): Self = StObject.set(x, "chain", js.Any.fromFunction2(value))
    
    inline def setMap(value: (WriterT[M, W, Any], js.Function1[Any, Any]) => WriterT[M, W, Any]): Self = StObject.set(x, "map", js.Any.fromFunction2(value))
    
    inline def setOf(value: Any => WriterT[M, W, Any]): Self = StObject.set(x, "of", js.Any.fromFunction1(value))
    
    inline def set_E(value: W): Self = StObject.set(x, "_E", value.asInstanceOf[js.Any])
  }
}
