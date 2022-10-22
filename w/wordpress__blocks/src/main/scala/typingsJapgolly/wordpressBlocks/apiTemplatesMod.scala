package typingsJapgolly.wordpressBlocks

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.std.ReadonlyArray
import typingsJapgolly.std.Record
import typingsJapgolly.wordpressBlocks.mod.BlockInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object apiTemplatesMod {
  
  @JSImport("@wordpress/blocks/api/templates", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def doBlocksMatchTemplate(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("doBlocksMatchTemplate")().asInstanceOf[Boolean]
  inline def doBlocksMatchTemplate(blocks: js.Array[BlockInstance[StringDictionary[Any]]]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("doBlocksMatchTemplate")(blocks.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def doBlocksMatchTemplate(blocks: js.Array[BlockInstance[StringDictionary[Any]]], template: TemplateArray): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("doBlocksMatchTemplate")(blocks.asInstanceOf[js.Any], template.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def doBlocksMatchTemplate(blocks: Unit, template: TemplateArray): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("doBlocksMatchTemplate")(blocks.asInstanceOf[js.Any], template.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def synchronizeBlocksWithTemplate(): js.Array[BlockInstance[StringDictionary[Any]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("synchronizeBlocksWithTemplate")().asInstanceOf[js.Array[BlockInstance[StringDictionary[Any]]]]
  inline def synchronizeBlocksWithTemplate(blocks: js.Array[BlockInstance[StringDictionary[Any]]]): js.Array[BlockInstance[StringDictionary[Any]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("synchronizeBlocksWithTemplate")(blocks.asInstanceOf[js.Any]).asInstanceOf[js.Array[BlockInstance[StringDictionary[Any]]]]
  inline def synchronizeBlocksWithTemplate(blocks: js.Array[BlockInstance[StringDictionary[Any]]], template: TemplateArray): js.Array[BlockInstance[StringDictionary[Any]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("synchronizeBlocksWithTemplate")(blocks.asInstanceOf[js.Any], template.asInstanceOf[js.Any])).asInstanceOf[js.Array[BlockInstance[StringDictionary[Any]]]]
  inline def synchronizeBlocksWithTemplate(blocks: Unit, template: TemplateArray): js.Array[BlockInstance[StringDictionary[Any]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("synchronizeBlocksWithTemplate")(blocks.asInstanceOf[js.Any], template.asInstanceOf[js.Any])).asInstanceOf[js.Array[BlockInstance[StringDictionary[Any]]]]
  
  type Template = js.Tuple3[String, js.UndefOr[Record[String, Any]], js.UndefOr[TemplateArray]]
  
  @js.native
  trait TemplateArray
    extends StObject
       with ReadonlyArray[Template]
}
