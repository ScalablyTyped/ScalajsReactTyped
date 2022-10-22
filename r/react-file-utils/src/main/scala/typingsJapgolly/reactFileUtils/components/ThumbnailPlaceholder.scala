package typingsJapgolly.reactFileUtils.components

import japgolly.scalajs.react.Callback
import org.scalajs.dom.File
import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.reactFileUtils.distComponentsThumbnailPlaceholderMod.ThumbnailPlaceholderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ThumbnailPlaceholder {
  
  inline def apply(handleFiles: js.Array[File] => Callback, multiple: Boolean): Default[js.Object] = {
    val __props = js.Dynamic.literal(handleFiles = js.Any.fromFunction1((t0: js.Array[File]) => handleFiles(t0).runNow()), multiple = multiple.asInstanceOf[js.Any])
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[ThumbnailPlaceholderProps]))
  }
  
  @JSImport("react-file-utils", "ThumbnailPlaceholder")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: ThumbnailPlaceholderProps): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
