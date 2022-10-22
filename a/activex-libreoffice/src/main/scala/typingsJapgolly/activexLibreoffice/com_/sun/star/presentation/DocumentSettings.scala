package typingsJapgolly.activexLibreoffice.com_.sun.star.presentation

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.document.HeaderFooterSettings
import typingsJapgolly.activexLibreoffice.com_.sun.star.document.Settings
import typingsJapgolly.activexLibreoffice.com_.sun.star.i18n.XForbiddenCharacters
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** describes properties that apply to the whole presentation document. */
trait DocumentSettings
  extends StObject
     with Settings
     with HeaderFooterSettings {
  
  /** enables or disables the printing of the drawing pages */
  var IsPrintDrawing: Boolean
  
  /** enables or disables the fitting of the page to the printable area during print */
  var IsPrintFitPage: Boolean
  
  /** enables or disables the printing of the handout pages */
  var IsPrintHandout: Boolean
  
  /** enables or disables the printing of draw pages that are marked hidden */
  var IsPrintHiddenPages: Boolean
  
  /** enables or disables the printing of the notes pages */
  var IsPrintNotes: Boolean
  
  /** enables or disables the printing of the outline pages */
  var IsPrintOutline: Boolean
  
  /** if this is true and the paper size for printing is larger than the paper size of the printer than the content is tiled over multiple pages. */
  var IsPrintTilePage: Boolean
  
  /** is the number format used for page number fields */
  var PageNumberFormat: Double
  
  /**
    * If this is true, the distance between two paragraphs is the sum of ParaTopMargin of the previous and ParaBottomMargin of the next paragraph. If false,
    * only the greater of the two is chosen.
    */
  var ParagraphSummation: Boolean
}
object DocumentSettings {
  
