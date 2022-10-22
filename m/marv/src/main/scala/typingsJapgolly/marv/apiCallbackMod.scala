package typingsJapgolly.marv

import typingsJapgolly.marv.anon.Quiet
import typingsJapgolly.marv.mod.Driver
import typingsJapgolly.marv.mod.ErrorOnlyCallback
import typingsJapgolly.marv.mod.ParsedMigration
import typingsJapgolly.marv.mod.ScanOptions
import typingsJapgolly.node.fsMod.PathLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object apiCallbackMod {
  
  @JSImport("marv/api/callback", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def drop(driver: Driver): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("drop")(driver.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def drop(driver: Driver, cb: ErrorOnlyCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drop")(driver.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def migrate(migrations: js.Array[ParsedMigration], driver: Driver, cb: ErrorOnlyCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("migrate")(migrations.asInstanceOf[js.Any], driver.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def migrate(migrations: js.Array[ParsedMigration], driver: Driver, options: Quiet, cb: ErrorOnlyCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("migrate")(migrations.asInstanceOf[js.Any], driver.asInstanceOf[js.Any], options.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def scan(
    directory: PathLike,
    cb: js.Function2[/* err */ js.UndefOr[js.Error], /* migrations */ js.Array[ParsedMigration], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("scan")(directory.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def scan(
    directory: PathLike,
    options: ScanOptions,
    cb: js.Function2[/* err */ js.UndefOr[js.Error], /* migrations */ js.Array[ParsedMigration], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("scan")(directory.asInstanceOf[js.Any], options.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
