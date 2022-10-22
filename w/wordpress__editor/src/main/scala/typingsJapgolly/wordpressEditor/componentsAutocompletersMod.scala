package typingsJapgolly.wordpressEditor

import typingsJapgolly.wordpressBlockEditor.mod.EditorInserterItem
import typingsJapgolly.wordpressComponents.autocompleteMod.Autocomplete.Completer
import typingsJapgolly.wordpressCoreData.schemaMod.Schema.User
import typingsJapgolly.wordpressEditor.wordpressEditorStrings.view
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsAutocompletersMod {
  
  @JSImport("@wordpress/editor/components/autocompleters", "blockAutocompleter")
  @js.native
  val blockAutocompleter: Completer[EditorInserterItem] = js.native
  
  @JSImport("@wordpress/editor/components/autocompleters", "userAutocompleter")
  @js.native
  val userAutocompleter: Completer[User[view]] = js.native
}
