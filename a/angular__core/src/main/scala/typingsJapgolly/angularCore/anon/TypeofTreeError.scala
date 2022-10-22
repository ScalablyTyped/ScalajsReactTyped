package typingsJapgolly.angularCore.anon

import org.scalablytyped.runtime.Instantiable3
import typingsJapgolly.angularCompiler.mod.ParseSourceSpan
import typingsJapgolly.angularCompiler.mod.TreeError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofTreeError
  extends StObject
     with Instantiable3[/* elementName */ String, /* span */ ParseSourceSpan, /* msg */ String, TreeError] {
  
  def create(elementName: String, span: ParseSourceSpan, msg: String): TreeError = js.native
  def create(elementName: Null, span: ParseSourceSpan, msg: String): TreeError = js.native
}
