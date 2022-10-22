package typingsJapgolly.openui5

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiFlWriteApiFeaturesAPIMod extends Shortcut {
  
  @JSImport("sap/ui/fl/write/api/FeaturesAPI", JSImport.Default)
  @js.native
  val default: FeaturesAPI = js.native
  
  /**
    * @SINCE 1.70
    *
    * Provides an API to determine which features are available for flexibility.
    */
  trait FeaturesAPI extends StObject {
    
    /**
      * Checks if key user rights are available for the current user. Application developers can use this API
      * to decide if the key user adaptation feature should be visible to the current user. This only applies
      * if key user adaptation should be handled standalone without an SAP Fiori launchpad.
      *
      * @returns Resolves to a boolean indicating if the key user role is assigned to the user
      */
    def isKeyUser(): js.Promise[Boolean]
  }
  object FeaturesAPI {
    
    inline def apply(isKeyUser: CallbackTo[js.Promise[Boolean]]): FeaturesAPI = {
      val __obj = js.Dynamic.literal(isKeyUser = isKeyUser.toJsFn)
      __obj.asInstanceOf[FeaturesAPI]
    }
    
    extension [Self <: FeaturesAPI](x: Self) {
      
      inline def setIsKeyUser(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isKeyUser", value.toJsFn)
    }
  }
  
  type _To = FeaturesAPI
  
  /* This means you don't have to write `default`, but can instead just say `sapUiFlWriteApiFeaturesAPIMod.foo` */
  override def _to: FeaturesAPI = default
}
