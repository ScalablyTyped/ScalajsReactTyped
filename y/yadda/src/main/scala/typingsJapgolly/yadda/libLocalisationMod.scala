package typingsJapgolly.yadda

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.yadda.libLocalisationEnglishMod.Library
import typingsJapgolly.yadda.libLocalisationLanguageMod.Vocabulary
import typingsJapgolly.yadda.libLocalisationLanguageMod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libLocalisationMod {
  
  object default extends Shortcut {
    
    @JSImport("yadda/lib/localisation", JSImport.Default)
    @js.native
    val ^ : typingsJapgolly.yadda.libLocalisationLanguageMod.^[Library] = js.native
    
    type _To = typingsJapgolly.yadda.libLocalisationLanguageMod.^[Library]
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: typingsJapgolly.yadda.libLocalisationLanguageMod.^[Library] = ^
  }
  
  @JSImport("yadda/lib/localisation", "Chinese")
  @js.native
  val Chinese: ^[typingsJapgolly.yadda.libLocalisationChineseMod.Library] = js.native
  
  @JSImport("yadda/lib/localisation", "Dutch")
  @js.native
  val Dutch: ^[typingsJapgolly.yadda.libLocalisationDutchMod.Library] = js.native
  
  @JSImport("yadda/lib/localisation", "English")
  @js.native
  val English: ^[Library] = js.native
  
  @JSImport("yadda/lib/localisation", "French")
  @js.native
  val French: ^[typingsJapgolly.yadda.libLocalisationFrenchMod.Library] = js.native
  
  @JSImport("yadda/lib/localisation", "German")
  @js.native
  val German: ^[typingsJapgolly.yadda.libLocalisationGermanMod.Library] = js.native
  
  @JSImport("yadda/lib/localisation", "Language")
  @js.native
  open class Language[TLibrary /* <: typingsJapgolly.yadda.libLocalisationLanguageMod.Library */] protected () extends ^[TLibrary] {
    def this(name: String, vocabulary: Vocabulary) = this()
  }
  
  @JSImport("yadda/lib/localisation", "Norwegian")
  @js.native
  val Norwegian: ^[typingsJapgolly.yadda.libLocalisationNorwegianMod.Library] = js.native
  
  @JSImport("yadda/lib/localisation", "Pirate")
  @js.native
  val Pirate: ^[typingsJapgolly.yadda.libLocalisationPirateMod.Library] = js.native
  
  @JSImport("yadda/lib/localisation", "Polish")
  @js.native
  val Polish: ^[typingsJapgolly.yadda.libLocalisationPolishMod.Library] = js.native
  
  @JSImport("yadda/lib/localisation", "Portuguese")
  @js.native
  val Portuguese: ^[typingsJapgolly.yadda.libLocalisationPortugueseMod.Library] = js.native
  
  @JSImport("yadda/lib/localisation", "Russian")
  @js.native
  val Russian: ^[typingsJapgolly.yadda.libLocalisationRussianMod.Library] = js.native
  
  @JSImport("yadda/lib/localisation", "Spanish")
  @js.native
  val Spanish: ^[typingsJapgolly.yadda.libLocalisationSpanishMod.Library] = js.native
  
  @JSImport("yadda/lib/localisation", "Ukrainian")
  @js.native
  val Ukrainian: ^[typingsJapgolly.yadda.libLocalisationUkrainianMod.Library] = js.native
}
