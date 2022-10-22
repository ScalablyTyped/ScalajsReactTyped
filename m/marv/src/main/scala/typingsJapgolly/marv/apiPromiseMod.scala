package typingsJapgolly.marv

import typingsJapgolly.marv.anon.Quiet
import typingsJapgolly.marv.mod.Driver
import typingsJapgolly.marv.mod.ParsedMigration
import typingsJapgolly.marv.mod.ScanOptions
import typingsJapgolly.node.fsMod.PathLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object apiPromiseMod {
  
  @JSImport("marv/api/promise", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def drop(driver: Driver): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("drop")(driver.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def migrate(migrations: js.Array[ParsedMigration], driver: Driver): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("migrate")(migrations.asInstanceOf[js.Any], driver.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def migrate(migrations: js.Array[ParsedMigration], driver: Driver, options: Quiet): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("migrate")(migrations.asInstanceOf[js.Any], driver.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def scan(directory: PathLike): js.Promise[js.Array[ParsedMigration]] = ^.asInstanceOf[js.Dynamic].applyDynamic("scan")(directory.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[ParsedMigration]]]
  inline def scan(directory: PathLike, options: ScanOptions): js.Promise[js.Array[ParsedMigration]] = (^.asInstanceOf[js.Dynamic].applyDynamic("scan")(directory.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[ParsedMigration]]]
}
