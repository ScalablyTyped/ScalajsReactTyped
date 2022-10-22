package typingsJapgolly.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.arcgisJsApi.esri.HandleOwner
import typingsJapgolly.arcgisJsApi.esri.HandleOwnerConstructor
import typingsJapgolly.arcgisJsApi.esri.HandleOwnerProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriCoreHandleOwnerMod extends Shortcut {
  
  @JSImport("esri/core/HandleOwner", JSImport.Namespace)
  @js.native
  val ^ : js.Object & HandleOwnerConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/core/HandleOwner", JSImport.Namespace)
  @js.native
  /**
    * Provides a single [handles](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-HandleOwner.html#handles) property to be shared with all subclasses.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-HandleOwner.html)
    */
  open class Class ()
    extends StObject
       with HandleOwner {
    def this(properties: HandleOwnerProperties) = this()
  }
  
  type _To = js.Object & HandleOwnerConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriCoreHandleOwnerMod.foo` */
  override def _to: js.Object & HandleOwnerConstructor = ^
}
