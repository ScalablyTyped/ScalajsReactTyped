package typingsJapgolly.luminoDomutils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesClipboardMod {
  
  object ClipboardExt {
    
    @JSImport("@lumino/domutils/types/clipboard", "ClipboardExt")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Copy text to the system clipboard.
      *
      * @param text - The text to copy to the clipboard.
      */
    inline def copyText(text: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("copyText")(text.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
}
