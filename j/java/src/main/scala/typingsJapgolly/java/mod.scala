package typingsJapgolly.java

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("java", JSImport.Namespace)
  @js.native
  val ^ : NodeAPI = js.native
  
  trait AsyncOptions extends StObject {
    
    var asyncSuffix: js.UndefOr[String] = js.undefined
    
    var promiseSuffix: js.UndefOr[String] = js.undefined
    
    var promisify: js.UndefOr[Promisify] = js.undefined
    
    var syncSuffix: String
  }
  object AsyncOptions {
    
    inline def apply(syncSuffix: String): AsyncOptions = {
      val __obj = js.Dynamic.literal(syncSuffix = syncSuffix.asInstanceOf[js.Any])
      __obj.asInstanceOf[AsyncOptions]
    }
    
    extension [Self <: AsyncOptions](x: Self) {
      
      inline def setAsyncSuffix(value: String): Self = StObject.set(x, "asyncSuffix", value.asInstanceOf[js.Any])
      
      inline def setAsyncSuffixUndefined: Self = StObject.set(x, "asyncSuffix", js.undefined)
      
      inline def setPromiseSuffix(value: String): Self = StObject.set(x, "promiseSuffix", value.asInstanceOf[js.Any])
      
      inline def setPromiseSuffixUndefined: Self = StObject.set(x, "promiseSuffix", js.undefined)
      
      inline def setPromisify(value: (/* funct */ js.Function, /* receiver */ js.UndefOr[Any]) => js.Function): Self = StObject.set(x, "promisify", js.Any.fromFunction2(value))
      
      inline def setPromisifyUndefined: Self = StObject.set(x, "promisify", js.undefined)
      
      inline def setSyncSuffix(value: String): Self = StObject.set(x, "syncSuffix", value.asInstanceOf[js.Any])
    }
  }
  
  type Callback[T] = js.Function2[/* err */ js.UndefOr[js.Error], /* result */ js.UndefOr[T], Unit]
  
  // *NodeAPI* declares methods & members exported by the node java module.
  @js.native
  trait NodeAPI extends StObject {
    
    var asyncOptions: AsyncOptions = js.native
    
    def callMethod(instance: Any, methodName: String, args: js.Array[Any], callback: Callback[Any]): Unit = js.native
    
    def callMethodSync(instance: Any, methodName: String, args: Any*): Any = js.native
    
    def callStaticMethod(className: String, methodName: String, args: (Any | Callback[Any])*): Unit = js.native
    
    def callStaticMethodSync(className: String, methodName: String, args: Any*): Any = js.native
    
    var classpath: js.Array[String] = js.native
    
    def ensureJvm(): js.Promise[Unit] = js.native
    def ensureJvm(done: Callback[Unit]): Unit = js.native
    
    def getClassLoader(): Any = js.native
    
    def getStaticFieldValue(className: String, fieldName: String): Any = js.native
    
    def `import`(className: String): Any = js.native
    
    def instanceOf(javaObject: Any, className: String): Boolean = js.native
    
    def isJvmCreated(): Boolean = js.native
    
    var nativeBindingLocation: String = js.native
    
    def newArray[T](className: String, arg: js.Array[Any]): Any = js.native
    
    def newByte(`val`: Double): Any = js.native
    
    def newChar(`val`: String): Any = js.native
    def newChar(`val`: Double): Any = js.native
    
    def newDouble(`val`: Double): Any = js.native
    
    def newFloat(`val`: Double): Any = js.native
    
    def newInstance(className: String, args: Any*): Unit = js.native
    
    def newInstanceP(className: String, args: Any*): js.Promise[Any] = js.native
    
    def newInstanceSync(className: String, args: Any*): Any = js.native
    
    def newLong(`val`: Double): Any = js.native
    
    def newProxy(interfaceName: String, functions: ProxyFunctions): Any = js.native
    
    def newShort(`val`: Double): Any = js.native
    
    var options: js.Array[String] = js.native
    
    def registerClient(before: js.Function1[/* cb */ Callback[Unit], Unit]): Unit = js.native
    def registerClient(
      before: js.Function1[/* cb */ Callback[Unit], Unit],
      after: js.Function1[/* cb */ Callback[Unit], Unit]
    ): Unit = js.native
    
    def registerClientP(beforeP: js.Function0[js.Promise[Unit]]): Unit = js.native
    def registerClientP(beforeP: js.Function0[js.Promise[Unit]], afterP: js.Function0[js.Promise[Unit]]): Unit = js.native
    
    def setStaticFieldValue(className: String, fieldName: String, newValue: Any): Unit = js.native
  }
  
  type Promisify = js.Function2[/* funct */ js.Function, /* receiver */ js.UndefOr[Any], js.Function]
  
  type ProxyFunctions = StringDictionary[js.Function]
  
  type _To = NodeAPI
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: NodeAPI = ^
}
