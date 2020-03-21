package typingsJapgolly.yadda.mod

import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.yadda.languageMod.Vocabulary
import typingsJapgolly.yadda.languageMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yadda", "localisation")
@js.native
object localisation extends js.Object {
  @js.native
  class Language[TLibrary /* <: typingsJapgolly.yadda.languageMod.Library */] protected ()
    extends typingsJapgolly.yadda.libMod.localisation.Language[TLibrary] {
    def this(name: String, vocabulary: Vocabulary) = this()
  }
  
  @js.native
  object Chinese
    extends TopLevel[^[typingsJapgolly.yadda.chineseMod.Library]]
  
  @js.native
  object Dutch
    extends TopLevel[^[typingsJapgolly.yadda.dutchMod.Library]]
  
  @js.native
  object English
    extends TopLevel[^[typingsJapgolly.yadda.englishMod.Library]]
  
  @js.native
  object French
    extends TopLevel[^[typingsJapgolly.yadda.frenchMod.Library]]
  
  @js.native
  object German
    extends TopLevel[^[typingsJapgolly.yadda.germanMod.Library]]
  
  @js.native
  object Norwegian
    extends TopLevel[^[typingsJapgolly.yadda.norwegianMod.Library]]
  
  @js.native
  object Pirate
    extends TopLevel[^[typingsJapgolly.yadda.pirateMod.Library]]
  
  @js.native
  object Polish
    extends TopLevel[^[typingsJapgolly.yadda.polishMod.Library]]
  
  @js.native
  object Portuguese
    extends TopLevel[^[typingsJapgolly.yadda.portugueseMod.Library]]
  
  @js.native
  object Russian
    extends TopLevel[^[typingsJapgolly.yadda.russianMod.Library]]
  
  @js.native
  object Spanish
    extends TopLevel[^[typingsJapgolly.yadda.spanishMod.Library]]
  
  @js.native
  object Ukrainian
    extends TopLevel[^[typingsJapgolly.yadda.ukrainianMod.Library]]
  
  @js.native
  object default
    extends TopLevel[^[typingsJapgolly.yadda.englishMod.Library]]
  
}

