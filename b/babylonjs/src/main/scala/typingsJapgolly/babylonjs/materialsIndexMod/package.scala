package typingsJapgolly.babylonjs.materialsIndexMod

import typingsJapgolly.babylonjs.materialsIndexMod.^
import typingsJapgolly.babylonjs.materialsMaterialPluginManagerMod.PluginMaterialFactory
import typingsJapgolly.babylonjs.materialsNodeNodeMaterialDecoratorMod.IEditablePropertyOption
import typingsJapgolly.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def RegisterMaterialPlugin(pluginName: String, factory: PluginMaterialFactory): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("RegisterMaterialPlugin")(pluginName.asInstanceOf[js.Any], factory.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def UnregisterAllMaterialPlugins(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("UnregisterAllMaterialPlugins")().asInstanceOf[Unit]

inline def UnregisterMaterialPlugin(pluginName: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("UnregisterMaterialPlugin")(pluginName.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def createDetailMapPlugin(material: typingsJapgolly.babylonjs.materialsMaterialMod.Material): Nullable[typingsJapgolly.babylonjs.materialsMaterialPluginBaseMod.MaterialPluginBase] = ^.asInstanceOf[js.Dynamic].applyDynamic("createDetailMapPlugin")(material.asInstanceOf[js.Any]).asInstanceOf[Nullable[typingsJapgolly.babylonjs.materialsMaterialPluginBaseMod.MaterialPluginBase]]

inline def createPBRAnisotropicPlugin(material: typingsJapgolly.babylonjs.materialsMaterialMod.Material): Nullable[typingsJapgolly.babylonjs.materialsMaterialPluginBaseMod.MaterialPluginBase] = ^.asInstanceOf[js.Dynamic].applyDynamic("createPBRAnisotropicPlugin")(material.asInstanceOf[js.Any]).asInstanceOf[Nullable[typingsJapgolly.babylonjs.materialsMaterialPluginBaseMod.MaterialPluginBase]]

inline def createPBRBRDFPlugin(material: typingsJapgolly.babylonjs.materialsMaterialMod.Material): Nullable[typingsJapgolly.babylonjs.materialsMaterialPluginBaseMod.MaterialPluginBase] = ^.asInstanceOf[js.Dynamic].applyDynamic("createPBRBRDFPlugin")(material.asInstanceOf[js.Any]).asInstanceOf[Nullable[typingsJapgolly.babylonjs.materialsMaterialPluginBaseMod.MaterialPluginBase]]

inline def createPBRClearCoatPlugin(material: typingsJapgolly.babylonjs.materialsMaterialMod.Material): Nullable[typingsJapgolly.babylonjs.materialsMaterialPluginBaseMod.MaterialPluginBase] = ^.asInstanceOf[js.Dynamic].applyDynamic("createPBRClearCoatPlugin")(material.asInstanceOf[js.Any]).asInstanceOf[Nullable[typingsJapgolly.babylonjs.materialsMaterialPluginBaseMod.MaterialPluginBase]]

inline def createPBRIridescencePlugin(material: typingsJapgolly.babylonjs.materialsMaterialMod.Material): Nullable[typingsJapgolly.babylonjs.materialsMaterialPluginBaseMod.MaterialPluginBase] = ^.asInstanceOf[js.Dynamic].applyDynamic("createPBRIridescencePlugin")(material.asInstanceOf[js.Any]).asInstanceOf[Nullable[typingsJapgolly.babylonjs.materialsMaterialPluginBaseMod.MaterialPluginBase]]

inline def createPBRSheenPlugin(material: typingsJapgolly.babylonjs.materialsMaterialMod.Material): Nullable[typingsJapgolly.babylonjs.materialsMaterialPluginBaseMod.MaterialPluginBase] = ^.asInstanceOf[js.Dynamic].applyDynamic("createPBRSheenPlugin")(material.asInstanceOf[js.Any]).asInstanceOf[Nullable[typingsJapgolly.babylonjs.materialsMaterialPluginBaseMod.MaterialPluginBase]]

inline def createPBRSubSurfacePlugin(material: typingsJapgolly.babylonjs.materialsMaterialMod.Material): Nullable[typingsJapgolly.babylonjs.materialsMaterialPluginBaseMod.MaterialPluginBase] = ^.asInstanceOf[js.Dynamic].applyDynamic("createPBRSubSurfacePlugin")(material.asInstanceOf[js.Any]).asInstanceOf[Nullable[typingsJapgolly.babylonjs.materialsMaterialPluginBaseMod.MaterialPluginBase]]

inline def editableInPropertyPage(displayName: String): js.Function2[/* target */ Any, /* propertyKey */ String, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("editableInPropertyPage")(displayName.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* target */ Any, /* propertyKey */ String, Unit]]
inline def editableInPropertyPage(displayName: String, propertyType: Unit, groupName: String): js.Function2[/* target */ Any, /* propertyKey */ String, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("editableInPropertyPage")(displayName.asInstanceOf[js.Any], propertyType.asInstanceOf[js.Any], groupName.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* target */ Any, /* propertyKey */ String, Unit]]
inline def editableInPropertyPage(displayName: String, propertyType: Unit, groupName: String, options: IEditablePropertyOption): js.Function2[/* target */ Any, /* propertyKey */ String, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("editableInPropertyPage")(displayName.asInstanceOf[js.Any], propertyType.asInstanceOf[js.Any], groupName.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* target */ Any, /* propertyKey */ String, Unit]]
inline def editableInPropertyPage(displayName: String, propertyType: Unit, groupName: Unit, options: IEditablePropertyOption): js.Function2[/* target */ Any, /* propertyKey */ String, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("editableInPropertyPage")(displayName.asInstanceOf[js.Any], propertyType.asInstanceOf[js.Any], groupName.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* target */ Any, /* propertyKey */ String, Unit]]
inline def editableInPropertyPage(
  displayName: String,
  propertyType: typingsJapgolly.babylonjs.materialsNodeNodeMaterialDecoratorMod.PropertyTypeForEdition
): js.Function2[/* target */ Any, /* propertyKey */ String, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("editableInPropertyPage")(displayName.asInstanceOf[js.Any], propertyType.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* target */ Any, /* propertyKey */ String, Unit]]
inline def editableInPropertyPage(
  displayName: String,
  propertyType: typingsJapgolly.babylonjs.materialsNodeNodeMaterialDecoratorMod.PropertyTypeForEdition,
  groupName: String
): js.Function2[/* target */ Any, /* propertyKey */ String, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("editableInPropertyPage")(displayName.asInstanceOf[js.Any], propertyType.asInstanceOf[js.Any], groupName.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* target */ Any, /* propertyKey */ String, Unit]]
inline def editableInPropertyPage(
  displayName: String,
  propertyType: typingsJapgolly.babylonjs.materialsNodeNodeMaterialDecoratorMod.PropertyTypeForEdition,
  groupName: String,
  options: IEditablePropertyOption
): js.Function2[/* target */ Any, /* propertyKey */ String, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("editableInPropertyPage")(displayName.asInstanceOf[js.Any], propertyType.asInstanceOf[js.Any], groupName.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* target */ Any, /* propertyKey */ String, Unit]]
inline def editableInPropertyPage(
  displayName: String,
  propertyType: typingsJapgolly.babylonjs.materialsNodeNodeMaterialDecoratorMod.PropertyTypeForEdition,
  groupName: Unit,
  options: IEditablePropertyOption
): js.Function2[/* target */ Any, /* propertyKey */ String, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("editableInPropertyPage")(displayName.asInstanceOf[js.Any], propertyType.asInstanceOf[js.Any], groupName.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* target */ Any, /* propertyKey */ String, Unit]]
