package typingsJapgolly.raml1Parser.distParserArtifactsRaml10parserMod

import typingsJapgolly.raml1Parser.distParserArtifactsRaml10parserapiMod.AnnotationRef
import typingsJapgolly.raml1Parser.distParserArtifactsRaml10parserapiMod.OAuth1SecuritySchemeSettingsScalarsAnnotations
import typingsJapgolly.raml1Parser.distParserHighLevelASTMod.IHighLevelNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("raml-1-parser/dist/parser/artifacts/raml10parser", "OAuth1SecuritySchemeSettingsScalarsAnnotationsImpl")
@js.native
open class OAuth1SecuritySchemeSettingsScalarsAnnotationsImpl protected ()
  extends StObject
     with OAuth1SecuritySchemeSettingsScalarsAnnotations {
  def this(node: IHighLevelNode) = this()
  
  /**
    * OAuth1SecuritySchemeSettings.authorizationUri annotations
    **/
  /* CompleteClass */
  override def authorizationUri(): js.Array[AnnotationRef] = js.native
  
  /* protected */ var node: IHighLevelNode = js.native
  
  /**
    * OAuth1SecuritySchemeSettings.requestTokenUri annotations
    **/
  /* CompleteClass */
  override def requestTokenUri(): js.Array[AnnotationRef] = js.native
  
  /**
    * OAuth1SecuritySchemeSettings.signatures annotations
    **/
  /* CompleteClass */
  override def signatures(): js.Array[js.Array[AnnotationRef]] = js.native
  
  /**
    * OAuth1SecuritySchemeSettings.tokenCredentialsUri annotations
    **/
  /* CompleteClass */
  override def tokenCredentialsUri(): js.Array[AnnotationRef] = js.native
}
