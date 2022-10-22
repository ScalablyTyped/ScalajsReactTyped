package typingsJapgolly.devextreme.mod.default

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.devextreme.anon.Compile
import typingsJapgolly.devextreme.mod.DevExpress.DOMComponent.Properties
import typingsJapgolly.devextreme.mod.DevExpress.core.ComponentFactory
import typingsJapgolly.devextreme.mod.DevExpress.globalConfig
import typingsJapgolly.devextreme.mod.default.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def config(): globalConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("config")().asInstanceOf[globalConfig]
inline def config(config: globalConfig): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("config")(config.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def devices: typingsJapgolly.devextreme.mod.DevExpress.DevicesObject = ^.asInstanceOf[js.Dynamic].selectDynamic("devices").asInstanceOf[typingsJapgolly.devextreme.mod.DevExpress.DevicesObject]

inline def hideTopOverlay(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hideTopOverlay")().asInstanceOf[Boolean]

inline def registerComponent[TComponent](name: String, componentClass: ComponentFactory[TComponent]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerComponent")(name.asInstanceOf[js.Any], componentClass.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def registerComponent[TComponent](
  name: String,
  namespace: StringDictionary[
  ComponentFactory[typingsJapgolly.devextreme.mod.DevExpress.DOMComponent[Properties]]
],
  componentClass: ComponentFactory[TComponent]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerComponent")(name.asInstanceOf[js.Any], namespace.asInstanceOf[js.Any], componentClass.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def setTemplateEngine(templateEngineName: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setTemplateEngine")(templateEngineName.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def setTemplateEngine(templateEngineOptions: Compile): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setTemplateEngine")(templateEngineOptions.asInstanceOf[js.Any]).asInstanceOf[Unit]
