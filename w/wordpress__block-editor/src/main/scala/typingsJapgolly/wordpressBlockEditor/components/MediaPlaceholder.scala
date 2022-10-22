package typingsJapgolly.wordpressBlockEditor.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.vdom.VdomElement
import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.wordpressBlockEditor.anon.Instructions
import typingsJapgolly.wordpressBlockEditor.componentsMediaPlaceholderMod.MediaPlaceholder.Props
import typingsJapgolly.wordpressComponents.dashiconMod.Dashicon.Icon
import typingsJapgolly.wordpressComponents.dropZoneMod.DropZone.HoverPosition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MediaPlaceholder {
  
  inline def apply[T /* <: Boolean */](
    onSelect: /* import warning: importer.ImportType#apply Failed type conversion: T extends true ? std.Array<{  id :number, [k: string] : any}> : {  id :number, [k: string] : any} */ js.Any => Callback
  ): Builder[T] = {
    val __props = js.Dynamic.literal(onSelect = js.Any.fromFunction1((t0: /* import warning: importer.ImportType#apply Failed type conversion: T extends true ? std.Array<{  id :number, [k: string] : any}> : {  id :number, [k: string] : any} */ js.Any) => onSelect(t0).runNow()))
    new Builder[T](js.Array(this.component, __props.asInstanceOf[Props[T]]))
  }
  
  @JSImport("@wordpress/block-editor", "MediaPlaceholder")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[T /* <: Boolean */] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def accept(value: String): this.type = set("accept", value.asInstanceOf[js.Any])
    
    inline def addToGallery(value: Boolean): this.type = set("addToGallery", value.asInstanceOf[js.Any])
    
    inline def allowedTypes(value: js.Array[String]): this.type = set("allowedTypes", value.asInstanceOf[js.Any])
    
    inline def allowedTypesVarargs(value: String*): this.type = set("allowedTypes", js.Array(value*))
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def dropZoneUIOnly(value: Boolean): this.type = set("dropZoneUIOnly", value.asInstanceOf[js.Any])
    
    inline def icon(value: Icon | Element): this.type = set("icon", value.asInstanceOf[js.Any])
    
    inline def iconVdomElement(value: VdomElement): this.type = set("icon", value.rawElement.asInstanceOf[js.Any])
    
    inline def isAppender(value: Boolean): this.type = set("isAppender", value.asInstanceOf[js.Any])
    
    inline def labels(value: Instructions): this.type = set("labels", value.asInstanceOf[js.Any])
    
    inline def mediaPreview(value: VdomElement): this.type = set("mediaPreview", value.rawElement.asInstanceOf[js.Any])
    
    inline def multiple(value: T): this.type = set("multiple", value.asInstanceOf[js.Any])
    
    inline def notices(value: VdomElement): this.type = set("notices", value.rawElement.asInstanceOf[js.Any])
    
    inline def onCancel(value: Callback): this.type = set("onCancel", value.toJsFn)
    
    inline def onDoubleClick(value: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element] => Callback): this.type = set("onDoubleClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLDivElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onError(value: /* message */ String => Callback): this.type = set("onError", js.Any.fromFunction1((t0: /* message */ String) => value(t0).runNow()))
    
    inline def onHTMLDrop(value: (/* html */ String, /* position */ HoverPosition) => Callback): this.type = set("onHTMLDrop", js.Any.fromFunction2((t0: /* html */ String, t1: /* position */ HoverPosition) => (value(t0, t1)).runNow()))
    
    inline def onSelectURL(value: /* src */ String => Callback): this.type = set("onSelectURL", js.Any.fromFunction1((t0: /* src */ String) => value(t0).runNow()))
    
    inline def value(
      value: /* import warning: importer.ImportType#apply Failed type conversion: T extends true ? std.Array<number> : number | undefined */ js.Any
    ): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  def withProps[T /* <: Boolean */](p: Props[T]): Builder[T] = new Builder[T](js.Array(this.component, p.asInstanceOf[js.Any]))
}
