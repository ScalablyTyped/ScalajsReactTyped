package typingsJapgolly.raml1Parser.distParserArtifactsRaml10parserMod

import typingsJapgolly.raml1Parser.distParserArtifactsRaml10parserapiMod.ResourceType
import typingsJapgolly.raml1Parser.distParserArtifactsRaml10parserapiMod.ResourceTypeRef
import typingsJapgolly.raml1Parser.distParserArtifactsRaml10parserapiMod.TypeInstance
import typingsJapgolly.raml1Parser.distParserHighLevelASTMod.IAttribute
import typingsJapgolly.raml1Parser.distParserHighLevelASTMod.IStructuredValue
import typingsJapgolly.raml1Parser.distParserWrappedAstParserCoreApiMod.BasicNode
import typingsJapgolly.raml1Parser.distParserWrappedAstParserCoreApiMod.ValueMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("raml-1-parser/dist/parser/artifacts/raml10parser", "ResourceTypeRefImpl")
@js.native
open class ResourceTypeRefImpl protected ()
  extends ReferenceImpl
     with ResourceTypeRef {
  def this(attr: IAttribute) = this()
  
  /**
    * @return RAML version of the node. "RAML10" for RAML 1.0 and "RAML08" for RAML 0.8.
    */
  /* CompleteClass */
  override def RAMLVersion(): String = js.native
  
  /**
    * @return Underlying High Level attribute node
    **/
  /* CompleteClass */
  override def highLevel(): IAttribute = js.native
  
  /**
    * @return Actual name of instance interface
    **/
  /* CompleteClass */
  override def kind(): String = js.native
  
  /* CompleteClass */
  override def meta(): ValueMetadata = js.native
  
  /**
    * Returns name of referenced object
    **/
  /* CompleteClass */
  override def name(): String = js.native
  
  /**
    * @return Whether the element is an optional sibling of trait or resource type
    **/
  /* CompleteClass */
  override def optional(): Boolean = js.native
  
  /* CompleteClass */
  override def parent(): BasicNode = js.native
  
  /**
    * Returns referenced resource type
    **/
  /* CompleteClass */
  override def resourceType(): ResourceType = js.native
  
  /**
    * Returns a structured object if the reference point to one.
    **/
  /* CompleteClass */
  override def structuredValue(): TypeInstance = js.native
  
  /**
    * JSON representation of the attribute value
    **/
  /* CompleteClass */
  override def toJSON(): Any = js.native
  
  /**
    * @return StructuredValue object representing the node value
    **/
  /* CompleteClass */
  override def value(): IStructuredValue = js.native
  
  /**
    * @hidden
    **/
  /* CompleteClass */
  override def wrapperClassName(): String = js.native
}
/* static members */
object ResourceTypeRefImpl {
  
  @JSImport("raml-1-parser/dist/parser/artifacts/raml10parser", "ResourceTypeRefImpl")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @return Whether specified object is an instance of this class
    **/
  inline def isInstance(instance: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(instance.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
