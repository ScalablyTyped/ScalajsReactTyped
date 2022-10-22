package typingsJapgolly.nginstackEngine

import typingsJapgolly.nginstackEngine.anon.ExcludeOrphans
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDatabaseClassesMod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/database/Classes", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with Classes
  @JSImport("@nginstack/engine/lib/database/Classes", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getInstance(): Classes = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")().asInstanceOf[Classes]
  
  @js.native
  trait Classes extends StObject {
    
    def checkClassPath(classKey: Double): Unit = js.native
    
    def formatToMessage(classKey: Double): String = js.native
    
    def getCachedDataSet(classKey: Double): typingsJapgolly.nginstackEngine.libDatasetDataSetMod.^ = js.native
    def getCachedDataSet(classKey: Double, userKey: Double): typingsJapgolly.nginstackEngine.libDatasetDataSetMod.^ = js.native
    def getCachedDataSet(classKey: Double, userKey: Double, securityExtraFilter: String): typingsJapgolly.nginstackEngine.libDatasetDataSetMod.^ = js.native
    def getCachedDataSet(classKey: Double, userKey: Double, securityExtraFilter: js.Array[js.Array[String]]): typingsJapgolly.nginstackEngine.libDatasetDataSetMod.^ = js.native
    def getCachedDataSet(classKey: Double, userKey: Unit, securityExtraFilter: String): typingsJapgolly.nginstackEngine.libDatasetDataSetMod.^ = js.native
    def getCachedDataSet(classKey: Double, userKey: Unit, securityExtraFilter: js.Array[js.Array[String]]): typingsJapgolly.nginstackEngine.libDatasetDataSetMod.^ = js.native
    
    def getChildren(classKeyOrClassKeys: String): String = js.native
    def getChildren(classKeyOrClassKeys: String, userKey: Double): String = js.native
    def getChildren(classKeyOrClassKeys: String, userKey: Double, permissionFieldName: String): String = js.native
    def getChildren(classKeyOrClassKeys: String, userKey: Unit, permissionFieldName: String): String = js.native
    def getChildren(classKeyOrClassKeys: Double): String = js.native
    def getChildren(classKeyOrClassKeys: Double, userKey: Double): String = js.native
    def getChildren(classKeyOrClassKeys: Double, userKey: Double, permissionFieldName: String): String = js.native
    def getChildren(classKeyOrClassKeys: Double, userKey: Unit, permissionFieldName: String): String = js.native
    
    def getClassDefinitionSource(classKey: Double, kind: Any): String = js.native
    def getClassDefinitionSource(classKey: Double, kind: Any, vfs: Unit, classes: Unit, ignoredClassKeys: js.Array[Double]): String = js.native
    def getClassDefinitionSource(
      classKey: Double,
      kind: Any,
      vfs: Unit,
      classes: typingsJapgolly.nginstackEngine.libDatasetDataSetMod.^
    ): String = js.native
    def getClassDefinitionSource(
      classKey: Double,
      kind: Any,
      vfs: Unit,
      classes: typingsJapgolly.nginstackEngine.libDatasetDataSetMod.^,
      ignoredClassKeys: js.Array[Double]
    ): String = js.native
    def getClassDefinitionSource(classKey: Double, kind: Any, vfs: typingsJapgolly.nginstackEngine.libDatasetDataSetMod.^): String = js.native
    def getClassDefinitionSource(
      classKey: Double,
      kind: Any,
      vfs: typingsJapgolly.nginstackEngine.libDatasetDataSetMod.^,
      classes: Unit,
      ignoredClassKeys: js.Array[Double]
    ): String = js.native
    def getClassDefinitionSource(
      classKey: Double,
      kind: Any,
      vfs: typingsJapgolly.nginstackEngine.libDatasetDataSetMod.^,
      classes: typingsJapgolly.nginstackEngine.libDatasetDataSetMod.^
    ): String = js.native
    def getClassDefinitionSource(
      classKey: Double,
      kind: Any,
      vfs: typingsJapgolly.nginstackEngine.libDatasetDataSetMod.^,
      classes: typingsJapgolly.nginstackEngine.libDatasetDataSetMod.^,
      ignoredClassKeys: js.Array[Double]
    ): String = js.native
    
    def getCommonAncestor(classA: Double, classB: Double): Double = js.native
    
    def getFieldValue(classKey: Double, keyOrCode: String, fieldName: String): Double | String | js.Date = js.native
    def getFieldValue(classKey: Double, keyOrCode: Double, fieldName: String): Double | String | js.Date = js.native
    
    def getHierarchicalProperty(classKey: Double, propertyName: String): String | Double | js.Date | (Record[Any, Any]) = js.native
    
    def getHierarchyList(startClass: Double, endClass: Double): String = js.native
    def getHierarchyList(startClass: Double, endClass: Double, level: Double): String = js.native
    def getHierarchyList(startClass: Double, endClass: Double, level: Double, concatenator: String): String = js.native
    def getHierarchyList(
      startClass: Double,
      endClass: Double,
      level: Double,
      concatenator: String,
      returnClassesKey: Boolean
    ): String = js.native
    def getHierarchyList(startClass: Double, endClass: Double, level: Double, concatenator: Unit, returnClassesKey: Boolean): String = js.native
    def getHierarchyList(startClass: Double, endClass: Double, level: Unit, concatenator: String): String = js.native
    def getHierarchyList(startClass: Double, endClass: Double, level: Unit, concatenator: String, returnClassesKey: Boolean): String = js.native
    def getHierarchyList(startClass: Double, endClass: Double, level: Unit, concatenator: Unit, returnClassesKey: Boolean): String = js.native
    
    def getLevel(classKey: Double): Double = js.native
    
    def getOrphans(): js.Array[Double] = js.native
    
    def getRemoteChildren(classKey: Double, database: Database): String = js.native
    
    def getTableName(classKey: Double): String = js.native
    
    def getTabularHierarchy(rootClassKey: Double): typingsJapgolly.nginstackEngine.libDatasetDataSetMod.^ = js.native
    def getTabularHierarchy(rootClassKey: Double, opt_filters: ExcludeOrphans): typingsJapgolly.nginstackEngine.libDatasetDataSetMod.^ = js.native
    
    def hasCachedData(classKey: Double): Boolean = js.native
    
    def isChildOf(key: Double, parent: Double): Boolean = js.native
    
    /* private */ var orphansCache_ : Any = js.native
    
    /* private */ var orphansVersion_ : Any = js.native
  }
  
  type Database = typingsJapgolly.nginstackEngine.libDatabaseDatabaseMod.^
}
