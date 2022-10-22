package typingsJapgolly.mondaySdkJs

import typingsJapgolly.mondaySdkJs.anon.PartialclientIdstringapiT
import typingsJapgolly.mondaySdkJs.anon.Partialtokenstring
import typingsJapgolly.mondaySdkJs.mod.MondayClientSdk
import typingsJapgolly.mondaySdkJs.mod.MondayServerSdk
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  inline def mondaySdk(): MondayServerSdk = js.Dynamic.global.applyDynamic("mondaySdk")().asInstanceOf[MondayServerSdk]
  inline def mondaySdk(config: PartialclientIdstringapiT): MondayClientSdk = js.Dynamic.global.applyDynamic("mondaySdk")(config.asInstanceOf[js.Any]).asInstanceOf[MondayClientSdk]
  inline def mondaySdk(config: Partialtokenstring): MondayServerSdk = js.Dynamic.global.applyDynamic("mondaySdk")(config.asInstanceOf[js.Any]).asInstanceOf[MondayServerSdk]
  
  inline def mondaySdk_MondayClientSdk(): MondayClientSdk = js.Dynamic.global.applyDynamic("mondaySdk")().asInstanceOf[MondayClientSdk]
}
