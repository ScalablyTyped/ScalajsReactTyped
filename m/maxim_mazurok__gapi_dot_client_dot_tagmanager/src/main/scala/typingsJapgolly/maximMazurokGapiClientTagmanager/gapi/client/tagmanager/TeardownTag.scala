package typingsJapgolly.maximMazurokGapiClientTagmanager.gapi.client.tagmanager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TeardownTag extends StObject {
  
  /** If true, fire the teardown tag if and only if the main tag fires successfully. If false, fire the teardown tag regardless of main tag firing status. */
  var stopTeardownOnFailure: js.UndefOr[Boolean] = js.undefined
  
  /** The name of the teardown tag. */
  var tagName: js.UndefOr[String] = js.undefined
}
object TeardownTag {
  
  inline def apply(): TeardownTag = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TeardownTag]
  }
  
  extension [Self <: TeardownTag](x: Self) {
    
    inline def setStopTeardownOnFailure(value: Boolean): Self = StObject.set(x, "stopTeardownOnFailure", value.asInstanceOf[js.Any])
    
    inline def setStopTeardownOnFailureUndefined: Self = StObject.set(x, "stopTeardownOnFailure", js.undefined)
    
    inline def setTagName(value: String): Self = StObject.set(x, "tagName", value.asInstanceOf[js.Any])
    
    inline def setTagNameUndefined: Self = StObject.set(x, "tagName", js.undefined)
  }
}
