package typingsJapgolly.activexLibreoffice.com_.sun.star.sdb

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`0`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`1`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`2`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`3`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`4`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`5`
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XNameAccess
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XComponent
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XInitialization
import typingsJapgolly.activexLibreoffice.com_.sun.star.sdbc.XConnection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tools {
  
  object CompositionType {
    
    /* Rewritten from type alias, can be one of: 
      - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`5`
      - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`2`
      - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`1`
      - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`4`
      - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`3`
      - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`0`
    */
    trait Constants extends StObject
    object Constants {
      
      inline def Complete: `5` = 5.asInstanceOf[`5`]
      
      inline def ForDataManipulation: `2` = 2.asInstanceOf[`2`]
      
      inline def ForIndexDefinitions: `1` = 1.asInstanceOf[`1`]
      
      inline def ForPrivilegeDefinitions: `4` = 4.asInstanceOf[`4`]
      
      inline def ForProcedureCalls: `3` = 3.asInstanceOf[`3`]
      
      inline def ForTableDefinitions: `0` = 0.asInstanceOf[`0`]
    }
  }
  
  /** @since LibreOffice 4.1 */
  trait ConnectionTools
    extends StObject
       with XConnectionTools {
    
    def createWithConnection(Connection: XConnection): Unit
  }
  object ConnectionTools {
    
    inline def apply(
      DataSourceMetaData: XDataSourceMetaData,
      ObjectNames: XObjectNames,
      createTableName: CallbackTo[XTableName],
      createWithConnection: XConnection => Callback,
      getComposer: (Double, String) => XSingleSelectQueryComposer,
      getDataSourceMetaData: CallbackTo[XDataSourceMetaData],
      getFieldsByCommandDescriptor: (Double, String, js.Array[XComponent]) => XNameAccess,
      getObjectNames: CallbackTo[XObjectNames]
    ): ConnectionTools = {
      val __obj = js.Dynamic.literal(DataSourceMetaData = DataSourceMetaData.asInstanceOf[js.Any], ObjectNames = ObjectNames.asInstanceOf[js.Any], createTableName = createTableName.toJsFn, createWithConnection = js.Any.fromFunction1((t0: XConnection) => createWithConnection(t0).runNow()), getComposer = js.Any.fromFunction2(getComposer), getDataSourceMetaData = getDataSourceMetaData.toJsFn, getFieldsByCommandDescriptor = js.Any.fromFunction3(getFieldsByCommandDescriptor), getObjectNames = getObjectNames.toJsFn)
      __obj.asInstanceOf[ConnectionTools]
    }
    
    extension [Self <: ConnectionTools](x: Self) {
      
      inline def setCreateWithConnection(value: XConnection => Callback): Self = StObject.set(x, "createWithConnection", js.Any.fromFunction1((t0: XConnection) => value(t0).runNow()))
    }
  }
  
  /**
    * allows to access the active connection
    * @see com.sun.star.sdbcx.XConnection
    * @since OOo 3.3
    */
  trait XConnectionSupplier
    extends StObject
       with XInitialization {
    
    /** returns the source connection. */
    var ActiveConnection: XConnection
  }
  object XConnectionSupplier {
    
    inline def apply(
      ActiveConnection: XConnection,
      acquire: Callback,
      initialize: SeqEquiv[Any] => Callback,
      queryInterface: `type` => Any,
      release: Callback
    ): XConnectionSupplier = {
      val __obj = js.Dynamic.literal(ActiveConnection = ActiveConnection.asInstanceOf[js.Any], acquire = acquire.toJsFn, initialize = js.Any.fromFunction1((t0: SeqEquiv[Any]) => initialize(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
      __obj.asInstanceOf[XConnectionSupplier]
    }
    
    extension [Self <: XConnectionSupplier](x: Self) {
      
      inline def setActiveConnection(value: XConnection): Self = StObject.set(x, "ActiveConnection", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * encapsulates various useful functionality around a {@link com.sun.star.sdb.Connection}
    *
    * Most of the functionality provided here is meaningful only relative to a given database connection. For instance, for quoting table names, you need
    * the meta data instance of the connection. Thus, the entry point for obtaining a {@link XConnectionTools} instance is the {@link
    * com.sun.star.sdb.Connection} service.
    *
    * Note that nearly all functionality provided by this interface is also available by other means, it's only provided here for convenience purposes.
    * @since OOo 2.0.4
    */
  trait XConnectionTools extends StObject {
    
    /** provides access to the application-level data source meta data */
    val DataSourceMetaData: XDataSourceMetaData
    
    /**
      * returns an instance supporting the {@link XObjectNames} interface, which provides access to functionality around table and query names.
      *
      * The returned object is guaranteed to not be `NULL` .
      */
    val ObjectNames: XObjectNames
    
    /**
      * creates an instance supporting the {@link XTableName} interface, which can be used to manipulate table names for various purposes.
      *
      * The returned object is guaranteed to not be `NULL` .
      */
    def createTableName(): XTableName
    
    /**
      * get the composer initialized with a command and command type.
      * @param commandType the type of the object
      * @param command the object. This may be a table name, a query name, or an SQL statement, depending on the value of _nCommandType
      * @returns the composer filled with command and command type.
      */
    def getComposer(commandType: Double, command: String): XSingleSelectQueryComposer
    
    /** provides access to the application-level data source meta data */
    def getDataSourceMetaData(): XDataSourceMetaData
    
    /**
      * get fields for a result set given by a "command descriptor"
      *
      * A command descriptor here means: a SDB-level connection ( {@link com.sun.star.sdb.Connection}a string specifying the name of an object relative to the
      * connectiona {@link com.sun.star.sdb.CommandType} value specifying the type of the object
      * @param commandType the type of the object
      * @param command the object. This may be a table name, a query name, or an SQL statement, depending on the value of _nCommandType
      * @param keepFieldsAlive If (and only if) {@link CommandType} is {@link CommandType.COMMAND} , the fields collection which is returned by this function
      * @returns the container of the columns (aka fields) of the object
      */
    def getFieldsByCommandDescriptor(commandType: Double, command: String, keepFieldsAlive: js.Array[XComponent]): XNameAccess
    
    /**
      * returns an instance supporting the {@link XObjectNames} interface, which provides access to functionality around table and query names.
      *
      * The returned object is guaranteed to not be `NULL` .
      */
    def getObjectNames(): XObjectNames
  }
  object XConnectionTools {
    
    inline def apply(
      DataSourceMetaData: XDataSourceMetaData,
      ObjectNames: XObjectNames,
      createTableName: CallbackTo[XTableName],
      getComposer: (Double, String) => XSingleSelectQueryComposer,
      getDataSourceMetaData: CallbackTo[XDataSourceMetaData],
      getFieldsByCommandDescriptor: (Double, String, js.Array[XComponent]) => XNameAccess,
      getObjectNames: CallbackTo[XObjectNames]
    ): XConnectionTools = {
      val __obj = js.Dynamic.literal(DataSourceMetaData = DataSourceMetaData.asInstanceOf[js.Any], ObjectNames = ObjectNames.asInstanceOf[js.Any], createTableName = createTableName.toJsFn, getComposer = js.Any.fromFunction2(getComposer), getDataSourceMetaData = getDataSourceMetaData.toJsFn, getFieldsByCommandDescriptor = js.Any.fromFunction3(getFieldsByCommandDescriptor), getObjectNames = getObjectNames.toJsFn)
      __obj.asInstanceOf[XConnectionTools]
    }
    
    extension [Self <: XConnectionTools](x: Self) {
      
      inline def setCreateTableName(value: CallbackTo[XTableName]): Self = StObject.set(x, "createTableName", value.toJsFn)
      
      inline def setDataSourceMetaData(value: XDataSourceMetaData): Self = StObject.set(x, "DataSourceMetaData", value.asInstanceOf[js.Any])
      
      inline def setGetComposer(value: (Double, String) => XSingleSelectQueryComposer): Self = StObject.set(x, "getComposer", js.Any.fromFunction2(value))
      
      inline def setGetDataSourceMetaData(value: CallbackTo[XDataSourceMetaData]): Self = StObject.set(x, "getDataSourceMetaData", value.toJsFn)
      
      inline def setGetFieldsByCommandDescriptor(value: (Double, String, js.Array[XComponent]) => XNameAccess): Self = StObject.set(x, "getFieldsByCommandDescriptor", js.Any.fromFunction3(value))
      
      inline def setGetObjectNames(value: CallbackTo[XObjectNames]): Self = StObject.set(x, "getObjectNames", value.toJsFn)
      
      inline def setObjectNames(value: XObjectNames): Self = StObject.set(x, "ObjectNames", value.asInstanceOf[js.Any])
    }
  }
  
  trait XDataSourceMetaData extends StObject {
    
    /** determines whether the data source supports queries in the `FROM` part of a `SELECT` statement. */
    def supportsQueriesInFrom(): Boolean
  }
  object XDataSourceMetaData {
    
    inline def apply(supportsQueriesInFrom: CallbackTo[Boolean]): XDataSourceMetaData = {
      val __obj = js.Dynamic.literal(supportsQueriesInFrom = supportsQueriesInFrom.toJsFn)
      __obj.asInstanceOf[XDataSourceMetaData]
    }
    
    extension [Self <: XDataSourceMetaData](x: Self) {
      
      inline def setSupportsQueriesInFrom(value: CallbackTo[Boolean]): Self = StObject.set(x, "supportsQueriesInFrom", value.toJsFn)
    }
  }
  
  /**
    * allows to alter the indexes of a table.
    * @see com.sun.star.sdb.DataSource.Settings
    * @see com.sun.star.sdbcx.XAppend
    * @see com.sun.star.sdbcx.XDrop
    * @since OOo 3.3
    */
  trait XIndexAlteration
    extends StObject
       with XConnectionSupplier {
    
    /**
      * creates a new object using the given descriptor and appends it to the related container. ** Note: ** The descriptor will not be changed and can be
      * used again to append another object.
      * @param table the table to be altered
      * @param descriptor the descriptor which should be serve to append a new object
      * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
      */
    def addIndex(table: XPropertySet, descriptor: XPropertySet): Unit
    
    /**
      * drops an object of the related container identified by its name.
      * @param table the table to be altered
      * @param index the name of the column to be dropped
      * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
      */
    def dropIndex(table: XPropertySet, index: String): Unit
  }
  object XIndexAlteration {
    
    inline def apply(
      ActiveConnection: XConnection,
      acquire: Callback,
      addIndex: (XPropertySet, XPropertySet) => Callback,
      dropIndex: (XPropertySet, String) => Callback,
      initialize: SeqEquiv[Any] => Callback,
      queryInterface: `type` => Any,
      release: Callback
    ): XIndexAlteration = {
      val __obj = js.Dynamic.literal(ActiveConnection = ActiveConnection.asInstanceOf[js.Any], acquire = acquire.toJsFn, addIndex = js.Any.fromFunction2((t0: XPropertySet, t1: XPropertySet) => (addIndex(t0, t1)).runNow()), dropIndex = js.Any.fromFunction2((t0: XPropertySet, t1: String) => (dropIndex(t0, t1)).runNow()), initialize = js.Any.fromFunction1((t0: SeqEquiv[Any]) => initialize(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
      __obj.asInstanceOf[XIndexAlteration]
    }
    
    extension [Self <: XIndexAlteration](x: Self) {
      
      inline def setAddIndex(value: (XPropertySet, XPropertySet) => Callback): Self = StObject.set(x, "addIndex", js.Any.fromFunction2((t0: XPropertySet, t1: XPropertySet) => (value(t0, t1)).runNow()))
      
      inline def setDropIndex(value: (XPropertySet, String) => Callback): Self = StObject.set(x, "dropIndex", js.Any.fromFunction2((t0: XPropertySet, t1: String) => (value(t0, t1)).runNow()))
    }
  }
  
  /**
    * allows to alter the keys of a table.
    * @see com.sun.star.sdb.DataSource.Settings
    * @see com.sun.star.sdbcx.XAppend
    * @see com.sun.star.sdbcx.XDrop
    * @since OOo 3.3
    */
  trait XKeyAlteration
    extends StObject
       with XConnectionSupplier {
    
    /**
      * creates a new object using the given descriptor and appends it to the related container. ** Note: ** The descriptor will not be changed and can be
      * used again to append another object.
      * @param table the table to be altered
      * @param descriptor the descriptor which should be serve to append a new object
      * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
      */
    def addKey(table: XPropertySet, descriptor: XPropertySet): Unit
    
    /**
      * drops an object of the related container identified by its name.
      * @param table the table to be altered
      * @param key the key to be dropped
      * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
      */
    def dropKey(table: XPropertySet, key: XPropertySet): Unit
  }
  object XKeyAlteration {
    
    inline def apply(
      ActiveConnection: XConnection,
      acquire: Callback,
      addKey: (XPropertySet, XPropertySet) => Callback,
      dropKey: (XPropertySet, XPropertySet) => Callback,
      initialize: SeqEquiv[Any] => Callback,
      queryInterface: `type` => Any,
      release: Callback
    ): XKeyAlteration = {
      val __obj = js.Dynamic.literal(ActiveConnection = ActiveConnection.asInstanceOf[js.Any], acquire = acquire.toJsFn, addKey = js.Any.fromFunction2((t0: XPropertySet, t1: XPropertySet) => (addKey(t0, t1)).runNow()), dropKey = js.Any.fromFunction2((t0: XPropertySet, t1: XPropertySet) => (dropKey(t0, t1)).runNow()), initialize = js.Any.fromFunction1((t0: SeqEquiv[Any]) => initialize(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
      __obj.asInstanceOf[XKeyAlteration]
    }
    
    extension [Self <: XKeyAlteration](x: Self) {
      
      inline def setAddKey(value: (XPropertySet, XPropertySet) => Callback): Self = StObject.set(x, "addKey", js.Any.fromFunction2((t0: XPropertySet, t1: XPropertySet) => (value(t0, t1)).runNow()))
      
      inline def setDropKey(value: (XPropertySet, XPropertySet) => Callback): Self = StObject.set(x, "dropKey", js.Any.fromFunction2((t0: XPropertySet, t1: XPropertySet) => (value(t0, t1)).runNow()))
    }
  }
  
  /**
    * encapsulates functionality which you might find useful when writing a database application which deals with query and table names.
    *
    * The most important task fulfilled by this instance is that it hides different naming restrictions from you, which are caused by server-side or client
    * side specialties.
    *
    * For instance, it can validate names against the characters allowed in the object names of a connection. Also, it relieves you from caring whether a
    * database supports queries in a `SELECT` statement's `FROM` part (known as "queries in queries"). In such databases, query and table names share a
    * common namespace, thus they must be unique. Using this interface, you can easily ensure this uniqueness.
    *
    * All of the functionality present in this interface depends on a connection, thus it entry point for obtaining it is a {@link
    * com.sun.star.sdb.Connection} service.
    *
    * The component itself does not have life-time control mechanisms, i.e. you cannot explicitly dispose it ( {@link
    * com.sun.star.lang.XComponent.dispose()} ), and you cannot be notified when it dies. ;  However, if your try to access any of its methods or
    * attributes, after the connection which was used to create it was closed, a {@link com.sun.star.lang.DisposedException} will be thrown.
    * @see XConnectionTools
    * @since OOo 2.0.4
    */
  trait XObjectNames extends StObject {
    
    /**
      * checks whether a given name is allowed for a to-be-created table or query in the database.
      *
      * This method basically does the same checks as {@link isNameUsed()} and {@link isNameValid()} . In case the given name is not allowed, it throws an
      * exception. This error can be presented to the user, to give it a common experience in all cases where they're required to enter an object name.
      * @see isNameUsed
      * @see isNameValid
      * @see com.sun.star.sdb.ErrorMessageDialog
      * @see com.sun.star.sdb.InteractionHandler
      */
    def checkNameForCreate(CommandType: Double, Name: String): Unit
    
    /**
      * converts the given object name to a name which is valid in the database.
      *
      * The conversion takes place by converting every character which is neither allowed by the SQL-92 standard, nor part of the special characters supported
      * by the database, with an underscore character (_).
      * @see com.sun.star.sdbc.XDatabaseMetaData.getExtraNameCharacters
      */
    def convertToSQLName(Name: String): String
    
    /**
      * checks whether a given name is used as table respectively query name in the database.
      *
      * If in the database, tables and queries share a common namespace, this will be respected by this function.
      *
      * As before, the information you obtain by calling this method might be obsolete in the very moment you evaluate this, in case another process or thread
      * interferes. However, it's usually sufficiently up-to-date for purpose of using it in a database application driven by user interactions.
      * @param CommandType specifies the {@link com.sun.star.sdb.CommandType} of the object whose name should be checked. Must be either {@link com.sun.star.sdb
      * @param Name specifies the to-be-checked name of the object.
      * @returns `TRUE` if and only if the given name is legitimate as table respectively query name to be used in the database.
      * @see checkNameIsUsed
      * @throws com::sun::star::lang::IllegalArgumentException if {@link CommandType} specifies an invalid command type.
      */
    def isNameUsed(CommandType: Double, Name: String): Boolean
    
    /**
      * checks whether a given name is valid as table or query name
      *
      * For tables, the name must consist of characters allowed by the SQL-92 standard, plus characters allowed by the connection as extra name characters.
      *
      * For queries, names are nearly arbitrary, except that usual quoting characters must not be part of the name.
      * @see com.sun.star.sdbc.XDatabaseMetaData.getExtraNameCharacters
      */
    def isNameValid(CommandType: Double, Name: String): Boolean
    
    /**
      * suggests a (unique) table or query name
      *
      * If in the database, tables and queries share a common namespace, this will be respected by this function.
      *
      * Note that in an multi-threaded environment, the name you obtain here is not absolutely guaranteed to be unique. It is unique at the very moment the
      * function returns to you. But already when you evaluate the returned value, it might not be unique anymore, if another process or thread created a
      * query or table with this name.
      *
      * This implies that you cannot rely on the name's uniqueness, but you can use it as first guess to present to the user. In most cases, it will still be
      * sufficient when you are actually creating the table respectively query.
      * @param CommandType specifies the {@link com.sun.star.sdb.CommandType} of the object for which a unique name is to be generated. Must be either {@link co
      * @param BaseName specifies the base of the to-be-created object name. If empty, a default base name will be used.
      * @throws com::sun::star::lang::IllegalArgumentException if {@link CommandType} specifies an invalid command type.
      */
    def suggestName(CommandType: Double, BaseName: String): String
  }
  object XObjectNames {
    
    inline def apply(
      checkNameForCreate: (Double, String) => Callback,
      convertToSQLName: String => String,
      isNameUsed: (Double, String) => Boolean,
      isNameValid: (Double, String) => Boolean,
      suggestName: (Double, String) => String
    ): XObjectNames = {
      val __obj = js.Dynamic.literal(checkNameForCreate = js.Any.fromFunction2((t0: Double, t1: String) => (checkNameForCreate(t0, t1)).runNow()), convertToSQLName = js.Any.fromFunction1(convertToSQLName), isNameUsed = js.Any.fromFunction2(isNameUsed), isNameValid = js.Any.fromFunction2(isNameValid), suggestName = js.Any.fromFunction2(suggestName))
      __obj.asInstanceOf[XObjectNames]
    }
    
    extension [Self <: XObjectNames](x: Self) {
      
      inline def setCheckNameForCreate(value: (Double, String) => Callback): Self = StObject.set(x, "checkNameForCreate", js.Any.fromFunction2((t0: Double, t1: String) => (value(t0, t1)).runNow()))
      
      inline def setConvertToSQLName(value: String => String): Self = StObject.set(x, "convertToSQLName", js.Any.fromFunction1(value))
      
      inline def setIsNameUsed(value: (Double, String) => Boolean): Self = StObject.set(x, "isNameUsed", js.Any.fromFunction2(value))
      
      inline def setIsNameValid(value: (Double, String) => Boolean): Self = StObject.set(x, "isNameValid", js.Any.fromFunction2(value))
      
      inline def setSuggestName(value: (Double, String) => String): Self = StObject.set(x, "suggestName", js.Any.fromFunction2(value))
    }
  }
  
  /**
    * allows to alter a table.
    * @see com.sun.star.sdb.DataSource.Settings
    * @see com.sun.star.sdbcx.ColumnDescriptor
    * @see com.sun.star.sdbcx.XAlterTable
    * @see com.sun.star.sdbcx.XAppend
    * @see com.sun.star.sdbcx.XDrop
    * @since OOo 3.3
    */
  trait XTableAlteration
    extends StObject
       with XConnectionSupplier {
    
    /**
      * creates a new object using the given descriptor and appends it to the related container. ** Note: ** The descriptor will not be changed and can be
      * used again to append another object.
      * @param table the table to be altered
      * @param descriptor the descriptor which should be serve to append a new object
      * @see com.sun.star.sdbcx.XAppend
      * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
      */
    def addColumn(table: XPropertySet, descriptor: XPropertySet): Unit
    
    /**
      * alter the column defined by name
      * @param table the table to be altered
      * @param columnName the name of the column to be changed
      * @param columnDescriptor the column descriptor with the information of the new column definition
      * @see com.sun.star.sdbcx.XAlterTable
      * @throws com::sun::star::sdbc::SQLException
      */
    def alterColumnByName(table: XPropertySet, columnName: String, columnDescriptor: XPropertySet): Unit
    
    /**
      * drops an object of the related container identified by its name.
      * @param table the table to be altered
      * @param columnName the name of the column to be dropped
      * @see com.sun.star.sdbcx.XDrop
      * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
      */
    def dropColumn(table: XPropertySet, columnName: String): Unit
  }
  object XTableAlteration {
    
    inline def apply(
      ActiveConnection: XConnection,
      acquire: Callback,
      addColumn: (XPropertySet, XPropertySet) => Callback,
      alterColumnByName: (XPropertySet, String, XPropertySet) => Callback,
      dropColumn: (XPropertySet, String) => Callback,
      initialize: SeqEquiv[Any] => Callback,
      queryInterface: `type` => Any,
      release: Callback
    ): XTableAlteration = {
      val __obj = js.Dynamic.literal(ActiveConnection = ActiveConnection.asInstanceOf[js.Any], acquire = acquire.toJsFn, addColumn = js.Any.fromFunction2((t0: XPropertySet, t1: XPropertySet) => (addColumn(t0, t1)).runNow()), alterColumnByName = js.Any.fromFunction3((t0: XPropertySet, t1: String, t2: XPropertySet) => (alterColumnByName(t0, t1, t2)).runNow()), dropColumn = js.Any.fromFunction2((t0: XPropertySet, t1: String) => (dropColumn(t0, t1)).runNow()), initialize = js.Any.fromFunction1((t0: SeqEquiv[Any]) => initialize(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
      __obj.asInstanceOf[XTableAlteration]
    }
    
    extension [Self <: XTableAlteration](x: Self) {
      
      inline def setAddColumn(value: (XPropertySet, XPropertySet) => Callback): Self = StObject.set(x, "addColumn", js.Any.fromFunction2((t0: XPropertySet, t1: XPropertySet) => (value(t0, t1)).runNow()))
      
      inline def setAlterColumnByName(value: (XPropertySet, String, XPropertySet) => Callback): Self = StObject.set(x, "alterColumnByName", js.Any.fromFunction3((t0: XPropertySet, t1: String, t2: XPropertySet) => (value(t0, t1, t2)).runNow()))
      
      inline def setDropColumn(value: (XPropertySet, String) => Callback): Self = StObject.set(x, "dropColumn", js.Any.fromFunction2((t0: XPropertySet, t1: String) => (value(t0, t1)).runNow()))
    }
  }
  
  /**
    * allows to manipulate table names.
    *
    * When, in a database application, dealing with table names, there's many degrees of freedom to deal with. For instance, suppose you want to have the
    * full name of a table object, as it should be used in a `SELECT` statement's `FROM` part. This requires you to evaluate whether or not the table has a
    * catalog and/or schema name, to combine the catalog, the schema, and the basic table name into one name, respecting the database's quoting character,
    * and the order in which all those parts should be combined. Additionally, you have to respect the client-side settings which tell OpenOffice.org to use
    * or not use catalogs and schemas in `SELECT` at all.
    *
    * The {@link XTableName} interface eases this and other, similar tasks around table names.
    *
    * The component itself does not have life-time control mechanisms, i.e. you cannot explicitly dispose it ( {@link
    * com.sun.star.lang.XComponent.dispose()} ), and you cannot be notified when it dies. ;  However, if your try to access any of its methods or
    * attributes, after the connection which was used to create it was closed, a {@link com.sun.star.lang.DisposedException} will be thrown.
    * @see XConnectionTools
    * @see com.sun.star.sdbc.XDatabaseMetaData
    * @see com.sun.star.sdb.DataSource.Settings
    * @since OOo 2.0.4
    */
  trait XTableName extends StObject {
    
    /** denotes the name of the catalog which the table is a part of */
    var CatalogName: String
    
    /**
      * represents the table name in a form to be used in a `SELECT` statement.
      *
      * On a per-data-source basis, OpenOffice.org allows to override database meta data information in that you can specify to not use catalog and or schema
      * names in `SELECT` statements. Using this attribute, you can generate a table name which respects those settings.
      * @see com.sun.star.sdb.DataSource.Settings
      */
    var NameForSelect: String
    
    /** denotes the name of the schema which the table is a part of */
    var SchemaName: String
    
    /**
      * is the {@link com.sun.star.sdb.Table} object specified by the current name.
      *
      * Retrieving this attribute is equivalent to obtaining the tables container from the connection (via {@link com.sun.star.sdbcx.XTablesSupplier} ), and
      * calling its {@link com.sun.star.container.XNameAccess.getByName()} method with the ComposedName.
      * @throws com::sun::star::container::NoSuchElementException if, upon getting the attribute value, the current composed table name represented by this insta
      * @throws com::sun::star::lang::IllegalArgumentException if you try to set an object which does not denote a table from the underlying database.
      */
    var Table: XPropertySet
    
    /** denotes the mere, unqualified table name, excluding any catalog and schema. */
    var TableName: String
    
    /**
      * returns the composed table name, including the catalog and schema name, respecting the database's quoting requirements, plus
      * @param Type the type of name composition to be used.
      * @param Quote specifies whether the single parts of the table name should be quoted
      * @see CompositionType
      * @throws com::sun::star::IllegalArgumentException if the given Type does not denote a valid {@link CompositionType}
      */
    def getComposedName(Type: Double, Quote: Boolean): String
    
    /**
      * sets a new composed table name
      * @param ComposedName specifies the composed table name
      * @param Type specifies the composition type which was used to create the composed table name
      */
    def setComposedName(ComposedName: String, Type: Double): Unit
  }
  object XTableName {
    
    inline def apply(
      CatalogName: String,
      NameForSelect: String,
      SchemaName: String,
      Table: XPropertySet,
      TableName: String,
      getComposedName: (Double, Boolean) => String,
      setComposedName: (String, Double) => Callback
    ): XTableName = {
      val __obj = js.Dynamic.literal(CatalogName = CatalogName.asInstanceOf[js.Any], NameForSelect = NameForSelect.asInstanceOf[js.Any], SchemaName = SchemaName.asInstanceOf[js.Any], Table = Table.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any], getComposedName = js.Any.fromFunction2(getComposedName), setComposedName = js.Any.fromFunction2((t0: String, t1: Double) => (setComposedName(t0, t1)).runNow()))
      __obj.asInstanceOf[XTableName]
    }
    
    extension [Self <: XTableName](x: Self) {
      
      inline def setCatalogName(value: String): Self = StObject.set(x, "CatalogName", value.asInstanceOf[js.Any])
      
      inline def setGetComposedName(value: (Double, Boolean) => String): Self = StObject.set(x, "getComposedName", js.Any.fromFunction2(value))
      
      inline def setNameForSelect(value: String): Self = StObject.set(x, "NameForSelect", value.asInstanceOf[js.Any])
      
      inline def setSchemaName(value: String): Self = StObject.set(x, "SchemaName", value.asInstanceOf[js.Any])
      
      inline def setSetComposedName(value: (String, Double) => Callback): Self = StObject.set(x, "setComposedName", js.Any.fromFunction2((t0: String, t1: Double) => (value(t0, t1)).runNow()))
      
      inline def setTable(value: XPropertySet): Self = StObject.set(x, "Table", value.asInstanceOf[js.Any])
      
      inline def setTableName(value: String): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * allows to rename table.
    * @see com.sun.star.sdb.DataSource.Settings
    * @since OOo 3.3
    */
  trait XTableRename
    extends StObject
       with XConnectionSupplier {
    
    /**
      * rename the given table to the new name
      * @param table the table to be renamed
      * @param newName the new name of the table
      * @throws com::sun::star::sdbc::SQLException
      */
    def rename(table: XPropertySet, newName: String): Unit
  }
  object XTableRename {
    
    inline def apply(
      ActiveConnection: XConnection,
      acquire: Callback,
      initialize: SeqEquiv[Any] => Callback,
      queryInterface: `type` => Any,
      release: Callback,
      rename: (XPropertySet, String) => Callback
    ): XTableRename = {
      val __obj = js.Dynamic.literal(ActiveConnection = ActiveConnection.asInstanceOf[js.Any], acquire = acquire.toJsFn, initialize = js.Any.fromFunction1((t0: SeqEquiv[Any]) => initialize(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, rename = js.Any.fromFunction2((t0: XPropertySet, t1: String) => (rename(t0, t1)).runNow()))
      __obj.asInstanceOf[XTableRename]
    }
    
    extension [Self <: XTableRename](x: Self) {
      
      inline def setRename(value: (XPropertySet, String) => Callback): Self = StObject.set(x, "rename", js.Any.fromFunction2((t0: XPropertySet, t1: String) => (value(t0, t1)).runNow()))
    }
  }
  
  /**
    * allows to fetch and to change the sql statements of views
    * @see com.sun.star.sdb.DataSource.Settings
    * @see com.sun.star.sdbcx.View
    * @since OOo 3.3
    */
  trait XViewAccess
    extends StObject
       with XConnectionSupplier {
    
    /**
      * allows to alter the SQL statement of a view
      * @param view the view to be altered
      * @param command the new SQL statement
      * @throws com::sun::star::sdbc::SQLException
      */
    def alterCommand(view: XPropertySet, command: String): Unit
    
    /**
      * returns the SQL statement of the view
      * @param view the table to be renamed
      * @throws com::sun::star::sdbc::SQLException
      */
    def getCommand(view: XPropertySet): String
  }
  object XViewAccess {
    
    inline def apply(
      ActiveConnection: XConnection,
      acquire: Callback,
      alterCommand: (XPropertySet, String) => Callback,
      getCommand: XPropertySet => String,
      initialize: SeqEquiv[Any] => Callback,
      queryInterface: `type` => Any,
      release: Callback
    ): XViewAccess = {
      val __obj = js.Dynamic.literal(ActiveConnection = ActiveConnection.asInstanceOf[js.Any], acquire = acquire.toJsFn, alterCommand = js.Any.fromFunction2((t0: XPropertySet, t1: String) => (alterCommand(t0, t1)).runNow()), getCommand = js.Any.fromFunction1(getCommand), initialize = js.Any.fromFunction1((t0: SeqEquiv[Any]) => initialize(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
      __obj.asInstanceOf[XViewAccess]
    }
    
    extension [Self <: XViewAccess](x: Self) {
      
      inline def setAlterCommand(value: (XPropertySet, String) => Callback): Self = StObject.set(x, "alterCommand", js.Any.fromFunction2((t0: XPropertySet, t1: String) => (value(t0, t1)).runNow()))
      
      inline def setGetCommand(value: XPropertySet => String): Self = StObject.set(x, "getCommand", js.Any.fromFunction1(value))
    }
  }
}
