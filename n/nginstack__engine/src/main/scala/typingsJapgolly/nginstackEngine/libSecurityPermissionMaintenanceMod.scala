package typingsJapgolly.nginstackEngine

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSecurityPermissionMaintenanceMod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/security/PermissionMaintenance", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with PermissionMaintenance {
    
    /* private */ /* CompleteClass */
    var _addPermissionChanged: Any = js.native
    
    /* private */ /* CompleteClass */
    var _classe: Any = js.native
    
    /* private */ /* CompleteClass */
    var _createPermissionToInvisibleClasses: Any = js.native
    
    /* private */ /* CompleteClass */
    var _getReplicatedFieldNames: Any = js.native
    
    /* private */ /* CompleteClass */
    var _iGroupUser: Any = js.native
    
    /* private */ /* CompleteClass */
    var _iPermission: Any = js.native
    
    /* CompleteClass */
    var _iPermissionClone: typingsJapgolly.nginstackEngine.libDatasetDataSetMod.^ = js.native
    
    /* private */ /* CompleteClass */
    var _iVfs: Any = js.native
    
    /* private */ /* CompleteClass */
    var _replicatePermissions: Any = js.native
    
    /* private */ /* CompleteClass */
    var _replicatePermissionsToMother: Any = js.native
    
    /* private */ /* CompleteClass */
    var _replicatedClass: Any = js.native
    
    /* CompleteClass */
    override def commit(): Double = js.native
    
    /* CompleteClass */
    override def fixAll(): Unit = js.native
    
    /* CompleteClass */
    override def fixInitialPermissions(): Unit = js.native
    
    /* CompleteClass */
    override def fixMissingPermissions(): Unit = js.native
    
    /* CompleteClass */
    override def fixPermissionsClasses(): Unit = js.native
    
    /* CompleteClass */
    override def fixReplicatedPermissions(): Unit = js.native
    
    /* CompleteClass */
    var iPermissionChanged: typingsJapgolly.nginstackEngine.libDatasetDataSetMod.^ = js.native
    
    /* private */ /* CompleteClass */
    var logger_ : Any = js.native
    
    /* private */ /* CompleteClass */
    var replicatedFieldNamesCache_ : Any = js.native
  }
  @JSImport("@nginstack/engine/lib/security/PermissionMaintenance", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait PermissionMaintenance extends StObject {
    
    /* private */ var _addPermissionChanged: Any
    
    /* private */ var _classe: Any
    
    /* private */ var _createPermissionToInvisibleClasses: Any
    
    /* private */ var _getReplicatedFieldNames: Any
    
    /* private */ var _iGroupUser: Any
    
    /* private */ var _iPermission: Any
    
    var _iPermissionClone: typingsJapgolly.nginstackEngine.libDatasetDataSetMod.^
    
    /* private */ var _iVfs: Any
    
    /* private */ var _replicatePermissions: Any
    
    /* private */ var _replicatePermissionsToMother: Any
    
    /* private */ var _replicatedClass: Any
    
    def commit(): Double
    
    def fixAll(): Unit
    
    def fixInitialPermissions(): Unit
    
    def fixMissingPermissions(): Unit
    
    def fixPermissionsClasses(): Unit
    
    def fixReplicatedPermissions(): Unit
    
    var iPermissionChanged: typingsJapgolly.nginstackEngine.libDatasetDataSetMod.^
    
    /* private */ var logger_ : Any
    
    /* private */ var replicatedFieldNamesCache_ : Any
  }
  object PermissionMaintenance {
    
    inline def apply(
      _addPermissionChanged: Any,
      _classe: Any,
      _createPermissionToInvisibleClasses: Any,
      _getReplicatedFieldNames: Any,
      _iGroupUser: Any,
      _iPermission: Any,
      _iPermissionClone: typingsJapgolly.nginstackEngine.libDatasetDataSetMod.^,
      _iVfs: Any,
      _replicatePermissions: Any,
      _replicatePermissionsToMother: Any,
      _replicatedClass: Any,
      commit: CallbackTo[Double],
      fixAll: Callback,
      fixInitialPermissions: Callback,
      fixMissingPermissions: Callback,
      fixPermissionsClasses: Callback,
      fixReplicatedPermissions: Callback,
      iPermissionChanged: typingsJapgolly.nginstackEngine.libDatasetDataSetMod.^,
      logger_ : Any,
      replicatedFieldNamesCache_ : Any
    ): PermissionMaintenance = {
      val __obj = js.Dynamic.literal(_addPermissionChanged = _addPermissionChanged.asInstanceOf[js.Any], _classe = _classe.asInstanceOf[js.Any], _createPermissionToInvisibleClasses = _createPermissionToInvisibleClasses.asInstanceOf[js.Any], _getReplicatedFieldNames = _getReplicatedFieldNames.asInstanceOf[js.Any], _iGroupUser = _iGroupUser.asInstanceOf[js.Any], _iPermission = _iPermission.asInstanceOf[js.Any], _iPermissionClone = _iPermissionClone.asInstanceOf[js.Any], _iVfs = _iVfs.asInstanceOf[js.Any], _replicatePermissions = _replicatePermissions.asInstanceOf[js.Any], _replicatePermissionsToMother = _replicatePermissionsToMother.asInstanceOf[js.Any], _replicatedClass = _replicatedClass.asInstanceOf[js.Any], commit = commit.toJsFn, fixAll = fixAll.toJsFn, fixInitialPermissions = fixInitialPermissions.toJsFn, fixMissingPermissions = fixMissingPermissions.toJsFn, fixPermissionsClasses = fixPermissionsClasses.toJsFn, fixReplicatedPermissions = fixReplicatedPermissions.toJsFn, iPermissionChanged = iPermissionChanged.asInstanceOf[js.Any], logger_ = logger_.asInstanceOf[js.Any], replicatedFieldNamesCache_ = replicatedFieldNamesCache_.asInstanceOf[js.Any])
      __obj.asInstanceOf[PermissionMaintenance]
    }
    
    extension [Self <: PermissionMaintenance](x: Self) {
      
      inline def setCommit(value: CallbackTo[Double]): Self = StObject.set(x, "commit", value.toJsFn)
      
      inline def setFixAll(value: Callback): Self = StObject.set(x, "fixAll", value.toJsFn)
      
      inline def setFixInitialPermissions(value: Callback): Self = StObject.set(x, "fixInitialPermissions", value.toJsFn)
      
      inline def setFixMissingPermissions(value: Callback): Self = StObject.set(x, "fixMissingPermissions", value.toJsFn)
      
      inline def setFixPermissionsClasses(value: Callback): Self = StObject.set(x, "fixPermissionsClasses", value.toJsFn)
      
      inline def setFixReplicatedPermissions(value: Callback): Self = StObject.set(x, "fixReplicatedPermissions", value.toJsFn)
      
      inline def setIPermissionChanged(value: typingsJapgolly.nginstackEngine.libDatasetDataSetMod.^): Self = StObject.set(x, "iPermissionChanged", value.asInstanceOf[js.Any])
      
      inline def setLogger_(value: Any): Self = StObject.set(x, "logger_", value.asInstanceOf[js.Any])
      
      inline def setReplicatedFieldNamesCache_(value: Any): Self = StObject.set(x, "replicatedFieldNamesCache_", value.asInstanceOf[js.Any])
      
      inline def set_addPermissionChanged(value: Any): Self = StObject.set(x, "_addPermissionChanged", value.asInstanceOf[js.Any])
      
      inline def set_classe(value: Any): Self = StObject.set(x, "_classe", value.asInstanceOf[js.Any])
      
      inline def set_createPermissionToInvisibleClasses(value: Any): Self = StObject.set(x, "_createPermissionToInvisibleClasses", value.asInstanceOf[js.Any])
      
      inline def set_getReplicatedFieldNames(value: Any): Self = StObject.set(x, "_getReplicatedFieldNames", value.asInstanceOf[js.Any])
      
      inline def set_iGroupUser(value: Any): Self = StObject.set(x, "_iGroupUser", value.asInstanceOf[js.Any])
      
      inline def set_iPermission(value: Any): Self = StObject.set(x, "_iPermission", value.asInstanceOf[js.Any])
      
      inline def set_iPermissionClone(value: typingsJapgolly.nginstackEngine.libDatasetDataSetMod.^): Self = StObject.set(x, "_iPermissionClone", value.asInstanceOf[js.Any])
      
      inline def set_iVfs(value: Any): Self = StObject.set(x, "_iVfs", value.asInstanceOf[js.Any])
      
      inline def set_replicatePermissions(value: Any): Self = StObject.set(x, "_replicatePermissions", value.asInstanceOf[js.Any])
      
      inline def set_replicatePermissionsToMother(value: Any): Self = StObject.set(x, "_replicatePermissionsToMother", value.asInstanceOf[js.Any])
      
      inline def set_replicatedClass(value: Any): Self = StObject.set(x, "_replicatedClass", value.asInstanceOf[js.Any])
    }
  }
}
