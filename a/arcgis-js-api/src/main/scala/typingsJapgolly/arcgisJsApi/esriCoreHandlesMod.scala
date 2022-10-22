package typingsJapgolly.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.arcgisJsApi.esri.Handles
import typingsJapgolly.arcgisJsApi.esri.HandlesConstructor
import typingsJapgolly.arcgisJsApi.esri.HandlesProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriCoreHandlesMod extends Shortcut {
  
  @JSImport("esri/core/Handles", JSImport.Namespace)
  @js.native
  val ^ : js.Object & HandlesConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/core/Handles", JSImport.Namespace)
  @js.native
  /**
    * This class helps manage a group of handles.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Handles.html)
    */
  open class Class ()
    extends StObject
       with Handles {
    def this(properties: HandlesProperties) = this()
  }
  
  type _To = js.Object & HandlesConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriCoreHandlesMod.foo` */
  override def _to: js.Object & HandlesConstructor = ^
}
