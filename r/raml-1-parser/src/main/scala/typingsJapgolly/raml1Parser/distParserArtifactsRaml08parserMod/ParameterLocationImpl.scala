package typingsJapgolly.raml1Parser.distParserArtifactsRaml08parserMod

import typingsJapgolly.raml1Parser.distParserHighLevelASTMod.AbstractWrapperNode
import typingsJapgolly.raml1Parser.distParserHighLevelASTMod.IAttribute
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("raml-1-parser/dist/parser/artifacts/raml08parser", "ParameterLocationImpl")
@js.native
open class ParameterLocationImpl protected ()
  extends StObject
     with AbstractWrapperNode {
  def this(attr: IAttribute) = this()
  
  /**
    * @return RAML version of the node. "RAML10" for RAML 1.0 and "RAML08" for RAML 0.8.
    */
  /* CompleteClass */
  override def RAMLVersion(): String = js.native
  
  /**
    * @return Actual name of instance interface and all of its superinterfaces
    **/
  def allKinds(): js.Array[String] = js.native
  
  /**
    * @return Actual name of instance class and all of its superclasses
    **/
  def allWrapperClassNames(): js.Array[String] = js.native
  
  /* protected */ var attr: IAttribute = js.native
  
  /**
    * @return Actual name of instance interface
    **/
  /* CompleteClass */
  override def kind(): String = js.native
  
  /**
    * @hidden
    **/
  /* CompleteClass */
  override def wrapperClassName(): String = js.native
}
/* static members */
object ParameterLocationImpl {
  
  @JSImport("raml-1-parser/dist/parser/artifacts/raml08parser", "ParameterLocationImpl")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @return Whether specified object is an instance of this class
    **/
  inline def isInstance(instance: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(instance.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
