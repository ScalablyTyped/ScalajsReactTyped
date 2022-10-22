package typingsJapgolly.typescriptServices.mod.Services

import typingsJapgolly.typescriptServices.TypeScript.IScriptSnapshot
import typingsJapgolly.typescriptServices.TypeScript.SourceUnitSyntax
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript-services", "Services.Indenter")
@js.native
open class Indenter ()
  extends StObject
     with typingsJapgolly.typescriptServices.TypeScript.Services.Indenter
object Indenter {
  
  @JSImport("typescript-services", "Services.Indenter")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def belongsToBracket(sourceText: Any, token: Any, position: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("belongsToBracket")(sourceText.asInstanceOf[js.Any], token.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  /* static member */
  inline def getCustomListIndentation(list: Any, element: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getCustomListIndentation")(list.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  /* static member */
  inline def getIndentation(
    node: SourceUnitSyntax,
    soruceText: IScriptSnapshot,
    position: Double,
    editorOptions: typingsJapgolly.typescriptServices.TypeScript.Services.EditorOptions
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getIndentation")(node.asInstanceOf[js.Any], soruceText.asInstanceOf[js.Any], position.asInstanceOf[js.Any], editorOptions.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /* static member */
  inline def getListItemIndentation(list: Any, elementIndex: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getListItemIndentation")(list.asInstanceOf[js.Any], elementIndex.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  /* static member */
  inline def isInContainerNode(parent: Any, element: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("isInContainerNode")(parent.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[Any]
}
