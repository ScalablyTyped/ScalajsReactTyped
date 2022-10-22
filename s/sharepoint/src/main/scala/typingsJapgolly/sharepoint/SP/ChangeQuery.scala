package typingsJapgolly.sharepoint.SP

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChangeQuery
  extends StObject
     with ClientValueObject {
  
  def get_add(): Boolean
  
  def get_alert(): Boolean
  
  def get_changeTokenEnd(): ChangeToken
  
  def get_changeTokenStart(): ChangeToken
  
  def get_contentType(): Boolean
  
  def get_deleteObject(): Boolean
  
  def get_field(): Boolean
  
  def get_file(): Boolean
  
  def get_folder(): Boolean
  
  def get_group(): Boolean
  
  def get_groupMembershipAdd(): Boolean
  
  def get_groupMembershipDelete(): Boolean
  
  def get_item(): Boolean
  
  def get_list(): Boolean
  
  def get_move(): Boolean
  
  def get_navigation(): Boolean
  
  def get_rename(): Boolean
  
  def get_restore(): Boolean
  
  def get_roleAssignmentAdd(): Boolean
  
  def get_roleAssignmentDelete(): Boolean
  
  def get_roleDefinitionAdd(): Boolean
  
  def get_roleDefinitionDelete(): Boolean
  
  def get_roleDefinitionUpdate(): Boolean
  
  def get_securityPolicy(): Boolean
  
  def get_site(): Boolean
  
  def get_systemUpdate(): Boolean
  
  def get_update(): Boolean
  
  def get_user(): Boolean
  
  def get_view(): Boolean
  
  def get_web(): Boolean
  
  def set_add(value: Boolean): Unit
  
  def set_alert(value: Boolean): Unit
  
  def set_changeTokenEnd(value: ChangeToken): Unit
  
  def set_changeTokenStart(value: ChangeToken): Unit
  
  def set_contentType(value: Boolean): Unit
  
  def set_deleteObject(value: Boolean): Unit
  
  def set_field(value: Boolean): Unit
  
  def set_file(value: Boolean): Unit
  
  def set_folder(value: Boolean): Unit
  
  def set_group(value: Boolean): Unit
  
  def set_groupMembershipAdd(value: Boolean): Unit
  
  def set_groupMembershipDelete(value: Boolean): Unit
  
  def set_item(value: Boolean): Unit
  
  def set_list(value: Boolean): Unit
  
  def set_move(value: Boolean): Unit
  
  def set_navigation(value: Boolean): Unit
  
  def set_rename(value: Boolean): Unit
  
  def set_restore(value: Boolean): Unit
  
  def set_roleAssignmentAdd(value: Boolean): Unit
  
  def set_roleAssignmentDelete(value: Boolean): Unit
  
  def set_roleDefinitionAdd(value: Boolean): Unit
  
  def set_roleDefinitionDelete(value: Boolean): Unit
  
  def set_roleDefinitionUpdate(value: Boolean): Unit
  
  def set_securityPolicy(value: Boolean): Unit
  
  def set_site(value: Boolean): Unit
  
  def set_systemUpdate(value: Boolean): Unit
  
  def set_update(value: Boolean): Unit
  
  def set_user(value: Boolean): Unit
  
  def set_view(value: Boolean): Unit
  
  def set_web(value: Boolean): Unit
}
object ChangeQuery {
  
