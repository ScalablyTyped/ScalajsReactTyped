package typingsJapgolly.typescriptServices.TypeScript

import typingsJapgolly.std.ITextWriter
import typingsJapgolly.typescriptServices.anon.Recursive
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IEnvironment extends StObject {
  
  var arguments: js.Array[String] = js.native
  
  def currentDirectory(): String = js.native
  
  def deleteFile(path: String): Unit = js.native
  
  def directoryExists(path: String): Boolean = js.native
  
  def fileExists(path: String): Boolean = js.native
  
  def listFiles(path: String): js.Array[String] = js.native
  def listFiles(path: String, re: js.RegExp): js.Array[String] = js.native
  def listFiles(path: String, re: js.RegExp, options: Recursive): js.Array[String] = js.native
  def listFiles(path: String, re: Unit, options: Recursive): js.Array[String] = js.native
  
  var newLine: String = js.native
  
  def readFile(path: String, codepage: Double): FileInformation = js.native
  
  var standardOut: ITextWriter = js.native
  
  def supportsCodePage(): Boolean = js.native
  
  def writeFile(path: String, contents: String, writeByteOrderMark: Boolean): Unit = js.native
}
