package typingsJapgolly.reactPdf

import typingsJapgolly.pdfjsDist.mod.PDFJSStatic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-pdf/dist/pdfjs-dist", JSImport.Namespace)
@js.native
object pdfjsDistMod extends js.Object {
  @js.native
  object default extends js.Object {
    val PDFJS: PDFJSStatic = js.native
    @js.native
    object CMapCompressionType extends js.Object {
      /* 1 */ val BINARY: typingsJapgolly.pdfjsDist.mod.CMapCompressionType.BINARY with Double = js.native
      /* 0 */ val NONE: typingsJapgolly.pdfjsDist.mod.CMapCompressionType.NONE with Double = js.native
      /* 2 */ val STREAM: typingsJapgolly.pdfjsDist.mod.CMapCompressionType.STREAM with Double = js.native
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typingsJapgolly.pdfjsDist.mod.CMapCompressionType with Double] = js.native
    }
    
    @js.native
    object VerbosityLevel extends js.Object {
      /* 0 */ val ERRORS: typingsJapgolly.pdfjsDist.mod.VerbosityLevel.ERRORS with Double = js.native
      /* 5 */ val INFOS: typingsJapgolly.pdfjsDist.mod.VerbosityLevel.INFOS with Double = js.native
      /* 1 */ val WARNINGS: typingsJapgolly.pdfjsDist.mod.VerbosityLevel.WARNINGS with Double = js.native
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typingsJapgolly.pdfjsDist.mod.VerbosityLevel with Double] = js.native
    }
    
  }
  
}

