package typingsJapgolly.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.arcgisJsApi.esri.corePromise
import typingsJapgolly.arcgisJsApi.esri.corePromiseConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriCorePromiseMod extends Shortcut {
  
  @JSImport("esri/core/Promise", JSImport.Namespace)
  @js.native
  val ^ : corePromiseConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/core/Promise", JSImport.Namespace)
  @js.native
  open class Class ()
    extends StObject
       with corePromise
  
  type _To = corePromiseConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriCorePromiseMod.foo` */
  override def _to: corePromiseConstructor = ^
}
