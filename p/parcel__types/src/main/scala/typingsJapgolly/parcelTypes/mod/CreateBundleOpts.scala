package typingsJapgolly.parcelTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.parcelTypes.anon.BundleBehavior
  - typingsJapgolly.parcelTypes.anon.Env
*/
trait CreateBundleOpts extends StObject
object CreateBundleOpts {
  
  inline def BundleBehavior(entryAsset: Asset, target: Target): typingsJapgolly.parcelTypes.anon.BundleBehavior = {
    val __obj = js.Dynamic.literal(entryAsset = entryAsset.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.parcelTypes.anon.BundleBehavior]
  }
  
  inline def Env(env: Environment, target: Target, `type`: String, uniqueKey: String): typingsJapgolly.parcelTypes.anon.Env = {
    val __obj = js.Dynamic.literal(env = env.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], uniqueKey = uniqueKey.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.parcelTypes.anon.Env]
  }
}
