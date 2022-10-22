package typingsJapgolly.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Bundle
  extends StObject
     with Node {
  
  @JSName("kind")
  val kind_Bundle: typingsJapgolly.typescript.mod.SyntaxKind.Bundle = js.native
  
  val prepends: js.Array[InputFiles | UnparsedSource] = js.native
  
  val sourceFiles: js.Array[SourceFile] = js.native
}
