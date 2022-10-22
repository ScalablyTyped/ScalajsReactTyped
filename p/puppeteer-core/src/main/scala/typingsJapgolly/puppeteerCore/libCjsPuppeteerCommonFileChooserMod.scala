package typingsJapgolly.puppeteerCore

import org.scalajs.dom.HTMLInputElement
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Page.FileChooserOpenedEvent
import typingsJapgolly.puppeteerCore.libCjsPuppeteerCommonElementHandleMod.ElementHandle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCjsPuppeteerCommonFileChooserMod {
  
  @JSImport("puppeteer-core/lib/cjs/puppeteer/common/FileChooser", "FileChooser")
  @js.native
  open class FileChooser protected () extends StObject {
    /**
      * @internal
      */
    def this(element: ElementHandle[HTMLInputElement], event: FileChooserOpenedEvent) = this()
    
    /**
      * Accept the file chooser request with given paths.
      *
      * @param filePaths - If some of the `filePaths` are relative paths, then
      * they are resolved relative to the
      * {@link https://nodejs.org/api/process.html#process_process_cwd | current working directory}.
      */
    def accept(filePaths: js.Array[String]): js.Promise[Unit] = js.native
    
    /**
      * Closes the file chooser without selecting any files.
      */
    def cancel(): Unit = js.native
    
    /**
      * Whether file chooser allow for
      * {@link https://developer.mozilla.org/en-US/docs/Web/HTML/Element/input/file#attr-multiple | multiple}
      * file selection.
      */
    def isMultiple(): Boolean = js.native
    
    /* private */ var `private`: Any = js.native
  }
}
