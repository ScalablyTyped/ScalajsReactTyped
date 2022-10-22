package typingsJapgolly.tslint

import typingsJapgolly.tslint.libLanguageFormatterAbstractFormatterMod.AbstractFormatter
import typingsJapgolly.tslint.libLanguageFormatterFormatterMod.IFormatterMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFormattersCodeFrameFormatterMod {
  
  @JSImport("tslint/lib/formatters/codeFrameFormatter", "Formatter")
  @js.native
  open class Formatter () extends AbstractFormatter
  /* static members */
  object Formatter {
    
    @JSImport("tslint/lib/formatters/codeFrameFormatter", "Formatter")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("tslint/lib/formatters/codeFrameFormatter", "Formatter.metadata")
    @js.native
    def metadata: IFormatterMetadata = js.native
    inline def metadata_=(x: IFormatterMetadata): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("metadata")(x.asInstanceOf[js.Any])
  }
}
