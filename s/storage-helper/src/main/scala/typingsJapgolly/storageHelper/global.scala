package typingsJapgolly.storageHelper

import typingsJapgolly.storageHelper.anon.FnCall
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object StorageHelper {
    
    @JSGlobal("StorageHelper")
    @js.native
    val ^ : js.Any = js.native
    
    inline def clear(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clear")().asInstanceOf[Unit]
    @JSGlobal("StorageHelper.clear")
    @js.native
    def clear_FStorageHelper: js.Function0[Unit] = js.native
    
    inline def clear_FStorageHelper_=(x: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("clear")(x.asInstanceOf[js.Any])
    
    @JSGlobal("StorageHelper.getItem")
    @js.native
    def getItem: FnCall = js.native
    inline def getItem[T /* <: js.UndefOr[Boolean] */, U](key: String): /* import warning: importer.ImportType#apply Failed type conversion: T extends true ? any : string | std.NonNullable<U> | null */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getItem")(key.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: T extends true ? any : string | std.NonNullable<U> | null */ js.Any]
    inline def getItem[T /* <: js.UndefOr[Boolean] */, U](key: String, parse: T): /* import warning: importer.ImportType#apply Failed type conversion: T extends true ? any : string | std.NonNullable<U> | null */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getItem")(key.asInstanceOf[js.Any], parse.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: T extends true ? any : string | std.NonNullable<U> | null */ js.Any]
    inline def getItem[T /* <: js.UndefOr[Boolean] */, U](key: String, parse: T, fallback: U): /* import warning: importer.ImportType#apply Failed type conversion: T extends true ? any : string | std.NonNullable<U> | null */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getItem")(key.asInstanceOf[js.Any], parse.asInstanceOf[js.Any], fallback.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: T extends true ? any : string | std.NonNullable<U> | null */ js.Any]
    inline def getItem[T /* <: js.UndefOr[Boolean] */, U](key: String, parse: Unit, fallback: U): /* import warning: importer.ImportType#apply Failed type conversion: T extends true ? any : string | std.NonNullable<U> | null */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getItem")(key.asInstanceOf[js.Any], parse.asInstanceOf[js.Any], fallback.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: T extends true ? any : string | std.NonNullable<U> | null */ js.Any]
    inline def getItem_=(x: FnCall): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getItem")(x.asInstanceOf[js.Any])
    
    @JSGlobal("StorageHelper.removeItem")
    @js.native
    def removeItem: js.Function1[/* key */ String, Unit] = js.native
    inline def removeItem(key: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeItem")(key.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def removeItem_=(x: js.Function1[/* key */ String, Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("removeItem")(x.asInstanceOf[js.Any])
    
    @JSGlobal("StorageHelper.setItem")
    @js.native
    def setItem: js.Function3[/* key */ String, /* value */ String, /* permanent */ js.UndefOr[Boolean], Unit] = js.native
    inline def setItem(key: String, value: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setItem")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def setItem(key: String, value: String, permanent: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setItem")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any], permanent.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def setItem_=(x: js.Function3[/* key */ String, /* value */ String, /* permanent */ js.UndefOr[Boolean], Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("setItem")(x.asInstanceOf[js.Any])
  }
}
