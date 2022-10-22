package typingsJapgolly.activexDao

import typingsJapgolly.activexDao.DAO.DBEngine
import typingsJapgolly.activexDao.DAO.Field
import typingsJapgolly.activexDao.DAO.Group
import typingsJapgolly.activexDao.DAO.Index
import typingsJapgolly.activexDao.DAO.QueryDef
import typingsJapgolly.activexDao.DAO.Relation
import typingsJapgolly.activexDao.DAO.TableDef
import typingsJapgolly.activexDao.DAO.User
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActiveXObjectNameMap extends StObject {
  
  @JSName("DAO.DBEngine")
  var DAODotDBEngine: DBEngine
  
  @JSName("DAO.Field")
  var DAODotField: Field
  
  @JSName("DAO.Group")
  var DAODotGroup: Group
  
  @JSName("DAO.Index")
  var DAODotIndex: Index
  
  @JSName("DAO.PrivateDBEngine")
  var DAODotPrivateDBEngine: DBEngine
  
  @JSName("DAO.QueryDef")
  var DAODotQueryDef: QueryDef
  
  @JSName("DAO.Relation")
  var DAODotRelation: Relation
  
  @JSName("DAO.TableDef")
  var DAODotTableDef: TableDef
  
  @JSName("DAO.User")
  var DAODotUser: User
}
object ActiveXObjectNameMap {
  
  inline def apply(
    DAODotDBEngine: DBEngine,
    DAODotField: Field,
    DAODotGroup: Group,
    DAODotIndex: Index,
    DAODotPrivateDBEngine: DBEngine,
    DAODotQueryDef: QueryDef,
    DAODotRelation: Relation,
    DAODotTableDef: TableDef,
    DAODotUser: User
  ): ActiveXObjectNameMap = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("DAO.DBEngine")(DAODotDBEngine.asInstanceOf[js.Any])
    __obj.updateDynamic("DAO.Field")(DAODotField.asInstanceOf[js.Any])
    __obj.updateDynamic("DAO.Group")(DAODotGroup.asInstanceOf[js.Any])
    __obj.updateDynamic("DAO.Index")(DAODotIndex.asInstanceOf[js.Any])
    __obj.updateDynamic("DAO.PrivateDBEngine")(DAODotPrivateDBEngine.asInstanceOf[js.Any])
    __obj.updateDynamic("DAO.QueryDef")(DAODotQueryDef.asInstanceOf[js.Any])
    __obj.updateDynamic("DAO.Relation")(DAODotRelation.asInstanceOf[js.Any])
    __obj.updateDynamic("DAO.TableDef")(DAODotTableDef.asInstanceOf[js.Any])
    __obj.updateDynamic("DAO.User")(DAODotUser.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActiveXObjectNameMap]
  }
  
  extension [Self <: ActiveXObjectNameMap](x: Self) {
    
    inline def setDAODotDBEngine(value: DBEngine): Self = StObject.set(x, "DAO.DBEngine", value.asInstanceOf[js.Any])
    
    inline def setDAODotField(value: Field): Self = StObject.set(x, "DAO.Field", value.asInstanceOf[js.Any])
    
    inline def setDAODotGroup(value: Group): Self = StObject.set(x, "DAO.Group", value.asInstanceOf[js.Any])
    
    inline def setDAODotIndex(value: Index): Self = StObject.set(x, "DAO.Index", value.asInstanceOf[js.Any])
    
    inline def setDAODotPrivateDBEngine(value: DBEngine): Self = StObject.set(x, "DAO.PrivateDBEngine", value.asInstanceOf[js.Any])
    
    inline def setDAODotQueryDef(value: QueryDef): Self = StObject.set(x, "DAO.QueryDef", value.asInstanceOf[js.Any])
    
    inline def setDAODotRelation(value: Relation): Self = StObject.set(x, "DAO.Relation", value.asInstanceOf[js.Any])
    
    inline def setDAODotTableDef(value: TableDef): Self = StObject.set(x, "DAO.TableDef", value.asInstanceOf[js.Any])
    
    inline def setDAODotUser(value: User): Self = StObject.set(x, "DAO.User", value.asInstanceOf[js.Any])
  }
}
