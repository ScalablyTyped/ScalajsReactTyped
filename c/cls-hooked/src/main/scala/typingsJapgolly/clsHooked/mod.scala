package typingsJapgolly.clsHooked

import typingsJapgolly.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("cls-hooked", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createNamespace(name: String): Namespace = ^.asInstanceOf[js.Dynamic].applyDynamic("createNamespace")(name.asInstanceOf[js.Any]).asInstanceOf[Namespace]
  
  inline def destroyNamespace(name: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("destroyNamespace")(name.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def getNamespace(name: String): js.UndefOr[Namespace] = ^.asInstanceOf[js.Dynamic].applyDynamic("getNamespace")(name.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Namespace]]
  
  inline def reset(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("reset")().asInstanceOf[Unit]
  
  @js.native
  trait Namespace extends StObject {
    
    var active: Any = js.native
    
    def bind[F /* <: js.Function */](fn: F): F = js.native
    def bind[F /* <: js.Function */](fn: F, context: Any): F = js.native
    
    // tslint:disable-line: ban-types
    def bindEmitter(emitter: EventEmitter): Unit = js.native
    
    def createContext(): Any = js.native
    
    def enter(context: Any): Unit = js.native
    
    def exit(context: Any): Unit = js.native
    
    def get(key: String): Any = js.native
    
    def run(fn: js.Function1[/* repeated */ Any, Unit]): Unit = js.native
    
    def runAndReturn[T](fn: js.Function1[/* repeated */ Any, T]): T = js.native
    
    def runPromise[T](fn: js.Function1[/* repeated */ Any, js.Promise[T]]): js.Promise[T] = js.native
    
    def set[T](key: String, value: T): T = js.native
  }
}
