package typingsJapgolly.vscodeLanguageclient.libCommonFeaturesMod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkspaceProviderFeature[PR] extends StObject {
  
  def getProviders(): js.UndefOr[js.Array[PR]]
}
object WorkspaceProviderFeature {
  
  inline def apply[PR](getProviders: CallbackTo[js.UndefOr[js.Array[PR]]]): WorkspaceProviderFeature[PR] = {
    val __obj = js.Dynamic.literal(getProviders = getProviders.toJsFn)
    __obj.asInstanceOf[WorkspaceProviderFeature[PR]]
  }
  
  extension [Self <: WorkspaceProviderFeature[?], PR](x: Self & WorkspaceProviderFeature[PR]) {
    
    inline def setGetProviders(value: CallbackTo[js.UndefOr[js.Array[PR]]]): Self = StObject.set(x, "getProviders", value.toJsFn)
  }
}
