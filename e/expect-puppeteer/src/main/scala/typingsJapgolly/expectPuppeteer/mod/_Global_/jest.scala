package typingsJapgolly.expectPuppeteer.mod._Global_

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Element
import typingsJapgolly.expectPuppeteer.mod.ExpectTimingActions
import typingsJapgolly.expectPuppeteer.mod.ExpectToClickOptions
import typingsJapgolly.puppeteer.mod.Dialog
import typingsJapgolly.puppeteer.mod.ElementHandle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("jest")
@js.native
object jest extends js.Object {
  // tslint:disable-next-line no-empty-interface
  @js.native
  trait Matchers[R, T] extends js.Object {
    // These must all match the ExpectPuppeteer interface above.
    // We can't extend from it directly because some method names conflict in type-incompatible ways.
    def toClick(selector: String): js.Promise[Unit] = js.native
    def toClick(selector: String, options: ExpectToClickOptions): js.Promise[Unit] = js.native
    def toDisplayDialog(block: js.Function0[js.Promise[Unit]]): js.Promise[Dialog] = js.native
    def toFill(selector: String, value: String): js.Promise[Unit] = js.native
    def toFill(selector: String, value: String, options: ExpectTimingActions): js.Promise[Unit] = js.native
    def toFillForm(selector: String, value: StringDictionary[js.Any]): js.Promise[Unit] = js.native
    def toFillForm(selector: String, value: StringDictionary[js.Any], options: ExpectTimingActions): js.Promise[Unit] = js.native
    def toMatch(selector: String): js.Promise[Unit] = js.native
    def toMatch(selector: String, options: ExpectTimingActions): js.Promise[Unit] = js.native
    def toMatchElement(selector: String): js.Promise[ElementHandle[Element]] = js.native
    def toMatchElement(selector: String, options: ExpectToClickOptions): js.Promise[ElementHandle[Element]] = js.native
    def toSelect(selector: String, valueOrText: String): js.Promise[Unit] = js.native
    def toSelect(selector: String, valueOrText: String, options: ExpectTimingActions): js.Promise[Unit] = js.native
    def toUploadFile(selector: String, filePath: String): js.Promise[Unit] = js.native
    def toUploadFile(selector: String, filePath: String, options: ExpectTimingActions): js.Promise[Unit] = js.native
  }
  
}

