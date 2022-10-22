package typingsJapgolly.yadda

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libLocalisationGermanMod extends Shortcut {
  
  @JSImport("yadda/lib/localisation/German", JSImport.Namespace)
  @js.native
  val ^ : typingsJapgolly.yadda.libLocalisationLanguageMod.^[Library] = js.native
  
  type Library = typingsJapgolly.yadda.libLocalisationEnglishMod.Library
  
  type Vocabulary = typingsJapgolly.yadda.libLocalisationEnglishMod.Vocabulary
  
  type _To = typingsJapgolly.yadda.libLocalisationLanguageMod.^[Library]
  
  /* This means you don't have to write `^`, but can instead just say `libLocalisationGermanMod.foo` */
  override def _to: typingsJapgolly.yadda.libLocalisationLanguageMod.^[Library] = ^
}
