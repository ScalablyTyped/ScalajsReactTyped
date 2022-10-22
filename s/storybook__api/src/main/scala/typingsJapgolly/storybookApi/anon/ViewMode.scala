package typingsJapgolly.storybookApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ViewMode extends StObject {
  
  var ref: js.UndefOr[String] = js.undefined
  
  var viewMode: js.UndefOr[typingsJapgolly.storybookApi.distTs3Dot9ModulesStoriesMod.ViewMode] = js.undefined
}
object ViewMode {
  
  inline def apply(): ViewMode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ViewMode]
  }
  
  extension [Self <: ViewMode](x: Self) {
    
    inline def setRef(value: String): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    
    inline def setViewMode(value: typingsJapgolly.storybookApi.distTs3Dot9ModulesStoriesMod.ViewMode): Self = StObject.set(x, "viewMode", value.asInstanceOf[js.Any])
    
    inline def setViewModeUndefined: Self = StObject.set(x, "viewMode", js.undefined)
  }
}
