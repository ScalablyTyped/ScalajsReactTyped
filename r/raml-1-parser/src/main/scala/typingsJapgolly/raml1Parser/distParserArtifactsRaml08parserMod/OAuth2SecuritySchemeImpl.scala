package typingsJapgolly.raml1Parser.distParserArtifactsRaml08parserMod

import typingsJapgolly.raml1Parser.distParserArtifactsRaml08parserapiMod.OAuth2SecurityScheme
import typingsJapgolly.raml1Parser.distParserHighLevelASTMod.IHighLevelNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("raml-1-parser/dist/parser/artifacts/raml08parser", "OAuth2SecuritySchemeImpl")
@js.native
open class OAuth2SecuritySchemeImpl protected ()
  extends AbstractSecuritySchemeImpl
     with OAuth2SecurityScheme {
  def this(nodeOrKey: String) = this()
  def this(nodeOrKey: IHighLevelNode) = this()
  def this(nodeOrKey: String, setAsTopLevel: Boolean) = this()
  def this(nodeOrKey: IHighLevelNode, setAsTopLevel: Boolean) = this()
  
  /**
    * @return RAML version of the node. "RAML10" for RAML 1.0 and "RAML08" for RAML 0.8.
    */
  /* CompleteClass */
  override def RAMLVersion(): String = js.native
  
  /**
    * @return Actual name of instance interface
    **/
  /* CompleteClass */
  override def kind(): String = js.native
  
  /* protected */ var nodeOrKey: IHighLevelNode | String = js.native
  
  /* protected */ var setAsTopLevel: Boolean = js.native
  
  /**
    * @hidden
    **/
  /* CompleteClass */
  override def wrapperClassName(): String = js.native
}
/* static members */
object OAuth2SecuritySchemeImpl {
  
  @JSImport("raml-1-parser/dist/parser/artifacts/raml08parser", "OAuth2SecuritySchemeImpl")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @return Whether specified object is an instance of this class
    **/
  inline def isInstance(instance: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(instance.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
