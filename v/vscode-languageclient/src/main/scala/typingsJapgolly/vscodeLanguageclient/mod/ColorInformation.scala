package typingsJapgolly.vscodeLanguageclient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ColorInformation {
  
  @JSImport("vscode-languageclient", "ColorInformation")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new ColorInformation literal.
    */
  inline def create(
    range: typingsJapgolly.vscodeLanguageserverTypes.mod.Range,
    color: typingsJapgolly.vscodeLanguageserverTypes.mod.Color
  ): typingsJapgolly.vscodeLanguageserverTypes.mod.ColorInformation = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(range.asInstanceOf[js.Any], color.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.vscodeLanguageserverTypes.mod.ColorInformation]
  
  /**
    * Checks whether the given literal conforms to the [ColorInformation](#ColorInformation) interface.
    */
  inline def is(value: Any): /* is vscode-languageserver-types.vscode-languageserver-types.ColorInformation */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")(value.asInstanceOf[js.Any]).asInstanceOf[/* is vscode-languageserver-types.vscode-languageserver-types.ColorInformation */ Boolean]
}
