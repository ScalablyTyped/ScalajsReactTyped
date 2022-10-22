package typingsJapgolly.anydbSqlMigrations

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.anydbSqlMigrations.mod.MigrationOptions
import typingsJapgolly.anydbSqlMigrations.mod.MigrationTask
import typingsJapgolly.bluebird.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Check extends StObject {
    
    def check(f: js.Function1[/* items */ js.Array[MigrationTask], Any]): ^[Any]
    
    def drop(): ^[Any]
    
    def execMigrations(migrationOptions: MigrationOptions): ^[Unit]
    
    def migrate(): ^[Any]
    
    def run(): ^[Any]
    
    def undoLast(): ^[Any]
  }
  object Check {
    
    inline def apply(
      check: js.Function1[/* items */ js.Array[MigrationTask], Any] => ^[Any],
      drop: CallbackTo[^[Any]],
      execMigrations: MigrationOptions => ^[Unit],
      migrate: CallbackTo[^[Any]],
      run: CallbackTo[^[Any]],
      undoLast: CallbackTo[^[Any]]
    ): Check = {
      val __obj = js.Dynamic.literal(check = js.Any.fromFunction1(check), drop = drop.toJsFn, execMigrations = js.Any.fromFunction1(execMigrations), migrate = migrate.toJsFn, run = run.toJsFn, undoLast = undoLast.toJsFn)
      __obj.asInstanceOf[Check]
    }
    
    extension [Self <: Check](x: Self) {
      
      inline def setCheck(value: js.Function1[/* items */ js.Array[MigrationTask], Any] => ^[Any]): Self = StObject.set(x, "check", js.Any.fromFunction1(value))
      
      inline def setDrop(value: CallbackTo[^[Any]]): Self = StObject.set(x, "drop", value.toJsFn)
      
      inline def setExecMigrations(value: MigrationOptions => ^[Unit]): Self = StObject.set(x, "execMigrations", js.Any.fromFunction1(value))
      
      inline def setMigrate(value: CallbackTo[^[Any]]): Self = StObject.set(x, "migrate", value.toJsFn)
      
      inline def setRun(value: CallbackTo[^[Any]]): Self = StObject.set(x, "run", value.toJsFn)
      
      inline def setUndoLast(value: CallbackTo[^[Any]]): Self = StObject.set(x, "undoLast", value.toJsFn)
    }
  }
}
