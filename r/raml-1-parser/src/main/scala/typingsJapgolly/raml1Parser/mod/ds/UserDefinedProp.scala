package typingsJapgolly.raml1Parser.mod.ds

import typingsJapgolly.ramlDefinitionSystem.mod.IParseResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("raml-1-parser", "ds.UserDefinedProp")
@js.native
open class UserDefinedProp protected ()
  extends typingsJapgolly.ramlDefinitionSystem.mod.UserDefinedProp {
  def this(name: String, source: IParseResult) = this()
}
/* static members */
object UserDefinedProp {
  
  @JSImport("raml-1-parser", "ds.UserDefinedProp")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("raml-1-parser", "ds.UserDefinedProp.CLASS_IDENTIFIER")
  @js.native
  def CLASS_IDENTIFIER: Any = js.native
  inline def CLASS_IDENTIFIER_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLASS_IDENTIFIER")(x.asInstanceOf[js.Any])
  
  inline def isInstance(instance: Any): /* is raml-definition-system.raml-definition-system.UserDefinedProp */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(instance.asInstanceOf[js.Any]).asInstanceOf[/* is raml-definition-system.raml-definition-system.UserDefinedProp */ Boolean]
}
