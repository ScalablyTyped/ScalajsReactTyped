package typingsJapgolly.nodePdftk

import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.nodePdftk.anon.PartialRecordLetterstring
import typingsJapgolly.nodePdftk.nodePdftkBooleans.`true`
import typingsJapgolly.std.PromiseConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("node-pdftk", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("node-pdftk", "PDFTK")
  @js.native
  open class PDFTK protected () extends StObject {
    /**
      * PdfTk constructor.
      */
    def this(src: js.Array[String]) = this()
    
    def allow(perms: js.Array[Permission]): this.type = js.native
    /**
      * Set permissions for a PDF. By not passing in the "perms" parameter, you are disabling all features.
      * @see {@link https://www.pdflabs.com/docs/pdftk-man-page/#dest-output-enc-perms}
      */
    def allow(perms: Permission): this.type = js.native
    
    /**
      * Attach files to PDF.
      * @see {@link https://www.pdflabs.com/docs/pdftk-man-page/#dest-op-attach} for more information.
      */
    def attachFiles(files: String): this.type = js.native
    def attachFiles(files: js.Array[String]): this.type = js.native
    
    /**
      * Applies a PDF watermark to the background of a single PDF.
      * @see {@link https://www.pdflabs.com/docs/pdftk-man-page/#dest-op-background}
      */
    def background(file: String): this.type = js.native
    def background(file: Buffer): this.type = js.native
    
    def burst(): js.Promise[Buffer] = js.native
    /**
      * Splits a single PDF into individual pages.
      * @see {@link https://www.pdflabs.com/docs/pdftk-man-page/#dest-op-burst}
      */
    def burst(outputOptions: String): js.Promise[String] = js.native
    
    /**
      * Assembles ("concatenate") pages from input PDFs to create a new PDF.
      * @see {@link https://www.pdflabs.com/docs/pdftk-man-page/#dest-op-cat}
      */
    def cat(command: String): this.type = js.native
    def cat(command: js.Array[String]): this.type = js.native
    
    /**
      * Restore page sream compression.
      * @see {@link https://www.pdflabs.com/docs/pdftk-man-page/#dest-compress}
      */
    def compress(): this.type = js.native
    
    /**
      * Always prompt when errors occur.
      * @see {@link https://www.pdflabs.com/docs/pdftk-man-page/#dest-ask}
      */
    def doAsk(): this.type = js.native
    
    /**
      * Never prompt when errors occur.
      * @see {@link https://www.pdflabs.com/docs/pdftk-man-page/#dest-ask}
      */
    def dontAsk(): this.type = js.native
    
    /**
      * Drop all XFA data.
      * @see {@link https://www.pdflabs.com/docs/pdftk-man-page/#dest-drop-xfa}
      */
    def dropXfa(): this.type = js.native
    
    /**
      * Merge PDF form fields and their data.
      * @see {@link https://www.pdflabs.com/docs/pdftk-man-page/#dest-output-flatten}
      */
    /**
      * Outputs PDF bookmarks and metadata.
      * @see {@link https://www.pdflabs.com/docs/pdftk-man-page/#dest-op-dump-data}
      */
    def dumpData(): this.type = js.native
    
    /**
      * Outputs PDF annotation information.
      * @see {@link https://www.pdflabs.com/docs/pdftk-man-page/#dest-op-dump-data-annots}
      */
    def dumpDataAnnots(): this.type = js.native
    
    /**
      * Outputs form field statistics.
      * @see {@link https://www.pdflabs.com/docs/pdftk-man-page/#dest-op-dump-data-fields}
      */
    def dumpDataFields(): this.type = js.native
    
    /**
      * Outputs form field statistics with utf-8 encoding.
      * @see {@link https://www.pdflabs.com/docs/pdftk-man-page/#dest-op-dump-data-fields-utf8}
      */
    def dumpDataFieldsUtf8(): this.type = js.native
    
    /**
      * Outputs PDF bookmarks and metadata with utf-8 encoding.
      * @see {@link https://www.pdflabs.com/docs/pdftk-man-page/#dest-op-dump-data-utf8}
      */
    def dumpDataUtf8(): this.type = js.native
    
    /**
      * Set 128 bit encryption.
      * @see {@link https://www.pdflabs.com/docs/pdftk-man-page/#dest-output-enc-strength}
      */
    def encrypt128Bit(): this.type = js.native
    
    /**
      * Set 40 bit encryption.
      * @see {@link https://www.pdflabs.com/docs/pdftk-man-page/#dest-output-enc-strength}
      */
    def encrypt40Bit(): this.type = js.native
    
    /**
      * Fill a PDF form from JSON data.
      * @see {@link https://www.pdflabs.com/docs/pdftk-man-page/#dest-op-fill-form}
      */
    def fillForm(payload: js.Object): this.type = js.native
    
    /**
      * Set Adobe Reader to generate new field appearances.
      * @see {@link https://www.pdflabs.com/docs/pdftk-man-page/#dest-output-need-appearances}
      */
    /**
      * Merge PDF form fields and their data.
      * @see {@link https://www.pdflabs.com/docs/pdftk-man-page/#dest-output-flatten}
      */
    def flatten(): this.type = js.native
    
    /**
      * Generate fdf file from input PDF.
      * @see {@link https://www.pdflabs.com/docs/pdftk-man-page/#dest-op-generate-fdf}
      */
    def generateFdf(): this.type = js.native
    
    /**
      * Allows the plugin to ignore the PDFTK warnings. Useful with huge PDF files.
      */
    def ignoreWarnings(): this.type = js.native
    
    /**
      * Set the input password.
      * @see {@link https://www.pdflabs.com/docs/pdftk-man-page/#dest-input-pw}
      */
    def inputPw(password: String): this.type = js.native
    
    /**
      * Keep final ID when combining pages.
      * @see {@link https://www.pdflabs.com/docs/pdftk-man-page/#dest-keep-id}
      */
    def keepFinalId(): this.type = js.native
    
    /**
      * Keep first ID when combining files.
      * @see {@link https://www.pdflabs.com/docs/pdftk-man-page/#dest-keep-id}
      */
    def keepFirstId(): this.type = js.native
    
    /**
      * Same as the background operation, but applies each page of the background PDF to the corresponding page of the input PDF.
      * @see {@link https://www.pdflabs.com/docs/pdftk-man-page/#dest-op-multibackground}
      */
    def multiBackground(file: String): this.type = js.native
    def multiBackground(file: Buffer): this.type = js.native
    
    /**
      * Same as the stamp operation, but applies each page of the stamp PDF to the corresponding page of the input PDF.
      * @see {@link https://www.pdflabs.com/docs/pdftk-man-page/#dest-op-multistamp}
      */
    def multiStamp(file: String): this.type = js.native
    def multiStamp(file: Buffer): this.type = js.native
    
    def needAppearances(): this.type = js.native
    
    def output(): js.Promise[Buffer] = js.native
    def output(writeFile: String): js.Promise[Buffer] = js.native
    /**
      * Run the command.
      */
    def output(writeFile: String, outputDest: String): js.Promise[String] = js.native
    def output(writeFile: String, outputDest: String, needsOutput: Boolean): js.Promise[String] = js.native
    
    /**
      * Set the owner password.
      * @see {@link https://www.pdflabs.com/docs/pdftk-man-page/#dest-output-enc-owner-pw}
      */
    def ownerPw(password: String): this.type = js.native
    
    /**
      * Takes a single input PDF and rotates just the specified pages.
      * @see {@link https://www.pdflabs.com/docs/pdftk-man-page/#dest-op-rotate}
      */
    def rotate(command: String): this.type = js.native
    def rotate(command: js.Array[String]): this.type = js.native
    
    /**
      * Collates pages from input PDF to create new PDF.
      * @see {@link https://www.pdflabs.com/docs/pdftk-man-page/#dest-op-shuffle}
      */
    def shuffle(command: String): this.type = js.native
    def shuffle(command: js.Array[String]): this.type = js.native
    
    /**
      * This behaves just like the background operation except it overlays the stamp PDF page on top of the input PDF document’s pages.
      * @see {@link https://www.pdflabs.com/docs/pdftk-man-page/#dest-op-stamp}
      */
    def stamp(file: String): this.type = js.native
    def stamp(file: Buffer): this.type = js.native
    
    /**
      * Used with the {@link attachFiles} method to attach to a specific page.
      * @see {@link https://www.pdflabs.com/docs/pdftk-man-page/#dest-op-attach}
      */
    def toPage(pageNo: Double): this.type = js.native
    
    /**
      * Remove page stream compression.
      * @see {@link https://www.pdflabs.com/docs/pdftk-man-page/#dest-compress}
      */
    def uncompress(): this.type = js.native
    
    /**
      * Unpack files into an output directory. This method is not chainable, and hereby does not require
      * the output method afterwards.
      * @see {@link https://www.pdflabs.com/docs/pdftk-man-page/#dest-op-unpack} for more information.
      */
    def unpackFiles(outputDir: String): js.Promise[String] = js.native
    
    /**
      * Update the bookmarks and metadata of a PDF with utf-8 encoding.
      * @see {@link https://www.pdflabs.com/docs/pdftk-man-page/#dest-op-update-info}
      */
    def updateInfo(data: js.Object): this.type = js.native
    
    /**
      * Update the bookmarks and metadata of a PDF.
      * @see {@link https://www.pdflabs.com/docs/pdftk-man-page/#dest-op-update-info-utf8}
      */
    def updateInfoUtf8(data: js.Object): this.type = js.native
    
    /**
      * Set the user password.
      * @see {@link https://www.pdflabs.com/docs/pdftk-man-page/#dest-output-enc-user-pw}
      */
    def userPw(password: String): this.type = js.native
    
    /**
      * Set the verbose option.
      * @see {@link https://www.pdflabs.com/docs/pdftk-man-page/#dest-verbose}
      */
    def verbose(): this.type = js.native
  }
  /* static members */
  object PDFTK {
    
    @JSImport("node-pdftk", "PDFTK")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Returns a buffer from a file.
      */
    inline def fileToBuffer(file: String): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("fileToBuffer")(file.asInstanceOf[js.Any]).asInstanceOf[Buffer]
    inline def fileToBuffer(file: Buffer): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("fileToBuffer")(file.asInstanceOf[js.Any]).asInstanceOf[Buffer]
    
    /**
      * Creates fdf file from JSON input.
      */
    inline def generateFdfFromJSON(data: js.Object): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("generateFdfFromJSON")(data.asInstanceOf[js.Any]).asInstanceOf[Buffer]
    
    /**
      * Creates pdf info text file from JSON input.
      */
    inline def generateInfoFromJSON(data: js.Object): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("generateInfoFromJSON")(data.asInstanceOf[js.Any]).asInstanceOf[Buffer]
    
    /**
      * Simple object check. Arrays not included.
      */
    inline def isObject(item: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isObject")(item.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /**
      * Simple string check.
      */
    inline def isString(item: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isString")(item.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /**
      * Sanitizes fdf input
      */
    inline def sanitizeForFdf(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("sanitizeForFdf")(str.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * Returns a buffer from a string.
      */
    inline def stringToBuffer(file: String): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("stringToBuffer")(file.asInstanceOf[js.Any]).asInstanceOf[Buffer]
    inline def stringToBuffer(file: String, encoding: String): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("stringToBuffer")(file.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[Buffer]
    inline def stringToBuffer(file: Buffer): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("stringToBuffer")(file.asInstanceOf[js.Any]).asInstanceOf[Buffer]
    inline def stringToBuffer(file: Buffer, encoding: String): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("stringToBuffer")(file.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  }
  
  inline def configure(opts: ConfigureOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("configure")(opts.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def input(file: String): PDFTK = ^.asInstanceOf[js.Dynamic].applyDynamic("input")(file.asInstanceOf[js.Any]).asInstanceOf[PDFTK]
  inline def input(file: js.Array[Buffer]): PDFTK = ^.asInstanceOf[js.Dynamic].applyDynamic("input")(file.asInstanceOf[js.Any]).asInstanceOf[PDFTK]
  inline def input(file: Buffer): PDFTK = ^.asInstanceOf[js.Dynamic].applyDynamic("input")(file.asInstanceOf[js.Any]).asInstanceOf[PDFTK]
  inline def input(file: PartialRecordLetterstring): PDFTK = ^.asInstanceOf[js.Dynamic].applyDynamic("input")(file.asInstanceOf[js.Any]).asInstanceOf[PDFTK]
  
  trait ConfigureOptions extends StObject {
    
    var Promise: js.UndefOr[PromiseConstructor] = js.undefined
    
    var bin: js.UndefOr[String] = js.undefined
    
    var ignoreWarnings: js.UndefOr[`true`] = js.undefined
    
    var tempDir: js.UndefOr[String] = js.undefined
  }
  object ConfigureOptions {
    
    inline def apply(): ConfigureOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfigureOptions]
    }
    
    extension [Self <: ConfigureOptions](x: Self) {
      
      inline def setBin(value: String): Self = StObject.set(x, "bin", value.asInstanceOf[js.Any])
      
      inline def setBinUndefined: Self = StObject.set(x, "bin", js.undefined)
      
      inline def setIgnoreWarnings(value: `true`): Self = StObject.set(x, "ignoreWarnings", value.asInstanceOf[js.Any])
      
      inline def setIgnoreWarningsUndefined: Self = StObject.set(x, "ignoreWarnings", js.undefined)
      
      inline def setPromise(value: PromiseConstructor): Self = StObject.set(x, "Promise", value.asInstanceOf[js.Any])
      
      inline def setPromiseUndefined: Self = StObject.set(x, "Promise", js.undefined)
      
      inline def setTempDir(value: String): Self = StObject.set(x, "tempDir", value.asInstanceOf[js.Any])
      
      inline def setTempDirUndefined: Self = StObject.set(x, "tempDir", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.nodePdftk.nodePdftkStrings.A
    - typingsJapgolly.nodePdftk.nodePdftkStrings.B
    - typingsJapgolly.nodePdftk.nodePdftkStrings.C
    - typingsJapgolly.nodePdftk.nodePdftkStrings.D
    - typingsJapgolly.nodePdftk.nodePdftkStrings.E
    - typingsJapgolly.nodePdftk.nodePdftkStrings.F
    - typingsJapgolly.nodePdftk.nodePdftkStrings.G
    - typingsJapgolly.nodePdftk.nodePdftkStrings.H
    - typingsJapgolly.nodePdftk.nodePdftkStrings.I
    - typingsJapgolly.nodePdftk.nodePdftkStrings.J
    - typingsJapgolly.nodePdftk.nodePdftkStrings.K
    - typingsJapgolly.nodePdftk.nodePdftkStrings.L
    - typingsJapgolly.nodePdftk.nodePdftkStrings.M
    - typingsJapgolly.nodePdftk.nodePdftkStrings.N
    - typingsJapgolly.nodePdftk.nodePdftkStrings.O
    - typingsJapgolly.nodePdftk.nodePdftkStrings.P
    - typingsJapgolly.nodePdftk.nodePdftkStrings.Q
    - typingsJapgolly.nodePdftk.nodePdftkStrings.R
    - typingsJapgolly.nodePdftk.nodePdftkStrings.S
    - typingsJapgolly.nodePdftk.nodePdftkStrings.T
    - typingsJapgolly.nodePdftk.nodePdftkStrings.U
    - typingsJapgolly.nodePdftk.nodePdftkStrings.V
    - typingsJapgolly.nodePdftk.nodePdftkStrings.W
    - typingsJapgolly.nodePdftk.nodePdftkStrings.X
    - typingsJapgolly.nodePdftk.nodePdftkStrings.Y
    - typingsJapgolly.nodePdftk.nodePdftkStrings.Z
  */
  trait Letter extends StObject
  object Letter {
    
    inline def A: typingsJapgolly.nodePdftk.nodePdftkStrings.A = "A".asInstanceOf[typingsJapgolly.nodePdftk.nodePdftkStrings.A]
    
    inline def B: typingsJapgolly.nodePdftk.nodePdftkStrings.B = "B".asInstanceOf[typingsJapgolly.nodePdftk.nodePdftkStrings.B]
    
    inline def C: typingsJapgolly.nodePdftk.nodePdftkStrings.C = "C".asInstanceOf[typingsJapgolly.nodePdftk.nodePdftkStrings.C]
    
    inline def D: typingsJapgolly.nodePdftk.nodePdftkStrings.D = "D".asInstanceOf[typingsJapgolly.nodePdftk.nodePdftkStrings.D]
    
    inline def E: typingsJapgolly.nodePdftk.nodePdftkStrings.E = "E".asInstanceOf[typingsJapgolly.nodePdftk.nodePdftkStrings.E]
    
    inline def F: typingsJapgolly.nodePdftk.nodePdftkStrings.F = "F".asInstanceOf[typingsJapgolly.nodePdftk.nodePdftkStrings.F]
    
    inline def G: typingsJapgolly.nodePdftk.nodePdftkStrings.G = "G".asInstanceOf[typingsJapgolly.nodePdftk.nodePdftkStrings.G]
    
    inline def H: typingsJapgolly.nodePdftk.nodePdftkStrings.H = "H".asInstanceOf[typingsJapgolly.nodePdftk.nodePdftkStrings.H]
    
    inline def I: typingsJapgolly.nodePdftk.nodePdftkStrings.I = "I".asInstanceOf[typingsJapgolly.nodePdftk.nodePdftkStrings.I]
    
    inline def J: typingsJapgolly.nodePdftk.nodePdftkStrings.J = "J".asInstanceOf[typingsJapgolly.nodePdftk.nodePdftkStrings.J]
    
    inline def K: typingsJapgolly.nodePdftk.nodePdftkStrings.K = "K".asInstanceOf[typingsJapgolly.nodePdftk.nodePdftkStrings.K]
    
    inline def L: typingsJapgolly.nodePdftk.nodePdftkStrings.L = "L".asInstanceOf[typingsJapgolly.nodePdftk.nodePdftkStrings.L]
    
    inline def M: typingsJapgolly.nodePdftk.nodePdftkStrings.M = "M".asInstanceOf[typingsJapgolly.nodePdftk.nodePdftkStrings.M]
    
    inline def N: typingsJapgolly.nodePdftk.nodePdftkStrings.N = "N".asInstanceOf[typingsJapgolly.nodePdftk.nodePdftkStrings.N]
    
    inline def O: typingsJapgolly.nodePdftk.nodePdftkStrings.O = "O".asInstanceOf[typingsJapgolly.nodePdftk.nodePdftkStrings.O]
    
    inline def P: typingsJapgolly.nodePdftk.nodePdftkStrings.P = "P".asInstanceOf[typingsJapgolly.nodePdftk.nodePdftkStrings.P]
    
    inline def Q: typingsJapgolly.nodePdftk.nodePdftkStrings.Q = "Q".asInstanceOf[typingsJapgolly.nodePdftk.nodePdftkStrings.Q]
    
    inline def R: typingsJapgolly.nodePdftk.nodePdftkStrings.R = "R".asInstanceOf[typingsJapgolly.nodePdftk.nodePdftkStrings.R]
    
    inline def S: typingsJapgolly.nodePdftk.nodePdftkStrings.S = "S".asInstanceOf[typingsJapgolly.nodePdftk.nodePdftkStrings.S]
    
    inline def T: typingsJapgolly.nodePdftk.nodePdftkStrings.T = "T".asInstanceOf[typingsJapgolly.nodePdftk.nodePdftkStrings.T]
    
    inline def U: typingsJapgolly.nodePdftk.nodePdftkStrings.U = "U".asInstanceOf[typingsJapgolly.nodePdftk.nodePdftkStrings.U]
    
    inline def V: typingsJapgolly.nodePdftk.nodePdftkStrings.V = "V".asInstanceOf[typingsJapgolly.nodePdftk.nodePdftkStrings.V]
    
    inline def W: typingsJapgolly.nodePdftk.nodePdftkStrings.W = "W".asInstanceOf[typingsJapgolly.nodePdftk.nodePdftkStrings.W]
    
    inline def X: typingsJapgolly.nodePdftk.nodePdftkStrings.X = "X".asInstanceOf[typingsJapgolly.nodePdftk.nodePdftkStrings.X]
    
    inline def Y: typingsJapgolly.nodePdftk.nodePdftkStrings.Y = "Y".asInstanceOf[typingsJapgolly.nodePdftk.nodePdftkStrings.Y]
    
    inline def Z: typingsJapgolly.nodePdftk.nodePdftkStrings.Z = "Z".asInstanceOf[typingsJapgolly.nodePdftk.nodePdftkStrings.Z]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.nodePdftk.nodePdftkStrings.Printing
    - typingsJapgolly.nodePdftk.nodePdftkStrings.DegradedPrintin
    - typingsJapgolly.nodePdftk.nodePdftkStrings.ModifyContents
    - typingsJapgolly.nodePdftk.nodePdftkStrings.Assembly
    - typingsJapgolly.nodePdftk.nodePdftkStrings.CopyContents
    - typingsJapgolly.nodePdftk.nodePdftkStrings.ScreenReaders
    - typingsJapgolly.nodePdftk.nodePdftkStrings.ModifyAnnotations
    - typingsJapgolly.nodePdftk.nodePdftkStrings.FillIn
    - typingsJapgolly.nodePdftk.nodePdftkStrings.AllFeatures
  */
  trait Permission extends StObject
  object Permission {
    
    inline def AllFeatures: typingsJapgolly.nodePdftk.nodePdftkStrings.AllFeatures = "AllFeatures".asInstanceOf[typingsJapgolly.nodePdftk.nodePdftkStrings.AllFeatures]
    
    inline def Assembly: typingsJapgolly.nodePdftk.nodePdftkStrings.Assembly = "Assembly".asInstanceOf[typingsJapgolly.nodePdftk.nodePdftkStrings.Assembly]
    
    inline def CopyContents: typingsJapgolly.nodePdftk.nodePdftkStrings.CopyContents = "CopyContents".asInstanceOf[typingsJapgolly.nodePdftk.nodePdftkStrings.CopyContents]
    
    inline def DegradedPrintin: typingsJapgolly.nodePdftk.nodePdftkStrings.DegradedPrintin = "DegradedPrintin".asInstanceOf[typingsJapgolly.nodePdftk.nodePdftkStrings.DegradedPrintin]
    
    inline def FillIn: typingsJapgolly.nodePdftk.nodePdftkStrings.FillIn = "FillIn".asInstanceOf[typingsJapgolly.nodePdftk.nodePdftkStrings.FillIn]
    
    inline def ModifyAnnotations: typingsJapgolly.nodePdftk.nodePdftkStrings.ModifyAnnotations = "ModifyAnnotations".asInstanceOf[typingsJapgolly.nodePdftk.nodePdftkStrings.ModifyAnnotations]
    
    inline def ModifyContents: typingsJapgolly.nodePdftk.nodePdftkStrings.ModifyContents = "ModifyContents".asInstanceOf[typingsJapgolly.nodePdftk.nodePdftkStrings.ModifyContents]
    
    inline def Printing: typingsJapgolly.nodePdftk.nodePdftkStrings.Printing = "Printing".asInstanceOf[typingsJapgolly.nodePdftk.nodePdftkStrings.Printing]
    
    inline def ScreenReaders: typingsJapgolly.nodePdftk.nodePdftkStrings.ScreenReaders = "ScreenReaders".asInstanceOf[typingsJapgolly.nodePdftk.nodePdftkStrings.ScreenReaders]
  }
}
