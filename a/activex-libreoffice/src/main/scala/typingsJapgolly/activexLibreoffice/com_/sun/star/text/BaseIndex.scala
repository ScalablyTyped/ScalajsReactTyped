package typingsJapgolly.activexLibreoffice.com_.sun.star.text

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XIndexReplace
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.style.GraphicLocation
import typingsJapgolly.activexLibreoffice.com_.sun.star.util.Color
import typingsJapgolly.activexLibreoffice.com_.sun.star.util.XRefreshListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.util.XRefreshable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * specifies the basic service of different indexes within a document.
  * @see com.sun.star.text.DocumentIndex
  * @see com.sun.star.text.ContentIndex
  * @see com.sun.star.text.UserDefinedIndex
  * @see com.sun.star.text.IllustrationsIndex
  * @see com.sun.star.text.TableIndex
  * @see com.sun.star.text.ObjectIndex
  */
trait BaseIndex
  extends StObject
     with XDocumentIndex
     with XRefreshable {
  
  /** specifies the color of the background. */
  var BackColor: Color
  
  /** contains the name of the filter of the graphic file that is displayed as background graphic */
  var BackGraphicFilter: String
  
  /**
    * determines the position of the background graphic.
    * @see GraphicLocation
    */
  var BackGraphicLocation: GraphicLocation
  
  /** contains the URL of a graphic file that is displayed as background graphic */
  var BackGraphicURL: String
  
  /** If `TRUE` , the background color value in "BackColor" is not visible. */
  var BackTransparent: Boolean
  
  /** the text section containing the content of the index */
  var ContentSection: XTextSection
  
  /**
    * determines if the content of the document index is created from the complete document content or from the current chapter only.
    *
    * It is not available in the bibliography
    */
  var CreateFromChapter: Boolean
  
  /** the text section containing the header of the index */
  var HeaderSection: XTextSection
  
  /** determines if the index is protected. */
  var IsProtected: Boolean
  
  /**
    * returns the interface of the level format of the index.
    *
    * The description of the format of the levels depends on the type of the document index.
    * @see DocumentIndexLevelFormat
    */
  var LevelFormat: XIndexReplace
  
  /** contains the name of the paragraph style that is applied to the heading. */
  var ParaStyleHeading: String
  
  /** contains the name of the paragraph style that is applied to the 1st level. */
  var ParaStyleLevel1: String
  
  /** contains the name of the paragraph style that is applied to the 10th level. */
  var ParaStyleLevel10: String
  
  /** contains the name of the paragraph style that is applied to the 2nd level. */
  var ParaStyleLevel2: String
  
  /** contains the name of the paragraph style that is applied to the 3rd level. */
  var ParaStyleLevel3: String
  
  /** contains the name of the paragraph style that is applied to the 4th level. */
  var ParaStyleLevel4: String
  
  /** contains the name of the paragraph style that is applied to the 5th level. */
  var ParaStyleLevel5: String
  
  /** contains the name of the paragraph style that is applied to the 6th level. */
  var ParaStyleLevel6: String
  
  /** contains the name of the paragraph style that is applied to the 7th level. */
  var ParaStyleLevel7: String
  
  /** contains the name of the paragraph style that is applied to the 8th level. */
  var ParaStyleLevel8: String
  
  /** contains the name of the paragraph style that is applied to the 9th level. */
  var ParaStyleLevel9: String
  
  /** contains the name of the paragraph style that is applied to the separator level. */
  var ParaStyleSeparator: String
  
  /** contains the column interface. */
  var TextColumns: XTextColumns
  
  /** contains the title of the index. */
  var Title: String
}
object BaseIndex {
  
