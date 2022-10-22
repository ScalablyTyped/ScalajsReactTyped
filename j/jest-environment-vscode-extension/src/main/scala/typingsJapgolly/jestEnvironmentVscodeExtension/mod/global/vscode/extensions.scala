package typingsJapgolly.jestEnvironmentVscodeExtension.mod.global.vscode

import typingsJapgolly.vscode.mod.Event
import typingsJapgolly.vscode.mod.Extension
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object extensions {
  
  @JSGlobal("vscode.extensions")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("vscode.extensions.all")
  @js.native
  val all: js.Array[Extension[Any]] = js.native
  
  inline def getExtension[T](extensionId: String): js.UndefOr[Extension[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getExtension")(extensionId.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Extension[T]]]
  
  @JSGlobal("vscode.extensions.onDidChange")
  @js.native
  val onDidChange: Event[Unit] = js.native
}
