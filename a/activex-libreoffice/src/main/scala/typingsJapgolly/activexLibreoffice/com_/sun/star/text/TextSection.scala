package typingsJapgolly.activexLibreoffice.com_.sun.star.text

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.PropertyState
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertyState
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XNameContainer
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XNamed
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.style.GraphicLocation
import typingsJapgolly.activexLibreoffice.com_.sun.star.xml.UserDefinedAttributesSupplier
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A {@link TextSection} is a range of complete paragraphs within a text.
  *
  * The content of the section may be the content of a link into another document, a link from the same document, or the result of a DDE operation.
  *
  * {@link TextSection} instances can be linked from and to other texts.
  */
trait TextSection
  extends StObject
     with TextContent
     with UserDefinedAttributesSupplier
     with XTextSection
     with XNamed
     with XPropertySet
     with XPropertyState {
  
  /** contains the name of the file filter for the background graphic. */
  var BackGraphicFilter: String
  
  /**
    * determines the position of the background graphic.
    * @see GraphicLocation
    */
  var BackGraphicLocation: GraphicLocation
  
  /** contains the URL for the background graphic. */
  var BackGraphicURL: String
  
  /**
    * This property contains a conditional expression.
    *
    * If the result of the conditional expression is `TRUE` and the property {@link TextSection.IsVisible} is `FALSE` , then the section is hidden.
    */
  var Condition: String
  
  /**
    * specifies the source element of the command string for a DDE operation.
    *
    * The element can be i.e. a name of a cell in a sheet or a bookmark.
    */
  var DDECommandElement: String
  
  /** specifies the source file name of the command string for a DDE operation. */
  var DDECommandFile: String
  
  /**
    * specifies the type of the command string for a DDE operation.
    *
    * The type can be the name of the application that provides a DDE source.
    */
  var DDECommandType: String
  
  /** determines whether endnotes inside the section are displayed at the end of the section text. */
  var EndnoteIsCollectAtTextEnd: Boolean
  
  /** determines whether the endnotes within the section use an own numbering format. This is only valid if `EndnoteIsRestartNumbering` is set. */
  var EndnoteIsOwnNumbering: Boolean
  
  /** determines whether the endnotes numbering restarts within the section. This is only valid if `EndnoteIsRestartNumbering` is set. */
  var EndnoteIsRestartNumbering: Boolean
  
  /** determines the prefix that is display before the endnote number. This is only valid if `EndnoteIsOwnNumbering` is set. */
  var EndnoteNumberingPrefix: String
  
  /** determines the suffix that is display after the endnote number. This is only valid if `EndnoteIsOwnNumbering` is set. */
  var EndnoteNumberingSuffix: String
  
  /**
    * determines the numbering type of the endnote numbering as a value of {@link com.sun.star.style.NumberingType} . This is only valid if
    * `EndoteIsOwnNumbering` is set.
    */
  var EndnoteNumberingType: Double
  
  /** determines at which number the endnote numbering inside of the section starts. This is only valid if `EndnoteIsRestartNumbering` is set. */
  var EndnoteRestartNumberingAt: Double
  
  /** If this property is set, then the content of the section is read from the specified document. */
  var FileLink: SectionFileLink
  
  /** determines whether footnotes inside the section are displayed at the end of the section text. */
  var FootnoteIsCollectAtTextEnd: Boolean
  
  /** determines whether the footnotes within the section use an own numbering format. This is only valid if `FootnoteIsRestartNumbering` is set. */
  var FootnoteIsOwnNumbering: Boolean
  
  /** determines whether the footnotes numbering restarts within the section. This is only valid if `FootnoteIsRestartNumbering` is set. */
  var FootnoteIsRestartNumbering: Boolean
  
  /** determines the prefix that is display before the footnote number. This is only valid if `FootnoteIsOwnNumbering` is set. */
  var FootnoteNumberingPrefix: String
  
  /** determines the suffix that is display after of the footnote number. This is only valid if `FootnoteIsOwnNumbering` is set. */
  var FootnoteNumberingSuffix: String
  
  /**
    * determines the numbering type of the footnote numbering as a value of {@link com.sun.star.style.NumberingType} . This is only valid if
    * `FootnoteIsOwnNumbering` is set.
    */
  var FootnoteNumberingType: Double
  
  /** determines at which number the footnote numbering inside of the section starts. This is only valid if `FootnoteIsRestartNumbering` is set. */
  var FootnoteRestartNumberingAt: Double
  
  /** determines if a DDE link is updated automatically. */
  var IsAutomaticUpdate: Boolean
  
  /** If this property is `TRUE` , the text section is protected and cannot be modified from the user interface. */
  var IsProtected: Boolean
  
  /** If this property is `FALSE` , the text section is hidden. */
  var IsVisible: Boolean
  
  /**
    * specifies the source of a file link in the document that is specified in {@link TextSection.FileLink} .
    *
    * The source may be a text section or a bookmark. If {@link TextSection.FileLink} is empty, then the current document is searched for the source. If
    * this property is empty and {@link TextSection.FileLink} is set, then the complete document content is linked into this section.
    */
  var LinkRegion: String
  
  /** determines the left margin of the section */
  var SectionLeftMargin: Double
  
  /** determines the left margin of the section */
  var SectionRightMargin: Double
  
  /** allows columns to be set into the text section */
  var TextColumns: XTextColumns
}
object TextSection {
  