  inline def apply(
    Anchor: XTextRange,
    BackColor: Color,
    BackGraphicFilter: String,
    BackGraphicLocation: GraphicLocation,
    BackGraphicURL: String,
    BackTransparent: Boolean,
    ContentSection: XTextSection,
    CreateFromChapter: Boolean,
    HeaderSection: XTextSection,
    IsProtected: Boolean,
    LevelFormat: XIndexReplace,
    ParaStyleHeading: String,
    ParaStyleLevel1: String,
    ParaStyleLevel10: String,
    ParaStyleLevel2: String,
    ParaStyleLevel3: String,
    ParaStyleLevel4: String,
    ParaStyleLevel5: String,
    ParaStyleLevel6: String,
    ParaStyleLevel7: String,
    ParaStyleLevel8: String,
    ParaStyleLevel9: String,
    ParaStyleSeparator: String,
    ServiceName: String,
    TextColumns: XTextColumns,
    Title: String,
    acquire: Callback,
    addEventListener: XEventListener => Callback,
    addRefreshListener: XRefreshListener => Callback,
    attach: XTextRange => Callback,
    dispose: Callback,
    getAnchor: CallbackTo[XTextRange],
    getServiceName: CallbackTo[String],
    queryInterface: `type` => Any,
    refresh: Callback,
    release: Callback,
    removeEventListener: XEventListener => Callback,
    removeRefreshListener: XRefreshListener => Callback,
    update: Callback
  ): BaseIndex = {
    val __obj = js.Dynamic.literal(Anchor = Anchor.asInstanceOf[js.Any], BackColor = BackColor.asInstanceOf[js.Any], BackGraphicFilter = BackGraphicFilter.asInstanceOf[js.Any], BackGraphicLocation = BackGraphicLocation.asInstanceOf[js.Any], BackGraphicURL = BackGraphicURL.asInstanceOf[js.Any], BackTransparent = BackTransparent.asInstanceOf[js.Any], ContentSection = ContentSection.asInstanceOf[js.Any], CreateFromChapter = CreateFromChapter.asInstanceOf[js.Any], HeaderSection = HeaderSection.asInstanceOf[js.Any], IsProtected = IsProtected.asInstanceOf[js.Any], LevelFormat = LevelFormat.asInstanceOf[js.Any], ParaStyleHeading = ParaStyleHeading.asInstanceOf[js.Any], ParaStyleLevel1 = ParaStyleLevel1.asInstanceOf[js.Any], ParaStyleLevel10 = ParaStyleLevel10.asInstanceOf[js.Any], ParaStyleLevel2 = ParaStyleLevel2.asInstanceOf[js.Any], ParaStyleLevel3 = ParaStyleLevel3.asInstanceOf[js.Any], ParaStyleLevel4 = ParaStyleLevel4.asInstanceOf[js.Any], ParaStyleLevel5 = ParaStyleLevel5.asInstanceOf[js.Any], ParaStyleLevel6 = ParaStyleLevel6.asInstanceOf[js.Any], ParaStyleLevel7 = ParaStyleLevel7.asInstanceOf[js.Any], ParaStyleLevel8 = ParaStyleLevel8.asInstanceOf[js.Any], ParaStyleLevel9 = ParaStyleLevel9.asInstanceOf[js.Any], ParaStyleSeparator = ParaStyleSeparator.asInstanceOf[js.Any], ServiceName = ServiceName.asInstanceOf[js.Any], TextColumns = TextColumns.asInstanceOf[js.Any], Title = Title.asInstanceOf[js.Any], acquire = acquire.toJsFn, addEventListener = js.Any.fromFunction1((t0: XEventListener) => addEventListener(t0).runNow()), addRefreshListener = js.Any.fromFunction1((t0: XRefreshListener) => addRefreshListener(t0).runNow()), attach = js.Any.fromFunction1((t0: XTextRange) => attach(t0).runNow()), dispose = dispose.toJsFn, getAnchor = getAnchor.toJsFn, getServiceName = getServiceName.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), refresh = refresh.toJsFn, release = release.toJsFn, removeEventListener = js.Any.fromFunction1((t0: XEventListener) => removeEventListener(t0).runNow()), removeRefreshListener = js.Any.fromFunction1((t0: XRefreshListener) => removeRefreshListener(t0).runNow()), update = update.toJsFn)
    __obj.asInstanceOf[BaseIndex]
  }
  
  extension [Self <: BaseIndex](x: Self) {
    
    inline def setBackColor(value: Color): Self = StObject.set(x, "BackColor", value.asInstanceOf[js.Any])
    
    inline def setBackGraphicFilter(value: String): Self = StObject.set(x, "BackGraphicFilter", value.asInstanceOf[js.Any])
    
    inline def setBackGraphicLocation(value: GraphicLocation): Self = StObject.set(x, "BackGraphicLocation", value.asInstanceOf[js.Any])
    
    inline def setBackGraphicURL(value: String): Self = StObject.set(x, "BackGraphicURL", value.asInstanceOf[js.Any])
    
    inline def setBackTransparent(value: Boolean): Self = StObject.set(x, "BackTransparent", value.asInstanceOf[js.Any])
    
    inline def setContentSection(value: XTextSection): Self = StObject.set(x, "ContentSection", value.asInstanceOf[js.Any])
    
    inline def setCreateFromChapter(value: Boolean): Self = StObject.set(x, "CreateFromChapter", value.asInstanceOf[js.Any])
    
    inline def setHeaderSection(value: XTextSection): Self = StObject.set(x, "HeaderSection", value.asInstanceOf[js.Any])
    
    inline def setIsProtected(value: Boolean): Self = StObject.set(x, "IsProtected", value.asInstanceOf[js.Any])
    
    inline def setLevelFormat(value: XIndexReplace): Self = StObject.set(x, "LevelFormat", value.asInstanceOf[js.Any])
    
    inline def setParaStyleHeading(value: String): Self = StObject.set(x, "ParaStyleHeading", value.asInstanceOf[js.Any])
    
    inline def setParaStyleLevel1(value: String): Self = StObject.set(x, "ParaStyleLevel1", value.asInstanceOf[js.Any])
    
    inline def setParaStyleLevel10(value: String): Self = StObject.set(x, "ParaStyleLevel10", value.asInstanceOf[js.Any])
    
    inline def setParaStyleLevel2(value: String): Self = StObject.set(x, "ParaStyleLevel2", value.asInstanceOf[js.Any])
    
    inline def setParaStyleLevel3(value: String): Self = StObject.set(x, "ParaStyleLevel3", value.asInstanceOf[js.Any])
    
    inline def setParaStyleLevel4(value: String): Self = StObject.set(x, "ParaStyleLevel4", value.asInstanceOf[js.Any])
    
    inline def setParaStyleLevel5(value: String): Self = StObject.set(x, "ParaStyleLevel5", value.asInstanceOf[js.Any])
    
    inline def setParaStyleLevel6(value: String): Self = StObject.set(x, "ParaStyleLevel6", value.asInstanceOf[js.Any])
    
    inline def setParaStyleLevel7(value: String): Self = StObject.set(x, "ParaStyleLevel7", value.asInstanceOf[js.Any])
    
    inline def setParaStyleLevel8(value: String): Self = StObject.set(x, "ParaStyleLevel8", value.asInstanceOf[js.Any])
    
    inline def setParaStyleLevel9(value: String): Self = StObject.set(x, "ParaStyleLevel9", value.asInstanceOf[js.Any])
    
    inline def setParaStyleSeparator(value: String): Self = StObject.set(x, "ParaStyleSeparator", value.asInstanceOf[js.Any])
    
    inline def setTextColumns(value: XTextColumns): Self = StObject.set(x, "TextColumns", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "Title", value.asInstanceOf[js.Any])
  }
}
