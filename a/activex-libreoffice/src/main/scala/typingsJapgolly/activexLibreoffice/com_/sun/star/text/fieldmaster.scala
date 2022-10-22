package typingsJapgolly.activexLibreoffice.com_.sun.star.text

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.PropertyValues
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.Locale
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fieldmaster {
  
  /**
    * specifies service of a {@link Bibliography} field master.
    * @see com.sun.star.text.TextField
    */
  trait Bibliography
    extends StObject
       with TextFieldMaster {
    
    /** determines the closing bracket used to display the bibliography text fields. */
    var BracketAfter: String
    
    /** determines the opening bracket used to display the bibliography text fields. */
    var BracketBefore: String
    
    /** determines whether the bibliography text fields are numbered. If `FALSE` the short name of the bibliography entry is displayed instead. */
    var IsNumberEntries: Boolean
    
    /**
      * determines whether the bibliography entries in a bibliography index are sorted by the document position. If `FALSE` the SortKey property determines
      * the sorting of the entries.
      */
    var IsSortByPosition: Boolean
    
    /** contains the locale of the field master */
    var Locale: typingsJapgolly.activexLibreoffice.com_.sun.star.lang.Locale
    
    /** contains the name of the sort algorithm that is used to sort the text fields. */
    var SortAlgorithm: String
    
    /**
      * determines the sorting of the bibliography entries in a bibliography index. This property is used if the property IsSortByPosition is not set. Each
      * contained element of the sequence is a sequence of the following two properties:
      *
      * [property] short SortKey;
      *
      *
      *
      * Determines the bibliography field that is used to sort by.
      *
      *
      *
      * [property] boolean IsSortAscending;
      *
      *
      *
      * Determines whether the sorting is ascending or descending. It uses the type {@link com.sun.star.text.BibliographyDataField}
      */
    var SortKeys: SafeArray[PropertyValues]
  }
  object Bibliography {
    
    inline def apply(
      BracketAfter: String,
      BracketBefore: String,
      DependentTextFields: SafeArray[XDependentTextField],
      InstanceName: String,
      IsNumberEntries: Boolean,
      IsSortByPosition: Boolean,
      Locale: Locale,
      Name: String,
      PropertySetInfo: XPropertySetInfo,
      SortAlgorithm: String,
      SortKeys: SafeArray[PropertyValues],
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
    ): typingsJapgolly.activexLibreoffice.com_.sun.star.text.fieldmaster.Bibliography = {
      val __obj = js.Dynamic.literal(BracketAfter = BracketAfter.asInstanceOf[js.Any], BracketBefore = BracketBefore.asInstanceOf[js.Any], DependentTextFields = DependentTextFields.asInstanceOf[js.Any], InstanceName = InstanceName.asInstanceOf[js.Any], IsNumberEntries = IsNumberEntries.asInstanceOf[js.Any], IsSortByPosition = IsSortByPosition.asInstanceOf[js.Any], Locale = Locale.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], SortAlgorithm = SortAlgorithm.asInstanceOf[js.Any], SortKeys = SortKeys.asInstanceOf[js.Any], acquire = acquire.toJsFn, addPropertyChangeListener = js.Any.fromFunction2((t0: String, t1: XPropertyChangeListener) => (addPropertyChangeListener(t0, t1)).runNow()), addVetoableChangeListener = js.Any.fromFunction2((t0: String, t1: XVetoableChangeListener) => (addVetoableChangeListener(t0, t1)).runNow()), getPropertySetInfo = getPropertySetInfo.toJsFn, getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removePropertyChangeListener = js.Any.fromFunction2((t0: String, t1: XPropertyChangeListener) => (removePropertyChangeListener(t0, t1)).runNow()), removeVetoableChangeListener = js.Any.fromFunction2((t0: String, t1: XVetoableChangeListener) => (removeVetoableChangeListener(t0, t1)).runNow()), setPropertyValue = js.Any.fromFunction2((t0: String, t1: Any) => (setPropertyValue(t0, t1)).runNow()))
      __obj.asInstanceOf[typingsJapgolly.activexLibreoffice.com_.sun.star.text.fieldmaster.Bibliography]
    }
    
    extension [Self <: typingsJapgolly.activexLibreoffice.com_.sun.star.text.fieldmaster.Bibliography](x: Self) {
      
      inline def setBracketAfter(value: String): Self = StObject.set(x, "BracketAfter", value.asInstanceOf[js.Any])
      
      inline def setBracketBefore(value: String): Self = StObject.set(x, "BracketBefore", value.asInstanceOf[js.Any])
      
      inline def setIsNumberEntries(value: Boolean): Self = StObject.set(x, "IsNumberEntries", value.asInstanceOf[js.Any])
      
      inline def setIsSortByPosition(value: Boolean): Self = StObject.set(x, "IsSortByPosition", value.asInstanceOf[js.Any])
      
      inline def setLocale(value: Locale): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
      
      inline def setSortAlgorithm(value: String): Self = StObject.set(x, "SortAlgorithm", value.asInstanceOf[js.Any])
      
      inline def setSortKeys(value: SafeArray[PropertyValues]): Self = StObject.set(x, "SortKeys", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * specifies service of a {@link DDE} field master.
    * @see com.sun.star.text.TextField
    */
  trait DDE
    extends StObject
       with TextFieldMaster {
    
    /** contains the content. */
    var Content: String
    
    /** contains the element string of the {@link DDE} command. */
    var DDECommandElement: String
    
    /** contains the file string of the {@link DDE} command. */
    var DDECommandFile: String
    
    /** contains the type string of the {@link DDE} command. */
    var DDECommandType: String
    
    /** determines whether {@link DDE} link is updated automatically. */
    var IsAutomaticUpdate: Boolean
  }
  object DDE {
    
    inline def apply(
      Content: String,
      DDECommandElement: String,
      DDECommandFile: String,
      DDECommandType: String,
      DependentTextFields: SafeArray[XDependentTextField],
      InstanceName: String,
      IsAutomaticUpdate: Boolean,
      Name: String,
      PropertySetInfo: XPropertySetInfo,
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
    ): DDE = {
      val __obj = js.Dynamic.literal(Content = Content.asInstanceOf[js.Any], DDECommandElement = DDECommandElement.asInstanceOf[js.Any], DDECommandFile = DDECommandFile.asInstanceOf[js.Any], DDECommandType = DDECommandType.asInstanceOf[js.Any], DependentTextFields = DependentTextFields.asInstanceOf[js.Any], InstanceName = InstanceName.asInstanceOf[js.Any], IsAutomaticUpdate = IsAutomaticUpdate.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], acquire = acquire.toJsFn, addPropertyChangeListener = js.Any.fromFunction2((t0: String, t1: XPropertyChangeListener) => (addPropertyChangeListener(t0, t1)).runNow()), addVetoableChangeListener = js.Any.fromFunction2((t0: String, t1: XVetoableChangeListener) => (addVetoableChangeListener(t0, t1)).runNow()), getPropertySetInfo = getPropertySetInfo.toJsFn, getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removePropertyChangeListener = js.Any.fromFunction2((t0: String, t1: XPropertyChangeListener) => (removePropertyChangeListener(t0, t1)).runNow()), removeVetoableChangeListener = js.Any.fromFunction2((t0: String, t1: XVetoableChangeListener) => (removeVetoableChangeListener(t0, t1)).runNow()), setPropertyValue = js.Any.fromFunction2((t0: String, t1: Any) => (setPropertyValue(t0, t1)).runNow()))
      __obj.asInstanceOf[DDE]
    }
    
    extension [Self <: DDE](x: Self) {
      
      inline def setContent(value: String): Self = StObject.set(x, "Content", value.asInstanceOf[js.Any])
      
      inline def setDDECommandElement(value: String): Self = StObject.set(x, "DDECommandElement", value.asInstanceOf[js.Any])
      
      inline def setDDECommandFile(value: String): Self = StObject.set(x, "DDECommandFile", value.asInstanceOf[js.Any])
      
      inline def setDDECommandType(value: String): Self = StObject.set(x, "DDECommandType", value.asInstanceOf[js.Any])
      
      inline def setIsAutomaticUpdate(value: Boolean): Self = StObject.set(x, "IsAutomaticUpdate", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * specifies service of a {@link Database} field master.
    * @see com.sun.star.text.TextField Only one of the properties {@link DataBaseName} , {@link DataBaseURL} and {@link DataBaseResource} should be set. If
    */
  trait Database
    extends StObject
       with TextFieldMaster {
    
    /** contains the CommandType this can be the name of a data base table, a data query or a statement. (0 = table, 1 = query, 2 = statement) */
    var CommandType: Double
    
    /** specifies the database name. */
    var DataBaseName: String
    
    /**
      * indicates a connection URL, which locates a database driver.
      * @since OOo 2.0
      */
    var DataBaseResource: String
    
    /**
      * indicates the URL of a database file.
      * @since OOo 2.0
      */
    var DataBaseURL: String
    
    /** contains the name of the data base table. */
    var DataColumnName: String
    
    /** contains the command string. Depending on the CommandType property this can be the name of a data base table, a data query or a statement. */
    var DataTableName: String
  }
  object Database {
    
    inline def apply(
      CommandType: Double,
      DataBaseName: String,
      DataBaseResource: String,
      DataBaseURL: String,
      DataColumnName: String,
      DataTableName: String,
      DependentTextFields: SafeArray[XDependentTextField],
      InstanceName: String,
      Name: String,
      PropertySetInfo: XPropertySetInfo,
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
    ): Database = {
      val __obj = js.Dynamic.literal(CommandType = CommandType.asInstanceOf[js.Any], DataBaseName = DataBaseName.asInstanceOf[js.Any], DataBaseResource = DataBaseResource.asInstanceOf[js.Any], DataBaseURL = DataBaseURL.asInstanceOf[js.Any], DataColumnName = DataColumnName.asInstanceOf[js.Any], DataTableName = DataTableName.asInstanceOf[js.Any], DependentTextFields = DependentTextFields.asInstanceOf[js.Any], InstanceName = InstanceName.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], acquire = acquire.toJsFn, addPropertyChangeListener = js.Any.fromFunction2((t0: String, t1: XPropertyChangeListener) => (addPropertyChangeListener(t0, t1)).runNow()), addVetoableChangeListener = js.Any.fromFunction2((t0: String, t1: XVetoableChangeListener) => (addVetoableChangeListener(t0, t1)).runNow()), getPropertySetInfo = getPropertySetInfo.toJsFn, getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removePropertyChangeListener = js.Any.fromFunction2((t0: String, t1: XPropertyChangeListener) => (removePropertyChangeListener(t0, t1)).runNow()), removeVetoableChangeListener = js.Any.fromFunction2((t0: String, t1: XVetoableChangeListener) => (removeVetoableChangeListener(t0, t1)).runNow()), setPropertyValue = js.Any.fromFunction2((t0: String, t1: Any) => (setPropertyValue(t0, t1)).runNow()))
      __obj.asInstanceOf[Database]
    }
    
    extension [Self <: Database](x: Self) {
      
      inline def setCommandType(value: Double): Self = StObject.set(x, "CommandType", value.asInstanceOf[js.Any])
      
      inline def setDataBaseName(value: String): Self = StObject.set(x, "DataBaseName", value.asInstanceOf[js.Any])
      
      inline def setDataBaseResource(value: String): Self = StObject.set(x, "DataBaseResource", value.asInstanceOf[js.Any])
      
      inline def setDataBaseURL(value: String): Self = StObject.set(x, "DataBaseURL", value.asInstanceOf[js.Any])
      
      inline def setDataColumnName(value: String): Self = StObject.set(x, "DataColumnName", value.asInstanceOf[js.Any])
      
      inline def setDataTableName(value: String): Self = StObject.set(x, "DataTableName", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Specifies the service of a set expression field master.
    * @see com.sun.star.text.TextFieldMaster
    */
  trait SetExpression
    extends StObject
       with TextFieldMaster {
    
    /** determines the number of the chapter. This values is used if the field master is set as number sequence. */
    var ChapterNumberingLevel: Double
    
    /** determines the numbering separator string if the field master is set as number sequence. */
    var NumberingSeparator: String
    
    /** determines the type of the field as {@link com.sun.star.text.SetVariableType} */
    var SubType: Double
  }
  object SetExpression {
    
    inline def apply(
      ChapterNumberingLevel: Double,
      DependentTextFields: SafeArray[XDependentTextField],
      InstanceName: String,
      Name: String,
      NumberingSeparator: String,
      PropertySetInfo: XPropertySetInfo,
      SubType: Double,
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
    ): SetExpression = {
      val __obj = js.Dynamic.literal(ChapterNumberingLevel = ChapterNumberingLevel.asInstanceOf[js.Any], DependentTextFields = DependentTextFields.asInstanceOf[js.Any], InstanceName = InstanceName.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], NumberingSeparator = NumberingSeparator.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], SubType = SubType.asInstanceOf[js.Any], acquire = acquire.toJsFn, addPropertyChangeListener = js.Any.fromFunction2((t0: String, t1: XPropertyChangeListener) => (addPropertyChangeListener(t0, t1)).runNow()), addVetoableChangeListener = js.Any.fromFunction2((t0: String, t1: XVetoableChangeListener) => (addVetoableChangeListener(t0, t1)).runNow()), getPropertySetInfo = getPropertySetInfo.toJsFn, getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removePropertyChangeListener = js.Any.fromFunction2((t0: String, t1: XPropertyChangeListener) => (removePropertyChangeListener(t0, t1)).runNow()), removeVetoableChangeListener = js.Any.fromFunction2((t0: String, t1: XVetoableChangeListener) => (removeVetoableChangeListener(t0, t1)).runNow()), setPropertyValue = js.Any.fromFunction2((t0: String, t1: Any) => (setPropertyValue(t0, t1)).runNow()))
      __obj.asInstanceOf[SetExpression]
    }
    
    extension [Self <: SetExpression](x: Self) {
      
      inline def setChapterNumberingLevel(value: Double): Self = StObject.set(x, "ChapterNumberingLevel", value.asInstanceOf[js.Any])
      
      inline def setNumberingSeparator(value: String): Self = StObject.set(x, "NumberingSeparator", value.asInstanceOf[js.Any])
      
      inline def setSubType(value: Double): Self = StObject.set(x, "SubType", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Specifies the service of a user field master.
    * @see com.sun.star.text.TextFieldMaster
    */
  trait User
    extends StObject
       with TextFieldMaster {
    
    /** contains the content. */
    var Content: String
    
    /** determines whether the field contains an expression. */
    var IsExpression: Boolean
    
    /** contains the value. */
    var Value: Double
  }
  object User {
    
    inline def apply(
      Content: String,
      DependentTextFields: SafeArray[XDependentTextField],
      InstanceName: String,
      IsExpression: Boolean,
      Name: String,
      PropertySetInfo: XPropertySetInfo,
      Value: Double,
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
    ): User = {
      val __obj = js.Dynamic.literal(Content = Content.asInstanceOf[js.Any], DependentTextFields = DependentTextFields.asInstanceOf[js.Any], InstanceName = InstanceName.asInstanceOf[js.Any], IsExpression = IsExpression.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any], acquire = acquire.toJsFn, addPropertyChangeListener = js.Any.fromFunction2((t0: String, t1: XPropertyChangeListener) => (addPropertyChangeListener(t0, t1)).runNow()), addVetoableChangeListener = js.Any.fromFunction2((t0: String, t1: XVetoableChangeListener) => (addVetoableChangeListener(t0, t1)).runNow()), getPropertySetInfo = getPropertySetInfo.toJsFn, getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removePropertyChangeListener = js.Any.fromFunction2((t0: String, t1: XPropertyChangeListener) => (removePropertyChangeListener(t0, t1)).runNow()), removeVetoableChangeListener = js.Any.fromFunction2((t0: String, t1: XVetoableChangeListener) => (removeVetoableChangeListener(t0, t1)).runNow()), setPropertyValue = js.Any.fromFunction2((t0: String, t1: Any) => (setPropertyValue(t0, t1)).runNow()))
      __obj.asInstanceOf[User]
    }
    
    extension [Self <: User](x: Self) {
      
      inline def setContent(value: String): Self = StObject.set(x, "Content", value.asInstanceOf[js.Any])
      
      inline def setIsExpression(value: Boolean): Self = StObject.set(x, "IsExpression", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Double): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    }
  }
}
