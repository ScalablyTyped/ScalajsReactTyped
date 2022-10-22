package typingsJapgolly.electronSpellchecker

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.electron.Electron.BrowserWindow
import typingsJapgolly.electron.Electron.ContextMenuParams
import typingsJapgolly.electron.Electron.Menu
import typingsJapgolly.electron.Electron.WebviewTag
import typingsJapgolly.electronSpellchecker.anon.Word
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("electron-spellchecker", "ContextMenuBuilder")
  @js.native
  open class ContextMenuBuilder () extends StObject {
    def this(spellCheckHandler: SpellCheckHandler) = this()
    def this(spellCheckHandler: Unit, target: BrowserWindow) = this()
    def this(spellCheckHandler: Unit, target: WebviewTag) = this()
    def this(spellCheckHandler: SpellCheckHandler, target: BrowserWindow) = this()
    def this(spellCheckHandler: SpellCheckHandler, target: WebviewTag) = this()
    def this(spellCheckHandler: Unit, target: Null, debugMode: Boolean) = this()
    def this(spellCheckHandler: Unit, target: Unit, debugMode: Boolean) = this()
    def this(spellCheckHandler: Unit, target: BrowserWindow, debugMode: Boolean) = this()
    def this(spellCheckHandler: Unit, target: WebviewTag, debugMode: Boolean) = this()
    def this(spellCheckHandler: SpellCheckHandler, target: Null, debugMode: Boolean) = this()
    def this(spellCheckHandler: SpellCheckHandler, target: Unit, debugMode: Boolean) = this()
    def this(spellCheckHandler: SpellCheckHandler, target: BrowserWindow, debugMode: Boolean) = this()
    def this(spellCheckHandler: SpellCheckHandler, target: WebviewTag, debugMode: Boolean) = this()
    def this(
      spellCheckHandler: Unit,
      target: Null,
      debugMode: Boolean,
      processMenu: js.Function1[/* menu */ Menu, Menu]
    ) = this()
    def this(
      spellCheckHandler: Unit,
      target: Null,
      debugMode: Unit,
      processMenu: js.Function1[/* menu */ Menu, Menu]
    ) = this()
    def this(
      spellCheckHandler: Unit,
      target: Unit,
      debugMode: Boolean,
      processMenu: js.Function1[/* menu */ Menu, Menu]
    ) = this()
    def this(
      spellCheckHandler: Unit,
      target: Unit,
      debugMode: Unit,
      processMenu: js.Function1[/* menu */ Menu, Menu]
    ) = this()
    def this(
      spellCheckHandler: Unit,
      target: BrowserWindow,
      debugMode: Boolean,
      processMenu: js.Function1[/* menu */ Menu, Menu]
    ) = this()
    def this(
      spellCheckHandler: Unit,
      target: BrowserWindow,
      debugMode: Unit,
      processMenu: js.Function1[/* menu */ Menu, Menu]
    ) = this()
    def this(
      spellCheckHandler: Unit,
      target: WebviewTag,
      debugMode: Boolean,
      processMenu: js.Function1[/* menu */ Menu, Menu]
    ) = this()
    def this(
      spellCheckHandler: Unit,
      target: WebviewTag,
      debugMode: Unit,
      processMenu: js.Function1[/* menu */ Menu, Menu]
    ) = this()
    def this(
      spellCheckHandler: SpellCheckHandler,
      target: Null,
      debugMode: Boolean,
      processMenu: js.Function1[/* menu */ Menu, Menu]
    ) = this()
    def this(
      spellCheckHandler: SpellCheckHandler,
      target: Null,
      debugMode: Unit,
      processMenu: js.Function1[/* menu */ Menu, Menu]
    ) = this()
    def this(
      spellCheckHandler: SpellCheckHandler,
      target: Unit,
      debugMode: Boolean,
      processMenu: js.Function1[/* menu */ Menu, Menu]
    ) = this()
    def this(
      spellCheckHandler: SpellCheckHandler,
      target: Unit,
      debugMode: Unit,
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
      target: BrowserWindow,
      debugMode: Unit,
      processMenu: js.Function1[/* menu */ Menu, Menu]
    ) = this()
    def this(
      spellCheckHandler: SpellCheckHandler,
      target: WebviewTag,
      debugMode: Boolean,
      processMenu: js.Function1[/* menu */ Menu, Menu]
    ) = this()
    def this(
      spellCheckHandler: SpellCheckHandler,
      target: WebviewTag,
      debugMode: Unit,
      processMenu: js.Function1[/* menu */ Menu, Menu]
    ) = this()
    
    def setAlternateStringFormatter(formatter: StringDictionary[ContextMenuFormatter]): Unit = js.native
    
    def showPopupMenu(info: ContextMenuParams): Unit = js.native
  }
  
  @JSImport("electron-spellchecker", "ContextMenuListener")
  @js.native
  open class ContextMenuListener protected () extends StObject {
    def this(handler: js.Function1[/* info */ ContextMenuParams, Unit]) = this()
    def this(handler: js.Function1[/* info */ ContextMenuParams, Unit], target: BrowserWindow) = this()
    def this(handler: js.Function1[/* info */ ContextMenuParams, Unit], target: WebviewTag) = this()
    
    def unsubscribe(): Unit = js.native
  }
  
  @JSImport("electron-spellchecker", "SpellCheckHandler")
  @js.native
  open class SpellCheckHandler () extends StObject {
    
    def addToDictionary(text: String): Unit = js.native
    
    def attachToInput(): Unit = js.native
    
    def autoUnloadDictionariesOnBlur(): Unit = js.native
    
    var currentSpellchecker: this.type = js.native
    
    def getCorrectionsForMisspelling(misspelledWord: String): js.Promise[js.Array[String]] = js.native
    
    def provideHintText(inputText: String): Unit = js.native
    
    def switchLanguage(language: String): Unit = js.native
    
    def unsubscribe(): Unit = js.native
  }
  
  type ContextMenuFormatter = js.Function1[/* options */ Word, String]
}
