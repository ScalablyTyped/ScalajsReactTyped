package typingsJapgolly.jestEnvironmentVscodeExtension.mod.global.vscode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("vscode.TaskGroup")
@js.native
open class TaskGroup protected ()
  extends typingsJapgolly.vscode.mod.TaskGroup {
  /* private */ def this(id: String, label: String) = this()
}
/* static members */
object TaskGroup {
  
  @JSGlobal("vscode.TaskGroup")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * The build task group;
    */
  @JSGlobal("vscode.TaskGroup.Build")
  @js.native
  def Build: typingsJapgolly.vscode.mod.TaskGroup = js.native
  inline def Build_=(x: typingsJapgolly.vscode.mod.TaskGroup): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Build")(x.asInstanceOf[js.Any])
  
  /**
    * The clean task group;
    */
  @JSGlobal("vscode.TaskGroup.Clean")
  @js.native
  def Clean: typingsJapgolly.vscode.mod.TaskGroup = js.native
  inline def Clean_=(x: typingsJapgolly.vscode.mod.TaskGroup): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Clean")(x.asInstanceOf[js.Any])
  
  /**
    * The rebuild all task group;
    */
  @JSGlobal("vscode.TaskGroup.Rebuild")
  @js.native
  def Rebuild: typingsJapgolly.vscode.mod.TaskGroup = js.native
  inline def Rebuild_=(x: typingsJapgolly.vscode.mod.TaskGroup): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Rebuild")(x.asInstanceOf[js.Any])
  
  /**
    * The test all task group;
    */
  @JSGlobal("vscode.TaskGroup.Test")
  @js.native
  def Test: typingsJapgolly.vscode.mod.TaskGroup = js.native
  inline def Test_=(x: typingsJapgolly.vscode.mod.TaskGroup): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Test")(x.asInstanceOf[js.Any])
}
