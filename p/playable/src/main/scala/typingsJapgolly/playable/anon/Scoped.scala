package typingsJapgolly.playable.anon

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.playable.distSrcCoreDependencyContainerConstantsLifetimeMod.Lifetime
import typingsJapgolly.playable.distSrcCoreDependencyContainerTypesMod.IOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Scoped extends StObject {
  
  def scoped(): IOptions
  
  def setLifetime(value: Lifetime): IOptions
  
  def singleton(): IOptions
  
  def transient(): IOptions
}
object Scoped {
  
  inline def apply(
    scoped: CallbackTo[IOptions],
    setLifetime: Lifetime => IOptions,
    singleton: CallbackTo[IOptions],
    transient: CallbackTo[IOptions]
  ): Scoped = {
    val __obj = js.Dynamic.literal(scoped = scoped.toJsFn, setLifetime = js.Any.fromFunction1(setLifetime), singleton = singleton.toJsFn, transient = transient.toJsFn)
    __obj.asInstanceOf[Scoped]
  }
  
  extension [Self <: Scoped](x: Self) {
    
    inline def setScoped(value: CallbackTo[IOptions]): Self = StObject.set(x, "scoped", value.toJsFn)
    
    inline def setSetLifetime(value: Lifetime => IOptions): Self = StObject.set(x, "setLifetime", js.Any.fromFunction1(value))
    
    inline def setSingleton(value: CallbackTo[IOptions]): Self = StObject.set(x, "singleton", value.toJsFn)
    
    inline def setTransient(value: CallbackTo[IOptions]): Self = StObject.set(x, "transient", value.toJsFn)
  }
}
