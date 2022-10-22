package typingsJapgolly.cypressImageSnapshot

import typingsJapgolly.cypressImageSnapshot.mod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandMod {
  
  @JSImport("cypress-image-snapshot/command", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addMatchImageSnapshotCommand(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addMatchImageSnapshotCommand")().asInstanceOf[Unit]
  inline def addMatchImageSnapshotCommand(nameOrOptions: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addMatchImageSnapshotCommand")(nameOrOptions.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def addMatchImageSnapshotCommand(nameOrOptions: Options): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addMatchImageSnapshotCommand")(nameOrOptions.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def addMatchImageSnapshotCommand(name: String, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addMatchImageSnapshotCommand")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
