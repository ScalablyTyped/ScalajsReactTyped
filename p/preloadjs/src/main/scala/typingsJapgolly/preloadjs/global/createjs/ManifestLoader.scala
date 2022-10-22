package typingsJapgolly.preloadjs.global.createjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("createjs.ManifestLoader")
@js.native
open class ManifestLoader protected ()
  extends StObject
     with typingsJapgolly.preloadjs.createjs.AbstractLoader {
  def this(loadItem: js.Object) = this()
  def this(loadItem: typingsJapgolly.preloadjs.createjs.LoadItem) = this()
}
/* static members */
object ManifestLoader {
  
  @JSGlobal("createjs.ManifestLoader")
  @js.native
  val ^ : js.Any = js.native
  
  inline def canLoadItem(item: js.Object): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("canLoadItem")(item.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  // methods
  inline def canLoadItem(item: typingsJapgolly.preloadjs.createjs.LoadItem): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("canLoadItem")(item.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
