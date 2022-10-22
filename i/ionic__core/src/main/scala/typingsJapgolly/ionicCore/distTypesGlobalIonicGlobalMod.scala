package typingsJapgolly.ionicCore

import typingsJapgolly.ionicCore.distTypesUtilsConfigMod.IonicConfig
import typingsJapgolly.ionicCore.mod.Mode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGlobalIonicGlobalMod {
  
  @JSImport("@ionic/core/dist/types/global/ionic-global", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Unit]
  inline def default(userConfig: IonicConfig): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(userConfig.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def getIonMode(): Mode = ^.asInstanceOf[js.Dynamic].applyDynamic("getIonMode")().asInstanceOf[Mode]
  inline def getIonMode(ref: Any): Mode = ^.asInstanceOf[js.Dynamic].applyDynamic("getIonMode")(ref.asInstanceOf[js.Any]).asInstanceOf[Mode]
  
  inline def initialize(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("initialize")().asInstanceOf[Unit]
  inline def initialize(userConfig: IonicConfig): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("initialize")(userConfig.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
