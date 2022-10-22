package typingsJapgolly.fridaGum.global

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.fridaGum.AnyFunction
import typingsJapgolly.fridaGum.EnumerateCallbacks
import typingsJapgolly.fridaGum.NativeFunctionOptions
import typingsJapgolly.fridaGum.NativePointerValue
import typingsJapgolly.fridaGum.ObjC.BlockImplementation
import typingsJapgolly.fridaGum.ObjC.BlockSignature
import typingsJapgolly.fridaGum.ObjC.ChooseSpecifier
import typingsJapgolly.fridaGum.ObjC.ClassSpec
import typingsJapgolly.fridaGum.ObjC.EnumerateLoadedClassesCallbacks
import typingsJapgolly.fridaGum.ObjC.EnumerateLoadedClassesOptions
import typingsJapgolly.fridaGum.ObjC.EnumerateLoadedClassesResult
import typingsJapgolly.fridaGum.ObjC.InstanceData
import typingsJapgolly.fridaGum.ObjC.MethodSpec
import typingsJapgolly.fridaGum.ObjC.ObjectMethod
import typingsJapgolly.fridaGum.ObjC.ProtocolMethodDescription
import typingsJapgolly.fridaGum.ObjC.ProtocolPropertyAttributes
import typingsJapgolly.fridaGum.ObjC.ProtocolSpec
import typingsJapgolly.fridaGum.ObjC.ProxyConstructor
import typingsJapgolly.fridaGum.ObjC.ProxyData
import typingsJapgolly.fridaGum.ObjC.ProxySpec
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ObjC {
  
  @JSGlobal("ObjC")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Dynamically generated language binding for any Objective-C block.
    *
    * Also supports implementing a block from scratch by passing in an
    * implementation.
    */
  @JSGlobal("ObjC.Block")
  @js.native
  open class Block protected ()
    extends StObject
       with typingsJapgolly.fridaGum.ObjC.Block {
    def this(target: typingsJapgolly.fridaGum.NativePointer) = this()
    def this(target: MethodSpec[BlockImplementation]) = this()
    def this(target: typingsJapgolly.fridaGum.NativePointer, options: NativeFunctionOptions) = this()
    def this(target: MethodSpec[BlockImplementation], options: NativeFunctionOptions) = this()
    
    /**
      * Declares the signature of an externally defined block. This is needed
      * when working with blocks without signature metadata, i.e. when
      * `block.types === undefined`.
      *
      * @param signature Signature to use.
      */
    /* CompleteClass */
    override def declare(signature: BlockSignature): Unit = js.native
    
    /* CompleteClass */
    var handle: typingsJapgolly.fridaGum.NativePointer = js.native
    
    /**
      * Current implementation. You may replace it by assigning to this property.
      */
    /* CompleteClass */
    override def implementation(args: Any*): Any = js.native
    /**
      * Current implementation. You may replace it by assigning to this property.
      */
    /* CompleteClass */
    @JSName("implementation")
    var implementation_Original: AnyFunction = js.native
  }
  
  /**
    * Dynamically generated wrapper for any Objective-C instance, class, or meta-class.
    */
  @JSGlobal("ObjC.Object")
  @js.native
  open class Object protected ()
    extends StObject
       with typingsJapgolly.fridaGum.ObjC.Object {
    def this(handle: typingsJapgolly.fridaGum.NativePointer) = this()
    def this(handle: typingsJapgolly.fridaGum.NativePointer, protocol: typingsJapgolly.fridaGum.ObjC.Protocol) = this()
    
    /* CompleteClass */
    var handle: typingsJapgolly.fridaGum.NativePointer = js.native
  }
  
  /**
    * Dynamically generated language binding for any Objective-C protocol.
    */
  @JSGlobal("ObjC.Protocol")
  @js.native
  open class Protocol protected ()
    extends StObject
       with typingsJapgolly.fridaGum.ObjC.Protocol {
    def this(handle: typingsJapgolly.fridaGum.NativePointer) = this()
    
    /* CompleteClass */
    var handle: typingsJapgolly.fridaGum.NativePointer = js.native
    
    /**
      * Methods declared by this protocol.
      */
    /* CompleteClass */
    var methods: StringDictionary[ProtocolMethodDescription] = js.native
    
    /**
      * Name visible to the Objective-C runtime.
      */
    /* CompleteClass */
    var name: String = js.native
    
    /**
      * Properties declared by this protocol.
      */
    /* CompleteClass */
    var properties: StringDictionary[ProtocolPropertyAttributes] = js.native
    
    /**
      * Protocols that this protocol conforms to.
      */
    /* CompleteClass */
    var protocols: StringDictionary[typingsJapgolly.fridaGum.ObjC.Protocol] = js.native
  }
  
  // tslint:disable:no-unnecessary-qualifier
  /**
    * Whether the current process has an Objective-C runtime loaded. Do not invoke any other ObjC properties or
    * methods unless this is the case.
    */
  @JSGlobal("ObjC.available")
  @js.native
  val available: Boolean = js.native
  
  inline def bind(obj: typingsJapgolly.fridaGum.NativePointer, data: InstanceData): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("bind")(obj.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
  /**
    * Binds some JavaScript data to an Objective-C instance.
    *
    * @param obj Objective-C instance to bind data to.
    * @param data Data to bind.
    */
  inline def bind(obj: typingsJapgolly.fridaGum.ObjC.Object, data: InstanceData): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("bind")(obj.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def choose(specifier: ChooseSpecifier, callbacks: EnumerateCallbacks[typingsJapgolly.fridaGum.ObjC.Object]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("choose")(specifier.asInstanceOf[js.Any], callbacks.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Synchronous version of `choose()`.
    *
    * @param specifier What kind of objects to look for.
    */
  inline def chooseSync(specifier: ChooseSpecifier): js.Array[typingsJapgolly.fridaGum.ObjC.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("chooseSync")(specifier.asInstanceOf[js.Any]).asInstanceOf[js.Array[typingsJapgolly.fridaGum.ObjC.Object]]
  
  /**
    * Enumerates loaded classes.
    *
    * @param callbacks Object with callbacks.
    */
  inline def enumerateLoadedClasses(callbacks: EnumerateLoadedClassesCallbacks): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enumerateLoadedClasses")(callbacks.asInstanceOf[js.Any]).asInstanceOf[Unit]
  /**
    * Enumerates loaded classes.
    *
    * @param options Options customizing the enumeration.
    * @param callbacks Object with callbacks.
    */
  inline def enumerateLoadedClasses(options: EnumerateLoadedClassesOptions, callbacks: EnumerateLoadedClassesCallbacks): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("enumerateLoadedClasses")(options.asInstanceOf[js.Any], callbacks.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Synchronous version of `enumerateLoadedClasses()`.
    *
    * @param options Options customizing the enumeration.
    */
  inline def enumerateLoadedClassesSync(): EnumerateLoadedClassesResult = ^.asInstanceOf[js.Dynamic].applyDynamic("enumerateLoadedClassesSync")().asInstanceOf[EnumerateLoadedClassesResult]
  inline def enumerateLoadedClassesSync(options: EnumerateLoadedClassesOptions): EnumerateLoadedClassesResult = ^.asInstanceOf[js.Dynamic].applyDynamic("enumerateLoadedClassesSync")(options.asInstanceOf[js.Any]).asInstanceOf[EnumerateLoadedClassesResult]
  
  inline def getBoundData(obj: typingsJapgolly.fridaGum.NativePointer): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getBoundData")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
  /**
    * Looks up previously bound data from an Objective-C object.
    *
    * @param obj Objective-C instance to look up data for.
    */
  inline def getBoundData(obj: typingsJapgolly.fridaGum.ObjC.Object): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getBoundData")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  /**
    * Creates a JavaScript implementation compatible with the signature of `method`, where `fn` is used as the
    * implementation. Returns a `NativeCallback` that you may assign to an ObjC method’s `implementation` property.
    *
    * @param method Method to implement.
    * @param fn Implementation.
    */
  inline def implement(method: ObjectMethod, fn: AnyFunction): typingsJapgolly.fridaGum.NativeCallback[Any, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("implement")(method.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.fridaGum.NativeCallback[Any, Any]]
  
  /**
    * GCD queue of the main thread.
    */
  @JSGlobal("ObjC.mainQueue")
  @js.native
  val mainQueue: typingsJapgolly.fridaGum.NativePointer = js.native
  
  /**
    * Creates a new Objective-C class.
    *
    * @param spec Class specification.
    */
  inline def registerClass(
    spec: ClassSpec[
      InstanceData, 
      typingsJapgolly.fridaGum.ObjC.Object, 
      typingsJapgolly.fridaGum.ObjC.Object
    ]
  ): typingsJapgolly.fridaGum.ObjC.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("registerClass")(spec.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.fridaGum.ObjC.Object]
  
  /**
    * Creates a new Objective-C protocol.
    *
    * @param spec Protocol specification.
    */
  inline def registerProtocol(spec: ProtocolSpec): typingsJapgolly.fridaGum.ObjC.Protocol = ^.asInstanceOf[js.Dynamic].applyDynamic("registerProtocol")(spec.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.fridaGum.ObjC.Protocol]
  
  /**
    * Creates a new class designed to act as a proxy for a target object.
    *
    * @param spec Proxy specification.
    */
  inline def registerProxy(
    spec: ProxySpec[
      ProxyData, 
      typingsJapgolly.fridaGum.ObjC.Object, 
      typingsJapgolly.fridaGum.ObjC.Object
    ]
  ): ProxyConstructor = ^.asInstanceOf[js.Dynamic].applyDynamic("registerProxy")(spec.asInstanceOf[js.Any]).asInstanceOf[ProxyConstructor]
  
  /**
    * Schedule the JavaScript function `work` on the GCD queue specified by `queue`. An NSAutoreleasePool is created
    * just before calling `work`, and cleaned up on return.
    *
    * E.g. on macOS:
    * ```
    *     const { NSSound } = ObjC.classes;
    *     ObjC.schedule(ObjC.mainQueue, () => {
    *         const sound = NSSound.alloc().initWithContentsOfFile_byReference_("/Users/oleavr/.Trash/test.mp3", true).autorelease();
    *         sound.play();
    *     });
    * ```
    *
    * @param queue GCD queue to schedule `work` on.
    * @param work Function to call on the specified `queue`.
    */
  inline def schedule(queue: NativePointerValue, work: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("schedule")(queue.asInstanceOf[js.Any], work.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Converts the JavaScript string `name` to a selector.
    *
    * @param name Name to turn into a selector.
    */
  inline def selector(name: String): typingsJapgolly.fridaGum.NativePointer = ^.asInstanceOf[js.Dynamic].applyDynamic("selector")(name.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.fridaGum.NativePointer]
  
  /**
    * Converts the selector `sel` to a JavaScript string.
    *
    * @param sel Selector to turn into a string.
    */
  inline def selectorAsString(sel: NativePointerValue): String = ^.asInstanceOf[js.Dynamic].applyDynamic("selectorAsString")(sel.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def unbind(obj: typingsJapgolly.fridaGum.NativePointer): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unbind")(obj.asInstanceOf[js.Any]).asInstanceOf[Unit]
  /**
    * Unbinds previously associated JavaScript data from an Objective-C instance.
    *
    * @param obj Objective-C instance to unbind data from.
    */
  inline def unbind(obj: typingsJapgolly.fridaGum.ObjC.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unbind")(obj.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
