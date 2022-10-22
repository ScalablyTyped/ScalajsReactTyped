package typingsJapgolly.googleapisCommon

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.googleapisCommon.buildSrcApiMod.GoogleConfigurable
import typingsJapgolly.googleapisCommon.buildSrcApiMod.ServiceOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcApiIndexMod {
  
  @JSImport("googleapis-common/build/src/apiIndex", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getAPI[T](api: String, options: String, versions: StringDictionary[Any]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("getAPI")(api.asInstanceOf[js.Any], options.asInstanceOf[js.Any], versions.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def getAPI[T](api: String, options: String, versions: StringDictionary[Any], context: GoogleConfigurable): T = (^.asInstanceOf[js.Dynamic].applyDynamic("getAPI")(api.asInstanceOf[js.Any], options.asInstanceOf[js.Any], versions.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def getAPI[T](api: String, options: ServiceOptions, versions: StringDictionary[Any]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("getAPI")(api.asInstanceOf[js.Any], options.asInstanceOf[js.Any], versions.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def getAPI[T](api: String, options: ServiceOptions, versions: StringDictionary[Any], context: GoogleConfigurable): T = (^.asInstanceOf[js.Dynamic].applyDynamic("getAPI")(api.asInstanceOf[js.Any], options.asInstanceOf[js.Any], versions.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[T]
}
