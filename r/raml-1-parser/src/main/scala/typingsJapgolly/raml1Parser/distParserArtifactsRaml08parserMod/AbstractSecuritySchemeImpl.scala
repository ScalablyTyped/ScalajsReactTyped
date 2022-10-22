package typingsJapgolly.raml1Parser.distParserArtifactsRaml08parserMod

import typingsJapgolly.raml1Parser.distParserArtifactsRaml08parserapiMod.AbstractSecurityScheme
import typingsJapgolly.raml1Parser.distParserHighLevelASTMod.IHighLevelNode
import typingsJapgolly.raml1Parser.distParserWrappedAstParserCoreMod.BasicNodeImpl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("raml-1-parser/dist/parser/artifacts/raml08parser", "AbstractSecuritySchemeImpl")
@js.native
open class AbstractSecuritySchemeImpl protected ()
  extends BasicNodeImpl
     with AbstractSecurityScheme {
  /**
    * @hidden
    **/
  def this(_node: IHighLevelNode) = this()
  def this(_node: IHighLevelNode, setAsWrapper: Boolean) = this()
  
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
  
  /**
    * @hidden
    * Set name value
    **/
  def setName(param: String): this.type = js.native
  
  /**
    * @hidden
    * Set type value
    **/
  def setType(param: String): this.type = js.native
  
  /**
    * @hidden
    **/
  /* CompleteClass */
  override def wrapperClassName(): String = js.native
}
/* static members */
object AbstractSecuritySchemeImpl {
  
  @JSImport("raml-1-parser/dist/parser/artifacts/raml08parser", "AbstractSecuritySchemeImpl")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @return Whether specified object is an instance of this class
    **/
  inline def isInstance(instance: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(instance.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
