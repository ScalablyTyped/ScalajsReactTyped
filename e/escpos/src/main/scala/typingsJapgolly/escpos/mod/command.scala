package typingsJapgolly.escpos.mod

import typingsJapgolly.escpos.anon.BARCODEHEIGHTDEFAULT
import typingsJapgolly.escpos.anon.`1`
import typingsJapgolly.escpos.anon.`2`
import typingsJapgolly.escpos.anon.`3`
import typingsJapgolly.escpos.escposStrings.Backspace
import typingsJapgolly.escpos.escposStrings.Cancel
import typingsJapgolly.escpos.escposStrings.Carriagereturn
import typingsJapgolly.escpos.escposStrings.Charactertabulation
import typingsJapgolly.escpos.escposStrings.Datalinkescape
import typingsJapgolly.escpos.escposStrings.Endoftransmission
import typingsJapgolly.escpos.escposStrings.Escape
import typingsJapgolly.escpos.escposStrings.Escape2
import typingsJapgolly.escpos.escposStrings.Escape3
import typingsJapgolly.escpos.escposStrings.Escape4
import typingsJapgolly.escpos.escposStrings.Escape5
import typingsJapgolly.escpos.escposStrings.EscapeAsteriskExclamationmark
import typingsJapgolly.escpos.escposStrings.EscapeAsteriskNull
import typingsJapgolly.escpos.escposStrings.EscapeAsteriskStartofheading
import typingsJapgolly.escpos.escposStrings.EscapeB
import typingsJapgolly.escpos.escposStrings.EscapeENull
import typingsJapgolly.escpos.escposStrings.EscapeEStartofheading
import typingsJapgolly.escpos.escposStrings.EscapeEqualssignStartofheading
import typingsJapgolly.escpos.escposStrings.EscapeExclamationmark0
import typingsJapgolly.escpos.escposStrings.EscapeExclamationmarkDatalinkescape
import typingsJapgolly.escpos.escposStrings.EscapeExclamationmarkNull
import typingsJapgolly.escpos.escposStrings.EscapeMNull
import typingsJapgolly.escpos.escposStrings.EscapeMStartofheading
import typingsJapgolly.escpos.escposStrings.EscapeMStartoftext
import typingsJapgolly.escpos.escposStrings.EscapeO
import typingsJapgolly.escpos.escposStrings.EscapeQ
import typingsJapgolly.escpos.escposStrings.EscapeQuestionmarkLinefeedNull
import typingsJapgolly.escpos.escposStrings.EscapeaNull
import typingsJapgolly.escpos.escposStrings.EscapeaStartofheading
import typingsJapgolly.escpos.escposStrings.EscapeaStartoftext
import typingsJapgolly.escpos.escposStrings.Escapel
import typingsJapgolly.escpos.escposStrings.EscapepNull
import typingsJapgolly.escpos.escposStrings.EscapepStartofheading
import typingsJapgolly.escpos.escposStrings.EscaperNull
import typingsJapgolly.escpos.escposStrings.EscaperStartofheading
import typingsJapgolly.escpos.escposStrings.Formfeed
import typingsJapgolly.escpos.escposStrings.H
import typingsJapgolly.escpos.escposStrings.Informationseparatorfour
import typingsJapgolly.escpos.escposStrings.Informationseparatorone$
import typingsJapgolly.escpos.escposStrings.InformationseparatoroneB
import typingsJapgolly.escpos.escposStrings.InformationseparatoroneC
import typingsJapgolly.escpos.escposStrings.InformationseparatoroneCarriagereturn
import typingsJapgolly.escpos.escposStrings.InformationseparatoroneE
import typingsJapgolly.escpos.escposStrings.InformationseparatoroneEndoftext
import typingsJapgolly.escpos.escposStrings.InformationseparatoroneLinefeed
import typingsJapgolly.escpos.escposStrings.InformationseparatoroneStartofheading
import typingsJapgolly.escpos.escposStrings.InformationseparatoroneStartoftext
import typingsJapgolly.escpos.escposStrings.InformationseparatoroneT
import typingsJapgolly.escpos.escposStrings.InformationseparatoroneU
import typingsJapgolly.escpos.escposStrings.InformationseparatoroneX
import typingsJapgolly.escpos.escposStrings.Informationseparatoroner
import typingsJapgolly.escpos.escposStrings.Informationseparatoronev
import typingsJapgolly.escpos.escposStrings.Informationseparatorthree
import typingsJapgolly.escpos.escposStrings.InformationseparatorthreeHEndoftext
import typingsJapgolly.escpos.escposStrings.InformationseparatorthreeHNull
import typingsJapgolly.escpos.escposStrings.InformationseparatorthreeHStartofheading
import typingsJapgolly.escpos.escposStrings.InformationseparatorthreeHStartoftext
import typingsJapgolly.escpos.escposStrings.InformationseparatorthreeVA
import typingsJapgolly.escpos.escposStrings.InformationseparatorthreeVB
import typingsJapgolly.escpos.escposStrings.InformationseparatorthreeVNull
import typingsJapgolly.escpos.escposStrings.InformationseparatorthreeVStartofheading
import typingsJapgolly.escpos.escposStrings.InformationseparatorthreefNull
import typingsJapgolly.escpos.escposStrings.InformationseparatorthreefStartofheading
import typingsJapgolly.escpos.escposStrings.Informationseparatorthreehd
import typingsJapgolly.escpos.escposStrings.InformationseparatorthreekAcknowledge
import typingsJapgolly.escpos.escposStrings.InformationseparatorthreekEndoftext
import typingsJapgolly.escpos.escposStrings.InformationseparatorthreekEndoftransmission
import typingsJapgolly.escpos.escposStrings.InformationseparatorthreekEnquiry
import typingsJapgolly.escpos.escposStrings.InformationseparatorthreekH
import typingsJapgolly.escpos.escposStrings.InformationseparatorthreekI
import typingsJapgolly.escpos.escposStrings.InformationseparatorthreekNull
import typingsJapgolly.escpos.escposStrings.InformationseparatorthreekStartofheading
import typingsJapgolly.escpos.escposStrings.InformationseparatorthreekStartoftext
import typingsJapgolly.escpos.escposStrings.Informationseparatorthreev0Endoftext
import typingsJapgolly.escpos.escposStrings.Informationseparatorthreev0Null
import typingsJapgolly.escpos.escposStrings.Informationseparatorthreev0Startofheading
import typingsJapgolly.escpos.escposStrings.Informationseparatorthreev0Startoftext
import typingsJapgolly.escpos.escposStrings.InformationseparatorthreewStartofheading
import typingsJapgolly.escpos.escposStrings.JNull
import typingsJapgolly.escpos.escposStrings.L
import typingsJapgolly.escpos.escposStrings.Linefeed
import typingsJapgolly.escpos.escposStrings.Linetabulation
import typingsJapgolly.escpos.escposStrings.M
import typingsJapgolly.escpos.escposStrings.Null
import typingsJapgolly.escpos.escposStrings.Q
import typingsJapgolly.escpos.escposStrings.`Escape Null`
import typingsJapgolly.escpos.escposStrings.`Escape `
import typingsJapgolly.escpos.escposStrings.`Escape-Null`
import typingsJapgolly.escpos.escposStrings.`Escape-Startofheading`
import typingsJapgolly.escpos.escposStrings.`Escape-Startoftext`
import typingsJapgolly.escpos.escposStrings.`Escape@`
import typingsJapgolly.escpos.escposStrings.`EscapeAsterisk `
import typingsJapgolly.escpos.escposStrings.`EscapeExclamationmark `
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object command {
  
  object BARCODE_FORMAT {
    
    @JSImport("escpos", "command.BARCODE_FORMAT")
    @js.native
    val ^ : js.Any = js.native
    
    // Barcode type CODE93
    @JSImport("escpos", "command.BARCODE_FORMAT.BARCODE_CODE128")
    @js.native
    def BARCODE_CODE128: InformationseparatorthreekI = js.native
    inline def BARCODE_CODE128_=(x: InformationseparatorthreekI): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BARCODE_CODE128")(x.asInstanceOf[js.Any])
    
    // Barcode type EAN8
    @JSImport("escpos", "command.BARCODE_FORMAT.BARCODE_CODE39")
    @js.native
    def BARCODE_CODE39: InformationseparatorthreekEndoftransmission = js.native
    inline def BARCODE_CODE39_=(x: InformationseparatorthreekEndoftransmission): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BARCODE_CODE39")(x.asInstanceOf[js.Any])
    
    // Barcode type NW7
    @JSImport("escpos", "command.BARCODE_FORMAT.BARCODE_CODE93")
    @js.native
    def BARCODE_CODE93: InformationseparatorthreekH = js.native
    inline def BARCODE_CODE93_=(x: InformationseparatorthreekH): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BARCODE_CODE93")(x.asInstanceOf[js.Any])
    
    // Barcode type UPC-E
    @JSImport("escpos", "command.BARCODE_FORMAT.BARCODE_EAN13")
    @js.native
    def BARCODE_EAN13: InformationseparatorthreekStartoftext = js.native
    inline def BARCODE_EAN13_=(x: InformationseparatorthreekStartoftext): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BARCODE_EAN13")(x.asInstanceOf[js.Any])
    
    // Barcode type EAN13
    @JSImport("escpos", "command.BARCODE_FORMAT.BARCODE_EAN8")
    @js.native
    def BARCODE_EAN8: InformationseparatorthreekEndoftext = js.native
    inline def BARCODE_EAN8_=(x: InformationseparatorthreekEndoftext): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BARCODE_EAN8")(x.asInstanceOf[js.Any])
    
    // HRI barcode chars both above and below
    @JSImport("escpos", "command.BARCODE_FORMAT.BARCODE_FONT_A")
    @js.native
    def BARCODE_FONT_A: InformationseparatorthreefNull = js.native
    inline def BARCODE_FONT_A_=(x: InformationseparatorthreefNull): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BARCODE_FONT_A")(x.asInstanceOf[js.Any])
    
    // Font type A for HRI barcode chars
    @JSImport("escpos", "command.BARCODE_FORMAT.BARCODE_FONT_B")
    @js.native
    def BARCODE_FONT_B: InformationseparatorthreefStartofheading = js.native
    inline def BARCODE_FONT_B_=(x: InformationseparatorthreefStartofheading): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BARCODE_FONT_B")(x.asInstanceOf[js.Any])
    
    // Font type B for HRI barcode chars
    inline def BARCODE_HEIGHT(height: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("BARCODE_HEIGHT")(height.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    @JSImport("escpos", "command.BARCODE_FORMAT.BARCODE_HEIGHT_DEFAULT")
    @js.native
    def BARCODE_HEIGHT_DEFAULT: Informationseparatorthreehd = js.native
    inline def BARCODE_HEIGHT_DEFAULT_=(x: Informationseparatorthreehd): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BARCODE_HEIGHT_DEFAULT")(x.asInstanceOf[js.Any])
    
    // Barcode type CODE39
    @JSImport("escpos", "command.BARCODE_FORMAT.BARCODE_ITF")
    @js.native
    def BARCODE_ITF: InformationseparatorthreekEnquiry = js.native
    inline def BARCODE_ITF_=(x: InformationseparatorthreekEnquiry): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BARCODE_ITF")(x.asInstanceOf[js.Any])
    
    // Barcode type ITF
    @JSImport("escpos", "command.BARCODE_FORMAT.BARCODE_NW7")
    @js.native
    def BARCODE_NW7: InformationseparatorthreekAcknowledge = js.native
    inline def BARCODE_NW7_=(x: InformationseparatorthreekAcknowledge): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BARCODE_NW7")(x.asInstanceOf[js.Any])
    
    // HRI barcode chars OFF
    @JSImport("escpos", "command.BARCODE_FORMAT.BARCODE_TXT_ABV")
    @js.native
    def BARCODE_TXT_ABV: InformationseparatorthreeHStartofheading = js.native
    inline def BARCODE_TXT_ABV_=(x: InformationseparatorthreeHStartofheading): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BARCODE_TXT_ABV")(x.asInstanceOf[js.Any])
    
    // HRI barcode chars above
    @JSImport("escpos", "command.BARCODE_FORMAT.BARCODE_TXT_BLW")
    @js.native
    def BARCODE_TXT_BLW: InformationseparatorthreeHStartoftext = js.native
    inline def BARCODE_TXT_BLW_=(x: InformationseparatorthreeHStartoftext): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BARCODE_TXT_BLW")(x.asInstanceOf[js.Any])
    
    // HRI barcode chars below
    @JSImport("escpos", "command.BARCODE_FORMAT.BARCODE_TXT_BTH")
    @js.native
    def BARCODE_TXT_BTH: InformationseparatorthreeHEndoftext = js.native
    inline def BARCODE_TXT_BTH_=(x: InformationseparatorthreeHEndoftext): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BARCODE_TXT_BTH")(x.asInstanceOf[js.Any])
    
    @JSImport("escpos", "command.BARCODE_FORMAT.BARCODE_TXT_OFF")
    @js.native
    def BARCODE_TXT_OFF: InformationseparatorthreeHNull = js.native
    inline def BARCODE_TXT_OFF_=(x: InformationseparatorthreeHNull): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BARCODE_TXT_OFF")(x.asInstanceOf[js.Any])
    
    // Barcode width default=1
    @JSImport("escpos", "command.BARCODE_FORMAT.BARCODE_UPC_A")
    @js.native
    def BARCODE_UPC_A: InformationseparatorthreekNull = js.native
    inline def BARCODE_UPC_A_=(x: InformationseparatorthreekNull): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BARCODE_UPC_A")(x.asInstanceOf[js.Any])
    
    // Barcode type UPC-A
    @JSImport("escpos", "command.BARCODE_FORMAT.BARCODE_UPC_E")
    @js.native
    def BARCODE_UPC_E: InformationseparatorthreekStartofheading = js.native
    inline def BARCODE_UPC_E_=(x: InformationseparatorthreekStartofheading): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BARCODE_UPC_E")(x.asInstanceOf[js.Any])
    
    // Barcode Height [1-255]
    // Barcode Width  [2-6]
    @JSImport("escpos", "command.BARCODE_FORMAT.BARCODE_WIDTH")
    @js.native
    def BARCODE_WIDTH: `3` = js.native
    inline def BARCODE_WIDTH_=(x: `3`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BARCODE_WIDTH")(x.asInstanceOf[js.Any])
    
    // Barcode height default=100
    @JSImport("escpos", "command.BARCODE_FORMAT.BARCODE_WIDTH_DEFAULT")
    @js.native
    def BARCODE_WIDTH_DEFAULT: InformationseparatorthreewStartofheading = js.native
    inline def BARCODE_WIDTH_DEFAULT_=(x: InformationseparatorthreewStartofheading): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BARCODE_WIDTH_DEFAULT")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("escpos", "command.BEEP")
  @js.native
  val BEEP: EscapeB = js.native
  
  object BITMAP_FORMAT {
    
    @JSImport("escpos", "command.BITMAP_FORMAT")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("escpos", "command.BITMAP_FORMAT.BITMAP_D24")
    @js.native
    def BITMAP_D24: EscapeAsteriskExclamationmark = js.native
    inline def BITMAP_D24_=(x: EscapeAsteriskExclamationmark): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BITMAP_D24")(x.asInstanceOf[js.Any])
    
    @JSImport("escpos", "command.BITMAP_FORMAT.BITMAP_D8")
    @js.native
    def BITMAP_D8: EscapeAsteriskStartofheading = js.native
    inline def BITMAP_D8_=(x: EscapeAsteriskStartofheading): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BITMAP_D8")(x.asInstanceOf[js.Any])
    
    @JSImport("escpos", "command.BITMAP_FORMAT.BITMAP_S24")
    @js.native
    def BITMAP_S24: `EscapeAsterisk ` = js.native
    inline def BITMAP_S24_=(x: `EscapeAsterisk `): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BITMAP_S24")(x.asInstanceOf[js.Any])
    
    @JSImport("escpos", "command.BITMAP_FORMAT.BITMAP_S8")
    @js.native
    def BITMAP_S8: EscapeAsteriskNull = js.native
    inline def BITMAP_S8_=(x: EscapeAsteriskNull): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BITMAP_S8")(x.asInstanceOf[js.Any])
  }
  
  object CASH_DRAWER {
    
    @JSImport("escpos", "command.CASH_DRAWER")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("escpos", "command.CASH_DRAWER.CD_KICK_2")
    @js.native
    def CD_KICK_2: EscapepNull = js.native
    inline def CD_KICK_2_=(x: EscapepNull): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CD_KICK_2")(x.asInstanceOf[js.Any])
    
    // Sends a pulse to pin 2 []
    @JSImport("escpos", "command.CASH_DRAWER.CD_KICK_5")
    @js.native
    def CD_KICK_5: EscapepStartofheading = js.native
    inline def CD_KICK_5_=(x: EscapepStartofheading): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CD_KICK_5")(x.asInstanceOf[js.Any])
  }
  
  object CHARACTER_SPACING {
    
    @JSImport("escpos", "command.CHARACTER_SPACING")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("escpos", "command.CHARACTER_SPACING.CS_DEFAULT")
    @js.native
    def CS_DEFAULT: `Escape Null` = js.native
    inline def CS_DEFAULT_=(x: `Escape Null`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CS_DEFAULT")(x.asInstanceOf[js.Any])
    
    @JSImport("escpos", "command.CHARACTER_SPACING.CS_SET")
    @js.native
    def CS_SET: `Escape ` = js.native
    inline def CS_SET_=(x: `Escape `): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CS_SET")(x.asInstanceOf[js.Any])
  }
  
  object CODE2D_FORMAT {
    
    @JSImport("escpos", "command.CODE2D_FORMAT")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("escpos", "command.CODE2D_FORMAT.CODE2D")
    @js.native
    def CODE2D: Any = js.native
    inline def CODE2D_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CODE2D")(x.asInstanceOf[js.Any])
    
    // correct level 25%
    @JSImport("escpos", "command.CODE2D_FORMAT.QR_LEVEL_H")
    @js.native
    def QR_LEVEL_H: H = js.native
    inline def QR_LEVEL_H_=(x: H): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("QR_LEVEL_H")(x.asInstanceOf[js.Any])
    
    @JSImport("escpos", "command.CODE2D_FORMAT.QR_LEVEL_L")
    @js.native
    def QR_LEVEL_L: L = js.native
    inline def QR_LEVEL_L_=(x: L): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("QR_LEVEL_L")(x.asInstanceOf[js.Any])
    
    // correct level 7%
    @JSImport("escpos", "command.CODE2D_FORMAT.QR_LEVEL_M")
    @js.native
    def QR_LEVEL_M: M = js.native
    inline def QR_LEVEL_M_=(x: M): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("QR_LEVEL_M")(x.asInstanceOf[js.Any])
    
    // correct level 15%
    @JSImport("escpos", "command.CODE2D_FORMAT.QR_LEVEL_Q")
    @js.native
    def QR_LEVEL_Q: Q = js.native
    inline def QR_LEVEL_Q_=(x: Q): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("QR_LEVEL_Q")(x.asInstanceOf[js.Any])
    
    @JSImport("escpos", "command.CODE2D_FORMAT.TYPE_DATAMATRIX")
    @js.native
    def TYPE_DATAMATRIX: Any = js.native
    inline def TYPE_DATAMATRIX_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TYPE_DATAMATRIX")(x.asInstanceOf[js.Any])
    
    @JSImport("escpos", "command.CODE2D_FORMAT.TYPE_PDF417")
    @js.native
    def TYPE_PDF417: Any = js.native
    inline def TYPE_PDF417_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TYPE_PDF417")(x.asInstanceOf[js.Any])
    
    @JSImport("escpos", "command.CODE2D_FORMAT.TYPE_QR")
    @js.native
    def TYPE_QR: Any = js.native
    inline def TYPE_QR_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TYPE_QR")(x.asInstanceOf[js.Any])
  }
  
  // Printer Buzzer pre hex
  object COLOR {
    
    @JSImport("escpos", "command.COLOR.0")
    @js.native
    val `0`: EscaperNull = js.native
    
    // black
    @JSImport("escpos", "command.COLOR.1")
    @js.native
    val `1`: EscaperStartofheading = js.native
  }
  
  @JSImport("escpos", "command.DLE")
  @js.native
  val DLE: Datalinkescape = js.native
  
  @JSImport("escpos", "command.EOL")
  @js.native
  val EOL: Linefeed = js.native
  
  @JSImport("escpos", "command.EOT")
  @js.native
  val EOT: Endoftransmission = js.native
  
  @JSImport("escpos", "command.ESC")
  @js.native
  val ESC: Escape = js.native
  
  object FEED_CONTROL_SEQUENCES {
    
    @JSImport("escpos", "command.FEED_CONTROL_SEQUENCES")
    @js.native
    val ^ : js.Any = js.native
    
    // Form feed
    @JSImport("escpos", "command.FEED_CONTROL_SEQUENCES.CTL_CR")
    @js.native
    def CTL_CR: Carriagereturn = js.native
    inline def CTL_CR_=(x: Carriagereturn): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CTL_CR")(x.asInstanceOf[js.Any])
    
    // Print and feed paper (without spaces between lines)
    @JSImport("escpos", "command.FEED_CONTROL_SEQUENCES.CTL_FF")
    @js.native
    def CTL_FF: Formfeed = js.native
    inline def CTL_FF_=(x: Formfeed): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CTL_FF")(x.asInstanceOf[js.Any])
    
    // Print and line feed
    @JSImport("escpos", "command.FEED_CONTROL_SEQUENCES.CTL_GLF")
    @js.native
    def CTL_GLF: JNull = js.native
    inline def CTL_GLF_=(x: JNull): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CTL_GLF")(x.asInstanceOf[js.Any])
    
    // Carriage return
    @JSImport("escpos", "command.FEED_CONTROL_SEQUENCES.CTL_HT")
    @js.native
    def CTL_HT: Charactertabulation = js.native
    inline def CTL_HT_=(x: Charactertabulation): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CTL_HT")(x.asInstanceOf[js.Any])
    
    @JSImport("escpos", "command.FEED_CONTROL_SEQUENCES.CTL_LF")
    @js.native
    def CTL_LF: Linefeed = js.native
    inline def CTL_LF_=(x: Linefeed): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CTL_LF")(x.asInstanceOf[js.Any])
    
    // Horizontal tab
    @JSImport("escpos", "command.FEED_CONTROL_SEQUENCES.CTL_VT")
    @js.native
    def CTL_VT: Linetabulation = js.native
    inline def CTL_VT_=(x: Linetabulation): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CTL_VT")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("escpos", "command.FF")
  @js.native
  val FF: Formfeed = js.native
  
  @JSImport("escpos", "command.FS")
  @js.native
  val FS: Informationseparatorfour = js.native
  
  @JSImport("escpos", "command.GS")
  @js.native
  val GS: Informationseparatorthree = js.native
  
  object GSV0_FORMAT {
    
    @JSImport("escpos", "command.GSV0_FORMAT")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("escpos", "command.GSV0_FORMAT.GSV0_DH")
    @js.native
    def GSV0_DH: Informationseparatorthreev0Startoftext = js.native
    inline def GSV0_DH_=(x: Informationseparatorthreev0Startoftext): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GSV0_DH")(x.asInstanceOf[js.Any])
    
    @JSImport("escpos", "command.GSV0_FORMAT.GSV0_DW")
    @js.native
    def GSV0_DW: Informationseparatorthreev0Startofheading = js.native
    
    @JSImport("escpos", "command.GSV0_FORMAT.GSV0_DWDH")
    @js.native
    def GSV0_DWDH: Informationseparatorthreev0Endoftext = js.native
    inline def GSV0_DWDH_=(x: Informationseparatorthreev0Endoftext): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GSV0_DWDH")(x.asInstanceOf[js.Any])
    
    inline def GSV0_DW_=(x: Informationseparatorthreev0Startofheading): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GSV0_DW")(x.asInstanceOf[js.Any])
    
    @JSImport("escpos", "command.GSV0_FORMAT.GSV0_NORMAL")
    @js.native
    def GSV0_NORMAL: Informationseparatorthreev0Null = js.native
    inline def GSV0_NORMAL_=(x: Informationseparatorthreev0Null): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GSV0_NORMAL")(x.asInstanceOf[js.Any])
  }
  
  object HARDWARE {
    
    @JSImport("escpos", "command.HARDWARE")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("escpos", "command.HARDWARE.HW_INIT")
    @js.native
    def HW_INIT: `Escape@` = js.native
    inline def HW_INIT_=(x: `Escape@`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HW_INIT")(x.asInstanceOf[js.Any])
    
    // Printer select
    @JSImport("escpos", "command.HARDWARE.HW_RESET")
    @js.native
    def HW_RESET: EscapeQuestionmarkLinefeedNull = js.native
    inline def HW_RESET_=(x: EscapeQuestionmarkLinefeedNull): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HW_RESET")(x.asInstanceOf[js.Any])
    
    // Clear data in buffer and reset modes
    @JSImport("escpos", "command.HARDWARE.HW_SELECT")
    @js.native
    def HW_SELECT: EscapeEqualssignStartofheading = js.native
    inline def HW_SELECT_=(x: EscapeEqualssignStartofheading): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HW_SELECT")(x.asInstanceOf[js.Any])
  }
  
  object IMAGE_FORMAT {
    
    @JSImport("escpos", "command.IMAGE_FORMAT")
    @js.native
    val ^ : js.Any = js.native
    
    // Set raster image double width
    @JSImport("escpos", "command.IMAGE_FORMAT.S_RASTER_2H")
    @js.native
    def S_RASTER_2H: Informationseparatorthreev0Startoftext = js.native
    inline def S_RASTER_2H_=(x: Informationseparatorthreev0Startoftext): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("S_RASTER_2H")(x.asInstanceOf[js.Any])
    
    // Set raster image normal size
    @JSImport("escpos", "command.IMAGE_FORMAT.S_RASTER_2W")
    @js.native
    def S_RASTER_2W: Informationseparatorthreev0Startofheading = js.native
    inline def S_RASTER_2W_=(x: Informationseparatorthreev0Startofheading): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("S_RASTER_2W")(x.asInstanceOf[js.Any])
    
    @JSImport("escpos", "command.IMAGE_FORMAT.S_RASTER_N")
    @js.native
    def S_RASTER_N: Informationseparatorthreev0Null = js.native
    inline def S_RASTER_N_=(x: Informationseparatorthreev0Null): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("S_RASTER_N")(x.asInstanceOf[js.Any])
    
    // Set raster image double height
    @JSImport("escpos", "command.IMAGE_FORMAT.S_RASTER_Q")
    @js.native
    def S_RASTER_Q: Informationseparatorthreev0Endoftext = js.native
    inline def S_RASTER_Q_=(x: Informationseparatorthreev0Endoftext): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("S_RASTER_Q")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("escpos", "command.LF")
  @js.native
  val LF: Linefeed = js.native
  
  object LINE_SPACING {
    
    @JSImport("escpos", "command.LINE_SPACING")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("escpos", "command.LINE_SPACING.LS_DEFAULT")
    @js.native
    def LS_DEFAULT: Escape2 = js.native
    inline def LS_DEFAULT_=(x: Escape2): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LS_DEFAULT")(x.asInstanceOf[js.Any])
    
    @JSImport("escpos", "command.LINE_SPACING.LS_SET")
    @js.native
    def LS_SET: Escape3 = js.native
    inline def LS_SET_=(x: Escape3): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LS_SET")(x.asInstanceOf[js.Any])
  }
  
  object MARGINS {
    
    @JSImport("escpos", "command.MARGINS")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("escpos", "command.MARGINS.BOTTOM")
    @js.native
    def BOTTOM: EscapeO = js.native
    inline def BOTTOM_=(x: EscapeO): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BOTTOM")(x.asInstanceOf[js.Any])
    
    // Fix bottom size
    @JSImport("escpos", "command.MARGINS.LEFT")
    @js.native
    def LEFT: Escapel = js.native
    inline def LEFT_=(x: Escapel): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LEFT")(x.asInstanceOf[js.Any])
    
    // Fix left size
    @JSImport("escpos", "command.MARGINS.RIGHT")
    @js.native
    def RIGHT: EscapeQ = js.native
    inline def RIGHT_=(x: EscapeQ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RIGHT")(x.asInstanceOf[js.Any])
  }
  
  object MODEL {
    
    @JSImport("escpos", "command.MODEL")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("escpos", "command.MODEL.QSPRINTER")
    @js.native
    def QSPRINTER: BARCODEHEIGHTDEFAULT = js.native
    inline def QSPRINTER_=(x: BARCODEHEIGHTDEFAULT): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("QSPRINTER")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("escpos", "command.NUL")
  @js.native
  val NUL: Null = js.native
  
  object PAPER {
    
    @JSImport("escpos", "command.PAPER")
    @js.native
    val ^ : js.Any = js.native
    
    // Partial cut paper
    @JSImport("escpos", "command.PAPER.PAPER_CUT_A")
    @js.native
    def PAPER_CUT_A: InformationseparatorthreeVA = js.native
    inline def PAPER_CUT_A_=(x: InformationseparatorthreeVA): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PAPER_CUT_A")(x.asInstanceOf[js.Any])
    
    // Partial cut paper
    @JSImport("escpos", "command.PAPER.PAPER_CUT_B")
    @js.native
    def PAPER_CUT_B: InformationseparatorthreeVB = js.native
    inline def PAPER_CUT_B_=(x: InformationseparatorthreeVB): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PAPER_CUT_B")(x.asInstanceOf[js.Any])
    
    @JSImport("escpos", "command.PAPER.PAPER_FULL_CUT")
    @js.native
    def PAPER_FULL_CUT: InformationseparatorthreeVNull = js.native
    inline def PAPER_FULL_CUT_=(x: InformationseparatorthreeVNull): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PAPER_FULL_CUT")(x.asInstanceOf[js.Any])
    
    // Full cut paper
    @JSImport("escpos", "command.PAPER.PAPER_PART_CUT")
    @js.native
    def PAPER_PART_CUT: InformationseparatorthreeVStartofheading = js.native
    inline def PAPER_PART_CUT_=(x: InformationseparatorthreeVStartofheading): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PAPER_PART_CUT")(x.asInstanceOf[js.Any])
  }
  
  object SCREEN {
    
    @JSImport("escpos", "command.SCREEN")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("escpos", "command.SCREEN.BS")
    @js.native
    def BS: Backspace = js.native
    inline def BS_=(x: Backspace): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BS")(x.asInstanceOf[js.Any])
    
    // Clears all displayed characters
    @JSImport("escpos", "command.SCREEN.CAN")
    @js.native
    def CAN: Cancel = js.native
    inline def CAN_=(x: Cancel): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CAN")(x.asInstanceOf[js.Any])
    
    // Moves the cursor to the nth position on the mth line
    @JSImport("escpos", "command.SCREEN.CLR")
    @js.native
    def CLR: Formfeed = js.native
    inline def CLR_=(x: Formfeed): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLR")(x.asInstanceOf[js.Any])
    
    // Moves the cursor to the left-most position on the upper line (home position)
    @JSImport("escpos", "command.SCREEN.CR")
    @js.native
    def CR: Carriagereturn = js.native
    inline def CR_=(x: Carriagereturn): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CR")(x.asInstanceOf[js.Any])
    
    // Moves the cursor up one line
    @JSImport("escpos", "command.SCREEN.HOM")
    @js.native
    def HOM: Linetabulation = js.native
    inline def HOM_=(x: Linetabulation): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HOM")(x.asInstanceOf[js.Any])
    
    // Moves the cursor one character position to the left
    @JSImport("escpos", "command.SCREEN.HT")
    @js.native
    def HT: Charactertabulation = js.native
    inline def HT_=(x: Charactertabulation): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HT")(x.asInstanceOf[js.Any])
    
    // Moves the cursor one character position to the right
    @JSImport("escpos", "command.SCREEN.LF")
    @js.native
    def LF: Linefeed = js.native
    inline def LF_=(x: Linefeed): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LF")(x.asInstanceOf[js.Any])
    
    // Moves the cursor to the bottom position
    @JSImport("escpos", "command.SCREEN.US_$")
    @js.native
    def US: Informationseparatorone$ = js.native
    
    // Sets the brightness of the fluorescent character display tube
    @JSImport("escpos", "command.SCREEN.US_r")
    @js.native
    def USR: Informationseparatoroner = js.native
    
    inline def USR_=(x: Informationseparatoroner): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("US_r")(x.asInstanceOf[js.Any])
    
    // Selects or cancels reverse display of the characters received after this command
    @JSImport("escpos", "command.SCREEN.US_v")
    @js.native
    def USV: Informationseparatoronev = js.native
    
    inline def USV_=(x: Informationseparatoronev): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("US_v")(x.asInstanceOf[js.Any])
    
    inline def US_=(x: Informationseparatorone$): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("US_$")(x.asInstanceOf[js.Any])
    
    // Moves the cursor to the right-most position on the current line
    @JSImport("escpos", "command.SCREEN.US_B")
    @js.native
    def US_B: InformationseparatoroneB = js.native
    inline def US_B_=(x: InformationseparatoroneB): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("US_B")(x.asInstanceOf[js.Any])
    
    // Selects horizontal scroll mode as the display screen mode
    @JSImport("escpos", "command.SCREEN.US_C")
    @js.native
    def US_C: InformationseparatoroneC = js.native
    
    // Moves the cursor to the left-most position on the current line
    @JSImport("escpos", "command.SCREEN.US_CR")
    @js.native
    def US_CR: InformationseparatoroneCarriagereturn = js.native
    inline def US_CR_=(x: InformationseparatoroneCarriagereturn): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("US_CR")(x.asInstanceOf[js.Any])
    
    inline def US_C_=(x: InformationseparatoroneC): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("US_C")(x.asInstanceOf[js.Any])
    
    // Turn cursor display mode on/off
    @JSImport("escpos", "command.SCREEN.US_E")
    @js.native
    def US_E: InformationseparatoroneE = js.native
    inline def US_E_=(x: InformationseparatoroneE): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("US_E")(x.asInstanceOf[js.Any])
    
    // Moves the cursor down one line
    @JSImport("escpos", "command.SCREEN.US_LF")
    @js.native
    def US_LF: InformationseparatoroneLinefeed = js.native
    inline def US_LF_=(x: InformationseparatoroneLinefeed): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("US_LF")(x.asInstanceOf[js.Any])
    
    // Clears the line containing the cursor
    @JSImport("escpos", "command.SCREEN.US_MD1")
    @js.native
    def US_MD1: InformationseparatoroneStartofheading = js.native
    inline def US_MD1_=(x: InformationseparatoroneStartofheading): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("US_MD1")(x.asInstanceOf[js.Any])
    
    // Selects overwrite mode as the screen display mode
    @JSImport("escpos", "command.SCREEN.US_MD2")
    @js.native
    def US_MD2: InformationseparatoroneStartoftext = js.native
    inline def US_MD2_=(x: InformationseparatoroneStartoftext): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("US_MD2")(x.asInstanceOf[js.Any])
    
    // Selects vertical scroll mode as the screen display mode
    @JSImport("escpos", "command.SCREEN.US_MD3")
    @js.native
    def US_MD3: InformationseparatoroneEndoftext = js.native
    inline def US_MD3_=(x: InformationseparatoroneEndoftext): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("US_MD3")(x.asInstanceOf[js.Any])
    
    // Sets or cancels the blink interval of the display screen
    @JSImport("escpos", "command.SCREEN.US_T")
    @js.native
    def US_T: InformationseparatoroneT = js.native
    inline def US_T_=(x: InformationseparatoroneT): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("US_T")(x.asInstanceOf[js.Any])
    
    // Sets the counter time and displays it in the bottom right of the screen
    @JSImport("escpos", "command.SCREEN.US_U")
    @js.native
    def US_U: InformationseparatoroneU = js.native
    inline def US_U_=(x: InformationseparatoroneU): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("US_U")(x.asInstanceOf[js.Any])
    
    // Displays the time counter at the right side of the bottom line
    @JSImport("escpos", "command.SCREEN.US_X")
    @js.native
    def US_X: InformationseparatoroneX = js.native
    inline def US_X_=(x: InformationseparatoroneX): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("US_X")(x.asInstanceOf[js.Any])
  }
  
  object TEXT_FORMAT {
    
    @JSImport("escpos", "command.TEXT_FORMAT")
    @js.native
    val ^ : js.Any = js.native
    
    // Normal text
    @JSImport("escpos", "command.TEXT_FORMAT.TXT_2HEIGHT")
    @js.native
    def TXT_2HEIGHT: EscapeExclamationmarkDatalinkescape = js.native
    inline def TXT_2HEIGHT_=(x: EscapeExclamationmarkDatalinkescape): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TXT_2HEIGHT")(x.asInstanceOf[js.Any])
    
    // Double height text
    @JSImport("escpos", "command.TEXT_FORMAT.TXT_2WIDTH")
    @js.native
    def TXT_2WIDTH: `EscapeExclamationmark ` = js.native
    inline def TXT_2WIDTH_=(x: `EscapeExclamationmark `): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TXT_2WIDTH")(x.asInstanceOf[js.Any])
    
    // Double width text
    @JSImport("escpos", "command.TEXT_FORMAT.TXT_4SQUARE")
    @js.native
    def TXT_4SQUARE: EscapeExclamationmark0 = js.native
    inline def TXT_4SQUARE_=(x: EscapeExclamationmark0): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TXT_4SQUARE")(x.asInstanceOf[js.Any])
    
    // Left justification
    @JSImport("escpos", "command.TEXT_FORMAT.TXT_ALIGN_CT")
    @js.native
    def TXT_ALIGN_CT: EscapeaStartofheading = js.native
    inline def TXT_ALIGN_CT_=(x: EscapeaStartofheading): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TXT_ALIGN_CT")(x.asInstanceOf[js.Any])
    
    // Font type C
    @JSImport("escpos", "command.TEXT_FORMAT.TXT_ALIGN_LT")
    @js.native
    def TXT_ALIGN_LT: EscapeaNull = js.native
    inline def TXT_ALIGN_LT_=(x: EscapeaNull): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TXT_ALIGN_LT")(x.asInstanceOf[js.Any])
    
    // Centering
    @JSImport("escpos", "command.TEXT_FORMAT.TXT_ALIGN_RT")
    @js.native
    def TXT_ALIGN_RT: EscapeaStartoftext = js.native
    inline def TXT_ALIGN_RT_=(x: EscapeaStartoftext): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TXT_ALIGN_RT")(x.asInstanceOf[js.Any])
    
    // Underline font 2-dot ON
    @JSImport("escpos", "command.TEXT_FORMAT.TXT_BOLD_OFF")
    @js.native
    def TXT_BOLD_OFF: EscapeENull = js.native
    inline def TXT_BOLD_OFF_=(x: EscapeENull): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TXT_BOLD_OFF")(x.asInstanceOf[js.Any])
    
    // Bold font OFF
    @JSImport("escpos", "command.TEXT_FORMAT.TXT_BOLD_ON")
    @js.native
    def TXT_BOLD_ON: EscapeEStartofheading = js.native
    inline def TXT_BOLD_ON_=(x: EscapeEStartofheading): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TXT_BOLD_ON")(x.asInstanceOf[js.Any])
    
    // Double width & height text
    inline def TXT_CUSTOM_SIZE(width: Any, height: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("TXT_CUSTOM_SIZE")(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    // Italic font ON
    @JSImport("escpos", "command.TEXT_FORMAT.TXT_FONT_A")
    @js.native
    def TXT_FONT_A: EscapeMNull = js.native
    inline def TXT_FONT_A_=(x: EscapeMNull): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TXT_FONT_A")(x.asInstanceOf[js.Any])
    
    // Font type A
    @JSImport("escpos", "command.TEXT_FORMAT.TXT_FONT_B")
    @js.native
    def TXT_FONT_B: EscapeMStartofheading = js.native
    inline def TXT_FONT_B_=(x: EscapeMStartofheading): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TXT_FONT_B")(x.asInstanceOf[js.Any])
    
    // Font type B
    @JSImport("escpos", "command.TEXT_FORMAT.TXT_FONT_C")
    @js.native
    def TXT_FONT_C: EscapeMStartoftext = js.native
    inline def TXT_FONT_C_=(x: EscapeMStartoftext): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TXT_FONT_C")(x.asInstanceOf[js.Any])
    
    @JSImport("escpos", "command.TEXT_FORMAT.TXT_HEIGHT")
    @js.native
    def TXT_HEIGHT: `1` = js.native
    inline def TXT_HEIGHT_=(x: `1`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TXT_HEIGHT")(x.asInstanceOf[js.Any])
    
    // Bold font ON
    @JSImport("escpos", "command.TEXT_FORMAT.TXT_ITALIC_OFF")
    @js.native
    def TXT_ITALIC_OFF: Escape5 = js.native
    inline def TXT_ITALIC_OFF_=(x: Escape5): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TXT_ITALIC_OFF")(x.asInstanceOf[js.Any])
    
    // Italic font ON
    @JSImport("escpos", "command.TEXT_FORMAT.TXT_ITALIC_ON")
    @js.native
    def TXT_ITALIC_ON: Escape4 = js.native
    inline def TXT_ITALIC_ON_=(x: Escape4): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TXT_ITALIC_ON")(x.asInstanceOf[js.Any])
    
    @JSImport("escpos", "command.TEXT_FORMAT.TXT_NORMAL")
    @js.native
    def TXT_NORMAL: EscapeExclamationmarkNull = js.native
    inline def TXT_NORMAL_=(x: EscapeExclamationmarkNull): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TXT_NORMAL")(x.asInstanceOf[js.Any])
    
    // Underline font 1-dot ON
    @JSImport("escpos", "command.TEXT_FORMAT.TXT_UNDERL2_ON")
    @js.native
    def TXT_UNDERL2_ON: `Escape-Startoftext` = js.native
    inline def TXT_UNDERL2_ON_=(x: `Escape-Startoftext`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TXT_UNDERL2_ON")(x.asInstanceOf[js.Any])
    
    @JSImport("escpos", "command.TEXT_FORMAT.TXT_UNDERL_OFF")
    @js.native
    def TXT_UNDERL_OFF: `Escape-Null` = js.native
    inline def TXT_UNDERL_OFF_=(x: `Escape-Null`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TXT_UNDERL_OFF")(x.asInstanceOf[js.Any])
    
    // Underline font OFF
    @JSImport("escpos", "command.TEXT_FORMAT.TXT_UNDERL_ON")
    @js.native
    def TXT_UNDERL_ON: `Escape-Startofheading` = js.native
    inline def TXT_UNDERL_ON_=(x: `Escape-Startofheading`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TXT_UNDERL_ON")(x.asInstanceOf[js.Any])
    
    @JSImport("escpos", "command.TEXT_FORMAT.TXT_WIDTH")
    @js.native
    def TXT_WIDTH: `2` = js.native
    inline def TXT_WIDTH_=(x: `2`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TXT_WIDTH")(x.asInstanceOf[js.Any])
  }
}
