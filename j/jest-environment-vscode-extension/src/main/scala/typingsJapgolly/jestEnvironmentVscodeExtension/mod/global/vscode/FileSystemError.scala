package typingsJapgolly.jestEnvironmentVscodeExtension.mod.global.vscode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("vscode.FileSystemError")
@js.native
/**
  * Creates a new filesystem error.
  *
  * @param messageOrUri Message or uri.
  */
open class FileSystemError ()
  extends typingsJapgolly.vscode.mod.FileSystemError {
  def this(messageOrUri: String) = this()
  def this(messageOrUri: typingsJapgolly.vscode.mod.Uri) = this()
}
/* static members */
object FileSystemError {
  
  @JSGlobal("vscode.FileSystemError")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Create an error to signal that a file or folder already exists, e.g. when
    * creating but not overwriting a file.
    * @param messageOrUri Message or uri.
    */
  inline def FileExists(): typingsJapgolly.vscode.mod.FileSystemError = ^.asInstanceOf[js.Dynamic].applyDynamic("FileExists")().asInstanceOf[typingsJapgolly.vscode.mod.FileSystemError]
  inline def FileExists(messageOrUri: String): typingsJapgolly.vscode.mod.FileSystemError = ^.asInstanceOf[js.Dynamic].applyDynamic("FileExists")(messageOrUri.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.vscode.mod.FileSystemError]
  inline def FileExists(messageOrUri: typingsJapgolly.vscode.mod.Uri): typingsJapgolly.vscode.mod.FileSystemError = ^.asInstanceOf[js.Dynamic].applyDynamic("FileExists")(messageOrUri.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.vscode.mod.FileSystemError]
  
  /**
    * Create an error to signal that a file is a folder.
    * @param messageOrUri Message or uri.
    */
  inline def FileIsADirectory(): typingsJapgolly.vscode.mod.FileSystemError = ^.asInstanceOf[js.Dynamic].applyDynamic("FileIsADirectory")().asInstanceOf[typingsJapgolly.vscode.mod.FileSystemError]
  inline def FileIsADirectory(messageOrUri: String): typingsJapgolly.vscode.mod.FileSystemError = ^.asInstanceOf[js.Dynamic].applyDynamic("FileIsADirectory")(messageOrUri.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.vscode.mod.FileSystemError]
  inline def FileIsADirectory(messageOrUri: typingsJapgolly.vscode.mod.Uri): typingsJapgolly.vscode.mod.FileSystemError = ^.asInstanceOf[js.Dynamic].applyDynamic("FileIsADirectory")(messageOrUri.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.vscode.mod.FileSystemError]
  
  /**
    * Create an error to signal that a file is not a folder.
    * @param messageOrUri Message or uri.
    */
  inline def FileNotADirectory(): typingsJapgolly.vscode.mod.FileSystemError = ^.asInstanceOf[js.Dynamic].applyDynamic("FileNotADirectory")().asInstanceOf[typingsJapgolly.vscode.mod.FileSystemError]
  inline def FileNotADirectory(messageOrUri: String): typingsJapgolly.vscode.mod.FileSystemError = ^.asInstanceOf[js.Dynamic].applyDynamic("FileNotADirectory")(messageOrUri.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.vscode.mod.FileSystemError]
  inline def FileNotADirectory(messageOrUri: typingsJapgolly.vscode.mod.Uri): typingsJapgolly.vscode.mod.FileSystemError = ^.asInstanceOf[js.Dynamic].applyDynamic("FileNotADirectory")(messageOrUri.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.vscode.mod.FileSystemError]
  
  /**
    * Create an error to signal that a file or folder wasn't found.
    * @param messageOrUri Message or uri.
    */
  inline def FileNotFound(): typingsJapgolly.vscode.mod.FileSystemError = ^.asInstanceOf[js.Dynamic].applyDynamic("FileNotFound")().asInstanceOf[typingsJapgolly.vscode.mod.FileSystemError]
  inline def FileNotFound(messageOrUri: String): typingsJapgolly.vscode.mod.FileSystemError = ^.asInstanceOf[js.Dynamic].applyDynamic("FileNotFound")(messageOrUri.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.vscode.mod.FileSystemError]
  inline def FileNotFound(messageOrUri: typingsJapgolly.vscode.mod.Uri): typingsJapgolly.vscode.mod.FileSystemError = ^.asInstanceOf[js.Dynamic].applyDynamic("FileNotFound")(messageOrUri.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.vscode.mod.FileSystemError]
  
  /**
    * Create an error to signal that an operation lacks required permissions.
    * @param messageOrUri Message or uri.
    */
  inline def NoPermissions(): typingsJapgolly.vscode.mod.FileSystemError = ^.asInstanceOf[js.Dynamic].applyDynamic("NoPermissions")().asInstanceOf[typingsJapgolly.vscode.mod.FileSystemError]
  inline def NoPermissions(messageOrUri: String): typingsJapgolly.vscode.mod.FileSystemError = ^.asInstanceOf[js.Dynamic].applyDynamic("NoPermissions")(messageOrUri.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.vscode.mod.FileSystemError]
  inline def NoPermissions(messageOrUri: typingsJapgolly.vscode.mod.Uri): typingsJapgolly.vscode.mod.FileSystemError = ^.asInstanceOf[js.Dynamic].applyDynamic("NoPermissions")(messageOrUri.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.vscode.mod.FileSystemError]
  
  /**
    * Create an error to signal that the file system is unavailable or too busy to
    * complete a request.
    * @param messageOrUri Message or uri.
    */
  inline def Unavailable(): typingsJapgolly.vscode.mod.FileSystemError = ^.asInstanceOf[js.Dynamic].applyDynamic("Unavailable")().asInstanceOf[typingsJapgolly.vscode.mod.FileSystemError]
  inline def Unavailable(messageOrUri: String): typingsJapgolly.vscode.mod.FileSystemError = ^.asInstanceOf[js.Dynamic].applyDynamic("Unavailable")(messageOrUri.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.vscode.mod.FileSystemError]
  inline def Unavailable(messageOrUri: typingsJapgolly.vscode.mod.Uri): typingsJapgolly.vscode.mod.FileSystemError = ^.asInstanceOf[js.Dynamic].applyDynamic("Unavailable")(messageOrUri.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.vscode.mod.FileSystemError]
}
