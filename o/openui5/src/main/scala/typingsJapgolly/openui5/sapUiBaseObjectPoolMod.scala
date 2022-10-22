package typingsJapgolly.openui5

import japgolly.scalajs.react.Callback
import typingsJapgolly.openui5.sap.ClassInfo
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiBaseObjectPoolMod {
  
  @JSImport("sap/ui/base/ObjectPool", JSImport.Default)
  @js.native
  open class default protected () extends ObjectPool {
    /**
      * Creates an `ObjectPool` for maintaining instances of the given class `oObjectClass`.
      *
      * `oObjectClass` must implement the {@link sap.ui.base.Poolable} interface.
      */
    def this(/**
      * Constructor for the class of objects that this pool should manage
      */
    oObjectClass: js.Function) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/base/ObjectPool", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.base.ObjectPool with name `sClassName` and enriches it with the
      * information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.base.Object.extend}.
      *
      * @returns Created class / constructor function
      */
    inline def extend[T /* <: Record[String, Any] */](/**
      * Name of the class being created
      */
    sClassName: String): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any]).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: Unit,
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, ObjectPool]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, ObjectPool],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.base.ObjectPool.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typingsJapgolly.openui5.sapUiBaseMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typingsJapgolly.openui5.sapUiBaseMetadataMod.default]
  }
  
  @js.native
  trait ObjectPool
    extends typingsJapgolly.openui5.sapUiBaseObjectMod.default {
    
    /**
      * Borrows a free object from the pool. Any arguments to this method are forwarded to the init method of
      * the borrowed object.
      *
      * @returns The borrowed object of the same type that has been specified for this pool
      */
    def borrowObject(/**
      * optional initialization parameters for the borrowed object
      */
    args: Any*): js.Object = js.native
    
    /**
      * Returns an object to the pool. The object must have been borrowed from this pool beforehand. The reset
      * method is called on the object before it is added to the set of free objects.
      */
    def returnObject(/**
      * The object to return to the pool
      */
    oObject: js.Object): Unit = js.native
  }
  
  trait Poolable extends StObject {
    
    var __implements__sap_ui_base_Poolable: Boolean
    
    /**
      * Called by the `ObjectPool` when this instance will be activated for a caller.
      *
      * The same method will be called after a new instance has been created by an otherwise exhausted pool.
      *
      * If the caller provided any arguments to {@link sap.ui.base.ObjectPool#borrowObject}, all arguments will
      * be propagated to this method.
      */
    def init(
      /**
      * the arguments which were given to {@link sap.ui.base.ObjectPool#borrowObject}
      */
    args: Any*
    ): Unit
    
    /**
      * Called by the object pool when an instance is returned to the pool.
      *
      * While no specific implementation is required, poolable objects in general should clean all caller specific
      * state (set to null) in this method to avoid memory leaks and to enforce garbage collection of the caller
      * state.
      */
    def reset(): Unit
  }
  object Poolable {
    
    inline def apply(__implements__sap_ui_base_Poolable: Boolean, init: /* repeated */ Any => Callback, reset: Callback): Poolable = {
      val __obj = js.Dynamic.literal(__implements__sap_ui_base_Poolable = __implements__sap_ui_base_Poolable.asInstanceOf[js.Any], init = js.Any.fromFunction1((t0: /* repeated */ Any) => init(t0).runNow()), reset = reset.toJsFn)
      __obj.asInstanceOf[Poolable]
    }
    
    extension [Self <: Poolable](x: Self) {
      
      inline def setInit(value: /* repeated */ Any => Callback): Self = StObject.set(x, "init", js.Any.fromFunction1((t0: /* repeated */ Any) => value(t0).runNow()))
      
      inline def setReset(value: Callback): Self = StObject.set(x, "reset", value.toJsFn)
      
      inline def set__implements__sap_ui_base_Poolable(value: Boolean): Self = StObject.set(x, "__implements__sap_ui_base_Poolable", value.asInstanceOf[js.Any])
    }
  }
}
