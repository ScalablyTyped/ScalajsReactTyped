package typingsJapgolly.raml1Parser.distParserArtifactsRaml10parserMod

import typingsJapgolly.raml1Parser.distParserArtifactsRaml10parserapiMod.AnnotationRef
import typingsJapgolly.raml1Parser.distParserArtifactsRaml10parserapiMod.XMLFacetInfoScalarsAnnotations
import typingsJapgolly.raml1Parser.distParserHighLevelASTMod.IHighLevelNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("raml-1-parser/dist/parser/artifacts/raml10parser", "XMLFacetInfoScalarsAnnotationsImpl")
@js.native
open class XMLFacetInfoScalarsAnnotationsImpl protected ()
  extends StObject
     with XMLFacetInfoScalarsAnnotations {
  def this(node: IHighLevelNode) = this()
  
  /**
    * XMLFacetInfo.attribute annotations
    **/
  /* CompleteClass */
  override def attribute(): js.Array[AnnotationRef] = js.native
  
  /**
    * XMLFacetInfo.name annotations
    **/
  /* CompleteClass */
  override def name(): js.Array[AnnotationRef] = js.native
  
  /**
    * XMLFacetInfo.namespace annotations
    **/
  /* CompleteClass */
  override def namespace(): js.Array[AnnotationRef] = js.native
  
  /* protected */ var node: IHighLevelNode = js.native
  
  /**
    * XMLFacetInfo.prefix annotations
    **/
  /* CompleteClass */
  override def prefix(): js.Array[AnnotationRef] = js.native
  
  /**
    * XMLFacetInfo.wrapped annotations
    **/
  /* CompleteClass */
  override def wrapped(): js.Array[AnnotationRef] = js.native
}
