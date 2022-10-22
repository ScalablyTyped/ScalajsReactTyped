package typingsJapgolly.angularLocalize

import typingsJapgolly.angularLocalize.mod.ɵParsedMessage
import typingsJapgolly.angularLocalize.toolsSrcDiagnosticsMod.Diagnostics
import typingsJapgolly.angularLocalize.toolsSrcExtractTranslationFilesTranslationSerializerMod.TranslationSerializer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toolsSrcExtractTranslationFilesLegacyMessageIdMigrationSerializerMod {
  
  @JSImport("@angular/localize/tools/src/extract/translation_files/legacy_message_id_migration_serializer", "LegacyMessageIdMigrationSerializer")
  @js.native
  open class LegacyMessageIdMigrationSerializer protected ()
    extends StObject
       with TranslationSerializer {
    def this(_diagnostics: Diagnostics) = this()
    
    /* private */ var _diagnostics: Any = js.native
    
    /**
      * Serialize the contents of a translation file containing the given `messages`.
      *
      * @param messages The messages to render to the file.
      * @returns The contents of the serialized file.
      */
    /* CompleteClass */
    override def serialize(messages: js.Array[ɵParsedMessage]): String = js.native
  }
}
