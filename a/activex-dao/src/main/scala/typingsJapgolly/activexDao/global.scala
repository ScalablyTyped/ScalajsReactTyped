package typingsJapgolly.activexDao

import typingsJapgolly.activexDao.DAO.Documents
import typingsJapgolly.activexDao.DAO.Fields
import typingsJapgolly.activexDao.DAO.Properties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object DAO {
    
    @JSGlobal("DAO.ComplexType")
    @js.native
    /* private */ open class ComplexType ()
      extends StObject
         with typingsJapgolly.activexDao.DAO.ComplexType {
      
      /* private */ /* CompleteClass */
      @JSName("DAO.ComplexType_typekey")
      var DAODotComplexType_typekey: typingsJapgolly.activexDao.DAO.ComplexType = js.native
      
      /* CompleteClass */
      override def Fields(Item: String): typingsJapgolly.activexDao.DAO.Field = js.native
      /* CompleteClass */
      override def Fields(Item: Double): typingsJapgolly.activexDao.DAO.Field = js.native
      /* CompleteClass */
      @JSName("Fields")
      override val Fields_Original: Fields = js.native
    }
    
    @JSGlobal("DAO.Connection")
    @js.native
    /* private */ open class Connection ()
      extends StObject
         with typingsJapgolly.activexDao.DAO.Connection
    
    @JSGlobal("DAO.Container")
    @js.native
    /* private */ open class Container ()
      extends StObject
         with typingsJapgolly.activexDao.DAO.Container {
      
      /* CompleteClass */
      override val AllPermissions: Double = js.native
      
      /* private */ /* CompleteClass */
      @JSName("DAO.Container_typekey")
      var DAODotContainer_typekey: typingsJapgolly.activexDao.DAO.Container = js.native
      
      /* CompleteClass */
      override def Documents(Item: String): typingsJapgolly.activexDao.DAO.Document = js.native
      /* CompleteClass */
      override def Documents(Item: Double): typingsJapgolly.activexDao.DAO.Document = js.native
      /* CompleteClass */
      @JSName("Documents")
      override val Documents_Original: Documents = js.native
      
      /* CompleteClass */
      var Inherit: Boolean = js.native
      
      /* CompleteClass */
      override val Name: String = js.native
      
      /* CompleteClass */
      var Owner: String = js.native
      
      /* CompleteClass */
      var Permissions: Double = js.native
      
      /* CompleteClass */
      override def Properties(Item: String): typingsJapgolly.activexDao.DAO.Property = js.native
      /* CompleteClass */
      override def Properties(Item: Double): typingsJapgolly.activexDao.DAO.Property = js.native
      /* CompleteClass */
      @JSName("Properties")
      override val Properties_Original: Properties = js.native
      
      /* CompleteClass */
      var UserName: String = js.native
    }
    
    @JSGlobal("DAO.DBEngine")
    @js.native
    /* private */ open class DBEngine ()
      extends StObject
         with typingsJapgolly.activexDao.DAO.DBEngine
    
    @JSGlobal("DAO.Database")
    @js.native
    /* private */ open class Database ()
      extends StObject
         with typingsJapgolly.activexDao.DAO.Database
    
    @JSGlobal("DAO.Document")
    @js.native
    /* private */ open class Document ()
      extends StObject
         with typingsJapgolly.activexDao.DAO.Document
    
    @JSGlobal("DAO.Error")
    @js.native
    /* private */ open class Error ()
      extends StObject
         with typingsJapgolly.activexDao.DAO.Error {
      
      /* private */ /* CompleteClass */
      @JSName("DAO.Error_typekey")
      var DAODotError_typekey: typingsJapgolly.activexDao.DAO.Error = js.native
      
      /* CompleteClass */
      override val Description: String = js.native
      
      /* CompleteClass */
      override val HelpContext: Double = js.native
      
      /* CompleteClass */
      override val HelpFile: String = js.native
      
      /* CompleteClass */
      override val Number: Double = js.native
      
      /* CompleteClass */
      override val Source: String = js.native
    }
    
    @JSGlobal("DAO.Field")
    @js.native
    /* private */ open class Field ()
      extends StObject
         with typingsJapgolly.activexDao.DAO.Field
    
    @JSGlobal("DAO.Group")
    @js.native
    /* private */ open class Group ()
      extends StObject
         with typingsJapgolly.activexDao.DAO.Group
    
    @JSGlobal("DAO.Index")
    @js.native
    /* private */ open class Index ()
      extends StObject
         with typingsJapgolly.activexDao.DAO.Index
    
    @JSGlobal("DAO.Parameter")
    @js.native
    /* private */ open class Parameter ()
      extends StObject
         with typingsJapgolly.activexDao.DAO.Parameter {
      
      /* private */ /* CompleteClass */
      @JSName("DAO.Parameter_typekey")
      var DAODotParameter_typekey: typingsJapgolly.activexDao.DAO.Parameter = js.native
      
      /* CompleteClass */
      var Direction: Double = js.native
      
      /* CompleteClass */
      override val Name: String = js.native
      
      /* CompleteClass */
      override def Properties(Item: String): typingsJapgolly.activexDao.DAO.Property = js.native
      /* CompleteClass */
      override def Properties(Item: Double): typingsJapgolly.activexDao.DAO.Property = js.native
      /* CompleteClass */
      @JSName("Properties")
      override val Properties_Original: Properties = js.native
      
      /* CompleteClass */
      var Type: Double = js.native
      
      /* CompleteClass */
      var Value: Any = js.native
    }
    
    @JSGlobal("DAO.Property")
    @js.native
    /* private */ open class Property ()
      extends StObject
         with typingsJapgolly.activexDao.DAO.Property {
      
      /* private */ /* CompleteClass */
      @JSName("DAO.Property_typekey")
      var DAODotProperty_typekey: typingsJapgolly.activexDao.DAO.Property = js.native
      
      /* CompleteClass */
      override val Inherited: Boolean = js.native
      
      /* CompleteClass */
      var Name: String = js.native
      
      /* CompleteClass */
      override def Properties(Item: String): typingsJapgolly.activexDao.DAO.Property = js.native
      /* CompleteClass */
      override def Properties(Item: Double): typingsJapgolly.activexDao.DAO.Property = js.native
      /* CompleteClass */
      @JSName("Properties")
      override val Properties_Original: Properties = js.native
      
      /* CompleteClass */
      var Type: Double = js.native
      
      /* CompleteClass */
      var Value: Any = js.native
    }
    
    @JSGlobal("DAO.QueryDef")
    @js.native
    /* private */ open class QueryDef ()
      extends StObject
         with typingsJapgolly.activexDao.DAO.QueryDef
    
    @JSGlobal("DAO.Relation")
    @js.native
    /* private */ open class Relation ()
      extends StObject
         with typingsJapgolly.activexDao.DAO.Relation
    
    @JSGlobal("DAO.TableDef")
    @js.native
    /* private */ open class TableDef ()
      extends StObject
         with typingsJapgolly.activexDao.DAO.TableDef
    
    @JSGlobal("DAO.User")
    @js.native
    /* private */ open class User ()
      extends StObject
         with typingsJapgolly.activexDao.DAO.User
    
    @JSGlobal("DAO.Workspace")
    @js.native
    /* private */ open class Workspace ()
      extends StObject
         with typingsJapgolly.activexDao.DAO.Workspace
  }
}
