package typingsJapgolly.angularCore.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ɵPipeDef[T] extends StObject {
  
  /**
    * Factory function used to create a new pipe instance. Will be null initially.
    * Populated when the factory is first requested by pipe instantiation logic.
    */
  var factory: FactoryFn[T] | Null
  
  /**
    * Pipe name.
    *
    * Used to resolve pipe in templates.
    */
  val name: String
  
  var onDestroy: js.Function0[Unit] | Null
  
  /**
    * Whether or not the pipe is pure.
    *
    * Pure pipes result only depends on the pipe input and not on internal
    * state of the pipe.
    */
  val pure: Boolean
  
  /**
    * Whether this pipe is standalone.
    */
  val standalone: Boolean
  
  /** Token representing the pipe. */
  var `type`: Type[T]
}
object ɵPipeDef {
  
  inline def apply[T](name: String, pure: Boolean, standalone: Boolean, `type`: Type[T]): ɵPipeDef[T] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], pure = pure.asInstanceOf[js.Any], standalone = standalone.asInstanceOf[js.Any], factory = null, onDestroy = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ɵPipeDef[T]]
  }
  
  extension [Self <: ɵPipeDef[?], T](x: Self & ɵPipeDef[T]) {
    
    inline def setFactory(value: FactoryFn[T]): Self = StObject.set(x, "factory", value.asInstanceOf[js.Any])
    
    inline def setFactoryNull: Self = StObject.set(x, "factory", null)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOnDestroy(value: Callback): Self = StObject.set(x, "onDestroy", value.toJsFn)
    
    inline def setOnDestroyNull: Self = StObject.set(x, "onDestroy", null)
    
    inline def setPure(value: Boolean): Self = StObject.set(x, "pure", value.asInstanceOf[js.Any])
    
    inline def setStandalone(value: Boolean): Self = StObject.set(x, "standalone", value.asInstanceOf[js.Any])
    
    inline def setType(value: Type[T]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
