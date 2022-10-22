package typingsJapgolly.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.arcgisJsApi.esri.Loadable
import typingsJapgolly.arcgisJsApi.esri.LoadableConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriCoreLoadableMod extends Shortcut {
  
  @JSImport("esri/core/Loadable", JSImport.Namespace)
  @js.native
  val ^ : LoadableConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/core/Loadable", JSImport.Namespace)
  @js.native
  open class Class ()
    extends StObject
       with Loadable
  
  type _To = LoadableConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriCoreLoadableMod.foo` */
  override def _to: LoadableConstructor = ^
}
