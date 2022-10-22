package typingsJapgolly.raml1Parser.distParserArtifactsRaml10parserMod

import typingsJapgolly.raml1Parser.distParserArtifactsRaml10parserapiMod.AnnotationRef
import typingsJapgolly.raml1Parser.distParserArtifactsRaml10parserapiMod.ApiScalarsAnnotations
import typingsJapgolly.raml1Parser.distParserHighLevelASTMod.IHighLevelNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("raml-1-parser/dist/parser/artifacts/raml10parser", "ApiScalarsAnnotationsImpl")
@js.native
open class ApiScalarsAnnotationsImpl protected ()
  extends StObject
     with ApiScalarsAnnotations {
  def this(node: IHighLevelNode) = this()
  
  /**
    * Api.baseUri annotations
    **/
  /* CompleteClass */
  override def baseUri(): js.Array[AnnotationRef] = js.native
  
  /**
    * Api.description annotations
    **/
  /* CompleteClass */
  override def description(): js.Array[AnnotationRef] = js.native
  
  /**
    * Api.mediaType annotations
    **/
  /* CompleteClass */
  override def mediaType(): js.Array[js.Array[AnnotationRef]] = js.native
  
  /* protected */ var node: IHighLevelNode = js.native
  
  /**
    * Api.protocols annotations
    **/
  /* CompleteClass */
  override def protocols(): js.Array[js.Array[AnnotationRef]] = js.native
  
  /**
    * Api.securedBy annotations
    **/
  /* CompleteClass */
  override def securedBy(): js.Array[js.Array[AnnotationRef]] = js.native
  
  /**
    * Api.title annotations
    **/
  /* CompleteClass */
  override def title(): js.Array[AnnotationRef] = js.native
  
  /**
    * Api.version annotations
    **/
  /* CompleteClass */
  override def version(): js.Array[AnnotationRef] = js.native
}
