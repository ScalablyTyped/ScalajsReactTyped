package typingsJapgolly.nginstackEngine

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libClassdefPermissionFieldScopeMod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/classdef/PermissionFieldScope", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with PermissionFieldScope {
    
    /* CompleteClass */
    override def addClass(classKey: Double): Unit = js.native
    
    /* CompleteClass */
    override def addMimeType(typeKey: Double): Unit = js.native
    
    /* private */ /* CompleteClass */
    var classes_ : Any = js.native
    
    /* CompleteClass */
    override def getClasses(): js.Array[Double] = js.native
    
    /* CompleteClass */
    override def getMimeTypes(): js.Array[Double] = js.native
    
    /* private */ /* CompleteClass */
    var mimeTypes_ : Any = js.native
  }
  @JSImport("@nginstack/engine/lib/classdef/PermissionFieldScope", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait PermissionFieldScope extends StObject {
    
    def addClass(classKey: Double): Unit
    
    def addMimeType(typeKey: Double): Unit
    
    /* private */ var classes_ : Any
    
    def getClasses(): js.Array[Double]
    
    def getMimeTypes(): js.Array[Double]
    
    /* private */ var mimeTypes_ : Any
  }
  object PermissionFieldScope {
    
    inline def apply(
      addClass: Double => Callback,
      addMimeType: Double => Callback,
      classes_ : Any,
      getClasses: CallbackTo[js.Array[Double]],
      getMimeTypes: CallbackTo[js.Array[Double]],
      mimeTypes_ : Any
    ): PermissionFieldScope = {
      val __obj = js.Dynamic.literal(addClass = js.Any.fromFunction1((t0: Double) => addClass(t0).runNow()), addMimeType = js.Any.fromFunction1((t0: Double) => addMimeType(t0).runNow()), classes_ = classes_.asInstanceOf[js.Any], getClasses = getClasses.toJsFn, getMimeTypes = getMimeTypes.toJsFn, mimeTypes_ = mimeTypes_.asInstanceOf[js.Any])
      __obj.asInstanceOf[PermissionFieldScope]
    }
    
    extension [Self <: PermissionFieldScope](x: Self) {
      
      inline def setAddClass(value: Double => Callback): Self = StObject.set(x, "addClass", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
      
      inline def setAddMimeType(value: Double => Callback): Self = StObject.set(x, "addMimeType", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
      
      inline def setClasses_(value: Any): Self = StObject.set(x, "classes_", value.asInstanceOf[js.Any])
      
      inline def setGetClasses(value: CallbackTo[js.Array[Double]]): Self = StObject.set(x, "getClasses", value.toJsFn)
      
      inline def setGetMimeTypes(value: CallbackTo[js.Array[Double]]): Self = StObject.set(x, "getMimeTypes", value.toJsFn)
      
      inline def setMimeTypes_(value: Any): Self = StObject.set(x, "mimeTypes_", value.asInstanceOf[js.Any])
    }
  }
}
