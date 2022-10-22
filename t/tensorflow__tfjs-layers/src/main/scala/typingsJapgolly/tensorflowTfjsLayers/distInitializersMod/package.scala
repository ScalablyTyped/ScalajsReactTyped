package typingsJapgolly.tensorflowTfjsLayers.distInitializersMod

import typingsJapgolly.tensorflowTfjsCore.distSerializationMod.ConfigDict
import typingsJapgolly.tensorflowTfjsCore.distSerializationMod.ConfigDictValue
import typingsJapgolly.tensorflowTfjsLayers.distInitializersMod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def checkDistribution(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("checkDistribution")().asInstanceOf[Unit]
inline def checkDistribution(value: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("checkDistribution")(value.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def checkFanMode(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("checkFanMode")().asInstanceOf[Unit]
inline def checkFanMode(value: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("checkFanMode")(value.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def getInitializer(identifier: ConfigDict): Initializer = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitializer")(identifier.asInstanceOf[js.Any]).asInstanceOf[Initializer]
inline def getInitializer(identifier: Initializer): Initializer = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitializer")(identifier.asInstanceOf[js.Any]).asInstanceOf[Initializer]
inline def getInitializer(identifier: InitializerIdentifier): Initializer = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitializer")(identifier.asInstanceOf[js.Any]).asInstanceOf[Initializer]

inline def serializeInitializer(initializer: Initializer): ConfigDictValue = ^.asInstanceOf[js.Dynamic].applyDynamic("serializeInitializer")(initializer.asInstanceOf[js.Any]).asInstanceOf[ConfigDictValue]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.constant_
  - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.glorotNormal
  - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.glorotUniform
  - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.heNormal
  - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.heUniform
  - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.identity_
  - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.leCunNormal
  - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.leCunUniform
  - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.ones_
  - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.orthogonal_
  - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.randomNormal_
  - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.randomUniform_
  - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.truncatedNormal_
  - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.varianceScaling_
  - typingsJapgolly.tensorflowTfjsLayers.tensorflowTfjsLayersStrings.zeros_
  - java.lang.String
*/
type InitializerIdentifier = _InitializerIdentifier | String