  inline def apply(
    AddExternalLeading: Boolean,
    ApplyUserData: Boolean,
    AutoCalculate: Boolean,
    BitmapTableURL: String,
    CharacterCompressionType: Double,
    ColorTableURL: String,
    CurrentDatabaseCommand: String,
    CurrentDatabaseCommandType: Double,
    CurrentDatabaseDataSource: String,
    DashTableURL: String,
    DefaultTabStop: Double,
    EmbedFonts: Boolean,
    EmbedSystemFonts: Boolean,
    FieldAutoUpdate: Boolean,
    ForbiddenCharacters: XForbiddenCharacters,
    GradientTableURL: String,
    HatchTableURL: String,
    IsKernAsianPunctuation: Boolean,
    IsPrintBooklet: Boolean,
    IsPrintBookletBack: Boolean,
    IsPrintBookletFront: Boolean,
    IsPrintDate: Boolean,
    IsPrintDrawing: Boolean,
    IsPrintFitPage: Boolean,
    IsPrintHandout: Boolean,
    IsPrintHiddenPages: Boolean,
    IsPrintNotes: Boolean,
    IsPrintOutline: Boolean,
    IsPrintPageName: Boolean,
    IsPrintTilePage: Boolean,
    IsPrintTime: Boolean,
    LineEndTableURL: String,
    LinkUpdateMode: Double,
    PageNumberFormat: Double,
    ParagraphSummation: Boolean,
    PrintQuality: Double,
    PrinterIndependentLayout: Double,
    PrinterName: String,
    PrinterSetup: SafeArray[Double],
    PropertySetInfo: XPropertySetInfo,
    SaveVersionOnClose: Boolean,
    UpdateFromTemplate: Boolean,
    acquire: Callback,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Callback,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Callback,
    getPropertySetInfo: CallbackTo[XPropertySetInfo],
    getPropertyValue: String => Any,
    queryInterface: `type` => Any,
    release: Callback,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Callback,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Callback,
    setPropertyValue: (String, Any) => Callback
  ): DocumentSettings = {
    val __obj = js.Dynamic.literal(AddExternalLeading = AddExternalLeading.asInstanceOf[js.Any], ApplyUserData = ApplyUserData.asInstanceOf[js.Any], AutoCalculate = AutoCalculate.asInstanceOf[js.Any], BitmapTableURL = BitmapTableURL.asInstanceOf[js.Any], CharacterCompressionType = CharacterCompressionType.asInstanceOf[js.Any], ColorTableURL = ColorTableURL.asInstanceOf[js.Any], CurrentDatabaseCommand = CurrentDatabaseCommand.asInstanceOf[js.Any], CurrentDatabaseCommandType = CurrentDatabaseCommandType.asInstanceOf[js.Any], CurrentDatabaseDataSource = CurrentDatabaseDataSource.asInstanceOf[js.Any], DashTableURL = DashTableURL.asInstanceOf[js.Any], DefaultTabStop = DefaultTabStop.asInstanceOf[js.Any], EmbedFonts = EmbedFonts.asInstanceOf[js.Any], EmbedSystemFonts = EmbedSystemFonts.asInstanceOf[js.Any], FieldAutoUpdate = FieldAutoUpdate.asInstanceOf[js.Any], ForbiddenCharacters = ForbiddenCharacters.asInstanceOf[js.Any], GradientTableURL = GradientTableURL.asInstanceOf[js.Any], HatchTableURL = HatchTableURL.asInstanceOf[js.Any], IsKernAsianPunctuation = IsKernAsianPunctuation.asInstanceOf[js.Any], IsPrintBooklet = IsPrintBooklet.asInstanceOf[js.Any], IsPrintBookletBack = IsPrintBookletBack.asInstanceOf[js.Any], IsPrintBookletFront = IsPrintBookletFront.asInstanceOf[js.Any], IsPrintDate = IsPrintDate.asInstanceOf[js.Any], IsPrintDrawing = IsPrintDrawing.asInstanceOf[js.Any], IsPrintFitPage = IsPrintFitPage.asInstanceOf[js.Any], IsPrintHandout = IsPrintHandout.asInstanceOf[js.Any], IsPrintHiddenPages = IsPrintHiddenPages.asInstanceOf[js.Any], IsPrintNotes = IsPrintNotes.asInstanceOf[js.Any], IsPrintOutline = IsPrintOutline.asInstanceOf[js.Any], IsPrintPageName = IsPrintPageName.asInstanceOf[js.Any], IsPrintTilePage = IsPrintTilePage.asInstanceOf[js.Any], IsPrintTime = IsPrintTime.asInstanceOf[js.Any], LineEndTableURL = LineEndTableURL.asInstanceOf[js.Any], LinkUpdateMode = LinkUpdateMode.asInstanceOf[js.Any], PageNumberFormat = PageNumberFormat.asInstanceOf[js.Any], ParagraphSummation = ParagraphSummation.asInstanceOf[js.Any], PrintQuality = PrintQuality.asInstanceOf[js.Any], PrinterIndependentLayout = PrinterIndependentLayout.asInstanceOf[js.Any], PrinterName = PrinterName.asInstanceOf[js.Any], PrinterSetup = PrinterSetup.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], SaveVersionOnClose = SaveVersionOnClose.asInstanceOf[js.Any], UpdateFromTemplate = UpdateFromTemplate.asInstanceOf[js.Any], acquire = acquire.toJsFn, addPropertyChangeListener = js.Any.fromFunction2((t0: String, t1: XPropertyChangeListener) => (addPropertyChangeListener(t0, t1)).runNow()), addVetoableChangeListener = js.Any.fromFunction2((t0: String, t1: XVetoableChangeListener) => (addVetoableChangeListener(t0, t1)).runNow()), getPropertySetInfo = getPropertySetInfo.toJsFn, getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removePropertyChangeListener = js.Any.fromFunction2((t0: String, t1: XPropertyChangeListener) => (removePropertyChangeListener(t0, t1)).runNow()), removeVetoableChangeListener = js.Any.fromFunction2((t0: String, t1: XVetoableChangeListener) => (removeVetoableChangeListener(t0, t1)).runNow()), setPropertyValue = js.Any.fromFunction2((t0: String, t1: Any) => (setPropertyValue(t0, t1)).runNow()))
    __obj.asInstanceOf[DocumentSettings]
  }
  
  extension [Self <: DocumentSettings](x: Self) {
    
    inline def setIsPrintDrawing(value: Boolean): Self = StObject.set(x, "IsPrintDrawing", value.asInstanceOf[js.Any])
    
    inline def setIsPrintFitPage(value: Boolean): Self = StObject.set(x, "IsPrintFitPage", value.asInstanceOf[js.Any])
    
    inline def setIsPrintHandout(value: Boolean): Self = StObject.set(x, "IsPrintHandout", value.asInstanceOf[js.Any])
    
    inline def setIsPrintHiddenPages(value: Boolean): Self = StObject.set(x, "IsPrintHiddenPages", value.asInstanceOf[js.Any])
    
    inline def setIsPrintNotes(value: Boolean): Self = StObject.set(x, "IsPrintNotes", value.asInstanceOf[js.Any])
    
    inline def setIsPrintOutline(value: Boolean): Self = StObject.set(x, "IsPrintOutline", value.asInstanceOf[js.Any])
    
    inline def setIsPrintTilePage(value: Boolean): Self = StObject.set(x, "IsPrintTilePage", value.asInstanceOf[js.Any])
    
    inline def setPageNumberFormat(value: Double): Self = StObject.set(x, "PageNumberFormat", value.asInstanceOf[js.Any])
    
    inline def setParagraphSummation(value: Boolean): Self = StObject.set(x, "ParagraphSummation", value.asInstanceOf[js.Any])
  }
}
