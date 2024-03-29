package typingsJapgolly.pdfmake

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.Blob
import org.scalajs.dom.Window
import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.pdfkit.PDFKit.PDFDocument
import typingsJapgolly.pdfmake.interfacesMod.BufferOptions
import typingsJapgolly.pdfmake.interfacesMod.CustomTableLayout
import typingsJapgolly.pdfmake.interfacesMod.TDocumentDefinitions
import typingsJapgolly.pdfmake.interfacesMod.TFontDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildPdfmakeMod {
  
  @JSImport("pdfmake/build/pdfmake", JSImport.Namespace)
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
  
  @JSImport("pdfmake/build/pdfmake", "fonts")
  @js.native
  def fonts: TFontDictionary = js.native
  inline def fonts_=(x: TFontDictionary): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fonts")(x.asInstanceOf[js.Any])
  
  @js.native
  trait TCreatedPdf extends StObject {
    
    def download(): Unit = js.native
    def download(cb: js.Function0[Unit]): Unit = js.native
    def download(cb: js.Function0[Unit], options: BufferOptions): Unit = js.native
    def download(cb: Unit, options: BufferOptions): Unit = js.native
    def download(defaultFileName: String): Unit = js.native
    def download(defaultFileName: String, cb: js.Function0[Unit]): Unit = js.native
    def download(defaultFileName: String, cb: js.Function0[Unit], options: BufferOptions): Unit = js.native
    def download(defaultFileName: String, cb: Unit, options: BufferOptions): Unit = js.native
    
    def getBase64(cb: js.Function1[/* result */ String, Unit]): Unit = js.native
    def getBase64(cb: js.Function1[/* result */ String, Unit], options: BufferOptions): Unit = js.native
    
    def getBlob(cb: js.Function1[/* result */ Blob, Unit]): Unit = js.native
    def getBlob(cb: js.Function1[/* result */ Blob, Unit], options: BufferOptions): Unit = js.native
    
    def getBuffer(cb: js.Function1[/* result */ Buffer, Unit]): Unit = js.native
    def getBuffer(cb: js.Function1[/* result */ Buffer, Unit], options: BufferOptions): Unit = js.native
    
    def getDataUrl(cb: js.Function1[/* result */ String, Unit]): Unit = js.native
    def getDataUrl(cb: js.Function1[/* result */ String, Unit], options: BufferOptions): Unit = js.native
    
    def getStream(): PDFDocument = js.native
    def getStream(options: BufferOptions): PDFDocument = js.native
    
    // minimal version 0.1.41
    def open(): Unit = js.native
    def open(options: Unit, win: Window): Unit = js.native
    def open(options: BufferOptions): Unit = js.native
    def open(options: BufferOptions, win: Window): Unit = js.native
    
    def print(): Unit = js.native
    def print(options: Unit, win: Window): Unit = js.native
    def print(options: BufferOptions): Unit = js.native
    def print(options: BufferOptions, win: Window): Unit = js.native
  }
}
