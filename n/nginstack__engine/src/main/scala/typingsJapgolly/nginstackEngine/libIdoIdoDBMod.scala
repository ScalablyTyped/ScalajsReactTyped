package typingsJapgolly.nginstackEngine

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIdoIdoDBMod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/ido/IdoDB", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with IdoDB {
    
    /* CompleteClass */
    override def dropTable(tableName: String): Unit = js.native
    
    /* CompleteClass */
    override def getDBStatistics(): String = js.native
    
    /* CompleteClass */
    override def getTable(tableName: String): DataSet = js.native
    
    /* CompleteClass */
    override def getTablesNames(): js.Array[Any] = js.native
    
    /* CompleteClass */
    var name: Any = js.native
    
    /* CompleteClass */
    override def tableExists(tableName: String): Unit = js.native
    
    /* CompleteClass */
    var uniqueId: Any = js.native
  }
  @JSImport("@nginstack/engine/lib/ido/IdoDB", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type DataSet = typingsJapgolly.nginstackEngine.libDatasetDataSetMod.^
  
  trait IdoDB extends StObject {
    
    def dropTable(tableName: String): Unit
    
    def getDBStatistics(): String
    
    def getTable(tableName: String): DataSet
    
    def getTablesNames(): js.Array[Any]
    
    var name: Any
    
    def tableExists(tableName: String): Unit
    
    var uniqueId: Any
  }
  object IdoDB {
    
    inline def apply(
      dropTable: String => Callback,
      getDBStatistics: CallbackTo[String],
      getTable: String => DataSet,
      getTablesNames: CallbackTo[js.Array[Any]],
      name: Any,
      tableExists: String => Callback,
      uniqueId: Any
    ): IdoDB = {
      val __obj = js.Dynamic.literal(dropTable = js.Any.fromFunction1((t0: String) => dropTable(t0).runNow()), getDBStatistics = getDBStatistics.toJsFn, getTable = js.Any.fromFunction1(getTable), getTablesNames = getTablesNames.toJsFn, name = name.asInstanceOf[js.Any], tableExists = js.Any.fromFunction1((t0: String) => tableExists(t0).runNow()), uniqueId = uniqueId.asInstanceOf[js.Any])
      __obj.asInstanceOf[IdoDB]
    }
    
    extension [Self <: IdoDB](x: Self) {
      
      inline def setDropTable(value: String => Callback): Self = StObject.set(x, "dropTable", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setGetDBStatistics(value: CallbackTo[String]): Self = StObject.set(x, "getDBStatistics", value.toJsFn)
      
      inline def setGetTable(value: String => DataSet): Self = StObject.set(x, "getTable", js.Any.fromFunction1(value))
      
      inline def setGetTablesNames(value: CallbackTo[js.Array[Any]]): Self = StObject.set(x, "getTablesNames", value.toJsFn)
      
      inline def setName(value: Any): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setTableExists(value: String => Callback): Self = StObject.set(x, "tableExists", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setUniqueId(value: Any): Self = StObject.set(x, "uniqueId", value.asInstanceOf[js.Any])
    }
  }
}
