package typingsJapgolly.activexLibreoffice.com_.sun.star.sheet

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.FontSlant
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.table.CellHoriJustify
import typingsJapgolly.activexLibreoffice.com_.sun.star.table.CellOrientation
import typingsJapgolly.activexLibreoffice.com_.sun.star.table.ShadowFormat
import typingsJapgolly.activexLibreoffice.com_.sun.star.table.TableBorder
import typingsJapgolly.activexLibreoffice.com_.sun.star.table.TableBorder2
import typingsJapgolly.activexLibreoffice.com_.sun.star.util.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** represents a field in an AutoFormat. A field contains all cell properties for a specific position in an AutoFormat. */
trait TableAutoFormatField
  extends StObject
     with XPropertySet {
  
  /** contains the cell background color. */
  var CellBackColor: Color
  
  /** contains the value of the text color. */
  var CharColor: Color
  
  /** is `TRUE` if the characters are contoured. */
  var CharContoured: Boolean
  
  /** is `TRUE` if the characters are crossed out. */
  var CharCrossedOut: Boolean
  
  /** contains the value of the character set of the western font. */
  var CharFontCharSet: String
  
  /** contains the value of the character set of the Asian font. */
  var CharFontCharSetAsian: String
  
  /** contains the value of the character set of the complex font. */
  var CharFontCharSetComplex: String
  
  /** contains the value of the western font family. */
  var CharFontFamily: String
  
  /** contains the value of the Asian font family. */
  var CharFontFamilyAsian: String
  
  /** contains the value of the complex font family. */
  var CharFontFamilyComplex: String
  
  /** specifies the name of the western font. */
  var CharFontName: String
  
  /** specifies the name of the Asian font. */
  var CharFontNameAsian: String
  
  /** specifies the name of the complex font. */
  var CharFontNameComplex: String
  
  /** contains the value of the pitch of the western font. */
  var CharFontPitch: String
  
  /** contains the value of the pitch of the Asian font. */
  var CharFontPitchAsian: String
  
  /** contains the value of the pitch of the complex font. */
  var CharFontPitchComplex: String
  
  /** specifies the name of the western font style. */
  var CharFontStyleName: String
  
  /** specifies the name of the Asian font style. */
  var CharFontStyleNameAsian: String
  
  /** specifies the name of the complex font style. */
  var CharFontStyleNameComplex: String
  
  /** contains the height of characters of the western font in point. */
  var CharHeight: Double
  
  /** contains the height of characters of the Asian font in point. */
  var CharHeightAsian: Double
  
  /** contains the height of characters of the complex font in point. */
  var CharHeightComplex: Double
  
  /** contains the value of the posture of characters of the western font. */
  var CharPosture: FontSlant
  
  /** contains the value of the posture of characters of the Asian font. */
  var CharPostureAsian: FontSlant
  
  /** contains the value of the posture of characters of the complex font. */
  var CharPostureComplex: FontSlant
  
  /** is `TRUE` if the characters are shadowed. */
  var CharShadowed: Boolean
  
  /** contains the value for the character underline. */
  var CharUnderline: Double
  
  /** contains the value for the weight of characters of the western font. */
  var CharWeight: Double
  
  /** contains the value for the weight of characters of the Asian font. */
  var CharWeightAsian: Double
  
  /** contains the value for the weight of characters of the complex font. */
  var CharWeightComplex: Double
  
  /** specifies the horizontal alignment of the cell contents. */
  var HoriJustify: CellHoriJustify
  
  /**
    * is `TRUE` if the cell background is transparent.
    *
    * In this case the {@link TableAutoFormatField.CellBackColor} value is not used.
    */
  var IsCellBackgroundTransparent: Boolean
  
  /** is `TRUE` if text breaks automatically at cell borders. */
  var IsTextWrapped: Boolean
  
  /** contains the orientation of the cell contents (i.e. top-to-bottom or stacked). */
  var Orientation: CellOrientation
  
  /** contains the margin between cell contents and bottom border (in 1/100 mm). */
  var ParaBottomMargin: Double
  
  /** contains the margin between cell contents and left border (in 1/100 mm). */
  var ParaLeftMargin: Double
  
  /** contains the margin between cell contents and right border (in 1/100 mm). */
  var ParaRightMargin: Double
  
  /** contains the margin between cell contents and top border (in 1/100 mm). */
  var ParaTopMargin: Double
  
  /** contains the rotation angle of the cell contents. */
  var RotateAngle: Double
  
  /**
    * contains the reference edge of the cell rotation.
    *
    * changed from {@link com.sun.star.table.CellVertJustify} to long in LibO 3.5
    * @see com.sun.star.table.CellVertJustify2
    */
  var RotateReference: Double
  
  /** contains a description of the shadow. */
  var ShadowFormat: typingsJapgolly.activexLibreoffice.com_.sun.star.table.ShadowFormat
  
  /**
    * property containing a description of the cell border.
    * @since OOo 1.1.2
    */
  var TableBorder: typingsJapgolly.activexLibreoffice.com_.sun.star.table.TableBorder
  
  /**
    * property containing a description of the cell border. Preferred over {@link com.sun.star.table.TableBorder}{@link TableBorder} .
    * @since LibreOffice 3.6
    */
  var TableBorder2: typingsJapgolly.activexLibreoffice.com_.sun.star.table.TableBorder2
  
  /**
    * specifies the vertical alignment of the cell contents.
    *
    * changed from {@link com.sun.star.table.CellVertJustify} to long in LibO 3.5
    * @see com.sun.star.table.CellVertJustify2
    */
  var VertJustify: Double
}
object TableAutoFormatField {
  
