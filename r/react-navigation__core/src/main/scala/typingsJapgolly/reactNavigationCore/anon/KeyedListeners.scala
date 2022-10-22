package typingsJapgolly.reactNavigationCore.anon

import typingsJapgolly.reactNavigationCore.libTypescriptSrcNavigationBuilderContextMod.ChildBeforeRemoveListener
import typingsJapgolly.reactNavigationCore.libTypescriptSrcNavigationBuilderContextMod.GetStateListener
import typingsJapgolly.reactNavigationCore.reactNavigationCoreStrings.beforeRemove
import typingsJapgolly.reactNavigationCore.reactNavigationCoreStrings.getState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeyedListeners extends StObject {
  
  @JSName("addKeyedListener")
  def addKeyedListener_beforeRemove(`type`: beforeRemove, key: String, listener: ChildBeforeRemoveListener): js.Function0[Unit] = js.native
  @JSName("addKeyedListener")
  def addKeyedListener_getState(`type`: getState, key: String, listener: GetStateListener): js.Function0[Unit] = js.native
  
  var keyedListeners: BeforeRemove = js.native
}
