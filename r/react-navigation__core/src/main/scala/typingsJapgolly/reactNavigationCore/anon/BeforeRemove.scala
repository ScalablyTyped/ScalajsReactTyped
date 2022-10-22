package typingsJapgolly.reactNavigationCore.anon

import typingsJapgolly.reactNavigationCore.libTypescriptSrcNavigationBuilderContextMod.ChildBeforeRemoveListener
import typingsJapgolly.reactNavigationCore.libTypescriptSrcNavigationBuilderContextMod.GetStateListener
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BeforeRemove extends StObject {
  
  var beforeRemove: Record[String, js.UndefOr[ChildBeforeRemoveListener]]
  
  var getState: Record[String, js.UndefOr[GetStateListener]]
}
object BeforeRemove {
  
  inline def apply(
    beforeRemove: Record[String, js.UndefOr[ChildBeforeRemoveListener]],
    getState: Record[String, js.UndefOr[GetStateListener]]
  ): BeforeRemove = {
    val __obj = js.Dynamic.literal(beforeRemove = beforeRemove.asInstanceOf[js.Any], getState = getState.asInstanceOf[js.Any])
    __obj.asInstanceOf[BeforeRemove]
  }
  
  extension [Self <: BeforeRemove](x: Self) {
    
    inline def setBeforeRemove(value: Record[String, js.UndefOr[ChildBeforeRemoveListener]]): Self = StObject.set(x, "beforeRemove", value.asInstanceOf[js.Any])
    
    inline def setGetState(value: Record[String, js.UndefOr[GetStateListener]]): Self = StObject.set(x, "getState", value.asInstanceOf[js.Any])
  }
}
