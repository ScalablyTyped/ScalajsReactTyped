package typingsJapgolly.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SSAO2Configuration
  extends StObject
     with PrePassEffectConfiguration
object SSAO2Configuration {
  
  inline def apply(enabled: Boolean, name: String, texturesRequired: js.Array[Double]): SSAO2Configuration = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], texturesRequired = texturesRequired.asInstanceOf[js.Any])
    __obj.asInstanceOf[SSAO2Configuration]
  }
}
