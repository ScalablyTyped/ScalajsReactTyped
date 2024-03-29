package typingsJapgolly.activexLibreoffice.com_.sun.star.view

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides access to the settings for printing documents.
  *
  * These settings are printer independent but affect the rendering of the document.
  */
trait PrintSettings extends StObject {
  
  /**
    * determines how annotations are printed.
    * @see NotePrintMode
    */
  var PrintAnnotationMode: Double
  
  /**
    * If `TRUE` , all characters are printed in black.
    *
    * It is useful for printing colored text on a b/w printer.
    */
  var PrintBlackFonts: Boolean
  
  /** If `TRUE` , control shapes are included in printing. */
  var PrintControls: Boolean
  
  /** If `TRUE` , drawing objects (shapes) are included in printing. */
  var PrintDrawings: Boolean
  
  /** If `TRUE` , graphic objects are included in printing. */
  var PrintGraphics: Boolean
  
  /** If `TRUE` , left pages are included in printing. */
  var PrintLeftPages: Boolean
  
  /** If `TRUE` , the background of the page is printed. */
  var PrintPageBackground: Boolean
  
  /** If `TRUE` , the pages are printed in the order of prospects. */
  var PrintProspect: Boolean
  
  /**
    * If `TRUE` , the pages are printed in reverse order.
    *
    * The last page is printed first.
    */
  var PrintReversed: Boolean
  
  /** If `TRUE` , right pages are included in printing. */
  var PrintRightPages: Boolean
  
  /** If `TRUE` , tables are included in printing. */
  var PrintTables: Boolean
}
object PrintSettings {
  
  inline def apply(
    PrintAnnotationMode: Double,
    PrintBlackFonts: Boolean,
    PrintControls: Boolean,
    PrintDrawings: Boolean,
    PrintGraphics: Boolean,
    PrintLeftPages: Boolean,
    PrintPageBackground: Boolean,
    PrintProspect: Boolean,
    PrintReversed: Boolean,
    PrintRightPages: Boolean,
    PrintTables: Boolean
  ): PrintSettings = {
    val __obj = js.Dynamic.literal(PrintAnnotationMode = PrintAnnotationMode.asInstanceOf[js.Any], PrintBlackFonts = PrintBlackFonts.asInstanceOf[js.Any], PrintControls = PrintControls.asInstanceOf[js.Any], PrintDrawings = PrintDrawings.asInstanceOf[js.Any], PrintGraphics = PrintGraphics.asInstanceOf[js.Any], PrintLeftPages = PrintLeftPages.asInstanceOf[js.Any], PrintPageBackground = PrintPageBackground.asInstanceOf[js.Any], PrintProspect = PrintProspect.asInstanceOf[js.Any], PrintReversed = PrintReversed.asInstanceOf[js.Any], PrintRightPages = PrintRightPages.asInstanceOf[js.Any], PrintTables = PrintTables.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrintSettings]
  }
  
  extension [Self <: PrintSettings](x: Self) {
    
    inline def setPrintAnnotationMode(value: Double): Self = StObject.set(x, "PrintAnnotationMode", value.asInstanceOf[js.Any])
    
    inline def setPrintBlackFonts(value: Boolean): Self = StObject.set(x, "PrintBlackFonts", value.asInstanceOf[js.Any])
    
    inline def setPrintControls(value: Boolean): Self = StObject.set(x, "PrintControls", value.asInstanceOf[js.Any])
    
    inline def setPrintDrawings(value: Boolean): Self = StObject.set(x, "PrintDrawings", value.asInstanceOf[js.Any])
    
    inline def setPrintGraphics(value: Boolean): Self = StObject.set(x, "PrintGraphics", value.asInstanceOf[js.Any])
    
    inline def setPrintLeftPages(value: Boolean): Self = StObject.set(x, "PrintLeftPages", value.asInstanceOf[js.Any])
    
    inline def setPrintPageBackground(value: Boolean): Self = StObject.set(x, "PrintPageBackground", value.asInstanceOf[js.Any])
    
    inline def setPrintProspect(value: Boolean): Self = StObject.set(x, "PrintProspect", value.asInstanceOf[js.Any])
    
    inline def setPrintReversed(value: Boolean): Self = StObject.set(x, "PrintReversed", value.asInstanceOf[js.Any])
    
    inline def setPrintRightPages(value: Boolean): Self = StObject.set(x, "PrintRightPages", value.asInstanceOf[js.Any])
    
    inline def setPrintTables(value: Boolean): Self = StObject.set(x, "PrintTables", value.asInstanceOf[js.Any])
  }
}
