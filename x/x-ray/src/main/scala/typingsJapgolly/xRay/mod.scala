package typingsJapgolly.xRay

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.node.NodeJS.ErrnoException
import typingsJapgolly.node.processMod.global.NodeJS.ReadStream
import typingsJapgolly.std.Array
import typingsJapgolly.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): Instance = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Instance]
  inline def apply(options: Options): Instance = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[Instance]
  
  @JSImport("x-ray", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type AbortHandler = js.Function2[/* data */ js.Array[Any], /* url */ String, Boolean]
  
  type Callback = js.Function2[/* err */ js.Error, /* data */ Any, Unit]
  
  @js.native
  trait Filter extends StObject {
    
    def apply(value: Any, args: String*): Any = js.native
  }
  
  @js.native
  trait Instance
    extends StObject
       with typingsJapgolly.xRayCrawler.mod.Instance {
    
    def apply(selector: Selector): InstanceInvocation = js.native
    def apply(source: String, context: String, selector: Selector): InstanceInvocation = js.native
    def apply(source: String, selector: Selector): InstanceInvocation = js.native
  }
  
  @js.native
  trait InstanceInvocation extends StObject {
    
    def apply(callback: Callback): Unit = js.native
    def apply(source: String, callback: Callback): Unit = js.native
    
    def abort(arg: AbortHandler): this.type = js.native
    
    def limit(n: Double): this.type = js.native
    
    def paginate(selector: Selector): this.type = js.native
    
    def stream(): ReadStream = js.native
    
    def `then`[U](): typingsJapgolly.bluebird.mod.^[U] = js.native
    def `then`[U](fn: js.Function1[/* value */ Any, U | PromiseLike[U]]): typingsJapgolly.bluebird.mod.^[U] = js.native
    
    def write(): js.Function1[/* err */ ErrnoException, Unit] = js.native
    def write(path: String): js.Function1[/* err */ ErrnoException, Unit] = js.native
  }
  
  trait Options extends StObject {
    
    var filters: StringDictionary[Filter]
  }
  object Options {
    
    inline def apply(filters: StringDictionary[Filter]): Options = {
      val __obj = js.Dynamic.literal(filters = filters.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setFilters(value: StringDictionary[Filter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    }
  }
  
  // circularly references itself
  // https://stackoverflow.com/a/41826582
  type ScalarSelector = String | InstanceInvocation | StringDictionary[Selector]
  
  type Selector = Any | SelectorArray
  
  @js.native
  trait SelectorArray
    extends StObject
       with Array[ScalarSelector | SelectorArray]
}
