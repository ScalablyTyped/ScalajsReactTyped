package typingsJapgolly.pdfmake

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.pdfmake.buildPdfmakeMod.TCreatedPdf
import typingsJapgolly.pdfmake.interfacesMod.CustomTableLayout
import typingsJapgolly.pdfmake.interfacesMod.TDocumentDefinitions
import typingsJapgolly.pdfmake.interfacesMod.TFontDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildPdfmakeDotminMod {
  
  @JSImport("pdfmake/build/pdfmake.min", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createPdf(documentDefinitions: TDocumentDefinitions): TCreatedPdf = ^.asInstanceOf[js.Dynamic].applyDynamic("createPdf")(documentDefinitions.asInstanceOf[js.Any]).asInstanceOf[TCreatedPdf]
  inline def createPdf(documentDefinitions: TDocumentDefinitions, tableLayouts: StringDictionary[CustomTableLayout]): TCreatedPdf = (^.asInstanceOf[js.Dynamic].applyDynamic("createPdf")(documentDefinitions.asInstanceOf[js.Any], tableLayouts.asInstanceOf[js.Any])).asInstanceOf[TCreatedPdf]
  inline def createPdf(
    documentDefinitions: TDocumentDefinitions,
    tableLayouts: StringDictionary[CustomTableLayout],
    fonts: Unit,
    vfs: StringDictionary[String]
  ): TCreatedPdf = (^.asInstanceOf[js.Dynamic].applyDynamic("createPdf")(documentDefinitions.asInstanceOf[js.Any], tableLayouts.asInstanceOf[js.Any], fonts.asInstanceOf[js.Any], vfs.asInstanceOf[js.Any])).asInstanceOf[TCreatedPdf]
  inline def createPdf(
    documentDefinitions: TDocumentDefinitions,
    tableLayouts: StringDictionary[CustomTableLayout],
    fonts: TFontDictionary
  ): TCreatedPdf = (^.asInstanceOf[js.Dynamic].applyDynamic("createPdf")(documentDefinitions.asInstanceOf[js.Any], tableLayouts.asInstanceOf[js.Any], fonts.asInstanceOf[js.Any])).asInstanceOf[TCreatedPdf]
  inline def createPdf(
    documentDefinitions: TDocumentDefinitions,
    tableLayouts: StringDictionary[CustomTableLayout],
    fonts: TFontDictionary,
    vfs: StringDictionary[String]
  ): TCreatedPdf = (^.asInstanceOf[js.Dynamic].applyDynamic("createPdf")(documentDefinitions.asInstanceOf[js.Any], tableLayouts.asInstanceOf[js.Any], fonts.asInstanceOf[js.Any], vfs.asInstanceOf[js.Any])).asInstanceOf[TCreatedPdf]
  inline def createPdf(
    documentDefinitions: TDocumentDefinitions,
    tableLayouts: Unit,
    fonts: Unit,
    vfs: StringDictionary[String]
  ): TCreatedPdf = (^.asInstanceOf[js.Dynamic].applyDynamic("createPdf")(documentDefinitions.asInstanceOf[js.Any], tableLayouts.asInstanceOf[js.Any], fonts.asInstanceOf[js.Any], vfs.asInstanceOf[js.Any])).asInstanceOf[TCreatedPdf]
  inline def createPdf(documentDefinitions: TDocumentDefinitions, tableLayouts: Unit, fonts: TFontDictionary): TCreatedPdf = (^.asInstanceOf[js.Dynamic].applyDynamic("createPdf")(documentDefinitions.asInstanceOf[js.Any], tableLayouts.asInstanceOf[js.Any], fonts.asInstanceOf[js.Any])).asInstanceOf[TCreatedPdf]
  inline def createPdf(
    documentDefinitions: TDocumentDefinitions,
    tableLayouts: Unit,
    fonts: TFontDictionary,
    vfs: StringDictionary[String]
  ): TCreatedPdf = (^.asInstanceOf[js.Dynamic].applyDynamic("createPdf")(documentDefinitions.asInstanceOf[js.Any], tableLayouts.asInstanceOf[js.Any], fonts.asInstanceOf[js.Any], vfs.asInstanceOf[js.Any])).asInstanceOf[TCreatedPdf]
  
  @JSImport("pdfmake/build/pdfmake.min", "fonts")
  @js.native
  def fonts: TFontDictionary = js.native
  inline def fonts_=(x: TFontDictionary): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fonts")(x.asInstanceOf[js.Any])
}
