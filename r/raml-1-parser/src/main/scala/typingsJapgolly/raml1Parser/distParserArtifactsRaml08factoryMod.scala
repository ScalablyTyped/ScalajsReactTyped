package typingsJapgolly.raml1Parser

import typingsJapgolly.raml1Parser.distParserHighLevelASTMod.IHighLevelNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distParserArtifactsRaml08factoryMod {
  
  @JSImport("raml-1-parser/dist/parser/artifacts/raml08factory", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def buildWrapperNode(node: IHighLevelNode): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("buildWrapperNode")(node.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def buildWrapperNode(node: IHighLevelNode, setAsTopLevel: Boolean): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("buildWrapperNode")(node.asInstanceOf[js.Any], setAsTopLevel.asInstanceOf[js.Any])).asInstanceOf[Any]
}
