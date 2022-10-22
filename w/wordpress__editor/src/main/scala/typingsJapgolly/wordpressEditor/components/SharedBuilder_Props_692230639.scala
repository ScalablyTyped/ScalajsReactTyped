package typingsJapgolly.wordpressEditor.components

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.wordpressBlocks.mod.BlockInstance
import typingsJapgolly.wordpressEditor.anon.PartialEditorSettings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
open class SharedBuilder_Props_692230639 (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[scala.Nothing] {
  
  inline def blocks(value: js.Array[BlockInstance[StringDictionary[Any]]]): this.type = set("blocks", value.asInstanceOf[js.Any])
  
  inline def blocksVarargs(value: BlockInstance[StringDictionary[Any]]*): this.type = set("blocks", js.Array(value*))
  
  inline def initialEdits(value: js.Object): this.type = set("initialEdits", value.asInstanceOf[js.Any])
  
  inline def settings(value: PartialEditorSettings): this.type = set("settings", value.asInstanceOf[js.Any])
  
  inline def useSubRegistry(value: Boolean): this.type = set("useSubRegistry", value.asInstanceOf[js.Any])
}
