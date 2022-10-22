package typingsJapgolly.keya

import typingsJapgolly.sqlite.sqlite3Mod.Database
import typingsJapgolly.sqlite.sqlite3Mod.Statement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outNodeSqliteMod {
  
  @JSImport("keya/out/node/sqlite", JSImport.Default)
  @js.native
  open class default[T] () extends SQLiteStore[T]
  /* static members */
  object default {
    
    @JSImport("keya/out/node/sqlite", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def stores(): js.Promise[js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("stores")().asInstanceOf[js.Promise[js.Array[String]]]
  }
  
  @js.native
  trait SQLiteStore[T]
    extends typingsJapgolly.keya.outCoreStoreMod.default[T] {
    
    var db: typingsJapgolly.sqlite.mod.Database[Database, Statement] = js.native
    
    var file: String = js.native
    
    /* private */ var statements: Any = js.native
  }
}
