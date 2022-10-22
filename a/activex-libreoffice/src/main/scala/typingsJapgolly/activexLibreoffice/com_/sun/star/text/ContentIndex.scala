package typingsJapgolly.activexLibreoffice.com_.sun.star.text

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XIndexReplace
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.style.GraphicLocation
import typingsJapgolly.activexLibreoffice.com_.sun.star.util.Color
import typingsJapgolly.activexLibreoffice.com_.sun.star.util.XRefreshListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * specifies service of content indexes within a document.
  * @see com.sun.star.text.BaseIndex
  */
trait ContentIndex
  extends StObject
     with BaseIndex {
  
  /** contains `TRUE` if the document index marks are included in this index. */
  var CreateFromMarks: Boolean
  
  /** determines if the document index is created from outlines. */
  var CreateFromOutline: Boolean
  
  /** determines the depth of outline levels that are included into the content index. */
  var Level: Double
  
  /**
    * contains the interface to access the paragraph style names that are included in this index.
    * @see DocumentIndexParagraphStyles
    */
  var LevelParagraphStyles: XIndexReplace
}
object ContentIndex {
  
  inline def apply(
    Anchor: XTextRange,
    BackColor: Color,
    BackGraphicFilter: String,
    BackGraphicLocation: GraphicLocation,
    BackGraphicURL: String,
    BackTransparent: Boolean,
    ContentSection: XTextSection,
    CreateFromChapter: Boolean,
    CreateFromMarks: Boolean,
    CreateFromOutline: Boolean,
    HeaderSection: XTextSection,
    IsProtected: Boolean,
    Level: Double,
    LevelFormat: XIndexReplace,
    LevelParagraphStyles: XIndexReplace,
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
  ): ContentIndex = {
    val __obj = js.Dynamic.literal(Anchor = Anchor.asInstanceOf[js.Any], BackColor = BackColor.asInstanceOf[js.Any], BackGraphicFilter = BackGraphicFilter.asInstanceOf[js.Any], BackGraphicLocation = BackGraphicLocation.asInstanceOf[js.Any], BackGraphicURL = BackGraphicURL.asInstanceOf[js.Any], BackTransparent = BackTransparent.asInstanceOf[js.Any], ContentSection = ContentSection.asInstanceOf[js.Any], CreateFromChapter = CreateFromChapter.asInstanceOf[js.Any], CreateFromMarks = CreateFromMarks.asInstanceOf[js.Any], CreateFromOutline = CreateFromOutline.asInstanceOf[js.Any], HeaderSection = HeaderSection.asInstanceOf[js.Any], IsProtected = IsProtected.asInstanceOf[js.Any], Level = Level.asInstanceOf[js.Any], LevelFormat = LevelFormat.asInstanceOf[js.Any], LevelParagraphStyles = LevelParagraphStyles.asInstanceOf[js.Any], ParaStyleHeading = ParaStyleHeading.asInstanceOf[js.Any], ParaStyleLevel1 = ParaStyleLevel1.asInstanceOf[js.Any], ParaStyleLevel10 = ParaStyleLevel10.asInstanceOf[js.Any], ParaStyleLevel2 = ParaStyleLevel2.asInstanceOf[js.Any], ParaStyleLevel3 = ParaStyleLevel3.asInstanceOf[js.Any], ParaStyleLevel4 = ParaStyleLevel4.asInstanceOf[js.Any], ParaStyleLevel5 = ParaStyleLevel5.asInstanceOf[js.Any], ParaStyleLevel6 = ParaStyleLevel6.asInstanceOf[js.Any], ParaStyleLevel7 = ParaStyleLevel7.asInstanceOf[js.Any], ParaStyleLevel8 = ParaStyleLevel8.asInstanceOf[js.Any], ParaStyleLevel9 = ParaStyleLevel9.asInstanceOf[js.Any], ParaStyleSeparator = ParaStyleSeparator.asInstanceOf[js.Any], ServiceName = ServiceName.asInstanceOf[js.Any], TextColumns = TextColumns.asInstanceOf[js.Any], Title = Title.asInstanceOf[js.Any], acquire = acquire.toJsFn, addEventListener = js.Any.fromFunction1((t0: XEventListener) => addEventListener(t0).runNow()), addRefreshListener = js.Any.fromFunction1((t0: XRefreshListener) => addRefreshListener(t0).runNow()), attach = js.Any.fromFunction1((t0: XTextRange) => attach(t0).runNow()), dispose = dispose.toJsFn, getAnchor = getAnchor.toJsFn, getServiceName = getServiceName.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), refresh = refresh.toJsFn, release = release.toJsFn, removeEventListener = js.Any.fromFunction1((t0: XEventListener) => removeEventListener(t0).runNow()), removeRefreshListener = js.Any.fromFunction1((t0: XRefreshListener) => removeRefreshListener(t0).runNow()), update = update.toJsFn)
    __obj.asInstanceOf[ContentIndex]
  }
  
  extension [Self <: ContentIndex](x: Self) {
    
    inline def setCreateFromMarks(value: Boolean): Self = StObject.set(x, "CreateFromMarks", value.asInstanceOf[js.Any])
    
    inline def setCreateFromOutline(value: Boolean): Self = StObject.set(x, "CreateFromOutline", value.asInstanceOf[js.Any])
    
    inline def setLevel(value: Double): Self = StObject.set(x, "Level", value.asInstanceOf[js.Any])
    
    inline def setLevelParagraphStyles(value: XIndexReplace): Self = StObject.set(x, "LevelParagraphStyles", value.asInstanceOf[js.Any])
  }
}
