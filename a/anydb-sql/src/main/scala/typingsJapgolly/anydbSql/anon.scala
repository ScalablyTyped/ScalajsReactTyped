package typingsJapgolly.anydbSql

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait `0` extends StObject {
    
    def LOWER(c: typingsJapgolly.anydbSql.mod.Column[String]): typingsJapgolly.anydbSql.mod.Column[String]
  }
  object `0` {
    
    inline def apply(LOWER: typingsJapgolly.anydbSql.mod.Column[String] => typingsJapgolly.anydbSql.mod.Column[String]): `0` = {
      val __obj = js.Dynamic.literal(LOWER = js.Any.fromFunction1(LOWER))
      __obj.asInstanceOf[`0`]
    }
    
    extension [Self <: `0`](x: Self) {
      
      inline def setLOWER(value: typingsJapgolly.anydbSql.mod.Column[String] => typingsJapgolly.anydbSql.mod.Column[String]): Self = StObject.set(x, "LOWER", js.Any.fromFunction1(value))
    }
  }
  
  trait Column extends StObject {
    
    var column: String
    
    var table: String
  }
  object Column {
    
    inline def apply(column: String, table: String): Column = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], table = table.asInstanceOf[js.Any])
      __obj.asInstanceOf[Column]
    }
    
    extension [Self <: Column](x: Self) {
      
      inline def setColumn(value: String): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setTable(value: String): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
    }
  }
  
  trait Emit extends StObject {
    
    def emit(`type`: String, args: Any*): Unit
    
    def on(eventName: String, handler: js.Function): Unit
  }
  object Emit {
    
    inline def apply(emit: (String, /* repeated */ Any) => Callback, on: (String, js.Function) => Callback): Emit = {
      val __obj = js.Dynamic.literal(emit = js.Any.fromFunction2((t0: String, t1: /* repeated */ Any) => (emit(t0, t1)).runNow()), on = js.Any.fromFunction2((t0: String, t1: js.Function) => (on(t0, t1)).runNow()))
      __obj.asInstanceOf[Emit]
    }
    
    extension [Self <: Emit](x: Self) {
      
      inline def setEmit(value: (String, /* repeated */ Any) => Callback): Self = StObject.set(x, "emit", js.Any.fromFunction2((t0: String, t1: /* repeated */ Any) => (value(t0, t1)).runNow()))
      
      inline def setOn(value: (String, js.Function) => Callback): Self = StObject.set(x, "on", js.Any.fromFunction2((t0: String, t1: js.Function) => (value(t0, t1)).runNow()))
    }
  }
  
  trait From extends StObject {
    
    var from: String
    
    var many: js.UndefOr[Boolean] = js.undefined
  }
  object From {
    
    inline def apply(from: String): From = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any])
      __obj.asInstanceOf[From]
    }
    
    extension [Self <: From](x: Self) {
      
      inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setMany(value: Boolean): Self = StObject.set(x, "many", value.asInstanceOf[js.Any])
      
      inline def setManyUndefined: Self = StObject.set(x, "many", js.undefined)
    }
  }
  
  trait Having[T] extends StObject {
    
    def having(nodes: Any*): T
  }
  object Having {
    
    inline def apply[T](having: /* repeated */ Any => T): Having[T] = {
      val __obj = js.Dynamic.literal(having = js.Any.fromFunction1(having))
      __obj.asInstanceOf[Having[T]]
    }
    
    extension [Self <: Having[?], T](x: Self & Having[T]) {
      
      inline def setHaving(value: /* repeated */ Any => T): Self = StObject.set(x, "having", js.Any.fromFunction1(value))
    }
  }
  
  trait LOWER extends StObject {
    
    def LOWER(name: typingsJapgolly.anydbSql.mod.Column[String]): typingsJapgolly.anydbSql.mod.Column[String]
    
    def RTRIM(name: typingsJapgolly.anydbSql.mod.Column[String]): typingsJapgolly.anydbSql.mod.Column[String]
  }
  object LOWER {
    
    inline def apply(
      LOWER: typingsJapgolly.anydbSql.mod.Column[String] => typingsJapgolly.anydbSql.mod.Column[String],
      RTRIM: typingsJapgolly.anydbSql.mod.Column[String] => typingsJapgolly.anydbSql.mod.Column[String]
    ): LOWER = {
      val __obj = js.Dynamic.literal(LOWER = js.Any.fromFunction1(LOWER), RTRIM = js.Any.fromFunction1(RTRIM))
      __obj.asInstanceOf[LOWER]
    }
    
    extension [Self <: LOWER](x: Self) {
      
      inline def setLOWER(value: typingsJapgolly.anydbSql.mod.Column[String] => typingsJapgolly.anydbSql.mod.Column[String]): Self = StObject.set(x, "LOWER", js.Any.fromFunction1(value))
      
      inline def setRTRIM(value: typingsJapgolly.anydbSql.mod.Column[String] => typingsJapgolly.anydbSql.mod.Column[String]): Self = StObject.set(x, "RTRIM", js.Any.fromFunction1(value))
    }
  }
  
  trait RowCount[T] extends StObject {
    
    var rowCount: Double
    
    var rows: js.Array[T]
  }
  object RowCount {
    
    inline def apply[T](rowCount: Double, rows: js.Array[T]): RowCount[T] = {
      val __obj = js.Dynamic.literal(rowCount = rowCount.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any])
      __obj.asInstanceOf[RowCount[T]]
    }
    
    extension [Self <: RowCount[?], T](x: Self & RowCount[T]) {
      
      inline def setRowCount(value: Double): Self = StObject.set(x, "rowCount", value.asInstanceOf[js.Any])
      
      inline def setRows(value: js.Array[T]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
      
      inline def setRowsVarargs(value: T*): Self = StObject.set(x, "rows", js.Array(value*))
    }
  }
}
