package typingsJapgolly.angularLocalize

import typingsJapgolly.angularCompiler.mod.Element
import typingsJapgolly.angularLocalize.anon.ParseErrors
import typingsJapgolly.angularLocalize.toolsSrcTranslateTranslationFilesMessageSerializationMessageSerializerMod.MessageSerializerConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toolsSrcTranslateTranslationFilesTranslationParsersSerializeTranslationMessageMod {
  
  @JSImport("@angular/localize/tools/src/translate/translation_files/translation_parsers/serialize_translation_message", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def serializeTranslationMessage(element: Element, config: MessageSerializerConfig): ParseErrors = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeTranslationMessage")(element.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[ParseErrors]
}
