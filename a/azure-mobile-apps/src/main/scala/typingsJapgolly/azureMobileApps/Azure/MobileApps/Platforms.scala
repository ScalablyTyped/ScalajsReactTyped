package typingsJapgolly.azureMobileApps.Azure.MobileApps

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Platforms {
  
  object Express {
    
    trait Api extends StObject {
      
      def add(name: String, definition: ApiDefinition): Unit
      
      def `import`(fileOrFolder: String): Unit
    }
    object Api {
      
      inline def apply(add: (String, ApiDefinition) => Callback, `import`: String => Callback): Api = {
        val __obj = js.Dynamic.literal(add = js.Any.fromFunction2((t0: String, t1: ApiDefinition) => (add(t0, t1)).runNow()))
        __obj.updateDynamic("import")(js.Any.fromFunction1((t0: String) => `import`(t0).runNow()))
        __obj.asInstanceOf[Api]
      }
      
      extension [Self <: Api](x: Self) {
        
        inline def setAdd(value: (String, ApiDefinition) => Callback): Self = StObject.set(x, "add", js.Any.fromFunction2((t0: String, t1: ApiDefinition) => (value(t0, t1)).runNow()))
        
        inline def setImport(value: String => Callback): Self = StObject.set(x, "import", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      }
    }
    
    @js.native
    trait MobileApp extends Middleware {
      
      var api: Api = js.native
      
      var configuration: Configuration = js.native
      
      def table(): Table = js.native
      
      var tables: Tables = js.native
      
      def use(middleware: Middleware*): MobileApp = js.native
      def use(middleware: js.Array[Middleware]): MobileApp = js.native
    }
    
    @js.native
    trait Table
      extends StObject
         with TableDefinition {
      
      def delete(operationHandler: js.Function1[/* context */ Context, Unit]): Table = js.native
      @JSName("delete")
      var delete_Original: TableOperation = js.native
      
      def insert(operationHandler: js.Function1[/* context */ Context, Unit]): Table = js.native
      @JSName("insert")
      var insert_Original: TableOperation = js.native
      
      def read(operationHandler: js.Function1[/* context */ Context, Unit]): Table = js.native
      @JSName("read")
      var read_Original: TableOperation = js.native
      
      def undelete(operationHandler: js.Function1[/* context */ Context, Unit]): Table = js.native
      @JSName("undelete")
      var undelete_Original: TableOperation = js.native
      
      def update(operationHandler: js.Function1[/* context */ Context, Unit]): Table = js.native
      @JSName("update")
      var update_Original: TableOperation = js.native
      
      def use(middleware: Middleware*): Table = js.native
      def use(middleware: js.Array[Middleware]): Table = js.native
    }
    
    @js.native
    trait TableOperation extends StObject {
      
      def apply(operationHandler: js.Function1[/* context */ Context, Unit]): Table = js.native
      
      var access: js.UndefOr[AccessType] = js.native
      
      def use(middleware: Middleware*): Table = js.native
      def use(middleware: js.Array[Middleware]): Table = js.native
    }
    
    @js.native
    trait Tables extends StObject {
      
      def add(name: String): Unit = js.native
      def add(name: String, definition: Table): Unit = js.native
      def add(name: String, definition: TableDefinition): Unit = js.native
      
      var configuration: Configuration = js.native
      
      def `import`(fileOrFolder: String): Unit = js.native
      
      def initialize(): Thenable[Any] = js.native
    }
  }
}
