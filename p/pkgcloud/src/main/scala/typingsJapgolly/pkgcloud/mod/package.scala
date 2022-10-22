package typingsJapgolly.pkgcloud.mod

import typingsJapgolly.pkgcloud.mod.^
import typingsJapgolly.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def version: String = ^.asInstanceOf[js.Dynamic].selectDynamic("version").asInstanceOf[String]

type ProviderOptions = BaseProviderOptions & (Partial[
AmazonProviderOptions | AzureProviderOptions | GoogleProviderOptions | OpenstackProviderOptions | RackspaceProviderOptions])