  inline def apply(
    customFromJson: Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: Any => Callback,
    get_add: CallbackTo[Boolean],
    get_alert: CallbackTo[Boolean],
    get_changeTokenEnd: CallbackTo[ChangeToken],
    get_changeTokenStart: CallbackTo[ChangeToken],
    get_contentType: CallbackTo[Boolean],
    get_deleteObject: CallbackTo[Boolean],
    get_field: CallbackTo[Boolean],
    get_file: CallbackTo[Boolean],
    get_folder: CallbackTo[Boolean],
    get_group: CallbackTo[Boolean],
    get_groupMembershipAdd: CallbackTo[Boolean],
    get_groupMembershipDelete: CallbackTo[Boolean],
    get_item: CallbackTo[Boolean],
    get_list: CallbackTo[Boolean],
    get_move: CallbackTo[Boolean],
    get_navigation: CallbackTo[Boolean],
    get_rename: CallbackTo[Boolean],
    get_restore: CallbackTo[Boolean],
    get_roleAssignmentAdd: CallbackTo[Boolean],
    get_roleAssignmentDelete: CallbackTo[Boolean],
    get_roleDefinitionAdd: CallbackTo[Boolean],
    get_roleDefinitionDelete: CallbackTo[Boolean],
    get_roleDefinitionUpdate: CallbackTo[Boolean],
    get_securityPolicy: CallbackTo[Boolean],
    get_site: CallbackTo[Boolean],
    get_systemUpdate: CallbackTo[Boolean],
    get_typeId: CallbackTo[String],
    get_update: CallbackTo[Boolean],
    get_user: CallbackTo[Boolean],
    get_view: CallbackTo[Boolean],
    get_web: CallbackTo[Boolean],
    set_add: Boolean => Callback,
    set_alert: Boolean => Callback,
    set_changeTokenEnd: ChangeToken => Callback,
    set_changeTokenStart: ChangeToken => Callback,
    set_contentType: Boolean => Callback,
    set_deleteObject: Boolean => Callback,
    set_field: Boolean => Callback,
    set_file: Boolean => Callback,
    set_folder: Boolean => Callback,
    set_group: Boolean => Callback,
    set_groupMembershipAdd: Boolean => Callback,
    set_groupMembershipDelete: Boolean => Callback,
    set_item: Boolean => Callback,
    set_list: Boolean => Callback,
    set_move: Boolean => Callback,
    set_navigation: Boolean => Callback,
    set_rename: Boolean => Callback,
    set_restore: Boolean => Callback,
    set_roleAssignmentAdd: Boolean => Callback,
    set_roleAssignmentDelete: Boolean => Callback,
    set_roleDefinitionAdd: Boolean => Callback,
    set_roleDefinitionDelete: Boolean => Callback,
    set_roleDefinitionUpdate: Boolean => Callback,
    set_securityPolicy: Boolean => Callback,
    set_site: Boolean => Callback,
    set_systemUpdate: Boolean => Callback,
    set_update: Boolean => Callback,
    set_user: Boolean => Callback,
    set_view: Boolean => Callback,
    set_web: Boolean => Callback,
    writeToXml: (XmlWriter, SerializationContext) => Callback
  ): ChangeQuery = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1((t0: Any) => fromJson(t0).runNow()), get_add = get_add.toJsFn, get_alert = get_alert.toJsFn, get_changeTokenEnd = get_changeTokenEnd.toJsFn, get_changeTokenStart = get_changeTokenStart.toJsFn, get_contentType = get_contentType.toJsFn, get_deleteObject = get_deleteObject.toJsFn, get_field = get_field.toJsFn, get_file = get_file.toJsFn, get_folder = get_folder.toJsFn, get_group = get_group.toJsFn, get_groupMembershipAdd = get_groupMembershipAdd.toJsFn, get_groupMembershipDelete = get_groupMembershipDelete.toJsFn, get_item = get_item.toJsFn, get_list = get_list.toJsFn, get_move = get_move.toJsFn, get_navigation = get_navigation.toJsFn, get_rename = get_rename.toJsFn, get_restore = get_restore.toJsFn, get_roleAssignmentAdd = get_roleAssignmentAdd.toJsFn, get_roleAssignmentDelete = get_roleAssignmentDelete.toJsFn, get_roleDefinitionAdd = get_roleDefinitionAdd.toJsFn, get_roleDefinitionDelete = get_roleDefinitionDelete.toJsFn, get_roleDefinitionUpdate = get_roleDefinitionUpdate.toJsFn, get_securityPolicy = get_securityPolicy.toJsFn, get_site = get_site.toJsFn, get_systemUpdate = get_systemUpdate.toJsFn, get_typeId = get_typeId.toJsFn, get_update = get_update.toJsFn, get_user = get_user.toJsFn, get_view = get_view.toJsFn, get_web = get_web.toJsFn, set_add = js.Any.fromFunction1((t0: Boolean) => set_add(t0).runNow()), set_alert = js.Any.fromFunction1((t0: Boolean) => set_alert(t0).runNow()), set_changeTokenEnd = js.Any.fromFunction1((t0: ChangeToken) => set_changeTokenEnd(t0).runNow()), set_changeTokenStart = js.Any.fromFunction1((t0: ChangeToken) => set_changeTokenStart(t0).runNow()), set_contentType = js.Any.fromFunction1((t0: Boolean) => set_contentType(t0).runNow()), set_deleteObject = js.Any.fromFunction1((t0: Boolean) => set_deleteObject(t0).runNow()), set_field = js.Any.fromFunction1((t0: Boolean) => set_field(t0).runNow()), set_file = js.Any.fromFunction1((t0: Boolean) => set_file(t0).runNow()), set_folder = js.Any.fromFunction1((t0: Boolean) => set_folder(t0).runNow()), set_group = js.Any.fromFunction1((t0: Boolean) => set_group(t0).runNow()), set_groupMembershipAdd = js.Any.fromFunction1((t0: Boolean) => set_groupMembershipAdd(t0).runNow()), set_groupMembershipDelete = js.Any.fromFunction1((t0: Boolean) => set_groupMembershipDelete(t0).runNow()), set_item = js.Any.fromFunction1((t0: Boolean) => set_item(t0).runNow()), set_list = js.Any.fromFunction1((t0: Boolean) => set_list(t0).runNow()), set_move = js.Any.fromFunction1((t0: Boolean) => set_move(t0).runNow()), set_navigation = js.Any.fromFunction1((t0: Boolean) => set_navigation(t0).runNow()), set_rename = js.Any.fromFunction1((t0: Boolean) => set_rename(t0).runNow()), set_restore = js.Any.fromFunction1((t0: Boolean) => set_restore(t0).runNow()), set_roleAssignmentAdd = js.Any.fromFunction1((t0: Boolean) => set_roleAssignmentAdd(t0).runNow()), set_roleAssignmentDelete = js.Any.fromFunction1((t0: Boolean) => set_roleAssignmentDelete(t0).runNow()), set_roleDefinitionAdd = js.Any.fromFunction1((t0: Boolean) => set_roleDefinitionAdd(t0).runNow()), set_roleDefinitionDelete = js.Any.fromFunction1((t0: Boolean) => set_roleDefinitionDelete(t0).runNow()), set_roleDefinitionUpdate = js.Any.fromFunction1((t0: Boolean) => set_roleDefinitionUpdate(t0).runNow()), set_securityPolicy = js.Any.fromFunction1((t0: Boolean) => set_securityPolicy(t0).runNow()), set_site = js.Any.fromFunction1((t0: Boolean) => set_site(t0).runNow()), set_systemUpdate = js.Any.fromFunction1((t0: Boolean) => set_systemUpdate(t0).runNow()), set_update = js.Any.fromFunction1((t0: Boolean) => set_update(t0).runNow()), set_user = js.Any.fromFunction1((t0: Boolean) => set_user(t0).runNow()), set_view = js.Any.fromFunction1((t0: Boolean) => set_view(t0).runNow()), set_web = js.Any.fromFunction1((t0: Boolean) => set_web(t0).runNow()), writeToXml = js.Any.fromFunction2((t0: XmlWriter, t1: SerializationContext) => (writeToXml(t0, t1)).runNow()))
    __obj.asInstanceOf[ChangeQuery]
  }
  
  extension [Self <: ChangeQuery](x: Self) {
    
    inline def setGet_add(value: CallbackTo[Boolean]): Self = StObject.set(x, "get_add", value.toJsFn)
    
    inline def setGet_alert(value: CallbackTo[Boolean]): Self = StObject.set(x, "get_alert", value.toJsFn)
    
    inline def setGet_changeTokenEnd(value: CallbackTo[ChangeToken]): Self = StObject.set(x, "get_changeTokenEnd", value.toJsFn)
    
    inline def setGet_changeTokenStart(value: CallbackTo[ChangeToken]): Self = StObject.set(x, "get_changeTokenStart", value.toJsFn)
    
    inline def setGet_contentType(value: CallbackTo[Boolean]): Self = StObject.set(x, "get_contentType", value.toJsFn)
    
    inline def setGet_deleteObject(value: CallbackTo[Boolean]): Self = StObject.set(x, "get_deleteObject", value.toJsFn)
    
    inline def setGet_field(value: CallbackTo[Boolean]): Self = StObject.set(x, "get_field", value.toJsFn)
    
    inline def setGet_file(value: CallbackTo[Boolean]): Self = StObject.set(x, "get_file", value.toJsFn)
    
    inline def setGet_folder(value: CallbackTo[Boolean]): Self = StObject.set(x, "get_folder", value.toJsFn)
    
    inline def setGet_group(value: CallbackTo[Boolean]): Self = StObject.set(x, "get_group", value.toJsFn)
    
    inline def setGet_groupMembershipAdd(value: CallbackTo[Boolean]): Self = StObject.set(x, "get_groupMembershipAdd", value.toJsFn)
    
    inline def setGet_groupMembershipDelete(value: CallbackTo[Boolean]): Self = StObject.set(x, "get_groupMembershipDelete", value.toJsFn)
    
    inline def setGet_item(value: CallbackTo[Boolean]): Self = StObject.set(x, "get_item", value.toJsFn)
    
    inline def setGet_list(value: CallbackTo[Boolean]): Self = StObject.set(x, "get_list", value.toJsFn)
    
    inline def setGet_move(value: CallbackTo[Boolean]): Self = StObject.set(x, "get_move", value.toJsFn)
    
    inline def setGet_navigation(value: CallbackTo[Boolean]): Self = StObject.set(x, "get_navigation", value.toJsFn)
    
    inline def setGet_rename(value: CallbackTo[Boolean]): Self = StObject.set(x, "get_rename", value.toJsFn)
    
    inline def setGet_restore(value: CallbackTo[Boolean]): Self = StObject.set(x, "get_restore", value.toJsFn)
    
    inline def setGet_roleAssignmentAdd(value: CallbackTo[Boolean]): Self = StObject.set(x, "get_roleAssignmentAdd", value.toJsFn)
    
    inline def setGet_roleAssignmentDelete(value: CallbackTo[Boolean]): Self = StObject.set(x, "get_roleAssignmentDelete", value.toJsFn)
    
    inline def setGet_roleDefinitionAdd(value: CallbackTo[Boolean]): Self = StObject.set(x, "get_roleDefinitionAdd", value.toJsFn)
    
    inline def setGet_roleDefinitionDelete(value: CallbackTo[Boolean]): Self = StObject.set(x, "get_roleDefinitionDelete", value.toJsFn)
    
    inline def setGet_roleDefinitionUpdate(value: CallbackTo[Boolean]): Self = StObject.set(x, "get_roleDefinitionUpdate", value.toJsFn)
    
    inline def setGet_securityPolicy(value: CallbackTo[Boolean]): Self = StObject.set(x, "get_securityPolicy", value.toJsFn)
    
    inline def setGet_site(value: CallbackTo[Boolean]): Self = StObject.set(x, "get_site", value.toJsFn)
    
    inline def setGet_systemUpdate(value: CallbackTo[Boolean]): Self = StObject.set(x, "get_systemUpdate", value.toJsFn)
    
    inline def setGet_update(value: CallbackTo[Boolean]): Self = StObject.set(x, "get_update", value.toJsFn)
    
    inline def setGet_user(value: CallbackTo[Boolean]): Self = StObject.set(x, "get_user", value.toJsFn)
    
    inline def setGet_view(value: CallbackTo[Boolean]): Self = StObject.set(x, "get_view", value.toJsFn)
    
    inline def setGet_web(value: CallbackTo[Boolean]): Self = StObject.set(x, "get_web", value.toJsFn)
    
    inline def setSet_add(value: Boolean => Callback): Self = StObject.set(x, "set_add", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setSet_alert(value: Boolean => Callback): Self = StObject.set(x, "set_alert", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setSet_changeTokenEnd(value: ChangeToken => Callback): Self = StObject.set(x, "set_changeTokenEnd", js.Any.fromFunction1((t0: ChangeToken) => value(t0).runNow()))
    
    inline def setSet_changeTokenStart(value: ChangeToken => Callback): Self = StObject.set(x, "set_changeTokenStart", js.Any.fromFunction1((t0: ChangeToken) => value(t0).runNow()))
    
    inline def setSet_contentType(value: Boolean => Callback): Self = StObject.set(x, "set_contentType", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setSet_deleteObject(value: Boolean => Callback): Self = StObject.set(x, "set_deleteObject", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setSet_field(value: Boolean => Callback): Self = StObject.set(x, "set_field", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setSet_file(value: Boolean => Callback): Self = StObject.set(x, "set_file", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setSet_folder(value: Boolean => Callback): Self = StObject.set(x, "set_folder", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setSet_group(value: Boolean => Callback): Self = StObject.set(x, "set_group", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setSet_groupMembershipAdd(value: Boolean => Callback): Self = StObject.set(x, "set_groupMembershipAdd", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setSet_groupMembershipDelete(value: Boolean => Callback): Self = StObject.set(x, "set_groupMembershipDelete", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setSet_item(value: Boolean => Callback): Self = StObject.set(x, "set_item", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setSet_list(value: Boolean => Callback): Self = StObject.set(x, "set_list", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setSet_move(value: Boolean => Callback): Self = StObject.set(x, "set_move", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setSet_navigation(value: Boolean => Callback): Self = StObject.set(x, "set_navigation", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setSet_rename(value: Boolean => Callback): Self = StObject.set(x, "set_rename", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setSet_restore(value: Boolean => Callback): Self = StObject.set(x, "set_restore", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setSet_roleAssignmentAdd(value: Boolean => Callback): Self = StObject.set(x, "set_roleAssignmentAdd", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setSet_roleAssignmentDelete(value: Boolean => Callback): Self = StObject.set(x, "set_roleAssignmentDelete", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setSet_roleDefinitionAdd(value: Boolean => Callback): Self = StObject.set(x, "set_roleDefinitionAdd", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setSet_roleDefinitionDelete(value: Boolean => Callback): Self = StObject.set(x, "set_roleDefinitionDelete", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setSet_roleDefinitionUpdate(value: Boolean => Callback): Self = StObject.set(x, "set_roleDefinitionUpdate", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setSet_securityPolicy(value: Boolean => Callback): Self = StObject.set(x, "set_securityPolicy", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setSet_site(value: Boolean => Callback): Self = StObject.set(x, "set_site", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setSet_systemUpdate(value: Boolean => Callback): Self = StObject.set(x, "set_systemUpdate", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setSet_update(value: Boolean => Callback): Self = StObject.set(x, "set_update", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setSet_user(value: Boolean => Callback): Self = StObject.set(x, "set_user", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setSet_view(value: Boolean => Callback): Self = StObject.set(x, "set_view", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setSet_web(value: Boolean => Callback): Self = StObject.set(x, "set_web", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
  }
}
