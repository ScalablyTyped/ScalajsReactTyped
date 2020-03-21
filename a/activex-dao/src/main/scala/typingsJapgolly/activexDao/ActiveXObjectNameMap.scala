package typingsJapgolly.activexDao

import typingsJapgolly.activexDao.DAO.DBEngine
import typingsJapgolly.activexDao.DAO.Field
import typingsJapgolly.activexDao.DAO.Group
import typingsJapgolly.activexDao.DAO.Index
import typingsJapgolly.activexDao.DAO.QueryDef
import typingsJapgolly.activexDao.DAO.Relation
import typingsJapgolly.activexDao.DAO.TableDef
import typingsJapgolly.activexDao.DAO.User
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActiveXObjectNameMap extends js.Object {
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
  @scala.inline
  def apply(
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
}

