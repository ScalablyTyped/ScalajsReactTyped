package typingsJapgolly.nginstackEngine

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIdoIdoDBManagerMod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/ido/IdoDBManager", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with IdoDBManager {
    
    /* CompleteClass */
    override def createDatabase(name: String): Unit = js.native
    
    /* CompleteClass */
    override def createTempDatabase(alias: String): IdoDB = js.native
    
    /* CompleteClass */
    override def databaseExists(name: String, searchInTempDBs: Boolean): Boolean = js.native
    
    /* CompleteClass */
    override def deleteDatabase(name: String): Unit = js.native
    
    /* CompleteClass */
    override def loadDatabase(name: String): IdoDB = js.native
    
    /* CompleteClass */
    override def renameDatabase(oldName: String, newName: String): Unit = js.native
  }
  @JSImport("@nginstack/engine/lib/ido/IdoDBManager", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type IdoDB = typingsJapgolly.nginstackEngine.libIdoIdoDBMod.^
  
  trait IdoDBManager extends StObject {
    
    def createDatabase(name: String): Unit
    
    def createTempDatabase(alias: String): IdoDB
    
    def databaseExists(name: String, searchInTempDBs: Boolean): Boolean
    
    def deleteDatabase(name: String): Unit
    
    def loadDatabase(name: String): IdoDB
    
    def renameDatabase(oldName: String, newName: String): Unit
  }
  object IdoDBManager {
    
    inline def apply(
      createDatabase: String => Callback,
      createTempDatabase: String => IdoDB,
      databaseExists: (String, Boolean) => Boolean,
      deleteDatabase: String => Callback,
      loadDatabase: String => IdoDB,
      renameDatabase: (String, String) => Callback
    ): IdoDBManager = {
      val __obj = js.Dynamic.literal(createDatabase = js.Any.fromFunction1((t0: String) => createDatabase(t0).runNow()), createTempDatabase = js.Any.fromFunction1(createTempDatabase), databaseExists = js.Any.fromFunction2(databaseExists), deleteDatabase = js.Any.fromFunction1((t0: String) => deleteDatabase(t0).runNow()), loadDatabase = js.Any.fromFunction1(loadDatabase), renameDatabase = js.Any.fromFunction2((t0: String, t1: String) => (renameDatabase(t0, t1)).runNow()))
      __obj.asInstanceOf[IdoDBManager]
    }
    
    extension [Self <: IdoDBManager](x: Self) {
      
      inline def setCreateDatabase(value: String => Callback): Self = StObject.set(x, "createDatabase", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setCreateTempDatabase(value: String => IdoDB): Self = StObject.set(x, "createTempDatabase", js.Any.fromFunction1(value))
      
      inline def setDatabaseExists(value: (String, Boolean) => Boolean): Self = StObject.set(x, "databaseExists", js.Any.fromFunction2(value))
      
      inline def setDeleteDatabase(value: String => Callback): Self = StObject.set(x, "deleteDatabase", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setLoadDatabase(value: String => IdoDB): Self = StObject.set(x, "loadDatabase", js.Any.fromFunction1(value))
      
      inline def setRenameDatabase(value: (String, String) => Callback): Self = StObject.set(x, "renameDatabase", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
    }
  }
}
