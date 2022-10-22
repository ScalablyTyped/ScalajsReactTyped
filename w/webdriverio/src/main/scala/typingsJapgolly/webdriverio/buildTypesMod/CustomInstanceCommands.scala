package typingsJapgolly.webdriverio.buildTypesMod

import org.scalajs.dom.HTMLElement
import typingsJapgolly.std.Record
import typingsJapgolly.webdriverio.webdriverioStrings.$
import typingsJapgolly.webdriverio.webdriverioStrings.DollarDollar
import typingsJapgolly.webdriverio.webdriverioStrings.addValue
import typingsJapgolly.webdriverio.webdriverioStrings.call
import typingsJapgolly.webdriverio.webdriverioStrings.clearValue
import typingsJapgolly.webdriverio.webdriverioStrings.click
import typingsJapgolly.webdriverio.webdriverioStrings.custom$
import typingsJapgolly.webdriverio.webdriverioStrings.customDollarDollar
import typingsJapgolly.webdriverio.webdriverioStrings.debug
import typingsJapgolly.webdriverio.webdriverioStrings.deleteCookies
import typingsJapgolly.webdriverio.webdriverioStrings.doubleClick
import typingsJapgolly.webdriverio.webdriverioStrings.dragAndDrop
import typingsJapgolly.webdriverio.webdriverioStrings.execute
import typingsJapgolly.webdriverio.webdriverioStrings.executeAsync
import typingsJapgolly.webdriverio.webdriverioStrings.getAttribute
import typingsJapgolly.webdriverio.webdriverioStrings.getCSSProperty
import typingsJapgolly.webdriverio.webdriverioStrings.getComputedLabel
import typingsJapgolly.webdriverio.webdriverioStrings.getComputedRole
import typingsJapgolly.webdriverio.webdriverioStrings.getCookies
import typingsJapgolly.webdriverio.webdriverioStrings.getHTML
import typingsJapgolly.webdriverio.webdriverioStrings.getLocation
import typingsJapgolly.webdriverio.webdriverioStrings.getProperty
import typingsJapgolly.webdriverio.webdriverioStrings.getPuppeteer
import typingsJapgolly.webdriverio.webdriverioStrings.getSize
import typingsJapgolly.webdriverio.webdriverioStrings.getTagName
import typingsJapgolly.webdriverio.webdriverioStrings.getText
import typingsJapgolly.webdriverio.webdriverioStrings.getValue
import typingsJapgolly.webdriverio.webdriverioStrings.getWindowSize
import typingsJapgolly.webdriverio.webdriverioStrings.isClickable
import typingsJapgolly.webdriverio.webdriverioStrings.isDisplayed
import typingsJapgolly.webdriverio.webdriverioStrings.isDisplayedInViewport
import typingsJapgolly.webdriverio.webdriverioStrings.isEnabled
import typingsJapgolly.webdriverio.webdriverioStrings.isEqual
import typingsJapgolly.webdriverio.webdriverioStrings.isExisting
import typingsJapgolly.webdriverio.webdriverioStrings.isFocused
import typingsJapgolly.webdriverio.webdriverioStrings.isSelected
import typingsJapgolly.webdriverio.webdriverioStrings.keys
import typingsJapgolly.webdriverio.webdriverioStrings.mock
import typingsJapgolly.webdriverio.webdriverioStrings.mockClearAll
import typingsJapgolly.webdriverio.webdriverioStrings.mockRestoreAll
import typingsJapgolly.webdriverio.webdriverioStrings.moveTo
import typingsJapgolly.webdriverio.webdriverioStrings.newWindow
import typingsJapgolly.webdriverio.webdriverioStrings.nextElement
import typingsJapgolly.webdriverio.webdriverioStrings.parentElement
import typingsJapgolly.webdriverio.webdriverioStrings.pause
import typingsJapgolly.webdriverio.webdriverioStrings.previousElement
import typingsJapgolly.webdriverio.webdriverioStrings.react$
import typingsJapgolly.webdriverio.webdriverioStrings.reactDollarDollar
import typingsJapgolly.webdriverio.webdriverioStrings.reloadSession
import typingsJapgolly.webdriverio.webdriverioStrings.savePDF
import typingsJapgolly.webdriverio.webdriverioStrings.saveRecordingScreen
import typingsJapgolly.webdriverio.webdriverioStrings.saveScreenshot
import typingsJapgolly.webdriverio.webdriverioStrings.scrollIntoView
import typingsJapgolly.webdriverio.webdriverioStrings.selectByAttribute
import typingsJapgolly.webdriverio.webdriverioStrings.selectByIndex
import typingsJapgolly.webdriverio.webdriverioStrings.selectByVisibleText
import typingsJapgolly.webdriverio.webdriverioStrings.setCookies
import typingsJapgolly.webdriverio.webdriverioStrings.setTimeout
import typingsJapgolly.webdriverio.webdriverioStrings.setValue
import typingsJapgolly.webdriverio.webdriverioStrings.setWindowSize
import typingsJapgolly.webdriverio.webdriverioStrings.shadow$
import typingsJapgolly.webdriverio.webdriverioStrings.shadowDollarDollar
import typingsJapgolly.webdriverio.webdriverioStrings.switchWindow
import typingsJapgolly.webdriverio.webdriverioStrings.throttle
import typingsJapgolly.webdriverio.webdriverioStrings.touchAction
import typingsJapgolly.webdriverio.webdriverioStrings.uploadFile
import typingsJapgolly.webdriverio.webdriverioStrings.url
import typingsJapgolly.webdriverio.webdriverioStrings.waitForClickable
import typingsJapgolly.webdriverio.webdriverioStrings.waitForDisplayed
import typingsJapgolly.webdriverio.webdriverioStrings.waitForEnabled
import typingsJapgolly.webdriverio.webdriverioStrings.waitForExist
import typingsJapgolly.webdriverio.webdriverioStrings.waitUntil
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomInstanceCommands[T] extends StObject {
  
  /**
    * add command to `browser` or `element` scope
    */
  def addCommand[IsElement /* <: Boolean */](name: String, func: AddCommandFn): Unit = js.native
  def addCommand[IsElement /* <: Boolean */](name: String, func: AddCommandFnScoped[T, IsElement]): Unit = js.native
  def addCommand[IsElement /* <: Boolean */](name: String, func: AddCommandFnScoped[T, IsElement], attachToElement: IsElement): Unit = js.native
  def addCommand[IsElement /* <: Boolean */](
    name: String,
    func: AddCommandFnScoped[T, IsElement],
    attachToElement: IsElement,
    proto: Unit,
    instances: Record[
      String, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.Browser */ Any
    ]
  ): Unit = js.native
  def addCommand[IsElement /* <: Boolean */](
    name: String,
    func: AddCommandFnScoped[T, IsElement],
    attachToElement: IsElement,
    proto: Record[String, Any]
  ): Unit = js.native
  def addCommand[IsElement /* <: Boolean */](
    name: String,
    func: AddCommandFnScoped[T, IsElement],
    attachToElement: IsElement,
    proto: Record[String, Any],
    instances: Record[
      String, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.Browser */ Any
    ]
  ): Unit = js.native
  def addCommand[IsElement /* <: Boolean */](
    name: String,
    func: AddCommandFnScoped[T, IsElement],
    attachToElement: Unit,
    proto: Unit,
    instances: Record[
      String, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.Browser */ Any
    ]
  ): Unit = js.native
  def addCommand[IsElement /* <: Boolean */](
    name: String,
    func: AddCommandFnScoped[T, IsElement],
    attachToElement: Unit,
    proto: Record[String, Any]
  ): Unit = js.native
  def addCommand[IsElement /* <: Boolean */](
    name: String,
    func: AddCommandFnScoped[T, IsElement],
    attachToElement: Unit,
    proto: Record[String, Any],
    instances: Record[
      String, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.Browser */ Any
    ]
  ): Unit = js.native
  def addCommand[IsElement /* <: Boolean */](name: String, func: AddCommandFn, attachToElement: IsElement): Unit = js.native
  def addCommand[IsElement /* <: Boolean */](
    name: String,
    func: AddCommandFn,
    attachToElement: IsElement,
    proto: Unit,
    instances: Record[
      String, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.Browser */ Any
    ]
  ): Unit = js.native
  def addCommand[IsElement /* <: Boolean */](name: String, func: AddCommandFn, attachToElement: IsElement, proto: Record[String, Any]): Unit = js.native
  def addCommand[IsElement /* <: Boolean */](
    name: String,
    func: AddCommandFn,
    attachToElement: IsElement,
    proto: Record[String, Any],
    instances: Record[
      String, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.Browser */ Any
    ]
  ): Unit = js.native
  def addCommand[IsElement /* <: Boolean */](
    name: String,
    func: AddCommandFn,
    attachToElement: Unit,
    proto: Unit,
    instances: Record[
      String, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.Browser */ Any
    ]
  ): Unit = js.native
  def addCommand[IsElement /* <: Boolean */](name: String, func: AddCommandFn, attachToElement: Unit, proto: Record[String, Any]): Unit = js.native
  def addCommand[IsElement /* <: Boolean */](
    name: String,
    func: AddCommandFn,
    attachToElement: Unit,
    proto: Record[String, Any],
    instances: Record[
      String, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.Browser */ Any
    ]
  ): Unit = js.native
  
  def addLocatorStrategy(name: String, func: js.Function1[/* selector */ String, CustomLocatorReturnValue]): Unit = js.native
  /**
    * create custom selector
    */
  def addLocatorStrategy(
    name: String,
    func: js.Function2[/* selector */ String, /* root */ HTMLElement, CustomLocatorReturnValue]
  ): Unit = js.native
  
  /**
    * overwrite `browser` or `element` command
    */
  @JSName("overwriteCommand")
  def overwriteCommand_true[ElementKey /* <: /* keyof webdriverio.webdriverio/build/types.$ElementCommands */ DollarDollar | $ | addValue | clearValue | click | custom$ | customDollarDollar | doubleClick | dragAndDrop | getAttribute | getCSSProperty | getComputedRole | getComputedLabel | getHTML | getLocation | getProperty | getSize | getTagName | getText | getValue | isClickable | isDisplayed | isDisplayedInViewport | isEnabled | isEqual | isExisting | isFocused | isSelected | moveTo | nextElement | parentElement | previousElement | react$ | reactDollarDollar | saveScreenshot | scrollIntoView | selectByAttribute | selectByIndex | selectByVisibleText | setValue | shadow$ | shadowDollarDollar | touchAction | waitForClickable | waitForDisplayed | waitForEnabled | waitForExist | waitUntil */, BrowserKey /* <: /* keyof webdriverio.webdriverio/build/types.$BrowserCommands */ DollarDollar | $ | call | customDollarDollar | custom$ | debug | deleteCookies | execute | executeAsync | getCookies | getPuppeteer | getWindowSize | keys | mock | mockClearAll | mockRestoreAll | newWindow | pause | reactDollarDollar | react$ | reloadSession | savePDF | saveRecordingScreen | saveScreenshot | setCookies | setTimeout | setWindowSize | switchWindow | throttle | touchAction | uploadFile | url | waitUntil */, IsElement /* <: Boolean */](
    name: /* import warning: importer.ImportType#apply Failed type conversion: IsElement extends true ? ElementKey : BrowserKey */ js.Any,
    func: OverwriteCommandFn[ElementKey, BrowserKey, IsElement]
  ): Unit = js.native
  @JSName("overwriteCommand")
  def overwriteCommand_true[ElementKey /* <: /* keyof webdriverio.webdriverio/build/types.$ElementCommands */ DollarDollar | $ | addValue | clearValue | click | custom$ | customDollarDollar | doubleClick | dragAndDrop | getAttribute | getCSSProperty | getComputedRole | getComputedLabel | getHTML | getLocation | getProperty | getSize | getTagName | getText | getValue | isClickable | isDisplayed | isDisplayedInViewport | isEnabled | isEqual | isExisting | isFocused | isSelected | moveTo | nextElement | parentElement | previousElement | react$ | reactDollarDollar | saveScreenshot | scrollIntoView | selectByAttribute | selectByIndex | selectByVisibleText | setValue | shadow$ | shadowDollarDollar | touchAction | waitForClickable | waitForDisplayed | waitForEnabled | waitForExist | waitUntil */, BrowserKey /* <: /* keyof webdriverio.webdriverio/build/types.$BrowserCommands */ DollarDollar | $ | call | customDollarDollar | custom$ | debug | deleteCookies | execute | executeAsync | getCookies | getPuppeteer | getWindowSize | keys | mock | mockClearAll | mockRestoreAll | newWindow | pause | reactDollarDollar | react$ | reloadSession | savePDF | saveRecordingScreen | saveScreenshot | setCookies | setTimeout | setWindowSize | switchWindow | throttle | touchAction | uploadFile | url | waitUntil */, IsElement /* <: Boolean */](
    name: /* import warning: importer.ImportType#apply Failed type conversion: IsElement extends true ? ElementKey : BrowserKey */ js.Any,
    func: OverwriteCommandFnScoped[ElementKey, BrowserKey, IsElement]
  ): Unit = js.native
  @JSName("overwriteCommand")
  def overwriteCommand_true[ElementKey /* <: /* keyof webdriverio.webdriverio/build/types.$ElementCommands */ DollarDollar | $ | addValue | clearValue | click | custom$ | customDollarDollar | doubleClick | dragAndDrop | getAttribute | getCSSProperty | getComputedRole | getComputedLabel | getHTML | getLocation | getProperty | getSize | getTagName | getText | getValue | isClickable | isDisplayed | isDisplayedInViewport | isEnabled | isEqual | isExisting | isFocused | isSelected | moveTo | nextElement | parentElement | previousElement | react$ | reactDollarDollar | saveScreenshot | scrollIntoView | selectByAttribute | selectByIndex | selectByVisibleText | setValue | shadow$ | shadowDollarDollar | touchAction | waitForClickable | waitForDisplayed | waitForEnabled | waitForExist | waitUntil */, BrowserKey /* <: /* keyof webdriverio.webdriverio/build/types.$BrowserCommands */ DollarDollar | $ | call | customDollarDollar | custom$ | debug | deleteCookies | execute | executeAsync | getCookies | getPuppeteer | getWindowSize | keys | mock | mockClearAll | mockRestoreAll | newWindow | pause | reactDollarDollar | react$ | reloadSession | savePDF | saveRecordingScreen | saveScreenshot | setCookies | setTimeout | setWindowSize | switchWindow | throttle | touchAction | uploadFile | url | waitUntil */, IsElement /* <: Boolean */](
    name: /* import warning: importer.ImportType#apply Failed type conversion: IsElement extends true ? ElementKey : BrowserKey */ js.Any,
    func: OverwriteCommandFnScoped[ElementKey, BrowserKey, IsElement],
    attachToElement: IsElement
  ): Unit = js.native
  @JSName("overwriteCommand")
  def overwriteCommand_true[ElementKey /* <: /* keyof webdriverio.webdriverio/build/types.$ElementCommands */ DollarDollar | $ | addValue | clearValue | click | custom$ | customDollarDollar | doubleClick | dragAndDrop | getAttribute | getCSSProperty | getComputedRole | getComputedLabel | getHTML | getLocation | getProperty | getSize | getTagName | getText | getValue | isClickable | isDisplayed | isDisplayedInViewport | isEnabled | isEqual | isExisting | isFocused | isSelected | moveTo | nextElement | parentElement | previousElement | react$ | reactDollarDollar | saveScreenshot | scrollIntoView | selectByAttribute | selectByIndex | selectByVisibleText | setValue | shadow$ | shadowDollarDollar | touchAction | waitForClickable | waitForDisplayed | waitForEnabled | waitForExist | waitUntil */, BrowserKey /* <: /* keyof webdriverio.webdriverio/build/types.$BrowserCommands */ DollarDollar | $ | call | customDollarDollar | custom$ | debug | deleteCookies | execute | executeAsync | getCookies | getPuppeteer | getWindowSize | keys | mock | mockClearAll | mockRestoreAll | newWindow | pause | reactDollarDollar | react$ | reloadSession | savePDF | saveRecordingScreen | saveScreenshot | setCookies | setTimeout | setWindowSize | switchWindow | throttle | touchAction | uploadFile | url | waitUntil */, IsElement /* <: Boolean */](
    name: /* import warning: importer.ImportType#apply Failed type conversion: IsElement extends true ? ElementKey : BrowserKey */ js.Any,
    func: OverwriteCommandFnScoped[ElementKey, BrowserKey, IsElement],
    attachToElement: IsElement,
    proto: Unit,
    instances: Record[
      String, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.Browser */ Any
    ]
  ): Unit = js.native
  @JSName("overwriteCommand")
  def overwriteCommand_true[ElementKey /* <: /* keyof webdriverio.webdriverio/build/types.$ElementCommands */ DollarDollar | $ | addValue | clearValue | click | custom$ | customDollarDollar | doubleClick | dragAndDrop | getAttribute | getCSSProperty | getComputedRole | getComputedLabel | getHTML | getLocation | getProperty | getSize | getTagName | getText | getValue | isClickable | isDisplayed | isDisplayedInViewport | isEnabled | isEqual | isExisting | isFocused | isSelected | moveTo | nextElement | parentElement | previousElement | react$ | reactDollarDollar | saveScreenshot | scrollIntoView | selectByAttribute | selectByIndex | selectByVisibleText | setValue | shadow$ | shadowDollarDollar | touchAction | waitForClickable | waitForDisplayed | waitForEnabled | waitForExist | waitUntil */, BrowserKey /* <: /* keyof webdriverio.webdriverio/build/types.$BrowserCommands */ DollarDollar | $ | call | customDollarDollar | custom$ | debug | deleteCookies | execute | executeAsync | getCookies | getPuppeteer | getWindowSize | keys | mock | mockClearAll | mockRestoreAll | newWindow | pause | reactDollarDollar | react$ | reloadSession | savePDF | saveRecordingScreen | saveScreenshot | setCookies | setTimeout | setWindowSize | switchWindow | throttle | touchAction | uploadFile | url | waitUntil */, IsElement /* <: Boolean */](
    name: /* import warning: importer.ImportType#apply Failed type conversion: IsElement extends true ? ElementKey : BrowserKey */ js.Any,
    func: OverwriteCommandFnScoped[ElementKey, BrowserKey, IsElement],
    attachToElement: IsElement,
    proto: Record[String, Any]
  ): Unit = js.native
  @JSName("overwriteCommand")
  def overwriteCommand_true[ElementKey /* <: /* keyof webdriverio.webdriverio/build/types.$ElementCommands */ DollarDollar | $ | addValue | clearValue | click | custom$ | customDollarDollar | doubleClick | dragAndDrop | getAttribute | getCSSProperty | getComputedRole | getComputedLabel | getHTML | getLocation | getProperty | getSize | getTagName | getText | getValue | isClickable | isDisplayed | isDisplayedInViewport | isEnabled | isEqual | isExisting | isFocused | isSelected | moveTo | nextElement | parentElement | previousElement | react$ | reactDollarDollar | saveScreenshot | scrollIntoView | selectByAttribute | selectByIndex | selectByVisibleText | setValue | shadow$ | shadowDollarDollar | touchAction | waitForClickable | waitForDisplayed | waitForEnabled | waitForExist | waitUntil */, BrowserKey /* <: /* keyof webdriverio.webdriverio/build/types.$BrowserCommands */ DollarDollar | $ | call | customDollarDollar | custom$ | debug | deleteCookies | execute | executeAsync | getCookies | getPuppeteer | getWindowSize | keys | mock | mockClearAll | mockRestoreAll | newWindow | pause | reactDollarDollar | react$ | reloadSession | savePDF | saveRecordingScreen | saveScreenshot | setCookies | setTimeout | setWindowSize | switchWindow | throttle | touchAction | uploadFile | url | waitUntil */, IsElement /* <: Boolean */](
    name: /* import warning: importer.ImportType#apply Failed type conversion: IsElement extends true ? ElementKey : BrowserKey */ js.Any,
    func: OverwriteCommandFnScoped[ElementKey, BrowserKey, IsElement],
    attachToElement: IsElement,
    proto: Record[String, Any],
    instances: Record[
      String, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.Browser */ Any
    ]
  ): Unit = js.native
  @JSName("overwriteCommand")
  def overwriteCommand_true[ElementKey /* <: /* keyof webdriverio.webdriverio/build/types.$ElementCommands */ DollarDollar | $ | addValue | clearValue | click | custom$ | customDollarDollar | doubleClick | dragAndDrop | getAttribute | getCSSProperty | getComputedRole | getComputedLabel | getHTML | getLocation | getProperty | getSize | getTagName | getText | getValue | isClickable | isDisplayed | isDisplayedInViewport | isEnabled | isEqual | isExisting | isFocused | isSelected | moveTo | nextElement | parentElement | previousElement | react$ | reactDollarDollar | saveScreenshot | scrollIntoView | selectByAttribute | selectByIndex | selectByVisibleText | setValue | shadow$ | shadowDollarDollar | touchAction | waitForClickable | waitForDisplayed | waitForEnabled | waitForExist | waitUntil */, BrowserKey /* <: /* keyof webdriverio.webdriverio/build/types.$BrowserCommands */ DollarDollar | $ | call | customDollarDollar | custom$ | debug | deleteCookies | execute | executeAsync | getCookies | getPuppeteer | getWindowSize | keys | mock | mockClearAll | mockRestoreAll | newWindow | pause | reactDollarDollar | react$ | reloadSession | savePDF | saveRecordingScreen | saveScreenshot | setCookies | setTimeout | setWindowSize | switchWindow | throttle | touchAction | uploadFile | url | waitUntil */, IsElement /* <: Boolean */](
    name: /* import warning: importer.ImportType#apply Failed type conversion: IsElement extends true ? ElementKey : BrowserKey */ js.Any,
    func: OverwriteCommandFnScoped[ElementKey, BrowserKey, IsElement],
    attachToElement: Unit,
    proto: Unit,
    instances: Record[
      String, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.Browser */ Any
    ]
  ): Unit = js.native
  @JSName("overwriteCommand")
  def overwriteCommand_true[ElementKey /* <: /* keyof webdriverio.webdriverio/build/types.$ElementCommands */ DollarDollar | $ | addValue | clearValue | click | custom$ | customDollarDollar | doubleClick | dragAndDrop | getAttribute | getCSSProperty | getComputedRole | getComputedLabel | getHTML | getLocation | getProperty | getSize | getTagName | getText | getValue | isClickable | isDisplayed | isDisplayedInViewport | isEnabled | isEqual | isExisting | isFocused | isSelected | moveTo | nextElement | parentElement | previousElement | react$ | reactDollarDollar | saveScreenshot | scrollIntoView | selectByAttribute | selectByIndex | selectByVisibleText | setValue | shadow$ | shadowDollarDollar | touchAction | waitForClickable | waitForDisplayed | waitForEnabled | waitForExist | waitUntil */, BrowserKey /* <: /* keyof webdriverio.webdriverio/build/types.$BrowserCommands */ DollarDollar | $ | call | customDollarDollar | custom$ | debug | deleteCookies | execute | executeAsync | getCookies | getPuppeteer | getWindowSize | keys | mock | mockClearAll | mockRestoreAll | newWindow | pause | reactDollarDollar | react$ | reloadSession | savePDF | saveRecordingScreen | saveScreenshot | setCookies | setTimeout | setWindowSize | switchWindow | throttle | touchAction | uploadFile | url | waitUntil */, IsElement /* <: Boolean */](
    name: /* import warning: importer.ImportType#apply Failed type conversion: IsElement extends true ? ElementKey : BrowserKey */ js.Any,
    func: OverwriteCommandFnScoped[ElementKey, BrowserKey, IsElement],
    attachToElement: Unit,
    proto: Record[String, Any]
  ): Unit = js.native
  @JSName("overwriteCommand")
  def overwriteCommand_true[ElementKey /* <: /* keyof webdriverio.webdriverio/build/types.$ElementCommands */ DollarDollar | $ | addValue | clearValue | click | custom$ | customDollarDollar | doubleClick | dragAndDrop | getAttribute | getCSSProperty | getComputedRole | getComputedLabel | getHTML | getLocation | getProperty | getSize | getTagName | getText | getValue | isClickable | isDisplayed | isDisplayedInViewport | isEnabled | isEqual | isExisting | isFocused | isSelected | moveTo | nextElement | parentElement | previousElement | react$ | reactDollarDollar | saveScreenshot | scrollIntoView | selectByAttribute | selectByIndex | selectByVisibleText | setValue | shadow$ | shadowDollarDollar | touchAction | waitForClickable | waitForDisplayed | waitForEnabled | waitForExist | waitUntil */, BrowserKey /* <: /* keyof webdriverio.webdriverio/build/types.$BrowserCommands */ DollarDollar | $ | call | customDollarDollar | custom$ | debug | deleteCookies | execute | executeAsync | getCookies | getPuppeteer | getWindowSize | keys | mock | mockClearAll | mockRestoreAll | newWindow | pause | reactDollarDollar | react$ | reloadSession | savePDF | saveRecordingScreen | saveScreenshot | setCookies | setTimeout | setWindowSize | switchWindow | throttle | touchAction | uploadFile | url | waitUntil */, IsElement /* <: Boolean */](
    name: /* import warning: importer.ImportType#apply Failed type conversion: IsElement extends true ? ElementKey : BrowserKey */ js.Any,
    func: OverwriteCommandFnScoped[ElementKey, BrowserKey, IsElement],
    attachToElement: Unit,
    proto: Record[String, Any],
    instances: Record[
      String, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.Browser */ Any
    ]
  ): Unit = js.native
  @JSName("overwriteCommand")
  def overwriteCommand_true[ElementKey /* <: /* keyof webdriverio.webdriverio/build/types.$ElementCommands */ DollarDollar | $ | addValue | clearValue | click | custom$ | customDollarDollar | doubleClick | dragAndDrop | getAttribute | getCSSProperty | getComputedRole | getComputedLabel | getHTML | getLocation | getProperty | getSize | getTagName | getText | getValue | isClickable | isDisplayed | isDisplayedInViewport | isEnabled | isEqual | isExisting | isFocused | isSelected | moveTo | nextElement | parentElement | previousElement | react$ | reactDollarDollar | saveScreenshot | scrollIntoView | selectByAttribute | selectByIndex | selectByVisibleText | setValue | shadow$ | shadowDollarDollar | touchAction | waitForClickable | waitForDisplayed | waitForEnabled | waitForExist | waitUntil */, BrowserKey /* <: /* keyof webdriverio.webdriverio/build/types.$BrowserCommands */ DollarDollar | $ | call | customDollarDollar | custom$ | debug | deleteCookies | execute | executeAsync | getCookies | getPuppeteer | getWindowSize | keys | mock | mockClearAll | mockRestoreAll | newWindow | pause | reactDollarDollar | react$ | reloadSession | savePDF | saveRecordingScreen | saveScreenshot | setCookies | setTimeout | setWindowSize | switchWindow | throttle | touchAction | uploadFile | url | waitUntil */, IsElement /* <: Boolean */](
    name: /* import warning: importer.ImportType#apply Failed type conversion: IsElement extends true ? ElementKey : BrowserKey */ js.Any,
    func: OverwriteCommandFn[ElementKey, BrowserKey, IsElement],
    attachToElement: IsElement
  ): Unit = js.native
  @JSName("overwriteCommand")
  def overwriteCommand_true[ElementKey /* <: /* keyof webdriverio.webdriverio/build/types.$ElementCommands */ DollarDollar | $ | addValue | clearValue | click | custom$ | customDollarDollar | doubleClick | dragAndDrop | getAttribute | getCSSProperty | getComputedRole | getComputedLabel | getHTML | getLocation | getProperty | getSize | getTagName | getText | getValue | isClickable | isDisplayed | isDisplayedInViewport | isEnabled | isEqual | isExisting | isFocused | isSelected | moveTo | nextElement | parentElement | previousElement | react$ | reactDollarDollar | saveScreenshot | scrollIntoView | selectByAttribute | selectByIndex | selectByVisibleText | setValue | shadow$ | shadowDollarDollar | touchAction | waitForClickable | waitForDisplayed | waitForEnabled | waitForExist | waitUntil */, BrowserKey /* <: /* keyof webdriverio.webdriverio/build/types.$BrowserCommands */ DollarDollar | $ | call | customDollarDollar | custom$ | debug | deleteCookies | execute | executeAsync | getCookies | getPuppeteer | getWindowSize | keys | mock | mockClearAll | mockRestoreAll | newWindow | pause | reactDollarDollar | react$ | reloadSession | savePDF | saveRecordingScreen | saveScreenshot | setCookies | setTimeout | setWindowSize | switchWindow | throttle | touchAction | uploadFile | url | waitUntil */, IsElement /* <: Boolean */](
    name: /* import warning: importer.ImportType#apply Failed type conversion: IsElement extends true ? ElementKey : BrowserKey */ js.Any,
    func: OverwriteCommandFn[ElementKey, BrowserKey, IsElement],
    attachToElement: IsElement,
    proto: Unit,
    instances: Record[
      String, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.Browser */ Any
    ]
  ): Unit = js.native
  @JSName("overwriteCommand")
  def overwriteCommand_true[ElementKey /* <: /* keyof webdriverio.webdriverio/build/types.$ElementCommands */ DollarDollar | $ | addValue | clearValue | click | custom$ | customDollarDollar | doubleClick | dragAndDrop | getAttribute | getCSSProperty | getComputedRole | getComputedLabel | getHTML | getLocation | getProperty | getSize | getTagName | getText | getValue | isClickable | isDisplayed | isDisplayedInViewport | isEnabled | isEqual | isExisting | isFocused | isSelected | moveTo | nextElement | parentElement | previousElement | react$ | reactDollarDollar | saveScreenshot | scrollIntoView | selectByAttribute | selectByIndex | selectByVisibleText | setValue | shadow$ | shadowDollarDollar | touchAction | waitForClickable | waitForDisplayed | waitForEnabled | waitForExist | waitUntil */, BrowserKey /* <: /* keyof webdriverio.webdriverio/build/types.$BrowserCommands */ DollarDollar | $ | call | customDollarDollar | custom$ | debug | deleteCookies | execute | executeAsync | getCookies | getPuppeteer | getWindowSize | keys | mock | mockClearAll | mockRestoreAll | newWindow | pause | reactDollarDollar | react$ | reloadSession | savePDF | saveRecordingScreen | saveScreenshot | setCookies | setTimeout | setWindowSize | switchWindow | throttle | touchAction | uploadFile | url | waitUntil */, IsElement /* <: Boolean */](
    name: /* import warning: importer.ImportType#apply Failed type conversion: IsElement extends true ? ElementKey : BrowserKey */ js.Any,
    func: OverwriteCommandFn[ElementKey, BrowserKey, IsElement],
    attachToElement: IsElement,
    proto: Record[String, Any]
  ): Unit = js.native
  @JSName("overwriteCommand")
  def overwriteCommand_true[ElementKey /* <: /* keyof webdriverio.webdriverio/build/types.$ElementCommands */ DollarDollar | $ | addValue | clearValue | click | custom$ | customDollarDollar | doubleClick | dragAndDrop | getAttribute | getCSSProperty | getComputedRole | getComputedLabel | getHTML | getLocation | getProperty | getSize | getTagName | getText | getValue | isClickable | isDisplayed | isDisplayedInViewport | isEnabled | isEqual | isExisting | isFocused | isSelected | moveTo | nextElement | parentElement | previousElement | react$ | reactDollarDollar | saveScreenshot | scrollIntoView | selectByAttribute | selectByIndex | selectByVisibleText | setValue | shadow$ | shadowDollarDollar | touchAction | waitForClickable | waitForDisplayed | waitForEnabled | waitForExist | waitUntil */, BrowserKey /* <: /* keyof webdriverio.webdriverio/build/types.$BrowserCommands */ DollarDollar | $ | call | customDollarDollar | custom$ | debug | deleteCookies | execute | executeAsync | getCookies | getPuppeteer | getWindowSize | keys | mock | mockClearAll | mockRestoreAll | newWindow | pause | reactDollarDollar | react$ | reloadSession | savePDF | saveRecordingScreen | saveScreenshot | setCookies | setTimeout | setWindowSize | switchWindow | throttle | touchAction | uploadFile | url | waitUntil */, IsElement /* <: Boolean */](
    name: /* import warning: importer.ImportType#apply Failed type conversion: IsElement extends true ? ElementKey : BrowserKey */ js.Any,
    func: OverwriteCommandFn[ElementKey, BrowserKey, IsElement],
    attachToElement: IsElement,
    proto: Record[String, Any],
    instances: Record[
      String, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.Browser */ Any
    ]
  ): Unit = js.native
  @JSName("overwriteCommand")
  def overwriteCommand_true[ElementKey /* <: /* keyof webdriverio.webdriverio/build/types.$ElementCommands */ DollarDollar | $ | addValue | clearValue | click | custom$ | customDollarDollar | doubleClick | dragAndDrop | getAttribute | getCSSProperty | getComputedRole | getComputedLabel | getHTML | getLocation | getProperty | getSize | getTagName | getText | getValue | isClickable | isDisplayed | isDisplayedInViewport | isEnabled | isEqual | isExisting | isFocused | isSelected | moveTo | nextElement | parentElement | previousElement | react$ | reactDollarDollar | saveScreenshot | scrollIntoView | selectByAttribute | selectByIndex | selectByVisibleText | setValue | shadow$ | shadowDollarDollar | touchAction | waitForClickable | waitForDisplayed | waitForEnabled | waitForExist | waitUntil */, BrowserKey /* <: /* keyof webdriverio.webdriverio/build/types.$BrowserCommands */ DollarDollar | $ | call | customDollarDollar | custom$ | debug | deleteCookies | execute | executeAsync | getCookies | getPuppeteer | getWindowSize | keys | mock | mockClearAll | mockRestoreAll | newWindow | pause | reactDollarDollar | react$ | reloadSession | savePDF | saveRecordingScreen | saveScreenshot | setCookies | setTimeout | setWindowSize | switchWindow | throttle | touchAction | uploadFile | url | waitUntil */, IsElement /* <: Boolean */](
    name: /* import warning: importer.ImportType#apply Failed type conversion: IsElement extends true ? ElementKey : BrowserKey */ js.Any,
    func: OverwriteCommandFn[ElementKey, BrowserKey, IsElement],
    attachToElement: Unit,
    proto: Unit,
    instances: Record[
      String, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.Browser */ Any
    ]
  ): Unit = js.native
  @JSName("overwriteCommand")
  def overwriteCommand_true[ElementKey /* <: /* keyof webdriverio.webdriverio/build/types.$ElementCommands */ DollarDollar | $ | addValue | clearValue | click | custom$ | customDollarDollar | doubleClick | dragAndDrop | getAttribute | getCSSProperty | getComputedRole | getComputedLabel | getHTML | getLocation | getProperty | getSize | getTagName | getText | getValue | isClickable | isDisplayed | isDisplayedInViewport | isEnabled | isEqual | isExisting | isFocused | isSelected | moveTo | nextElement | parentElement | previousElement | react$ | reactDollarDollar | saveScreenshot | scrollIntoView | selectByAttribute | selectByIndex | selectByVisibleText | setValue | shadow$ | shadowDollarDollar | touchAction | waitForClickable | waitForDisplayed | waitForEnabled | waitForExist | waitUntil */, BrowserKey /* <: /* keyof webdriverio.webdriverio/build/types.$BrowserCommands */ DollarDollar | $ | call | customDollarDollar | custom$ | debug | deleteCookies | execute | executeAsync | getCookies | getPuppeteer | getWindowSize | keys | mock | mockClearAll | mockRestoreAll | newWindow | pause | reactDollarDollar | react$ | reloadSession | savePDF | saveRecordingScreen | saveScreenshot | setCookies | setTimeout | setWindowSize | switchWindow | throttle | touchAction | uploadFile | url | waitUntil */, IsElement /* <: Boolean */](
    name: /* import warning: importer.ImportType#apply Failed type conversion: IsElement extends true ? ElementKey : BrowserKey */ js.Any,
    func: OverwriteCommandFn[ElementKey, BrowserKey, IsElement],
    attachToElement: Unit,
    proto: Record[String, Any]
  ): Unit = js.native
  @JSName("overwriteCommand")
  def overwriteCommand_true[ElementKey /* <: /* keyof webdriverio.webdriverio/build/types.$ElementCommands */ DollarDollar | $ | addValue | clearValue | click | custom$ | customDollarDollar | doubleClick | dragAndDrop | getAttribute | getCSSProperty | getComputedRole | getComputedLabel | getHTML | getLocation | getProperty | getSize | getTagName | getText | getValue | isClickable | isDisplayed | isDisplayedInViewport | isEnabled | isEqual | isExisting | isFocused | isSelected | moveTo | nextElement | parentElement | previousElement | react$ | reactDollarDollar | saveScreenshot | scrollIntoView | selectByAttribute | selectByIndex | selectByVisibleText | setValue | shadow$ | shadowDollarDollar | touchAction | waitForClickable | waitForDisplayed | waitForEnabled | waitForExist | waitUntil */, BrowserKey /* <: /* keyof webdriverio.webdriverio/build/types.$BrowserCommands */ DollarDollar | $ | call | customDollarDollar | custom$ | debug | deleteCookies | execute | executeAsync | getCookies | getPuppeteer | getWindowSize | keys | mock | mockClearAll | mockRestoreAll | newWindow | pause | reactDollarDollar | react$ | reloadSession | savePDF | saveRecordingScreen | saveScreenshot | setCookies | setTimeout | setWindowSize | switchWindow | throttle | touchAction | uploadFile | url | waitUntil */, IsElement /* <: Boolean */](
    name: /* import warning: importer.ImportType#apply Failed type conversion: IsElement extends true ? ElementKey : BrowserKey */ js.Any,
    func: OverwriteCommandFn[ElementKey, BrowserKey, IsElement],
    attachToElement: Unit,
    proto: Record[String, Any],
    instances: Record[
      String, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebdriverIO.Browser */ Any
    ]
  ): Unit = js.native
}
