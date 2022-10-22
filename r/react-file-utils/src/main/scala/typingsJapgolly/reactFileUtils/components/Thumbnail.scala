package typingsJapgolly.reactFileUtils.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLButtonElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactFileUtils.distComponentsThumbnailMod.ThumbnailProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Thumbnail {
  
  inline def apply(image: String): Builder = {
    val __props = js.Dynamic.literal(image = image.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ThumbnailProps]))
  }
  
  @JSImport("react-file-utils", "Thumbnail")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def alt(value: String): this.type = set("alt", value.asInstanceOf[js.Any])
    
    inline def handleClose(value: ReactMouseEventFrom[HTMLButtonElement & Element] => Callback): this.type = set("handleClose", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLButtonElement & Element]) => value(t0).runNow()))
    
    inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    inline def size(value: Double): this.type = set("size", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ThumbnailProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
