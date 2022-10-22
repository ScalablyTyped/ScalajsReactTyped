package typingsJapgolly.draftJs.mod

import typingsJapgolly.draftJs.mod.Draft.Model.ImmutableData.CharacterMetadataConfig
import typingsJapgolly.draftJs.mod.Draft.Model.ImmutableData.DraftInlineStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("draft-js", "CharacterMetadata")
@js.native
open class CharacterMetadata ()
  extends StObject
     with typingsJapgolly.draftJs.mod.Draft.Model.ImmutableData.CharacterMetadata {
  
  /* CompleteClass */
  override def getEntity(): String = js.native
  
  /* CompleteClass */
  override def getStyle(): DraftInlineStyle = js.native
  
  /* CompleteClass */
  override def hasStyle(style: String): Boolean = js.native
}
object CharacterMetadata {
  
  @JSImport("draft-js", "CharacterMetadata")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def applyEntity(record: typingsJapgolly.draftJs.mod.Draft.Model.ImmutableData.CharacterMetadata): typingsJapgolly.draftJs.mod.Draft.Model.ImmutableData.CharacterMetadata = ^.asInstanceOf[js.Dynamic].applyDynamic("applyEntity")(record.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.draftJs.mod.Draft.Model.ImmutableData.CharacterMetadata]
  inline def applyEntity(record: typingsJapgolly.draftJs.mod.Draft.Model.ImmutableData.CharacterMetadata, entityKey: String): typingsJapgolly.draftJs.mod.Draft.Model.ImmutableData.CharacterMetadata = (^.asInstanceOf[js.Dynamic].applyDynamic("applyEntity")(record.asInstanceOf[js.Any], entityKey.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.draftJs.mod.Draft.Model.ImmutableData.CharacterMetadata]
  
  /* static member */
  inline def applyStyle(record: typingsJapgolly.draftJs.mod.Draft.Model.ImmutableData.CharacterMetadata, style: String): typingsJapgolly.draftJs.mod.Draft.Model.ImmutableData.CharacterMetadata = (^.asInstanceOf[js.Dynamic].applyDynamic("applyStyle")(record.asInstanceOf[js.Any], style.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.draftJs.mod.Draft.Model.ImmutableData.CharacterMetadata]
  
  /**
    * Use this function instead of the `CharacterMetadata` constructor.
    * Since most content generally uses only a very small number of
    * style/entity permutations, we can reuse these objects as often as
    * possible.
    */
  /* static member */
  inline def create(): typingsJapgolly.draftJs.mod.Draft.Model.ImmutableData.CharacterMetadata = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typingsJapgolly.draftJs.mod.Draft.Model.ImmutableData.CharacterMetadata]
  inline def create(config: CharacterMetadataConfig): typingsJapgolly.draftJs.mod.Draft.Model.ImmutableData.CharacterMetadata = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(config.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.draftJs.mod.Draft.Model.ImmutableData.CharacterMetadata]
  
  /* static member */
  inline def removeStyle(record: typingsJapgolly.draftJs.mod.Draft.Model.ImmutableData.CharacterMetadata, style: String): typingsJapgolly.draftJs.mod.Draft.Model.ImmutableData.CharacterMetadata = (^.asInstanceOf[js.Dynamic].applyDynamic("removeStyle")(record.asInstanceOf[js.Any], style.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.draftJs.mod.Draft.Model.ImmutableData.CharacterMetadata]
}
