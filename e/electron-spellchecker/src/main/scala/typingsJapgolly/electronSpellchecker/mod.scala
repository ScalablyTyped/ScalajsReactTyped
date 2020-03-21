package typingsJapgolly.electronSpellchecker

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.electron.Electron.BrowserWindow
import typingsJapgolly.electron.Electron.ContextMenuParams
import typingsJapgolly.electron.Electron.Menu
import typingsJapgolly.electron.Electron.WebviewTag_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("electron-spellchecker", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class ContextMenuBuilder () extends js.Object {
    def this(spellCheckHandler: SpellCheckHandler) = this()
    def this(spellCheckHandler: SpellCheckHandler, target: BrowserWindow) = this()
    def this(spellCheckHandler: SpellCheckHandler, target: WebviewTag_) = this()
    def this(spellCheckHandler: SpellCheckHandler, target: Null, debugMode: Boolean) = this()
    def this(spellCheckHandler: SpellCheckHandler, target: BrowserWindow, debugMode: Boolean) = this()
    def this(spellCheckHandler: SpellCheckHandler, target: WebviewTag_, debugMode: Boolean) = this()
    def this(
      spellCheckHandler: SpellCheckHandler,
      target: Null,
      debugMode: Boolean,
      processMenu: js.Function1[/* menu */ Menu, Menu]
    ) = this()
    def this(
      spellCheckHandler: SpellCheckHandler,
      target: BrowserWindow,
      debugMode: Boolean,
      processMenu: js.Function1[/* menu */ Menu, Menu]
    ) = this()
    def this(
      spellCheckHandler: SpellCheckHandler,
      target: WebviewTag_,
      debugMode: Boolean,
      processMenu: js.Function1[/* menu */ Menu, Menu]
    ) = this()
    def setAlternateStringFormatter(formatter: StringDictionary[ContextMenuFormatter]): Unit = js.native
    def showPopupMenu(info: ContextMenuParams): Unit = js.native
  }
  
  @js.native
  class ContextMenuListener protected () extends js.Object {
    def this(handler: js.Function1[/* info */ ContextMenuParams, Unit]) = this()
    def this(handler: js.Function1[/* info */ ContextMenuParams, Unit], target: BrowserWindow) = this()
    def this(handler: js.Function1[/* info */ ContextMenuParams, Unit], target: WebviewTag_) = this()
    def unsubscribe(): Unit = js.native
  }
  
  @js.native
  class SpellCheckHandler () extends js.Object {
    var currentSpellchecker: this.type = js.native
    def addToDictionary(text: String): Unit = js.native
    def attachToInput(): Unit = js.native
    def autoUnloadDictionariesOnBlur(): Unit = js.native
    def getCorrectionsForMisspelling(misspelledWord: String): js.Promise[js.Array[String]] = js.native
    def provideHintText(inputText: String): Unit = js.native
    def switchLanguage(language: String): Unit = js.native
    def unsubscribe(): Unit = js.native
  }
  
  type ContextMenuFormatter = js.Function1[/* options */ AnonWord, String]
}

