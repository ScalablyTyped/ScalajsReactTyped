package typingsJapgolly.wordpressEditPost

import typingsJapgolly.std.Record
import typingsJapgolly.wordpressEditPost.mod.EditorMode
import typingsJapgolly.wordpressEditPost.mod.MetaboxDescriptor
import typingsJapgolly.wordpressEditPost.mod.MetaboxLocation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object storeSelectorsMod {
  
  @JSImport("@wordpress/edit-post/store/selectors", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getActiveGeneralSidebarName(): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getActiveGeneralSidebarName")().asInstanceOf[String | Null]
  
  inline def getActiveMetaBoxLocations(): js.Array[MetaboxLocation] = ^.asInstanceOf[js.Dynamic].applyDynamic("getActiveMetaBoxLocations")().asInstanceOf[js.Array[MetaboxLocation]]
  
  inline def getAllMetaBoxes(): js.Array[MetaboxDescriptor] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAllMetaBoxes")().asInstanceOf[js.Array[MetaboxDescriptor]]
  
  inline def getEditorMode(): EditorMode = ^.asInstanceOf[js.Dynamic].applyDynamic("getEditorMode")().asInstanceOf[EditorMode]
  
  inline def getMetaBoxesPerLocation(location: MetaboxLocation): js.UndefOr[js.Array[MetaboxDescriptor]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetaBoxesPerLocation")(location.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[js.Array[MetaboxDescriptor]]]
  
  inline def getPreference[T](preferenceKey: String): js.UndefOr[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPreference")(preferenceKey.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[T]]
  inline def getPreference[T](preferenceKey: String, defaultValue: T): /* import warning: importer.ImportType#apply Failed type conversion: T extends string ? string : T extends number ? number : T */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getPreference")(preferenceKey.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: T extends string ? string : T extends number ? number : T */ js.Any]
  
  inline def getPreferences(): Record[String, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPreferences")().asInstanceOf[Record[String, Any]]
  
  inline def hasMetaBoxes(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasMetaBoxes")().asInstanceOf[Boolean]
  
  inline def isEditorPanelEnabled(panelName: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEditorPanelEnabled")(panelName.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isEditorPanelOpened(panelName: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEditorPanelOpened")(panelName.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isEditorPanelRemoved(panelName: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEditorPanelRemoved")(panelName.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isEditorSidebarOpened(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEditorSidebarOpened")().asInstanceOf[Boolean]
  
  inline def isFeatureActive(feature: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFeatureActive")(feature.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isMetaBoxLocationActive(location: MetaboxLocation): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMetaBoxLocationActive")(location.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isMetaBoxLocationVisible(location: MetaboxLocation): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMetaBoxLocationVisible")(location.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isModalActive(modalName: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isModalActive")(modalName.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isPluginItemPinned(pluginName: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPluginItemPinned")(pluginName.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isPluginSidebarOpened(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPluginSidebarOpened")().asInstanceOf[Boolean]
  
  inline def isPublishSidebarOpened(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPublishSidebarOpened")().asInstanceOf[Boolean]
  
  inline def isSavingMetaBoxes(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSavingMetaBoxes")().asInstanceOf[Boolean]
}
