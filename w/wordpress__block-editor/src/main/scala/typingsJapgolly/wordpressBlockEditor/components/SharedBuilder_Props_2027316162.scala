package typingsJapgolly.wordpressBlockEditor.components

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.wordpressBlockEditor.anon.PartialEditorSettingsEdit
import typingsJapgolly.wordpressBlocks.mod.BlockInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
open class SharedBuilder_Props_2027316162 (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[scala.Nothing] {
  
  inline def onChange(value: /* blocks */ js.Array[BlockInstance[StringDictionary[Any]]] => Callback): this.type = set("onChange", js.Any.fromFunction1((t0: /* blocks */ js.Array[BlockInstance[StringDictionary[Any]]]) => value(t0).runNow()))
  
  inline def onInput(value: /* blocks */ js.Array[BlockInstance[StringDictionary[Any]]] => Callback): this.type = set("onInput", js.Any.fromFunction1((t0: /* blocks */ js.Array[BlockInstance[StringDictionary[Any]]]) => value(t0).runNow()))
  
  inline def settings(value: PartialEditorSettingsEdit): this.type = set("settings", value.asInstanceOf[js.Any])
  
  inline def useSubRegistry(value: Boolean): this.type = set("useSubRegistry", value.asInstanceOf[js.Any])
  
  inline def value(value: js.Array[BlockInstance[StringDictionary[Any]]]): this.type = set("value", value.asInstanceOf[js.Any])
  
  inline def valueVarargs(value: BlockInstance[StringDictionary[Any]]*): this.type = set("value", js.Array(value*))
}
