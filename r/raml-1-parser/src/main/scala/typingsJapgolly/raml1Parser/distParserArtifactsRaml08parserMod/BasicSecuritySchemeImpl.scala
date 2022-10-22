package typingsJapgolly.raml1Parser.distParserArtifactsRaml08parserMod

import typingsJapgolly.raml1Parser.distParserHighLevelASTMod.IHighLevelNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("raml-1-parser/dist/parser/artifacts/raml08parser", "BasicSecuritySchemeImpl")
@js.native
open class BasicSecuritySchemeImpl protected () extends AbstractSecuritySchemeImpl {
  def this(nodeOrKey: String) = this()
  def this(nodeOrKey: IHighLevelNode) = this()
  def this(nodeOrKey: String, setAsTopLevel: Boolean) = this()
  def this(nodeOrKey: IHighLevelNode, setAsTopLevel: Boolean) = this()
  
  /* protected */ var nodeOrKey: IHighLevelNode | String = js.native
  
  /* protected */ var setAsTopLevel: Boolean = js.native
}
/* static members */
object BasicSecuritySchemeImpl {
  
  @JSImport("raml-1-parser/dist/parser/artifacts/raml08parser", "BasicSecuritySchemeImpl")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @return Whether specified object is an instance of this class
    **/
  inline def isInstance(instance: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(instance.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
