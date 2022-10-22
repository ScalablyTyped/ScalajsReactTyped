package typingsJapgolly.ckeditorCkeditor5Engine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcModelRootelementMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsJapgolly.ckeditorCkeditor5Engine.srcModelSchemaMod._SchemaContextDefinition because Already inherited
  - typingsJapgolly.ckeditorCkeditor5Engine.srcModelSelectionMod._Selectable because Already inherited
  - typingsJapgolly.ckeditorCkeditor5Engine.srcModelItemMod.Item because Already inherited */ @JSImport("@ckeditor/ckeditor5-engine/src/model/rootelement", JSImport.Default)
  @js.native
  open class default protected () extends RootElement {
    def this(document: typingsJapgolly.ckeditorCkeditor5Engine.srcModelDocumentMod.default, name: String) = this()
    def this(
      document: typingsJapgolly.ckeditorCkeditor5Engine.srcModelDocumentMod.default,
      name: String,
      rootName: String
    ) = this()
  }
  
  @js.native
  trait RootElement
    extends typingsJapgolly.ckeditorCkeditor5Engine.srcModelElementMod.default {
    
    val document: typingsJapgolly.ckeditorCkeditor5Engine.srcModelDocumentMod.default | Null = js.native
    
    val rootName: String = js.native
  }
}
