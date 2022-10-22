package typingsJapgolly.tsJest.distTypesMod

import typingsJapgolly.typescript.mod.Bundle
import typingsJapgolly.typescript.mod.SourceFile
import typingsJapgolly.typescript.mod.TransformerFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AstTransformerDesc[T] extends StObject {
  
  def factory(tsCompiler: TsCompilerInstance): TransformerFactory[Bundle | SourceFile] = js.native
  def factory(tsCompiler: TsCompilerInstance, opts: T): TransformerFactory[Bundle | SourceFile] = js.native
  
  var name: String = js.native
  
  var options: js.UndefOr[T] = js.native
  
  var version: Double = js.native
}
