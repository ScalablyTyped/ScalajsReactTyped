package typingsJapgolly.winrtUwp.global.Windows.Globalization

import typingsJapgolly.winrtUwp.Windows.UI.Text.FontStretch
import typingsJapgolly.winrtUwp.Windows.UI.Text.FontStyle
import typingsJapgolly.winrtUwp.Windows.UI.Text.FontWeight
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides classes that allow apps to select language-appropriate and script-appropriate fonts for text display. */
object Fonts {
  
  /** Provides data related to a particular font recommendation for a given language. */
  /* note: abstract class */ @JSGlobal("Windows.Globalization.Fonts.LanguageFont")
  @js.native
  open class LanguageFont ()
    extends StObject
       with typingsJapgolly.winrtUwp.Windows.Globalization.Fonts.LanguageFont {
    
    /** Gets the family name of the font. */
    /* CompleteClass */
    var fontFamily: String = js.native
    
    /** Gets the FontStretch property of the font. */
    /* CompleteClass */
    var fontStretch: FontStretch = js.native
    
    /** Gets the FontStyle property of the font. */
    /* CompleteClass */
    var fontStyle: FontStyle = js.native
    
    /** Gets the weight of the font ( FontWeight ). */
    /* CompleteClass */
    var fontWeight: FontWeight = js.native
    
    /** Gets a recommended font size scaling factor for the font. */
    /* CompleteClass */
    var scaleFactor: Double = js.native
  }
  
  /** Supplies a set of font recommendations for a given language or script for various usage cases. */
  @JSGlobal("Windows.Globalization.Fonts.LanguageFontGroup")
  @js.native
  open class LanguageFontGroup protected ()
    extends StObject
       with typingsJapgolly.winrtUwp.Windows.Globalization.Fonts.LanguageFontGroup {
    /**
      * Creates a LanguageFontGroup object for a given language or script.
      * @param languageTag A BCP-47 language tag, or an ISO 15924 script identifier.
      */
    def this(languageTag: String) = this()
    
    /** Gets a font that is recommended as an additional option for use in documents beyond the recommendations provided by DocumentHeadingFont , ModernDocumentFont and TraditionalDocumentFont . */
    /* CompleteClass */
    var documentAlternate1Font: typingsJapgolly.winrtUwp.Windows.Globalization.Fonts.LanguageFont = js.native
    
    /** Gets a font that is recommended as an additional option for use in documents beyond the recommendations provided by DocumentHeadingFont , ModernDocumentFont and TraditionalDocumentFont . */
    /* CompleteClass */
    var documentAlternate2Font: typingsJapgolly.winrtUwp.Windows.Globalization.Fonts.LanguageFont = js.native
    
    /** Gets a font that is recommended for use in document headings. */
    /* CompleteClass */
    var documentHeadingFont: typingsJapgolly.winrtUwp.Windows.Globalization.Fonts.LanguageFont = js.native
    
    /** Gets a font that is recommended for displaying fixed-width characters. */
    /* CompleteClass */
    var fixedWidthTextFont: typingsJapgolly.winrtUwp.Windows.Globalization.Fonts.LanguageFont = js.native
    
    /** Gets a font that is recommended for typical document body text following modern style conventions. */
    /* CompleteClass */
    var modernDocumentFont: typingsJapgolly.winrtUwp.Windows.Globalization.Fonts.LanguageFont = js.native
    
    /** Gets a font that is recommended for typical document body text following traditional style conventions. */
    /* CompleteClass */
    var traditionalDocumentFont: typingsJapgolly.winrtUwp.Windows.Globalization.Fonts.LanguageFont = js.native
    
    /** Gets a font that is recommended for special UI elements, such as captions, that are displayed at sizes smaller than typical UI body text. */
    /* CompleteClass */
    var uiCaptionFont: typingsJapgolly.winrtUwp.Windows.Globalization.Fonts.LanguageFont = js.native
    
    /** Gets a font that is recommended for special UI elements, such as headings, that are displayed at sizes somewhat larger than typical UI body text. */
    /* CompleteClass */
    var uiHeadingFont: typingsJapgolly.winrtUwp.Windows.Globalization.Fonts.LanguageFont = js.native
    
    /** Gets a font that is recommended for special UI elements, such as headings in notifications or other app messages, that are displayed at UI body text size or only slightly larger yet need to be differentiated from UI body text. */
    /* CompleteClass */
    var uiNotificationHeadingFont: typingsJapgolly.winrtUwp.Windows.Globalization.Fonts.LanguageFont = js.native
    
    /** Gets a font that is recommended for typical UI body text. */
    /* CompleteClass */
    var uiTextFont: typingsJapgolly.winrtUwp.Windows.Globalization.Fonts.LanguageFont = js.native
    
    /** Gets a font that is recommended for special UI elements set at sizes much larger than typical UI body text. */
    /* CompleteClass */
    var uiTitleFont: typingsJapgolly.winrtUwp.Windows.Globalization.Fonts.LanguageFont = js.native
  }
}