  inline def apply(
    CellBackColor: Color,
    CharColor: Color,
    CharContoured: Boolean,
    CharCrossedOut: Boolean,
    CharFontCharSet: String,
    CharFontCharSetAsian: String,
    CharFontCharSetComplex: String,
    CharFontFamily: String,
    CharFontFamilyAsian: String,
    CharFontFamilyComplex: String,
    CharFontName: String,
    CharFontNameAsian: String,
    CharFontNameComplex: String,
    CharFontPitch: String,
    CharFontPitchAsian: String,
    CharFontPitchComplex: String,
    CharFontStyleName: String,
    CharFontStyleNameAsian: String,
    CharFontStyleNameComplex: String,
    CharHeight: Double,
    CharHeightAsian: Double,
    CharHeightComplex: Double,
    CharPosture: FontSlant,
    CharPostureAsian: FontSlant,
    CharPostureComplex: FontSlant,
    CharShadowed: Boolean,
    CharUnderline: Double,
    CharWeight: Double,
    CharWeightAsian: Double,
    CharWeightComplex: Double,
    HoriJustify: CellHoriJustify,
    IsCellBackgroundTransparent: Boolean,
    IsTextWrapped: Boolean,
    Orientation: CellOrientation,
    ParaBottomMargin: Double,
    ParaLeftMargin: Double,
    ParaRightMargin: Double,
    ParaTopMargin: Double,
    PropertySetInfo: XPropertySetInfo,
    RotateAngle: Double,
    RotateReference: Double,
    ShadowFormat: ShadowFormat,
    TableBorder: TableBorder,
    TableBorder2: TableBorder2,
    VertJustify: Double,
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
  ): TableAutoFormatField = {
    val __obj = js.Dynamic.literal(CellBackColor = CellBackColor.asInstanceOf[js.Any], CharColor = CharColor.asInstanceOf[js.Any], CharContoured = CharContoured.asInstanceOf[js.Any], CharCrossedOut = CharCrossedOut.asInstanceOf[js.Any], CharFontCharSet = CharFontCharSet.asInstanceOf[js.Any], CharFontCharSetAsian = CharFontCharSetAsian.asInstanceOf[js.Any], CharFontCharSetComplex = CharFontCharSetComplex.asInstanceOf[js.Any], CharFontFamily = CharFontFamily.asInstanceOf[js.Any], CharFontFamilyAsian = CharFontFamilyAsian.asInstanceOf[js.Any], CharFontFamilyComplex = CharFontFamilyComplex.asInstanceOf[js.Any], CharFontName = CharFontName.asInstanceOf[js.Any], CharFontNameAsian = CharFontNameAsian.asInstanceOf[js.Any], CharFontNameComplex = CharFontNameComplex.asInstanceOf[js.Any], CharFontPitch = CharFontPitch.asInstanceOf[js.Any], CharFontPitchAsian = CharFontPitchAsian.asInstanceOf[js.Any], CharFontPitchComplex = CharFontPitchComplex.asInstanceOf[js.Any], CharFontStyleName = CharFontStyleName.asInstanceOf[js.Any], CharFontStyleNameAsian = CharFontStyleNameAsian.asInstanceOf[js.Any], CharFontStyleNameComplex = CharFontStyleNameComplex.asInstanceOf[js.Any], CharHeight = CharHeight.asInstanceOf[js.Any], CharHeightAsian = CharHeightAsian.asInstanceOf[js.Any], CharHeightComplex = CharHeightComplex.asInstanceOf[js.Any], CharPosture = CharPosture.asInstanceOf[js.Any], CharPostureAsian = CharPostureAsian.asInstanceOf[js.Any], CharPostureComplex = CharPostureComplex.asInstanceOf[js.Any], CharShadowed = CharShadowed.asInstanceOf[js.Any], CharUnderline = CharUnderline.asInstanceOf[js.Any], CharWeight = CharWeight.asInstanceOf[js.Any], CharWeightAsian = CharWeightAsian.asInstanceOf[js.Any], CharWeightComplex = CharWeightComplex.asInstanceOf[js.Any], HoriJustify = HoriJustify.asInstanceOf[js.Any], IsCellBackgroundTransparent = IsCellBackgroundTransparent.asInstanceOf[js.Any], IsTextWrapped = IsTextWrapped.asInstanceOf[js.Any], Orientation = Orientation.asInstanceOf[js.Any], ParaBottomMargin = ParaBottomMargin.asInstanceOf[js.Any], ParaLeftMargin = ParaLeftMargin.asInstanceOf[js.Any], ParaRightMargin = ParaRightMargin.asInstanceOf[js.Any], ParaTopMargin = ParaTopMargin.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], RotateAngle = RotateAngle.asInstanceOf[js.Any], RotateReference = RotateReference.asInstanceOf[js.Any], ShadowFormat = ShadowFormat.asInstanceOf[js.Any], TableBorder = TableBorder.asInstanceOf[js.Any], TableBorder2 = TableBorder2.asInstanceOf[js.Any], VertJustify = VertJustify.asInstanceOf[js.Any], acquire = acquire.toJsFn, addPropertyChangeListener = js.Any.fromFunction2((t0: String, t1: XPropertyChangeListener) => (addPropertyChangeListener(t0, t1)).runNow()), addVetoableChangeListener = js.Any.fromFunction2((t0: String, t1: XVetoableChangeListener) => (addVetoableChangeListener(t0, t1)).runNow()), getPropertySetInfo = getPropertySetInfo.toJsFn, getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removePropertyChangeListener = js.Any.fromFunction2((t0: String, t1: XPropertyChangeListener) => (removePropertyChangeListener(t0, t1)).runNow()), removeVetoableChangeListener = js.Any.fromFunction2((t0: String, t1: XVetoableChangeListener) => (removeVetoableChangeListener(t0, t1)).runNow()), setPropertyValue = js.Any.fromFunction2((t0: String, t1: Any) => (setPropertyValue(t0, t1)).runNow()))
    __obj.asInstanceOf[TableAutoFormatField]
  }
  
  extension [Self <: TableAutoFormatField](x: Self) {
    
    inline def setCellBackColor(value: Color): Self = StObject.set(x, "CellBackColor", value.asInstanceOf[js.Any])
    
    inline def setCharColor(value: Color): Self = StObject.set(x, "CharColor", value.asInstanceOf[js.Any])
    
    inline def setCharContoured(value: Boolean): Self = StObject.set(x, "CharContoured", value.asInstanceOf[js.Any])
    
    inline def setCharCrossedOut(value: Boolean): Self = StObject.set(x, "CharCrossedOut", value.asInstanceOf[js.Any])
    
    inline def setCharFontCharSet(value: String): Self = StObject.set(x, "CharFontCharSet", value.asInstanceOf[js.Any])
    
    inline def setCharFontCharSetAsian(value: String): Self = StObject.set(x, "CharFontCharSetAsian", value.asInstanceOf[js.Any])
    
    inline def setCharFontCharSetComplex(value: String): Self = StObject.set(x, "CharFontCharSetComplex", value.asInstanceOf[js.Any])
    
    inline def setCharFontFamily(value: String): Self = StObject.set(x, "CharFontFamily", value.asInstanceOf[js.Any])
    
    inline def setCharFontFamilyAsian(value: String): Self = StObject.set(x, "CharFontFamilyAsian", value.asInstanceOf[js.Any])
    
    inline def setCharFontFamilyComplex(value: String): Self = StObject.set(x, "CharFontFamilyComplex", value.asInstanceOf[js.Any])
    
    inline def setCharFontName(value: String): Self = StObject.set(x, "CharFontName", value.asInstanceOf[js.Any])
    
    inline def setCharFontNameAsian(value: String): Self = StObject.set(x, "CharFontNameAsian", value.asInstanceOf[js.Any])
    
    inline def setCharFontNameComplex(value: String): Self = StObject.set(x, "CharFontNameComplex", value.asInstanceOf[js.Any])
    
    inline def setCharFontPitch(value: String): Self = StObject.set(x, "CharFontPitch", value.asInstanceOf[js.Any])
    
    inline def setCharFontPitchAsian(value: String): Self = StObject.set(x, "CharFontPitchAsian", value.asInstanceOf[js.Any])
    
    inline def setCharFontPitchComplex(value: String): Self = StObject.set(x, "CharFontPitchComplex", value.asInstanceOf[js.Any])
    
    inline def setCharFontStyleName(value: String): Self = StObject.set(x, "CharFontStyleName", value.asInstanceOf[js.Any])
    
    inline def setCharFontStyleNameAsian(value: String): Self = StObject.set(x, "CharFontStyleNameAsian", value.asInstanceOf[js.Any])
    
    inline def setCharFontStyleNameComplex(value: String): Self = StObject.set(x, "CharFontStyleNameComplex", value.asInstanceOf[js.Any])
    
    inline def setCharHeight(value: Double): Self = StObject.set(x, "CharHeight", value.asInstanceOf[js.Any])
    
    inline def setCharHeightAsian(value: Double): Self = StObject.set(x, "CharHeightAsian", value.asInstanceOf[js.Any])
    
    inline def setCharHeightComplex(value: Double): Self = StObject.set(x, "CharHeightComplex", value.asInstanceOf[js.Any])
    
    inline def setCharPosture(value: FontSlant): Self = StObject.set(x, "CharPosture", value.asInstanceOf[js.Any])
    
    inline def setCharPostureAsian(value: FontSlant): Self = StObject.set(x, "CharPostureAsian", value.asInstanceOf[js.Any])
    
    inline def setCharPostureComplex(value: FontSlant): Self = StObject.set(x, "CharPostureComplex", value.asInstanceOf[js.Any])
    
    inline def setCharShadowed(value: Boolean): Self = StObject.set(x, "CharShadowed", value.asInstanceOf[js.Any])
    
    inline def setCharUnderline(value: Double): Self = StObject.set(x, "CharUnderline", value.asInstanceOf[js.Any])
    
    inline def setCharWeight(value: Double): Self = StObject.set(x, "CharWeight", value.asInstanceOf[js.Any])
    
    inline def setCharWeightAsian(value: Double): Self = StObject.set(x, "CharWeightAsian", value.asInstanceOf[js.Any])
    
    inline def setCharWeightComplex(value: Double): Self = StObject.set(x, "CharWeightComplex", value.asInstanceOf[js.Any])
    
    inline def setHoriJustify(value: CellHoriJustify): Self = StObject.set(x, "HoriJustify", value.asInstanceOf[js.Any])
    
    inline def setIsCellBackgroundTransparent(value: Boolean): Self = StObject.set(x, "IsCellBackgroundTransparent", value.asInstanceOf[js.Any])
    
    inline def setIsTextWrapped(value: Boolean): Self = StObject.set(x, "IsTextWrapped", value.asInstanceOf[js.Any])
    
    inline def setOrientation(value: CellOrientation): Self = StObject.set(x, "Orientation", value.asInstanceOf[js.Any])
    
    inline def setParaBottomMargin(value: Double): Self = StObject.set(x, "ParaBottomMargin", value.asInstanceOf[js.Any])
    
    inline def setParaLeftMargin(value: Double): Self = StObject.set(x, "ParaLeftMargin", value.asInstanceOf[js.Any])
    
    inline def setParaRightMargin(value: Double): Self = StObject.set(x, "ParaRightMargin", value.asInstanceOf[js.Any])
    
    inline def setParaTopMargin(value: Double): Self = StObject.set(x, "ParaTopMargin", value.asInstanceOf[js.Any])
    
    inline def setRotateAngle(value: Double): Self = StObject.set(x, "RotateAngle", value.asInstanceOf[js.Any])
    
    inline def setRotateReference(value: Double): Self = StObject.set(x, "RotateReference", value.asInstanceOf[js.Any])
    
    inline def setShadowFormat(value: ShadowFormat): Self = StObject.set(x, "ShadowFormat", value.asInstanceOf[js.Any])
    
    inline def setTableBorder(value: TableBorder): Self = StObject.set(x, "TableBorder", value.asInstanceOf[js.Any])
    
    inline def setTableBorder2(value: TableBorder2): Self = StObject.set(x, "TableBorder2", value.asInstanceOf[js.Any])
    
    inline def setVertJustify(value: Double): Self = StObject.set(x, "VertJustify", value.asInstanceOf[js.Any])
  }
}