  inline def apply(
    Anchor: XTextRange,
    AnchorType: TextContentAnchorType,
    AnchorTypes: SafeArray[TextContentAnchorType],
    BackGraphicFilter: String,
    BackGraphicLocation: GraphicLocation,
    BackGraphicURL: String,
    ChildSections: SafeArray[XTextSection],
    Condition: String,
    DDECommandElement: String,
    DDECommandFile: String,
    DDECommandType: String,
    EndnoteIsCollectAtTextEnd: Boolean,
    EndnoteIsOwnNumbering: Boolean,
    EndnoteIsRestartNumbering: Boolean,
    EndnoteNumberingPrefix: String,
    EndnoteNumberingSuffix: String,
    EndnoteNumberingType: Double,
    EndnoteRestartNumberingAt: Double,
    FileLink: SectionFileLink,
    FootnoteIsCollectAtTextEnd: Boolean,
    FootnoteIsOwnNumbering: Boolean,
    FootnoteIsRestartNumbering: Boolean,
    FootnoteNumberingPrefix: String,
    FootnoteNumberingSuffix: String,
    FootnoteNumberingType: Double,
    FootnoteRestartNumberingAt: Double,
    IsAutomaticUpdate: Boolean,
    IsProtected: Boolean,
    IsVisible: Boolean,
    LinkRegion: String,
    Name: String,
    ParentSection: XTextSection,
    PropertySetInfo: XPropertySetInfo,
    SectionLeftMargin: Double,
    SectionRightMargin: Double,
    TextColumns: XTextColumns,
    TextWrap: WrapTextMode,
    UserDefinedAttributes: XNameContainer,
    acquire: Callback,
    addEventListener: XEventListener => Callback,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Callback,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Callback,
    attach: XTextRange => Callback,
    dispose: Callback,
    getAnchor: CallbackTo[XTextRange],
    getChildSections: CallbackTo[SafeArray[XTextSection]],
    getName: CallbackTo[String],
    getParentSection: CallbackTo[XTextSection],
    getPropertyDefault: String => Any,
    getPropertySetInfo: CallbackTo[XPropertySetInfo],
    getPropertyState: String => PropertyState,
    getPropertyStates: SeqEquiv[String] => SafeArray[PropertyState],
    getPropertyValue: String => Any,
    queryInterface: `type` => Any,
    release: Callback,
    removeEventListener: XEventListener => Callback,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Callback,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Callback,
    setName: String => Callback,
    setPropertyToDefault: String => Callback,
    setPropertyValue: (String, Any) => Callback
  ): TextSection = {
    val __obj = js.Dynamic.literal(Anchor = Anchor.asInstanceOf[js.Any], AnchorType = AnchorType.asInstanceOf[js.Any], AnchorTypes = AnchorTypes.asInstanceOf[js.Any], BackGraphicFilter = BackGraphicFilter.asInstanceOf[js.Any], BackGraphicLocation = BackGraphicLocation.asInstanceOf[js.Any], BackGraphicURL = BackGraphicURL.asInstanceOf[js.Any], ChildSections = ChildSections.asInstanceOf[js.Any], Condition = Condition.asInstanceOf[js.Any], DDECommandElement = DDECommandElement.asInstanceOf[js.Any], DDECommandFile = DDECommandFile.asInstanceOf[js.Any], DDECommandType = DDECommandType.asInstanceOf[js.Any], EndnoteIsCollectAtTextEnd = EndnoteIsCollectAtTextEnd.asInstanceOf[js.Any], EndnoteIsOwnNumbering = EndnoteIsOwnNumbering.asInstanceOf[js.Any], EndnoteIsRestartNumbering = EndnoteIsRestartNumbering.asInstanceOf[js.Any], EndnoteNumberingPrefix = EndnoteNumberingPrefix.asInstanceOf[js.Any], EndnoteNumberingSuffix = EndnoteNumberingSuffix.asInstanceOf[js.Any], EndnoteNumberingType = EndnoteNumberingType.asInstanceOf[js.Any], EndnoteRestartNumberingAt = EndnoteRestartNumberingAt.asInstanceOf[js.Any], FileLink = FileLink.asInstanceOf[js.Any], FootnoteIsCollectAtTextEnd = FootnoteIsCollectAtTextEnd.asInstanceOf[js.Any], FootnoteIsOwnNumbering = FootnoteIsOwnNumbering.asInstanceOf[js.Any], FootnoteIsRestartNumbering = FootnoteIsRestartNumbering.asInstanceOf[js.Any], FootnoteNumberingPrefix = FootnoteNumberingPrefix.asInstanceOf[js.Any], FootnoteNumberingSuffix = FootnoteNumberingSuffix.asInstanceOf[js.Any], FootnoteNumberingType = FootnoteNumberingType.asInstanceOf[js.Any], FootnoteRestartNumberingAt = FootnoteRestartNumberingAt.asInstanceOf[js.Any], IsAutomaticUpdate = IsAutomaticUpdate.asInstanceOf[js.Any], IsProtected = IsProtected.asInstanceOf[js.Any], IsVisible = IsVisible.asInstanceOf[js.Any], LinkRegion = LinkRegion.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], ParentSection = ParentSection.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], SectionLeftMargin = SectionLeftMargin.asInstanceOf[js.Any], SectionRightMargin = SectionRightMargin.asInstanceOf[js.Any], TextColumns = TextColumns.asInstanceOf[js.Any], TextWrap = TextWrap.asInstanceOf[js.Any], UserDefinedAttributes = UserDefinedAttributes.asInstanceOf[js.Any], acquire = acquire.toJsFn, addEventListener = js.Any.fromFunction1((t0: XEventListener) => addEventListener(t0).runNow()), addPropertyChangeListener = js.Any.fromFunction2((t0: String, t1: XPropertyChangeListener) => (addPropertyChangeListener(t0, t1)).runNow()), addVetoableChangeListener = js.Any.fromFunction2((t0: String, t1: XVetoableChangeListener) => (addVetoableChangeListener(t0, t1)).runNow()), attach = js.Any.fromFunction1((t0: XTextRange) => attach(t0).runNow()), dispose = dispose.toJsFn, getAnchor = getAnchor.toJsFn, getChildSections = getChildSections.toJsFn, getName = getName.toJsFn, getParentSection = getParentSection.toJsFn, getPropertyDefault = js.Any.fromFunction1(getPropertyDefault), getPropertySetInfo = getPropertySetInfo.toJsFn, getPropertyState = js.Any.fromFunction1(getPropertyState), getPropertyStates = js.Any.fromFunction1(getPropertyStates), getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeEventListener = js.Any.fromFunction1((t0: XEventListener) => removeEventListener(t0).runNow()), removePropertyChangeListener = js.Any.fromFunction2((t0: String, t1: XPropertyChangeListener) => (removePropertyChangeListener(t0, t1)).runNow()), removeVetoableChangeListener = js.Any.fromFunction2((t0: String, t1: XVetoableChangeListener) => (removeVetoableChangeListener(t0, t1)).runNow()), setName = js.Any.fromFunction1((t0: String) => setName(t0).runNow()), setPropertyToDefault = js.Any.fromFunction1((t0: String) => setPropertyToDefault(t0).runNow()), setPropertyValue = js.Any.fromFunction2((t0: String, t1: Any) => (setPropertyValue(t0, t1)).runNow()))
    __obj.asInstanceOf[TextSection]
  }
  
  extension [Self <: TextSection](x: Self) {
    
    inline def setBackGraphicFilter(value: String): Self = StObject.set(x, "BackGraphicFilter", value.asInstanceOf[js.Any])
    
    inline def setBackGraphicLocation(value: GraphicLocation): Self = StObject.set(x, "BackGraphicLocation", value.asInstanceOf[js.Any])
    
    inline def setBackGraphicURL(value: String): Self = StObject.set(x, "BackGraphicURL", value.asInstanceOf[js.Any])
    
    inline def setCondition(value: String): Self = StObject.set(x, "Condition", value.asInstanceOf[js.Any])
    
    inline def setDDECommandElement(value: String): Self = StObject.set(x, "DDECommandElement", value.asInstanceOf[js.Any])
    
    inline def setDDECommandFile(value: String): Self = StObject.set(x, "DDECommandFile", value.asInstanceOf[js.Any])
    
    inline def setDDECommandType(value: String): Self = StObject.set(x, "DDECommandType", value.asInstanceOf[js.Any])
    
    inline def setEndnoteIsCollectAtTextEnd(value: Boolean): Self = StObject.set(x, "EndnoteIsCollectAtTextEnd", value.asInstanceOf[js.Any])
    
    inline def setEndnoteIsOwnNumbering(value: Boolean): Self = StObject.set(x, "EndnoteIsOwnNumbering", value.asInstanceOf[js.Any])
    
    inline def setEndnoteIsRestartNumbering(value: Boolean): Self = StObject.set(x, "EndnoteIsRestartNumbering", value.asInstanceOf[js.Any])
    
    inline def setEndnoteNumberingPrefix(value: String): Self = StObject.set(x, "EndnoteNumberingPrefix", value.asInstanceOf[js.Any])
    
    inline def setEndnoteNumberingSuffix(value: String): Self = StObject.set(x, "EndnoteNumberingSuffix", value.asInstanceOf[js.Any])
    
    inline def setEndnoteNumberingType(value: Double): Self = StObject.set(x, "EndnoteNumberingType", value.asInstanceOf[js.Any])
    
    inline def setEndnoteRestartNumberingAt(value: Double): Self = StObject.set(x, "EndnoteRestartNumberingAt", value.asInstanceOf[js.Any])
    
    inline def setFileLink(value: SectionFileLink): Self = StObject.set(x, "FileLink", value.asInstanceOf[js.Any])
    
    inline def setFootnoteIsCollectAtTextEnd(value: Boolean): Self = StObject.set(x, "FootnoteIsCollectAtTextEnd", value.asInstanceOf[js.Any])
    
    inline def setFootnoteIsOwnNumbering(value: Boolean): Self = StObject.set(x, "FootnoteIsOwnNumbering", value.asInstanceOf[js.Any])
    
    inline def setFootnoteIsRestartNumbering(value: Boolean): Self = StObject.set(x, "FootnoteIsRestartNumbering", value.asInstanceOf[js.Any])
    
    inline def setFootnoteNumberingPrefix(value: String): Self = StObject.set(x, "FootnoteNumberingPrefix", value.asInstanceOf[js.Any])
    
    inline def setFootnoteNumberingSuffix(value: String): Self = StObject.set(x, "FootnoteNumberingSuffix", value.asInstanceOf[js.Any])
    
    inline def setFootnoteNumberingType(value: Double): Self = StObject.set(x, "FootnoteNumberingType", value.asInstanceOf[js.Any])
    
    inline def setFootnoteRestartNumberingAt(value: Double): Self = StObject.set(x, "FootnoteRestartNumberingAt", value.asInstanceOf[js.Any])
    
    inline def setIsAutomaticUpdate(value: Boolean): Self = StObject.set(x, "IsAutomaticUpdate", value.asInstanceOf[js.Any])
    
    inline def setIsProtected(value: Boolean): Self = StObject.set(x, "IsProtected", value.asInstanceOf[js.Any])
    
    inline def setIsVisible(value: Boolean): Self = StObject.set(x, "IsVisible", value.asInstanceOf[js.Any])
    
    inline def setLinkRegion(value: String): Self = StObject.set(x, "LinkRegion", value.asInstanceOf[js.Any])
    
    inline def setSectionLeftMargin(value: Double): Self = StObject.set(x, "SectionLeftMargin", value.asInstanceOf[js.Any])
    
    inline def setSectionRightMargin(value: Double): Self = StObject.set(x, "SectionRightMargin", value.asInstanceOf[js.Any])
    
    inline def setTextColumns(value: XTextColumns): Self = StObject.set(x, "TextColumns", value.asInstanceOf[js.Any])
  }
}
