package typingsJapgolly.typescriptServices.global.TypeScript

import typingsJapgolly.typescriptServices.anon.AllowAutomaticSemicolonInsertion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("TypeScript.ParseOptions")
@js.native
open class ParseOptions protected ()
  extends StObject
     with typingsJapgolly.typescriptServices.TypeScript.ParseOptions {
  def this(
    languageVersion: typingsJapgolly.typescriptServices.TypeScript.LanguageVersion,
    allowAutomaticSemicolonInsertion: Boolean
  ) = this()
  
  /* private */ /* CompleteClass */
  var _allowAutomaticSemicolonInsertion: Any = js.native
  
  /* private */ /* CompleteClass */
  var _languageVersion: Any = js.native
  
  /* CompleteClass */
  override def allowAutomaticSemicolonInsertion(): Boolean = js.native
  
  /* CompleteClass */
  override def languageVersion(): typingsJapgolly.typescriptServices.TypeScript.LanguageVersion = js.native
  
  /* CompleteClass */
  override def toJSON(key: Any): AllowAutomaticSemicolonInsertion = js.native
}
