package typingsJapgolly.activexLibreoffice.com_.sun.star

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`0`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`10`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`11`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`12`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`13`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`14`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`15`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`16`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`17`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`18`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`19`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`1`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`2`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`3`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`4`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`5`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`6`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`7`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`8`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`9`
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object xsd {
  
  /** specifies an [XSD compliant boolean type]{@link url="http://www.w3.org/TR/xmlschema-2/#boolean"} */
  type Boolean = XDataType
  
  object DataTypeClass {
    
    /* Rewritten from type alias, can be one of: 
      - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`17`
      - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`16`
      - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`2`
      - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`9`
      - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`7`
      - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`3`
      - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`5`
      - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`6`
      - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`4`
      - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`13`
      - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`14`
      - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`12`
      - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`11`
      - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`10`
      - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`15`
      - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`19`
      - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`18`
      - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`1`
      - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`8`
    */
    trait Constants extends StObject
    object Constants {
      
      inline def BOOLEAN: `2` = 2.asInstanceOf[`2`]
      
      inline def DATE: `9` = 9.asInstanceOf[`9`]
      
      inline def DATETIME: `7` = 7.asInstanceOf[`7`]
      
      inline def DECIMAL: `3` = 3.asInstanceOf[`3`]
      
      inline def DOUBLE: `5` = 5.asInstanceOf[`5`]
      
      inline def DURATION: `6` = 6.asInstanceOf[`6`]
      
      inline def FLOAT: `4` = 4.asInstanceOf[`4`]
      
      inline def NOTATION: `19` = 19.asInstanceOf[`19`]
      
      inline def QName: `18` = 18.asInstanceOf[`18`]
      
      inline def STRING: `1` = 1.asInstanceOf[`1`]
      
      inline def TIME: `8` = 8.asInstanceOf[`8`]
      
      inline def anyURI: `17` = 17.asInstanceOf[`17`]
      
      inline def base64Binary: `16` = 16.asInstanceOf[`16`]
      
      inline def gDay: `13` = 13.asInstanceOf[`13`]
      
      inline def gMonth: `14` = 14.asInstanceOf[`14`]
      
      inline def gMonthDay: `12` = 12.asInstanceOf[`12`]
      
      inline def gYear: `11` = 11.asInstanceOf[`11`]
      
      inline def gYearMonth: `10` = 10.asInstanceOf[`10`]
      
      inline def hexBinary: `15` = 15.asInstanceOf[`15`]
    }
  }
  
  /** specifies an [XSD compliant date type]{@link url="http://www.w3.org/TR/xmlschema-2/#date"} */
  trait Date
    extends StObject
       with XDataType {
    
    /**
      * specifies the exclusive upper bound for the value
      * @see http://www.w3.org/TR/xmlschema-2/#rf-maxExclusive
      */
    var MaxExclusiveDate: typingsJapgolly.activexLibreoffice.com_.sun.star.util.Date
    
    /**
      * specifies the inclusive upper bound for the value
      * @see http://www.w3.org/TR/xmlschema-2/#rf-maxInclusive
      */
    var MaxInclusiveDate: typingsJapgolly.activexLibreoffice.com_.sun.star.util.Date
    
    /**
      * specifies the exclusive lower bound for the value
      * @see http://www.w3.org/TR/xmlschema-2/#rf-minExclusive
      */
    var MinExclusiveDate: typingsJapgolly.activexLibreoffice.com_.sun.star.util.Date
    
    /**
      * specifies the inclusive lower bound for the value
      * @see http://www.w3.org/TR/xmlschema-2/#rf-minInclusive
      */
    var MinInclusiveDate: typingsJapgolly.activexLibreoffice.com_.sun.star.util.Date
  }
  object Date {
    
    inline def apply(
      IsBasic: scala.Boolean,
      MaxExclusiveDate: typingsJapgolly.activexLibreoffice.com_.sun.star.util.Date,
      MaxInclusiveDate: typingsJapgolly.activexLibreoffice.com_.sun.star.util.Date,
      MinExclusiveDate: typingsJapgolly.activexLibreoffice.com_.sun.star.util.Date,
      MinInclusiveDate: typingsJapgolly.activexLibreoffice.com_.sun.star.util.Date,
      Name: java.lang.String,
      Pattern: java.lang.String,
      PropertySetInfo: XPropertySetInfo,
      TypeClass: Double,
      WhiteSpaceTreatment: Double,
      acquire: Callback,
      addPropertyChangeListener: (java.lang.String, XPropertyChangeListener) => Callback,
      addVetoableChangeListener: (java.lang.String, XVetoableChangeListener) => Callback,
      explainInvalid: java.lang.String => java.lang.String,
      getPropertySetInfo: CallbackTo[XPropertySetInfo],
      getPropertyValue: java.lang.String => Any,
      queryInterface: `type` => Any,
      release: Callback,
      removePropertyChangeListener: (java.lang.String, XPropertyChangeListener) => Callback,
      removeVetoableChangeListener: (java.lang.String, XVetoableChangeListener) => Callback,
      setPropertyValue: (java.lang.String, Any) => Callback,
      validate: java.lang.String => scala.Boolean
    ): Date = {
      val __obj = js.Dynamic.literal(IsBasic = IsBasic.asInstanceOf[js.Any], MaxExclusiveDate = MaxExclusiveDate.asInstanceOf[js.Any], MaxInclusiveDate = MaxInclusiveDate.asInstanceOf[js.Any], MinExclusiveDate = MinExclusiveDate.asInstanceOf[js.Any], MinInclusiveDate = MinInclusiveDate.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Pattern = Pattern.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], TypeClass = TypeClass.asInstanceOf[js.Any], WhiteSpaceTreatment = WhiteSpaceTreatment.asInstanceOf[js.Any], acquire = acquire.toJsFn, addPropertyChangeListener = js.Any.fromFunction2((t0: java.lang.String, t1: XPropertyChangeListener) => (addPropertyChangeListener(t0, t1)).runNow()), addVetoableChangeListener = js.Any.fromFunction2((t0: java.lang.String, t1: XVetoableChangeListener) => (addVetoableChangeListener(t0, t1)).runNow()), explainInvalid = js.Any.fromFunction1(explainInvalid), getPropertySetInfo = getPropertySetInfo.toJsFn, getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removePropertyChangeListener = js.Any.fromFunction2((t0: java.lang.String, t1: XPropertyChangeListener) => (removePropertyChangeListener(t0, t1)).runNow()), removeVetoableChangeListener = js.Any.fromFunction2((t0: java.lang.String, t1: XVetoableChangeListener) => (removeVetoableChangeListener(t0, t1)).runNow()), setPropertyValue = js.Any.fromFunction2((t0: java.lang.String, t1: Any) => (setPropertyValue(t0, t1)).runNow()), validate = js.Any.fromFunction1(validate))
      __obj.asInstanceOf[Date]
    }
    
    extension [Self <: Date](x: Self) {
      
      inline def setMaxExclusiveDate(value: typingsJapgolly.activexLibreoffice.com_.sun.star.util.Date): Self = StObject.set(x, "MaxExclusiveDate", value.asInstanceOf[js.Any])
      
      inline def setMaxInclusiveDate(value: typingsJapgolly.activexLibreoffice.com_.sun.star.util.Date): Self = StObject.set(x, "MaxInclusiveDate", value.asInstanceOf[js.Any])
      
      inline def setMinExclusiveDate(value: typingsJapgolly.activexLibreoffice.com_.sun.star.util.Date): Self = StObject.set(x, "MinExclusiveDate", value.asInstanceOf[js.Any])
      
      inline def setMinInclusiveDate(value: typingsJapgolly.activexLibreoffice.com_.sun.star.util.Date): Self = StObject.set(x, "MinInclusiveDate", value.asInstanceOf[js.Any])
    }
  }
  
  /** specifies an [XSD compliant dateTime type]{@link url="http://www.w3.org/TR/xmlschema-2/#dateTime"} */
  trait DateTime
    extends StObject
       with XDataType {
    
    /**
      * specifies the exclusive upper bound for the value
      * @see http://www.w3.org/TR/xmlschema-2/#rf-maxExclusive
      */
    var MaxExclusiveDateTime: typingsJapgolly.activexLibreoffice.com_.sun.star.util.DateTime
    
    /**
      * specifies the inclusive upper bound for the value
      * @see http://www.w3.org/TR/xmlschema-2/#rf-maxInclusive
      */
    var MaxInclusiveDateTime: typingsJapgolly.activexLibreoffice.com_.sun.star.util.DateTime
    
    /**
      * specifies the exclusive lower bound for the value
      * @see http://www.w3.org/TR/xmlschema-2/#rf-minExclusive
      */
    var MinExclusiveDateTime: typingsJapgolly.activexLibreoffice.com_.sun.star.util.DateTime
    
    /**
      * specifies the inclusive lower bound for the value
      * @see http://www.w3.org/TR/xmlschema-2/#rf-minInclusive
      */
    var MinInclusiveDateTime: typingsJapgolly.activexLibreoffice.com_.sun.star.util.DateTime
  }
  object DateTime {
    
    inline def apply(
      IsBasic: scala.Boolean,
      MaxExclusiveDateTime: typingsJapgolly.activexLibreoffice.com_.sun.star.util.DateTime,
      MaxInclusiveDateTime: typingsJapgolly.activexLibreoffice.com_.sun.star.util.DateTime,
      MinExclusiveDateTime: typingsJapgolly.activexLibreoffice.com_.sun.star.util.DateTime,
      MinInclusiveDateTime: typingsJapgolly.activexLibreoffice.com_.sun.star.util.DateTime,
      Name: java.lang.String,
      Pattern: java.lang.String,
      PropertySetInfo: XPropertySetInfo,
      TypeClass: Double,
      WhiteSpaceTreatment: Double,
      acquire: Callback,
      addPropertyChangeListener: (java.lang.String, XPropertyChangeListener) => Callback,
      addVetoableChangeListener: (java.lang.String, XVetoableChangeListener) => Callback,
      explainInvalid: java.lang.String => java.lang.String,
      getPropertySetInfo: CallbackTo[XPropertySetInfo],
      getPropertyValue: java.lang.String => Any,
      queryInterface: `type` => Any,
      release: Callback,
      removePropertyChangeListener: (java.lang.String, XPropertyChangeListener) => Callback,
      removeVetoableChangeListener: (java.lang.String, XVetoableChangeListener) => Callback,
      setPropertyValue: (java.lang.String, Any) => Callback,
      validate: java.lang.String => scala.Boolean
    ): DateTime = {
      val __obj = js.Dynamic.literal(IsBasic = IsBasic.asInstanceOf[js.Any], MaxExclusiveDateTime = MaxExclusiveDateTime.asInstanceOf[js.Any], MaxInclusiveDateTime = MaxInclusiveDateTime.asInstanceOf[js.Any], MinExclusiveDateTime = MinExclusiveDateTime.asInstanceOf[js.Any], MinInclusiveDateTime = MinInclusiveDateTime.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Pattern = Pattern.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], TypeClass = TypeClass.asInstanceOf[js.Any], WhiteSpaceTreatment = WhiteSpaceTreatment.asInstanceOf[js.Any], acquire = acquire.toJsFn, addPropertyChangeListener = js.Any.fromFunction2((t0: java.lang.String, t1: XPropertyChangeListener) => (addPropertyChangeListener(t0, t1)).runNow()), addVetoableChangeListener = js.Any.fromFunction2((t0: java.lang.String, t1: XVetoableChangeListener) => (addVetoableChangeListener(t0, t1)).runNow()), explainInvalid = js.Any.fromFunction1(explainInvalid), getPropertySetInfo = getPropertySetInfo.toJsFn, getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removePropertyChangeListener = js.Any.fromFunction2((t0: java.lang.String, t1: XPropertyChangeListener) => (removePropertyChangeListener(t0, t1)).runNow()), removeVetoableChangeListener = js.Any.fromFunction2((t0: java.lang.String, t1: XVetoableChangeListener) => (removeVetoableChangeListener(t0, t1)).runNow()), setPropertyValue = js.Any.fromFunction2((t0: java.lang.String, t1: Any) => (setPropertyValue(t0, t1)).runNow()), validate = js.Any.fromFunction1(validate))
      __obj.asInstanceOf[DateTime]
    }
    
    extension [Self <: DateTime](x: Self) {
      
      inline def setMaxExclusiveDateTime(value: typingsJapgolly.activexLibreoffice.com_.sun.star.util.DateTime): Self = StObject.set(x, "MaxExclusiveDateTime", value.asInstanceOf[js.Any])
      
      inline def setMaxInclusiveDateTime(value: typingsJapgolly.activexLibreoffice.com_.sun.star.util.DateTime): Self = StObject.set(x, "MaxInclusiveDateTime", value.asInstanceOf[js.Any])
      
      inline def setMinExclusiveDateTime(value: typingsJapgolly.activexLibreoffice.com_.sun.star.util.DateTime): Self = StObject.set(x, "MinExclusiveDateTime", value.asInstanceOf[js.Any])
      
      inline def setMinInclusiveDateTime(value: typingsJapgolly.activexLibreoffice.com_.sun.star.util.DateTime): Self = StObject.set(x, "MinInclusiveDateTime", value.asInstanceOf[js.Any])
    }
  }
  
  /** specifies an [XSD compliant gDay type]{@link url="http://www.w3.org/TR/xmlschema-2/#gDay"} */
  trait Day
    extends StObject
       with XDataType {
    
    /**
      * specifies the exclusive upper bound for the value
      * @see http://www.w3.org/TR/xmlschema-2/#rf-maxExclusive
      */
    var MaxExclusiveInt: Double
    
    /**
      * specifies the inclusive upper bound for the value
      * @see http://www.w3.org/TR/xmlschema-2/#rf-maxInclusive
      */
    var MaxInclusiveInt: Double
    
    /**
      * specifies the exclusive lower bound for the value
      * @see http://www.w3.org/TR/xmlschema-2/#rf-minExclusive
      */
    var MinExclusiveInt: Double
    
    /**
      * specifies the inclusive lower bound for the value
      * @see http://www.w3.org/TR/xmlschema-2/#rf-minInclusive
      */
    var MinInclusiveInt: Double
  }
  object Day {
    
    inline def apply(
      IsBasic: scala.Boolean,
      MaxExclusiveInt: Double,
      MaxInclusiveInt: Double,
      MinExclusiveInt: Double,
      MinInclusiveInt: Double,
      Name: java.lang.String,
      Pattern: java.lang.String,
      PropertySetInfo: XPropertySetInfo,
      TypeClass: Double,
      WhiteSpaceTreatment: Double,
      acquire: Callback,
      addPropertyChangeListener: (java.lang.String, XPropertyChangeListener) => Callback,
      addVetoableChangeListener: (java.lang.String, XVetoableChangeListener) => Callback,
      explainInvalid: java.lang.String => java.lang.String,
      getPropertySetInfo: CallbackTo[XPropertySetInfo],
      getPropertyValue: java.lang.String => Any,
      queryInterface: `type` => Any,
      release: Callback,
      removePropertyChangeListener: (java.lang.String, XPropertyChangeListener) => Callback,
      removeVetoableChangeListener: (java.lang.String, XVetoableChangeListener) => Callback,
      setPropertyValue: (java.lang.String, Any) => Callback,
      validate: java.lang.String => scala.Boolean
    ): Day = {
      val __obj = js.Dynamic.literal(IsBasic = IsBasic.asInstanceOf[js.Any], MaxExclusiveInt = MaxExclusiveInt.asInstanceOf[js.Any], MaxInclusiveInt = MaxInclusiveInt.asInstanceOf[js.Any], MinExclusiveInt = MinExclusiveInt.asInstanceOf[js.Any], MinInclusiveInt = MinInclusiveInt.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Pattern = Pattern.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], TypeClass = TypeClass.asInstanceOf[js.Any], WhiteSpaceTreatment = WhiteSpaceTreatment.asInstanceOf[js.Any], acquire = acquire.toJsFn, addPropertyChangeListener = js.Any.fromFunction2((t0: java.lang.String, t1: XPropertyChangeListener) => (addPropertyChangeListener(t0, t1)).runNow()), addVetoableChangeListener = js.Any.fromFunction2((t0: java.lang.String, t1: XVetoableChangeListener) => (addVetoableChangeListener(t0, t1)).runNow()), explainInvalid = js.Any.fromFunction1(explainInvalid), getPropertySetInfo = getPropertySetInfo.toJsFn, getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removePropertyChangeListener = js.Any.fromFunction2((t0: java.lang.String, t1: XPropertyChangeListener) => (removePropertyChangeListener(t0, t1)).runNow()), removeVetoableChangeListener = js.Any.fromFunction2((t0: java.lang.String, t1: XVetoableChangeListener) => (removeVetoableChangeListener(t0, t1)).runNow()), setPropertyValue = js.Any.fromFunction2((t0: java.lang.String, t1: Any) => (setPropertyValue(t0, t1)).runNow()), validate = js.Any.fromFunction1(validate))
      __obj.asInstanceOf[Day]
    }
    
    extension [Self <: Day](x: Self) {
      
      inline def setMaxExclusiveInt(value: Double): Self = StObject.set(x, "MaxExclusiveInt", value.asInstanceOf[js.Any])
      
      inline def setMaxInclusiveInt(value: Double): Self = StObject.set(x, "MaxInclusiveInt", value.asInstanceOf[js.Any])
      
      inline def setMinExclusiveInt(value: Double): Self = StObject.set(x, "MinExclusiveInt", value.asInstanceOf[js.Any])
      
      inline def setMinInclusiveInt(value: Double): Self = StObject.set(x, "MinInclusiveInt", value.asInstanceOf[js.Any])
    }
  }
  
  /** specifies an [XSD compliant decimal type]{@link url="http://www.w3.org/TR/xmlschema-2/#decimal"} */
  trait Decimal
    extends StObject
       with XDataType {
    
    /**
      * fractionDigits is the maximum number of digits in the fractional part of values of decimal data
      *
      * The value of fractionDigits must be a non negative integer.
      *
      * See [http://www.w3.org/TR/xmlschema-2/#rf-fractionDigits]{@link url="http://www.w3.org/TR/xmlschema-2/#rf-fractionDigits"}
      */
    var FractionDigits: Double
    
    /**
      * specifies the exclusive upper bound for the value
      * @see http://www.w3.org/TR/xmlschema-2/#rf-maxExclusive
      */
    var MaxExclusiveDouble: Double
    
    /**
      * specifies the inclusive upper bound for the value
      * @see http://www.w3.org/TR/xmlschema-2/#rf-maxInclusive
      */
    var MaxInclusiveDouble: Double
    
    /**
      * specifies the exclusive lower bound for the value
      * @see http://www.w3.org/TR/xmlschema-2/#rf-minExclusive
      */
    var MinExclusiveDouble: Double
    
    /**
      * specifies the inclusive lower bound for the value
      * @see http://www.w3.org/TR/xmlschema-2/#rf-minInclusive
      */
    var MinInclusiveDouble: Double
    
    /**
      * totalDigits is the maximum number of digits in values of decimal data types.
      *
      * The value of totalDigits must be a positive integer.
      *
      * See [http://www.w3.org/TR/xmlschema-2/#rf-totalDigits]{@link url="http://www.w3.org/TR/xmlschema-2/#rf-totalDigits"}
      */
    var TotalDigits: Double
  }
  object Decimal {
    
    inline def apply(
      FractionDigits: Double,
      IsBasic: scala.Boolean,
      MaxExclusiveDouble: Double,
      MaxInclusiveDouble: Double,
      MinExclusiveDouble: Double,
      MinInclusiveDouble: Double,
      Name: java.lang.String,
      Pattern: java.lang.String,
      PropertySetInfo: XPropertySetInfo,
      TotalDigits: Double,
      TypeClass: Double,
      WhiteSpaceTreatment: Double,
      acquire: Callback,
      addPropertyChangeListener: (java.lang.String, XPropertyChangeListener) => Callback,
      addVetoableChangeListener: (java.lang.String, XVetoableChangeListener) => Callback,
      explainInvalid: java.lang.String => java.lang.String,
      getPropertySetInfo: CallbackTo[XPropertySetInfo],
      getPropertyValue: java.lang.String => Any,
      queryInterface: `type` => Any,
      release: Callback,
      removePropertyChangeListener: (java.lang.String, XPropertyChangeListener) => Callback,
      removeVetoableChangeListener: (java.lang.String, XVetoableChangeListener) => Callback,
      setPropertyValue: (java.lang.String, Any) => Callback,
      validate: java.lang.String => scala.Boolean
    ): Decimal = {
      val __obj = js.Dynamic.literal(FractionDigits = FractionDigits.asInstanceOf[js.Any], IsBasic = IsBasic.asInstanceOf[js.Any], MaxExclusiveDouble = MaxExclusiveDouble.asInstanceOf[js.Any], MaxInclusiveDouble = MaxInclusiveDouble.asInstanceOf[js.Any], MinExclusiveDouble = MinExclusiveDouble.asInstanceOf[js.Any], MinInclusiveDouble = MinInclusiveDouble.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Pattern = Pattern.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], TotalDigits = TotalDigits.asInstanceOf[js.Any], TypeClass = TypeClass.asInstanceOf[js.Any], WhiteSpaceTreatment = WhiteSpaceTreatment.asInstanceOf[js.Any], acquire = acquire.toJsFn, addPropertyChangeListener = js.Any.fromFunction2((t0: java.lang.String, t1: XPropertyChangeListener) => (addPropertyChangeListener(t0, t1)).runNow()), addVetoableChangeListener = js.Any.fromFunction2((t0: java.lang.String, t1: XVetoableChangeListener) => (addVetoableChangeListener(t0, t1)).runNow()), explainInvalid = js.Any.fromFunction1(explainInvalid), getPropertySetInfo = getPropertySetInfo.toJsFn, getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removePropertyChangeListener = js.Any.fromFunction2((t0: java.lang.String, t1: XPropertyChangeListener) => (removePropertyChangeListener(t0, t1)).runNow()), removeVetoableChangeListener = js.Any.fromFunction2((t0: java.lang.String, t1: XVetoableChangeListener) => (removeVetoableChangeListener(t0, t1)).runNow()), setPropertyValue = js.Any.fromFunction2((t0: java.lang.String, t1: Any) => (setPropertyValue(t0, t1)).runNow()), validate = js.Any.fromFunction1(validate))
      __obj.asInstanceOf[Decimal]
    }
    
    extension [Self <: Decimal](x: Self) {
      
      inline def setFractionDigits(value: Double): Self = StObject.set(x, "FractionDigits", value.asInstanceOf[js.Any])
      
      inline def setMaxExclusiveDouble(value: Double): Self = StObject.set(x, "MaxExclusiveDouble", value.asInstanceOf[js.Any])
      
      inline def setMaxInclusiveDouble(value: Double): Self = StObject.set(x, "MaxInclusiveDouble", value.asInstanceOf[js.Any])
      
      inline def setMinExclusiveDouble(value: Double): Self = StObject.set(x, "MinExclusiveDouble", value.asInstanceOf[js.Any])
      
      inline def setMinInclusiveDouble(value: Double): Self = StObject.set(x, "MinInclusiveDouble", value.asInstanceOf[js.Any])
      
      inline def setTotalDigits(value: Double): Self = StObject.set(x, "TotalDigits", value.asInstanceOf[js.Any])
    }
  }
  
  /** specifies an [XSD compliant gMonth type]{@link url="http://www.w3.org/TR/xmlschema-2/#gMonth"} */
  trait Month
    extends StObject
       with XDataType {
    
    /**
      * specifies the exclusive upper bound for the value
      * @see http://www.w3.org/TR/xmlschema-2/#rf-maxExclusive
      */
    var MaxExclusiveInt: Double
    
    /**
      * specifies the inclusive upper bound for the value
      * @see http://www.w3.org/TR/xmlschema-2/#rf-maxInclusive
      */
    var MaxInclusiveInt: Double
    
    /**
      * specifies the exclusive lower bound for the value
      * @see http://www.w3.org/TR/xmlschema-2/#rf-minExclusive
      */
    var MinExclusiveInt: Double
    
    /**
      * specifies the inclusive lower bound for the value
      * @see http://www.w3.org/TR/xmlschema-2/#rf-minInclusive
      */
    var MinInclusiveInt: Double
  }
  object Month {
    
    inline def apply(
      IsBasic: scala.Boolean,
      MaxExclusiveInt: Double,
      MaxInclusiveInt: Double,
      MinExclusiveInt: Double,
      MinInclusiveInt: Double,
      Name: java.lang.String,
      Pattern: java.lang.String,
      PropertySetInfo: XPropertySetInfo,
      TypeClass: Double,
      WhiteSpaceTreatment: Double,
      acquire: Callback,
      addPropertyChangeListener: (java.lang.String, XPropertyChangeListener) => Callback,
      addVetoableChangeListener: (java.lang.String, XVetoableChangeListener) => Callback,
      explainInvalid: java.lang.String => java.lang.String,
      getPropertySetInfo: CallbackTo[XPropertySetInfo],
      getPropertyValue: java.lang.String => Any,
      queryInterface: `type` => Any,
      release: Callback,
      removePropertyChangeListener: (java.lang.String, XPropertyChangeListener) => Callback,
      removeVetoableChangeListener: (java.lang.String, XVetoableChangeListener) => Callback,
      setPropertyValue: (java.lang.String, Any) => Callback,
      validate: java.lang.String => scala.Boolean
    ): Month = {
      val __obj = js.Dynamic.literal(IsBasic = IsBasic.asInstanceOf[js.Any], MaxExclusiveInt = MaxExclusiveInt.asInstanceOf[js.Any], MaxInclusiveInt = MaxInclusiveInt.asInstanceOf[js.Any], MinExclusiveInt = MinExclusiveInt.asInstanceOf[js.Any], MinInclusiveInt = MinInclusiveInt.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Pattern = Pattern.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], TypeClass = TypeClass.asInstanceOf[js.Any], WhiteSpaceTreatment = WhiteSpaceTreatment.asInstanceOf[js.Any], acquire = acquire.toJsFn, addPropertyChangeListener = js.Any.fromFunction2((t0: java.lang.String, t1: XPropertyChangeListener) => (addPropertyChangeListener(t0, t1)).runNow()), addVetoableChangeListener = js.Any.fromFunction2((t0: java.lang.String, t1: XVetoableChangeListener) => (addVetoableChangeListener(t0, t1)).runNow()), explainInvalid = js.Any.fromFunction1(explainInvalid), getPropertySetInfo = getPropertySetInfo.toJsFn, getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removePropertyChangeListener = js.Any.fromFunction2((t0: java.lang.String, t1: XPropertyChangeListener) => (removePropertyChangeListener(t0, t1)).runNow()), removeVetoableChangeListener = js.Any.fromFunction2((t0: java.lang.String, t1: XVetoableChangeListener) => (removeVetoableChangeListener(t0, t1)).runNow()), setPropertyValue = js.Any.fromFunction2((t0: java.lang.String, t1: Any) => (setPropertyValue(t0, t1)).runNow()), validate = js.Any.fromFunction1(validate))
      __obj.asInstanceOf[Month]
    }
    
    extension [Self <: Month](x: Self) {
      
      inline def setMaxExclusiveInt(value: Double): Self = StObject.set(x, "MaxExclusiveInt", value.asInstanceOf[js.Any])
      
      inline def setMaxInclusiveInt(value: Double): Self = StObject.set(x, "MaxInclusiveInt", value.asInstanceOf[js.Any])
      
      inline def setMinExclusiveInt(value: Double): Self = StObject.set(x, "MinExclusiveInt", value.asInstanceOf[js.Any])
      
      inline def setMinInclusiveInt(value: Double): Self = StObject.set(x, "MinInclusiveInt", value.asInstanceOf[js.Any])
    }
  }
  
  /** specifies an [XSD compliant string type]{@link url="http://www.w3.org/TR/xmlschema-2/#string"} */
  trait String
    extends StObject
       with XDataType {
    
    /**
      * specifies the length of the string
      *
      * Note that you cannot specify {@link Length} together with {@link MinLength} or {@link MaxLength} .
      */
    var Length: Double
    
    /**
      * specifies the maximum length of the string
      *
      * Note that you cannot specify {@link MaxLength} together with {@link Length} .
      */
    var MaxLength: Double
    
    /**
      * specifies the minimum length of the string
      *
      * Note that you cannot specify {@link MinLength} together with {@link Length} .
      */
    var MinLength: Double
  }
  object String {
    
    inline def apply(
      IsBasic: scala.Boolean,
      Length: Double,
      MaxLength: Double,
      MinLength: Double,
      Name: java.lang.String,
      Pattern: java.lang.String,
      PropertySetInfo: XPropertySetInfo,
      TypeClass: Double,
      WhiteSpaceTreatment: Double,
      acquire: Callback,
      addPropertyChangeListener: (java.lang.String, XPropertyChangeListener) => Callback,
      addVetoableChangeListener: (java.lang.String, XVetoableChangeListener) => Callback,
      explainInvalid: java.lang.String => java.lang.String,
      getPropertySetInfo: CallbackTo[XPropertySetInfo],
      getPropertyValue: java.lang.String => Any,
      queryInterface: `type` => Any,
      release: Callback,
      removePropertyChangeListener: (java.lang.String, XPropertyChangeListener) => Callback,
      removeVetoableChangeListener: (java.lang.String, XVetoableChangeListener) => Callback,
      setPropertyValue: (java.lang.String, Any) => Callback,
      validate: java.lang.String => scala.Boolean
    ): String = {
      val __obj = js.Dynamic.literal(IsBasic = IsBasic.asInstanceOf[js.Any], Length = Length.asInstanceOf[js.Any], MaxLength = MaxLength.asInstanceOf[js.Any], MinLength = MinLength.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Pattern = Pattern.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], TypeClass = TypeClass.asInstanceOf[js.Any], WhiteSpaceTreatment = WhiteSpaceTreatment.asInstanceOf[js.Any], acquire = acquire.toJsFn, addPropertyChangeListener = js.Any.fromFunction2((t0: java.lang.String, t1: XPropertyChangeListener) => (addPropertyChangeListener(t0, t1)).runNow()), addVetoableChangeListener = js.Any.fromFunction2((t0: java.lang.String, t1: XVetoableChangeListener) => (addVetoableChangeListener(t0, t1)).runNow()), explainInvalid = js.Any.fromFunction1(explainInvalid), getPropertySetInfo = getPropertySetInfo.toJsFn, getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removePropertyChangeListener = js.Any.fromFunction2((t0: java.lang.String, t1: XPropertyChangeListener) => (removePropertyChangeListener(t0, t1)).runNow()), removeVetoableChangeListener = js.Any.fromFunction2((t0: java.lang.String, t1: XVetoableChangeListener) => (removeVetoableChangeListener(t0, t1)).runNow()), setPropertyValue = js.Any.fromFunction2((t0: java.lang.String, t1: Any) => (setPropertyValue(t0, t1)).runNow()), validate = js.Any.fromFunction1(validate))
      __obj.asInstanceOf[String]
    }
    
    extension [Self <: String](x: Self) {
      
      inline def setLength(value: Double): Self = StObject.set(x, "Length", value.asInstanceOf[js.Any])
      
      inline def setMaxLength(value: Double): Self = StObject.set(x, "MaxLength", value.asInstanceOf[js.Any])
      
      inline def setMinLength(value: Double): Self = StObject.set(x, "MinLength", value.asInstanceOf[js.Any])
    }
  }
  
  /** specifies an [XSD compliant time type]{@link url="http://www.w3.org/TR/xmlschema-2/#time"} */
  trait Time
    extends StObject
       with XDataType {
    
    /**
      * specifies the exclusive upper bound for the value
      * @see http://www.w3.org/TR/xmlschema-2/#rf-maxExclusive
      */
    var MaxExclusiveTime: typingsJapgolly.activexLibreoffice.com_.sun.star.util.Time
    
    /**
      * specifies the inclusive upper bound for the value
      * @see http://www.w3.org/TR/xmlschema-2/#rf-maxInclusive
      */
    var MaxInclusiveTime: typingsJapgolly.activexLibreoffice.com_.sun.star.util.Time
    
    /**
      * specifies the exclusive lower bound for the value
      * @see http://www.w3.org/TR/xmlschema-2/#rf-minExclusive
      */
    var MinExclusiveTime: typingsJapgolly.activexLibreoffice.com_.sun.star.util.Time
    
    /**
      * specifies the inclusive lower bound for the value
      * @see http://www.w3.org/TR/xmlschema-2/#rf-minInclusive
      */
    var MinInclusiveTime: typingsJapgolly.activexLibreoffice.com_.sun.star.util.Time
  }
  object Time {
    
    inline def apply(
      IsBasic: scala.Boolean,
      MaxExclusiveTime: typingsJapgolly.activexLibreoffice.com_.sun.star.util.Time,
      MaxInclusiveTime: typingsJapgolly.activexLibreoffice.com_.sun.star.util.Time,
      MinExclusiveTime: typingsJapgolly.activexLibreoffice.com_.sun.star.util.Time,
      MinInclusiveTime: typingsJapgolly.activexLibreoffice.com_.sun.star.util.Time,
      Name: java.lang.String,
      Pattern: java.lang.String,
      PropertySetInfo: XPropertySetInfo,
      TypeClass: Double,
      WhiteSpaceTreatment: Double,
      acquire: Callback,
      addPropertyChangeListener: (java.lang.String, XPropertyChangeListener) => Callback,
      addVetoableChangeListener: (java.lang.String, XVetoableChangeListener) => Callback,
      explainInvalid: java.lang.String => java.lang.String,
      getPropertySetInfo: CallbackTo[XPropertySetInfo],
      getPropertyValue: java.lang.String => Any,
      queryInterface: `type` => Any,
      release: Callback,
      removePropertyChangeListener: (java.lang.String, XPropertyChangeListener) => Callback,
      removeVetoableChangeListener: (java.lang.String, XVetoableChangeListener) => Callback,
      setPropertyValue: (java.lang.String, Any) => Callback,
      validate: java.lang.String => scala.Boolean
    ): Time = {
      val __obj = js.Dynamic.literal(IsBasic = IsBasic.asInstanceOf[js.Any], MaxExclusiveTime = MaxExclusiveTime.asInstanceOf[js.Any], MaxInclusiveTime = MaxInclusiveTime.asInstanceOf[js.Any], MinExclusiveTime = MinExclusiveTime.asInstanceOf[js.Any], MinInclusiveTime = MinInclusiveTime.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Pattern = Pattern.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], TypeClass = TypeClass.asInstanceOf[js.Any], WhiteSpaceTreatment = WhiteSpaceTreatment.asInstanceOf[js.Any], acquire = acquire.toJsFn, addPropertyChangeListener = js.Any.fromFunction2((t0: java.lang.String, t1: XPropertyChangeListener) => (addPropertyChangeListener(t0, t1)).runNow()), addVetoableChangeListener = js.Any.fromFunction2((t0: java.lang.String, t1: XVetoableChangeListener) => (addVetoableChangeListener(t0, t1)).runNow()), explainInvalid = js.Any.fromFunction1(explainInvalid), getPropertySetInfo = getPropertySetInfo.toJsFn, getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removePropertyChangeListener = js.Any.fromFunction2((t0: java.lang.String, t1: XPropertyChangeListener) => (removePropertyChangeListener(t0, t1)).runNow()), removeVetoableChangeListener = js.Any.fromFunction2((t0: java.lang.String, t1: XVetoableChangeListener) => (removeVetoableChangeListener(t0, t1)).runNow()), setPropertyValue = js.Any.fromFunction2((t0: java.lang.String, t1: Any) => (setPropertyValue(t0, t1)).runNow()), validate = js.Any.fromFunction1(validate))
      __obj.asInstanceOf[Time]
    }
    
    extension [Self <: Time](x: Self) {
      
      inline def setMaxExclusiveTime(value: typingsJapgolly.activexLibreoffice.com_.sun.star.util.Time): Self = StObject.set(x, "MaxExclusiveTime", value.asInstanceOf[js.Any])
      
      inline def setMaxInclusiveTime(value: typingsJapgolly.activexLibreoffice.com_.sun.star.util.Time): Self = StObject.set(x, "MaxInclusiveTime", value.asInstanceOf[js.Any])
      
      inline def setMinExclusiveTime(value: typingsJapgolly.activexLibreoffice.com_.sun.star.util.Time): Self = StObject.set(x, "MinExclusiveTime", value.asInstanceOf[js.Any])
      
      inline def setMinInclusiveTime(value: typingsJapgolly.activexLibreoffice.com_.sun.star.util.Time): Self = StObject.set(x, "MinInclusiveTime", value.asInstanceOf[js.Any])
    }
  }
  
  object WhiteSpaceTreatment {
    
    /* Rewritten from type alias, can be one of: 
      - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`2`
      - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`0`
      - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`1`
    */
    trait Constants extends StObject
    object Constants {
      
      inline def Collapse: `2` = 2.asInstanceOf[`2`]
      
      inline def Preserve: `0` = 0.asInstanceOf[`0`]
      
      inline def Replace: `1` = 1.asInstanceOf[`1`]
    }
  }
  
  /** specifies an [XSD compliant simple data type]{@link url="http://www.w3.org/TR/xmlschema-2/#built-in-datatypes"} */
  trait XDataType
    extends StObject
       with XPropertySet {
    
    /**
      * specifies whether the type is a basic type
      *
      * Basic types are built into the type system, and cannot be changed by the user.
      */
    var IsBasic: scala.Boolean
    
    /** provides access to the name of the type */
    var Name: java.lang.String
    
    /**
      * specifies the pattern which strings conforming to this type comply to
      *
      * See [http://www.w3.org/TR/xmlschema-2/#rf-pattern]{@link url="http://www.w3.org/TR/xmlschema-2/#rf-pattern"}
      */
    var Pattern: java.lang.String
    
    /**
      * class of the type
      * @see DataTypeClass
      */
    var TypeClass: Double
    
    /**
      * specifies how strings of this data type are to be processed, with respect to white spaces
      *
      * See [http://www.w3.org/TR/xmlschema-2/#rf-whiteSpace]{@link url="http://www.w3.org/TR/xmlschema-2/#rf-whiteSpace"}
      */
    var WhiteSpaceTreatment: Double
    
    def explainInvalid(value: java.lang.String): java.lang.String
    
    def validate(value: java.lang.String): scala.Boolean
  }
  object XDataType {
    
    inline def apply(
      IsBasic: scala.Boolean,
      Name: java.lang.String,
      Pattern: java.lang.String,
      PropertySetInfo: XPropertySetInfo,
      TypeClass: Double,
      WhiteSpaceTreatment: Double,
      acquire: Callback,
      addPropertyChangeListener: (java.lang.String, XPropertyChangeListener) => Callback,
      addVetoableChangeListener: (java.lang.String, XVetoableChangeListener) => Callback,
      explainInvalid: java.lang.String => java.lang.String,
      getPropertySetInfo: CallbackTo[XPropertySetInfo],
      getPropertyValue: java.lang.String => Any,
      queryInterface: `type` => Any,
      release: Callback,
      removePropertyChangeListener: (java.lang.String, XPropertyChangeListener) => Callback,
      removeVetoableChangeListener: (java.lang.String, XVetoableChangeListener) => Callback,
      setPropertyValue: (java.lang.String, Any) => Callback,
      validate: java.lang.String => scala.Boolean
    ): XDataType = {
      val __obj = js.Dynamic.literal(IsBasic = IsBasic.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Pattern = Pattern.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], TypeClass = TypeClass.asInstanceOf[js.Any], WhiteSpaceTreatment = WhiteSpaceTreatment.asInstanceOf[js.Any], acquire = acquire.toJsFn, addPropertyChangeListener = js.Any.fromFunction2((t0: java.lang.String, t1: XPropertyChangeListener) => (addPropertyChangeListener(t0, t1)).runNow()), addVetoableChangeListener = js.Any.fromFunction2((t0: java.lang.String, t1: XVetoableChangeListener) => (addVetoableChangeListener(t0, t1)).runNow()), explainInvalid = js.Any.fromFunction1(explainInvalid), getPropertySetInfo = getPropertySetInfo.toJsFn, getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removePropertyChangeListener = js.Any.fromFunction2((t0: java.lang.String, t1: XPropertyChangeListener) => (removePropertyChangeListener(t0, t1)).runNow()), removeVetoableChangeListener = js.Any.fromFunction2((t0: java.lang.String, t1: XVetoableChangeListener) => (removeVetoableChangeListener(t0, t1)).runNow()), setPropertyValue = js.Any.fromFunction2((t0: java.lang.String, t1: Any) => (setPropertyValue(t0, t1)).runNow()), validate = js.Any.fromFunction1(validate))
      __obj.asInstanceOf[XDataType]
    }
    
    extension [Self <: XDataType](x: Self) {
      
      inline def setExplainInvalid(value: java.lang.String => java.lang.String): Self = StObject.set(x, "explainInvalid", js.Any.fromFunction1(value))
      
      inline def setIsBasic(value: scala.Boolean): Self = StObject.set(x, "IsBasic", value.asInstanceOf[js.Any])
      
      inline def setName(value: java.lang.String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
      
      inline def setPattern(value: java.lang.String): Self = StObject.set(x, "Pattern", value.asInstanceOf[js.Any])
      
      inline def setTypeClass(value: Double): Self = StObject.set(x, "TypeClass", value.asInstanceOf[js.Any])
      
      inline def setValidate(value: java.lang.String => scala.Boolean): Self = StObject.set(x, "validate", js.Any.fromFunction1(value))
      
      inline def setWhiteSpaceTreatment(value: Double): Self = StObject.set(x, "WhiteSpaceTreatment", value.asInstanceOf[js.Any])
    }
  }
  
  /** specifies an [XSD compliant gYear type]{@link url="http://www.w3.org/TR/xmlschema-2/#gYear"} */
  trait Year
    extends StObject
       with XDataType {
    
    /**
      * specifies the exclusive upper bound for the value
      * @see http://www.w3.org/TR/xmlschema-2/#rf-maxExclusive
      */
    var MaxExclusiveInt: Double
    
    /**
      * specifies the inclusive upper bound for the value
      * @see http://www.w3.org/TR/xmlschema-2/#rf-maxInclusive
      */
    var MaxInclusiveInt: Double
    
    /**
      * specifies the exclusive lower bound for the value
      * @see http://www.w3.org/TR/xmlschema-2/#rf-minExclusive
      */
    var MinExclusiveInt: Double
    
    /**
      * specifies the inclusive lower bound for the value
      * @see http://www.w3.org/TR/xmlschema-2/#rf-minInclusive
      */
    var MinInclusiveInt: Double
  }
  object Year {
    
    inline def apply(
      IsBasic: scala.Boolean,
      MaxExclusiveInt: Double,
      MaxInclusiveInt: Double,
      MinExclusiveInt: Double,
      MinInclusiveInt: Double,
      Name: java.lang.String,
      Pattern: java.lang.String,
      PropertySetInfo: XPropertySetInfo,
      TypeClass: Double,
      WhiteSpaceTreatment: Double,
      acquire: Callback,
      addPropertyChangeListener: (java.lang.String, XPropertyChangeListener) => Callback,
      addVetoableChangeListener: (java.lang.String, XVetoableChangeListener) => Callback,
      explainInvalid: java.lang.String => java.lang.String,
      getPropertySetInfo: CallbackTo[XPropertySetInfo],
      getPropertyValue: java.lang.String => Any,
      queryInterface: `type` => Any,
      release: Callback,
      removePropertyChangeListener: (java.lang.String, XPropertyChangeListener) => Callback,
      removeVetoableChangeListener: (java.lang.String, XVetoableChangeListener) => Callback,
      setPropertyValue: (java.lang.String, Any) => Callback,
      validate: java.lang.String => scala.Boolean
    ): Year = {
      val __obj = js.Dynamic.literal(IsBasic = IsBasic.asInstanceOf[js.Any], MaxExclusiveInt = MaxExclusiveInt.asInstanceOf[js.Any], MaxInclusiveInt = MaxInclusiveInt.asInstanceOf[js.Any], MinExclusiveInt = MinExclusiveInt.asInstanceOf[js.Any], MinInclusiveInt = MinInclusiveInt.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Pattern = Pattern.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], TypeClass = TypeClass.asInstanceOf[js.Any], WhiteSpaceTreatment = WhiteSpaceTreatment.asInstanceOf[js.Any], acquire = acquire.toJsFn, addPropertyChangeListener = js.Any.fromFunction2((t0: java.lang.String, t1: XPropertyChangeListener) => (addPropertyChangeListener(t0, t1)).runNow()), addVetoableChangeListener = js.Any.fromFunction2((t0: java.lang.String, t1: XVetoableChangeListener) => (addVetoableChangeListener(t0, t1)).runNow()), explainInvalid = js.Any.fromFunction1(explainInvalid), getPropertySetInfo = getPropertySetInfo.toJsFn, getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removePropertyChangeListener = js.Any.fromFunction2((t0: java.lang.String, t1: XPropertyChangeListener) => (removePropertyChangeListener(t0, t1)).runNow()), removeVetoableChangeListener = js.Any.fromFunction2((t0: java.lang.String, t1: XVetoableChangeListener) => (removeVetoableChangeListener(t0, t1)).runNow()), setPropertyValue = js.Any.fromFunction2((t0: java.lang.String, t1: Any) => (setPropertyValue(t0, t1)).runNow()), validate = js.Any.fromFunction1(validate))
      __obj.asInstanceOf[Year]
    }
    
    extension [Self <: Year](x: Self) {
      
      inline def setMaxExclusiveInt(value: Double): Self = StObject.set(x, "MaxExclusiveInt", value.asInstanceOf[js.Any])
      
      inline def setMaxInclusiveInt(value: Double): Self = StObject.set(x, "MaxInclusiveInt", value.asInstanceOf[js.Any])
      
      inline def setMinExclusiveInt(value: Double): Self = StObject.set(x, "MinExclusiveInt", value.asInstanceOf[js.Any])
      
      inline def setMinInclusiveInt(value: Double): Self = StObject.set(x, "MinInclusiveInt", value.asInstanceOf[js.Any])
    }
  }
}
