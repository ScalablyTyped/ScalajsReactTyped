package typingsJapgolly.raml1Parser.distParserArtifactsRaml10parserMod

import typingsJapgolly.raml1Parser.distParserArtifactsRaml10parserapiMod.AnnotationRef
import typingsJapgolly.raml1Parser.distParserArtifactsRaml10parserapiMod.MethodScalarsAnnotations
import typingsJapgolly.raml1Parser.distParserHighLevelASTMod.IHighLevelNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("raml-1-parser/dist/parser/artifacts/raml10parser", "MethodScalarsAnnotationsImpl")
@js.native
open class MethodScalarsAnnotationsImpl protected ()
  extends MethodBaseScalarsAnnotationsImpl
     with MethodScalarsAnnotations {
  def this(node: IHighLevelNode) = this()
  
  /**
    * MethodBase.description annotations
    **/
  /* CompleteClass */
  override def description(): js.Array[AnnotationRef] = js.native
  
  /**
    * MethodBase.displayName annotations
    **/
  /* CompleteClass */
  override def displayName(): js.Array[AnnotationRef] = js.native
  
  /**
    * MethodBase.is annotations
    **/
  /* CompleteClass */
  override def is(): js.Array[js.Array[AnnotationRef]] = js.native
  
  /**
    * MethodBase.protocols annotations
    **/
  /* CompleteClass */
  override def protocols(): js.Array[js.Array[AnnotationRef]] = js.native
  
  /**
    * MethodBase.securedBy annotations
    **/
  /* CompleteClass */
  override def securedBy(): js.Array[js.Array[AnnotationRef]] = js.native
}
